package WhiteBox.Models;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import main.java.model.User;

public class userModelTest {

	 @Test
	    public void testGetName() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user", null);
	        assertEquals("John Doe", user.getName());
	    }

	    @Test
	    public void testSetName() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user", null);
	        user.setName("Jane Doe");
	        assertEquals("Jane Doe", user.getName());
	    }

	    @Test
	    public void testGetUserName() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user", null);
	        assertEquals("johndoe", user.getUserName());
	    }

	    @Test
	    public void testSetUserName() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user", null);
	        user.setUserName("janedoe");
	        assertEquals("janedoe", user.getUserName());
	    }

	    @Test
	    public void testGetPassword() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user", null);
	        assertEquals("password123", user.getPassword());
	    }

	    @Test
	    public void testSetPassword() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user", null);
	        user.setPassword("newpassword456");
	        assertEquals("newpassword456", user.getPassword());
	    }

	    @Test
	    public void testGetAllergies() {
	        User user = new User("John Doe", "johndoe", "password123", Arrays.asList("nuts", "dairy"), "user", null);
	        assertEquals(Arrays.asList("nuts", "dairy"), user.getAllergies());
	    }

	    @Test
	    public void testSetAllergies() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user", null);
	        user.setAllergies(Arrays.asList("gluten", "soy"));
	        assertEquals(Arrays.asList("gluten", "soy"), user.getAllergies());
	    }

	    @Test
	    public void testGetRole() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "admin", null);
	        assertEquals("admin", user.getRole());
	    }

	    @Test
	    public void testSetRole() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user", null);
	        user.setRole("admin");
	        assertEquals("admin", user.getRole());
	    }

	    @Test
	    public void testGetFavoriteList() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user", Arrays.asList("item1", "item2"));
	        assertEquals(Arrays.asList("item1", "item2"), user.getFavoriteList());
	    }

	    @Test
	    public void testSetFavoriteList() {
	        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user", null);
	        user.setFavoriteList(Arrays.asList("item3", "item4"));
	        assertEquals(Arrays.asList("item3", "item4"), user.getFavoriteList());
	    }
}
