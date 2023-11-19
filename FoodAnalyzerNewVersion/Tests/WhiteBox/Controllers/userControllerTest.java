package WhiteBox.Controllers;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import main.java.controller.UserController;
import main.java.model.User;
import main.java.repository.UserRepository;
import main.java.repository.UserRepositoryImpl;

public class userControllerTest {


	 private UserController userController;


	    @Test
	    public void testUserLoginValidUser() {
	    	userController = new UserController();
	        // Set up: Add a user to the repository for testing
	        List<String> allergies = Arrays.asList("allergy1", "allergy2");
	        String passwordHash = UserController.hashPassword("password123");
	        User validUser = new User("Test User", "testuser", passwordHash, allergies, "user");
	        UserRepositoryImpl repository = new UserRepositoryImpl();
	        repository.addUser(validUser);

	        // Perform the test
	        boolean result = userController.UserLogin("testuser", "password123");

	        // Verify the result
	        assertTrue(result);

	        // Clean up: Delete the added user
	        repository.deleteUserbyUsername("testuser");
	    }

	    @Test
	    public void testUserLoginInvalidUser() {
	    	userController = new UserController();

	        // Perform the test with a non-existent user
	        boolean result = userController.UserLogin("nonexistentuser", "password123");

	        // Verify the result
	        assertFalse(result);
	    }

	    @Test
	    public void testCreateUserAccount() {
	    	userController = new UserController();

	        // Mocking behavior: None needed, using the actual repository

	        // Perform the test
	        userController.createUserAccount("John Doe", "johndoe", "password123", null);

	        // Verify that the repository has the added user
	        Document addedUser = userController.userRepository.findUserbyUsername("johndoe");
	        assertNotNull(addedUser);
	        assertEquals("John Doe", addedUser.getString("name"));
	        assertEquals("johndoe", addedUser.getString("userName"));
	        assertTrue(userController.checkPassword("password123", addedUser.getString("PasswordHash")));
	        assertNull(addedUser.get("allergies"));
	        assertEquals("user", addedUser.getString("Role"));

	        // Clean up: Delete the added user
	        userController.userRepository.deleteUserbyUsername("johndoe");
	    }

	    @Test
	    public void testDeleteUserAccount() {
	    	userController = new UserController();

	        // Set up: Add a user to the repository for testing
	        String userNameToDelete = "userToDelete";
	        User userToDelete = new User("Delete Me", userNameToDelete, "password456", null, "admin");
	        userController.userRepository.addUser(userToDelete);

	        // Perform the test
	        userController.deleteUserAccount(userNameToDelete);

	        // Verify that the user is deleted
	        Document deletedUser = userController.userRepository.findUserbyUsername(userNameToDelete);
	        assertNull(deletedUser);
	    }

	    @Test
	    public void testUpdateUserAccount() {
	    	userController = new UserController();

	        // Set up: Add a user to the repository for testing
	        String userNameToUpdate = "userToUpdate";
	        User userToUpdate = new User("Old Name", userNameToUpdate, "oldPassword", null, "user");
	        userController.userRepository.addUser(userToUpdate);

	        // Perform the test
	        userController.UpdateUserAccount("New Name", userNameToUpdate, "newPassword", Arrays.asList("allergy"),userNameToUpdate);

	        // Verify that the user is updated
	        Document updatedUser = userController.userRepository.findUserbyUsername(userNameToUpdate);
	        assertNotNull(updatedUser);
	        assertEquals("New Name", updatedUser.getString("name"));
	        assertNotEquals("oldPassword", updatedUser.getString("PasswordHash"));
	        assertEquals(Arrays.asList("allergy"), updatedUser.get("allergies"));

	        // Clean up: Delete the updated user
	        userController.userRepository.deleteUserbyUsername(userNameToUpdate);
	    }

	    @Test
	    public void testCheckUserAccount() {
	    	userController = new UserController();

	        // Set up: Add a user to the repository for testing
	        String userNameToCheck = "userToCheck";
	        User userToCheck = new User("Check Me", userNameToCheck, "password789", null, "user");
	        userController.userRepository.addUser(userToCheck);

	        // Perform the test
	        userController.CheckUserAccount(userNameToCheck);

	        // No explicit verification in this case, as it's mostly a retrieval operation

	        // Clean up: Delete the added user
	        userController.userRepository.deleteUserbyUsername(userNameToCheck);
	    }
	}

	