package White_Box.BranchCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import main.java.controller.UserController;

class UserControllerBranchTest {

	private UserController userController= new UserController();;

   

	 @Test
	    public void testUserLoginValidCredentials() {
		 userController.createUserAccount("usr", "uuu", "password123", Arrays.asList("Eggs"));
	        assertTrue(userController.UserLogin("uuu", "password123"));
	    }

	    @Test
	    public void testUserLoginInvalidCredentials() {
	        assertFalse(userController.UserLogin("nonexistentuser", "wrongpassword"));
	    }

	    @Test
	    public void testCreateUserAccount() {
	        userController.createUserAccount("New User", "newuser", "newpassword", Arrays.asList("Eggs"));
	        Document newUser = userController.CheckUserAccount("newuser");
	        assertNotNull(newUser);
	    }

	    @Test
	    public void testDeleteUserAccount() {
	        userController.deleteUserAccount("john.doe");
	        assertNull(userController.CheckUserAccount("john.doe"));
	    }

	    @Test
	    public void testUpdateUserAccountValidUser() {
	    	userController.createUserAccount("johnEE", "newuser", "newpassword", Arrays.asList("Eggs"));
	        Document updatedUser = userController.UpdateUserAccount("Updated Name", "john.doe", "newpassword", Arrays.asList("Updated Allergies"), "newuser");
	        assertNotNull(updatedUser);
	        assertEquals("Updated Name", updatedUser.getString("name"));
	    }

	    @Test
	    public void testUpdateUserAccountInvalidUser() {
	        assertNull(userController.UpdateUserAccount("Updated Name", "nonexistentuser", "newpassword", Arrays.asList("Updated Allergies"), "john.doe"));
	    }

	    @Test
	    public void testCheckUserAccountValidUser() {
	        Document user = userController.CheckUserAccount("john.doe");
	        assertNotNull(user);
	    }

	    @Test
	    public void testCheckUserAccountInvalidUser() {
	        assertNull(userController.CheckUserAccount("nonexistentuser"));
	    }

	    @Test
	    public void testAddFavListProductNotInList() {
	    	userController.createUserAccount("usr", "uu", "newpassword", Arrays.asList("Eggs"));
	        userController.addFavList("uu", "Chicken and Mushroom");
	        Document updatedUser = userController.CheckUserAccount("uu");
	        assertNotNull(updatedUser);
	        List<String> favList = updatedUser.getList("FavoriteList", String.class);
	        assertNotNull(favList);
	        assertTrue(favList.contains("Chicken and Mushroom"));
	    }

	    @Test
	    public void testAddFavListProductAlreadyInList() {
	        userController.addFavList("john.doe", "Chicken and Mushroom");
	        Document updatedUser = userController.CheckUserAccount("john.doe");
	        assertNotNull(updatedUser);
	        List<String> favList = updatedUser.getList("FavoriteList", String.class);
	        assertNotNull(favList);
	        assertTrue(favList.contains("Chicken and Mushroom"));
	    }

	    @Test
	    public void testDeleteFavListProductInList() {
	    	userController.createUserAccount("usr", "newuser", "newpassword", Arrays.asList("Eggs"));
	        userController.deleteFavList("usr", "Chicken and Mushroom");
	        Document updatedUser = userController.CheckUserAccount("newuser");
	        assertNotNull(updatedUser);
	        List<String> favList = updatedUser.getList("FavoriteList", String.class);
	        assertNull(favList);
	    }

	    @Test
	    public void testDeleteFavListProductNotInList() {
	        userController.deleteFavList("john.doe", "Chicken and Mushroom");
	        Document updatedUser = userController.CheckUserAccount("john.doe");
	        assertNotNull(updatedUser);
	        List<String> favList = updatedUser.getList("FavoriteList", String.class);
	        assertNotNull(favList);
	    }

	   /* @Test
	    public void testCheckFavListNotEmpty() {
	        userController.checkFavList("john.doe");
	        // Assert based on console output or modify the method to return a string for assertion
	    }

	    @Test
	    public void testCheckFavListEmpty() {
	        userController.checkFavList("nonexistentuser");
	        // Assert based on console output or modify the method to return a string for assertion
	    }*/

	    @Test
	    public void testUpdatePasswordValidUser() {
	        userController.updatePassword("john.doe", "newpassword");
	        Document updatedUser = userController.CheckUserAccount("john.doe");
	        assertNotNull(updatedUser);
	        assertTrue(userController.checkPassword("newpassword", updatedUser.getString("PasswordHash")));
	    }

	    @Test
	    public void testUpdatePasswordInvalidUser() {
	        userController.updatePassword("nonexistentuser", "newpassword");
	        Document updatedUser = userController.CheckUserAccount("nonexistentuser");
	        assertNull(updatedUser);
	    }

	    @Test
	    public void testUpdateNameValidUser() {
	    	userController.createUserAccount("usr", "newuser", "newpassword", Arrays.asList("Eggs"));
	        userController.updateName("newuser", "lolo");
	        Document updatedUser = userController.CheckUserAccount("newuser");
	        assertNotNull(updatedUser);
	        assertEquals("lolo", updatedUser.getString("name"));
	    }

	    @Test
	    public void testUpdateNameInvalidUser() {
	        userController.updateName("nonexistentuser", "Updated Name");
	        Document updatedUser = userController.CheckUserAccount("nonexistentuser");
	        assertNull(updatedUser);
	    }

	    @Test
	    public void testUpdateUserNameValidUser() {
	        userController.updateUserName("john.doe", "newusername");
	        Document updatedUser = userController.CheckUserAccount("newusername");
	        assertNotNull(updatedUser);
	        assertEquals("newusername", updatedUser.getString("userName"));
	    }

	    @Test
	    public void testUpdateUserNameInvalidUser() {
	        userController.updateUserName("nonexistentuser", "newusername");
	        Document updatedUser = userController.CheckUserAccount("nonexistentuser");
	        assertNull(updatedUser);
	    }

}
