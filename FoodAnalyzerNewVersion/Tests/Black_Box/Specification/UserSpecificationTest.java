package Black_Box.Specification;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.model.User;

class UserSpecificationTest {

	 @Test
	    public void testConstructorAndGetters() {
	        List<String> allergies = Arrays.asList("Peanuts", "Shellfish");
	        List<String> favoriteList = Arrays.asList("Book", "Movie");

	        User user = new User("John Doe", "john_doe", "password123", allergies, "Admin", favoriteList, "", "");

	        assertEquals("John Doe", user.getName());
	        assertEquals("john_doe", user.getUserName());
	        assertEquals("password123", user.getPassword());
	        assertEquals(allergies, user.getAllergies());
	        assertEquals("Admin", user.getRole());
	        assertEquals(favoriteList, user.getFavoriteList());
	    }

	    @Test
	    public void testSetters() {
	        User user = new User("John Doe", "john_doe", "password123", new ArrayList<>(), "User", new ArrayList<>(), "", "");

	        user.setName("Jane Doe");
	        assertEquals("Jane Doe", user.getName());

	        user.setUserName("jane_doe");
	        assertEquals("jane_doe", user.getUserName());

	        user.setPassword("newpassword");
	        assertEquals("newpassword", user.getPassword());

	        List<String> newAllergies = Arrays.asList("Gluten", "Dairy");
	        user.setAllergies(newAllergies);
	        assertEquals(newAllergies, user.getAllergies());

	        user.setRole("Moderator");
	        assertEquals("Moderator", user.getRole());

	        List<String> newFavorites = Arrays.asList("Music", "Travel");
	        user.setFavoriteList(newFavorites);
	        assertEquals(newFavorites, user.getFavoriteList());
	    }

	    @Test
	    public void testEmptyConstructor() {
	        User user = new User("", "", "", new ArrayList<>(), "", new ArrayList<>(), "", "");

	        assertNotNull(user);
	        assertEquals("", user.getName());
	        assertEquals("", user.getUserName());
	        assertEquals("", user.getPassword());
	        assertEquals(0, user.getAllergies().size());
	        assertEquals("", user.getRole());
	        assertEquals(0, user.getFavoriteList().size());
	    }

	   

}
