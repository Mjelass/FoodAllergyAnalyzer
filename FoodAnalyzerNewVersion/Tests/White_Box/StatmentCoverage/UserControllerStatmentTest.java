package White_Box.StatmentCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;

import main.java.controller.UserController;

class UserControllerStatmentTest {

	 @Test
	    public void testUserLogin() {
	        UserController userController = new UserController();
	        String username = "johnoe";
	        String password = "password123";

	        // Create a user for testing
	        userController.createUserAccount("John Doe", username, password, Arrays.asList("Peanuts"));

	        // Test user login with correct credentials
	        assertTrue(userController.UserLogin(username, password));

	        // Test user login with incorrect password
	        assertFalse(userController.UserLogin(username, "wrongpassword"));

	        // Test user login with non-existent username
	        assertFalse(userController.UserLogin("nonexistentuser", password));
	    }

	    @Test
	    public void testCreateUserAccount() {
	        UserController userController = new UserController();
	        String name = "John Doe";
	        String username = "john.doe";
	        String password = "password123";
	        List<String> allergies = Arrays.asList("Peanuts");

	        // Create a user account
	        userController.createUserAccount(name, username, password, allergies);

	        // Check if the user is added to the repository
	        Document createdUser = userController.CheckUserAccount(username);
	        assertNotNull(createdUser);
	        assertEquals(name, createdUser.getString("name"));
	        assertEquals(username, createdUser.getString("userName"));
	        assertNotNull(createdUser.getString("PasswordHash"));
	        assertEquals(allergies, createdUser.getList("allergies", String.class));
	    }

	    @Test
	    public void testDeleteUserAccount() {
	        UserController userController = new UserController();
	        String username = "john.doe";
	        String password = "password123";

	        // Create a user for testing
	        userController.createUserAccount("John Doe", username, password, Arrays.asList("Peanuts"));

	        // Delete the user account
	        userController.deleteUserAccount(username);

	        // Check if the user is deleted from the repository
	        Document deletedUser = userController.CheckUserAccount(username);
	        assertNull(deletedUser);
	    }

	    @Test
	    public void testUpdateUserAccount() {
	        UserController userController = new UserController();
	        String currentUsername = "johnyy";
	        String newPassword = "newpassword";
	        String newName = "Updated Name";
	        String newUsername = "new.john.doe";
	        String newECEmail = "a@gmail.com";
	        String newECNumber = "123456789";
	        List<String> newAllergies = Arrays.asList("Updated Allergies");

	        // Create a user for testing
	        userController.createUserAccount("John Doe", currentUsername, "password123", Arrays.asList("Peanuts"));

	        // Update the user account
	        Document updatedUser = userController.UpdateUserAccount(newName, newUsername, newPassword, newAllergies, currentUsername, newECEmail, newECNumber);

	        // Check if the user is updated in the repository
	        assertNotNull(updatedUser);
	        assertEquals(newName, updatedUser.getString("name"));
	        assertEquals(newUsername, updatedUser.getString("userName"));
	        assertNotNull(updatedUser.getString("PasswordHash"));
	    }

	    @Test
	    public void testCheckUserAccount() {
	        UserController userController = new UserController();
	        String username = "john.doe";
	        String password = "password123";

	        // Create a user for testing
	        userController.createUserAccount("John Doe", username, password, Arrays.asList("Peanuts"));

	        // Check if the user can be retrieved from the repository
	        Document retrievedUser = userController.CheckUserAccount(username);
	        assertNotNull(retrievedUser);
	        assertEquals("John Doe", retrievedUser.getString("name"));
	        assertEquals(username, retrievedUser.getString("userName"));
	        assertNotNull(retrievedUser.getString("PasswordHash"));
	        assertEquals(Arrays.asList("Peanuts"), retrievedUser.getList("allergies", String.class));
	    }

	    @Test
	    public void testAddFavList() {
	        UserController userController = new UserController();
	        String username = "john.doe";
	        String product = "Chicken and Mushroom";

	        // Create a user for testing
	        userController.createUserAccount("John Doe", username, "password123", Arrays.asList("Peanuts"));

	        // Add a product to the user's favorite list
	        userController.addFavList(username, product);

	        // Check if the product is added to the user's favorite list
	        Document updatedUser = userController.CheckUserAccount(username);
	        assertNotNull(updatedUser);
	        List<String> favList = updatedUser.getList("FavoriteList", String.class);
	        assertNotNull(favList);
	        assertTrue(favList.contains(product));
	    }

	    @Test
	    public void testDeleteFavList() {
	        UserController userController = new UserController();
	        String username = "john.doe";
	        String product = "Chicken and Mushroom";

	        // Create a user for testing
	        userController.createUserAccount("John Doe", username, "password123", Arrays.asList("Peanuts"));

	        // Add a product to the user's favorite list
	        userController.addFavList(username, product);

	        // Delete the product from the user's favorite list
	        userController.deleteFavList(username, product);

	        // Check if the product is deleted from the user's favorite list
	        Document updatedUser = userController.CheckUserAccount(username);
	        assertNotNull(updatedUser);
	        List<String> favList = updatedUser.getList("FavoriteList", String.class);
	        assertNotNull(favList);
	        assertFalse(favList.contains(product));
	    }

	    @Test
	    public void testCheckFavList() {
	        UserController userController = new UserController();
	        String username = "john.doe";
	        String product = "Chicken and Mushroom";

	        // Create a user for testing
	        userController.createUserAccount("John Doe", username, "password123", Arrays.asList("Peanuts"));

	        // Add a product to the user's favorite list
	        userController.addFavList(username, product);

	        // Check the content of the user's favorite list
	        userController.checkFavList(username);

	        // Check if the user does not have an empty favorite list
	        Document updatedUser = userController.CheckUserAccount(username);
	        assertNotNull(updatedUser);
	        List<String> favList = updatedUser.getList("FavoriteList", String.class);
	        assertNotNull(favList);
	        assertFalse(favList.isEmpty());
	    }

	    @Test
	    public void testUpdatePassword() {
	        UserController userController = new UserController();
	        String username = "john.doe";
	        String newPassword = "newpassword";

	        // Create a user for testing
	        userController.createUserAccount("John Doe", username, "password123", Arrays.asList("Peanuts"));

	        // Update the user's password
	        userController.updatePassword(username, newPassword);

	        // Check if the password is updated in the user's account
	        Document updatedUser = userController.CheckUserAccount(username);
	        assertNotNull(updatedUser);
	        assertTrue(UserController.checkPassword(newPassword, updatedUser.getString("PasswordHash")));
	    }

	    @Test
	    public void testUpdateName() {
	        UserController userController = new UserController();
	        String username = "john.doe";
	        String newName = "Updated Name";

	        // Create a user for testing
	        userController.createUserAccount("John Doe", username, "password123", Arrays.asList("Peanuts"));

	        // Update the user's name
	        userController.updateName(username, newName);

	        // Check if the name is updated in the user's account
	        Document updatedUser = userController.CheckUserAccount(username);
	        assertNotNull(updatedUser);
	        assertEquals(newName, updatedUser.getString("name"));
	    }

	    @Test
	    public void testUpdateUserName() {
	        UserController userController = new UserController();
	        String username = "john.doe";
	        String newUsername = "new.john.doe";

	        // Create a user for testing
	        userController.createUserAccount("John Doe", username, "password123", Arrays.asList("Peanuts"));

	        // Update the user's username
	        userController.updateUserName(username, newUsername);

	        // Check if the username is updated in the user's account
	        Document updatedUser = userController.CheckUserAccount(newUsername);
	        assertNotNull(updatedUser);
	        assertEquals(newUsername, updatedUser.getString("userName"));
	    }
}
