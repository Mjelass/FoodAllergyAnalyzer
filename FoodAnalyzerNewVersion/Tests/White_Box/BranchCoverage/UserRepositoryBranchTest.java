package White_Box.BranchCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;

import main.java.model.User;
import main.java.repository.UserRepositoryImpl;

class UserRepositoryBranchTest {

	  @Test
	    public void testAddUser() {
	        UserRepositoryImpl userRepository = new UserRepositoryImpl();
	        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"), "", "");
	        userRepository.addUser(user1);

	        // Check if the user was added successfully (username doesn't exist)
	        Document addedUser = userRepository.findUserbyUsername("john.doe");
	        assertNotNull(addedUser);
	        assertEquals("John Doe", addedUser.get("name"));
	    }

	    @Test
	    public void testAddUserExistingUsername() {
	        UserRepositoryImpl userRepository = new UserRepositoryImpl();
	        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"), "", "");
	        userRepository.addUser(user1);

	        // Attempt to add a user with an existing username
	        User user2 = new User("Jane Doe", "john.doe", "newpassword", Arrays.asList("No allergies"), "Admin", Arrays.asList("Movie2"), "", "");
	        userRepository.addUser(user2);

	        // Check if the system handled the existing username correctly
	        // You can modify this based on your expected behavior
	        Document existingUser = userRepository.findUserbyUsername("john.doe");
	        assertNotNull(existingUser);
	        assertEquals("John Doe", existingUser.get("name"));
	    }

	    @Test
	    public void testFindUserByUsername() {
	        UserRepositoryImpl userRepository = new UserRepositoryImpl();
	        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"), "", "");
	        userRepository.addUser(user1);

	        // Check if the findUserbyUsername method returns the correct user
	        Document foundUser = userRepository.findUserbyUsername("john.doe");
	        assertNotNull(foundUser);
	        assertEquals("John Doe", foundUser.get("name"));
	    }

	    @Test
	    public void testDeleteUserByUsername() {
	        UserRepositoryImpl userRepository = new UserRepositoryImpl();
	        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"), "", "");
	        userRepository.addUser(user1);

	        // Delete the user and check if the user was removed
	        userRepository.deleteUserbyUsername("john.doe");
	        Document deletedUser = userRepository.findUserbyUsername("john.doe");
	        assertNull(deletedUser);
	    }

	    @Test
	    public void testUpdateUser() {
	        UserRepositoryImpl userRepository = new UserRepositoryImpl();
	        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"), "", "");
	        userRepository.addUser(user1);

	        // Update the user's information
	        Document updatedUserInfo = new Document("name", "Updated Name")
	                .append("userName", "john.doe")
	                .append("PasswordHash", "newpassword")
	                .append("allergies", Arrays.asList("Updated Allergies"))
	                .append("Role", "Admin")
	                .append("FavoriteList", Arrays.asList("Updated Movie"));

	        userRepository.updateUser("john.doe", updatedUserInfo);

	        // Check if the user information was updated
	        Document updatedUser = userRepository.findUserbyUsername("john.doe");
	        assertNotNull(updatedUser);
	        assertEquals("Updated Name", updatedUser.get("name"));
	        assertEquals("newpassword", updatedUser.get("PasswordHash"));
	        assertEquals(Arrays.asList("Updated Allergies"), updatedUser.get("allergies"));
	        assertEquals("Admin", updatedUser.get("Role"));
	        assertEquals(Arrays.asList("Updated Movie"), updatedUser.get("FavoriteList"));
	    }

	    @Test
	    public void testGetUserAllergiesByUsername() {
	        UserRepositoryImpl userRepository = new UserRepositoryImpl();
	        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"), "", "");
	        userRepository.addUser(user1);

	        // Check if the getUserAllergiesByUsername method returns the correct allergies
	        List<String> allergies = userRepository.getUserAllergiesByUsername("john.doe");
	        assertNotNull(allergies);
	        assertTrue(allergies.contains("Peanuts"));
	    }

}
