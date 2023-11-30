package WhiteBox.Controllers;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import main.java.controller.ExtraInformation;
import main.java.controller.UserController;
import main.java.model.User;
import main.java.repository.UserRepository;
import main.java.repository.UserRepositoryImpl;

public class userControllerTest {


	private UserController userController;
	// Set up input stream to simulate user input
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;
 // Helper method to simulate user input
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
        System.setIn(testIn);
    }

    // Helper method to restore the original system input
    private void restoreSystemInput() {
        System.setIn(systemIn);
    }

    @Test
    public void testUserLoginValidUser() {
        userController = new UserController();

        // Set up: Add a user to the repository for testing
        List<String> allergies = Arrays.asList("allergy1", "allergy2");
        String password="password123";
        User user = new User("Test User", "testuser1", password, allergies, "user", null);
        userController.createUserAccount(user.getName(), user.getUserName(), user.getPassword(), null);

        // Perform the test
        boolean result = userController.UserLogin("testuser1", "password123");
        
        // Verify the result
        assertTrue(result);

        // Clean up: Delete the added user
        userController.deleteUserAccount("testuser1");
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
        userController.deleteUserAccount("johndoe");
    }

    @Test
    public void testDeleteUserAccount() {
        userController = new UserController();

        // Set up: Add a user to the repository for testing
        String userNameToDelete = "userToDelete";
        User user = new User("Delete Me", userNameToDelete, "password456", null, "admin", null);
        userController.createUserAccount(user.getName(), user.getUserName(), user.getPassword(), null);

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
        User userToUpdate = new User("Old Name", userNameToUpdate, "oldPassword", null, "user", null);
        userController.userRepository.addUser(userToUpdate);

        // Perform the test
        userController.UpdateUserAccount("New Name", userNameToUpdate, "newPassword", Arrays.asList("allergy"), userNameToUpdate);

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
        User userToCheck = new User("Check Me", userNameToCheck, "password789", null, "user", null);
        userController.userRepository.addUser(userToCheck);

        // Perform the test
        Document result = userController.CheckUserAccount(userNameToCheck);

        // Verify the result
        assertNotNull(result);

        // Clean up: Delete the added user
        userController.userRepository.deleteUserbyUsername(userNameToCheck);
    }

    @Test
    public void addFavList_Success() {
    	userController = new UserController();
        String product = "Chicken and Mushroom";
        String userName = "favListllg8eUser";
        User user = new User("Fav List User", userName, "password123", null, "user", null);
        userController.createUserAccount(user.getName(), user.getUserName(), user.getPassword(), null);

        userController.addFavList(userName, product);

        
        Document existingUserDocument = userController.userRepository.findUserbyUsername(userName);
        
        List<String> favList = existingUserDocument.getList("FavoriteList", String.class);

        assertTrue(favList != null && favList.contains(product));
        // Clean up: Delete the added user
        userController.deleteUserAccount(userName);
    }


    @Test
    public void testDeleteFavList() {
    	userController = new UserController();
        String userName = "favListllg8eUser";
        List<String> List = Arrays.asList("Chicken and Mushroom");
        User user = new User("Fav List User", userName, "password123", null, "user", List);
        userController.createUserAccount(user.getName(), user.getUserName(), user.getPassword(), null);

       
        userController.deleteFavList(userName, "Chicken and Mushroom");

        
        Document existingUserDocument = userController.userRepository.findUserbyUsername(userName);
        
        List<String> favList = existingUserDocument.getList("FavoriteList", String.class);

        assertTrue(favList == null);
        // Clean up: Delete the added user
        userController.deleteUserAccount(userName);
    }
    
    @Test
    public void testCheckFavList() {
    	userController = new UserController();
        String userName = "favListllg8eUser";
        List<String> List = Arrays.asList("Chicken and Mushroom");
        User user = new User("Fav List User", userName, "password123", null, "user", List);
        userController.createUserAccount(user.getName(), user.getUserName(), user.getPassword(), null);

       
        

        
     // Redirect System.out.println to a PrintStream so we can capture the output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        userController.checkFavList(userName);

        // Reset System.out to standard output
        System.setOut(System.out);
        System.out.print(outputStreamCaptor.toString());
        assertTrue(!outputStreamCaptor.toString().trim().equals("Your favorite list is empty"));
        userController.deleteUserAccount(userName);
    }
}

	