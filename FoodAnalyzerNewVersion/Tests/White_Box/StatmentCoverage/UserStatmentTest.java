package White_Box.StatmentCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.java.model.User;

class UserStatmentTest {

	 @Test 
	    public void testStatementCoverage() {
	        // Test constructor and getters
	        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));
	        assertEquals("John Doe", user.getName());
	        assertEquals("john.doe", user.getUserName());
	        assertEquals("password123", user.getPassword());
	        assertEquals(Arrays.asList("Peanuts"), user.getAllergies());
	        assertEquals("User", user.getRole());
	        assertEquals(Arrays.asList("Movie1"), user.getFavoriteList());

	        // Test setters
	        user.setName("Jane Doe");
	        assertEquals("Jane Doe", user.getName());

	        user.setUserName("jane.doe");
	        assertEquals("jane.doe", user.getUserName());

	        user.setPassword("newpassword");
	        assertEquals("newpassword", user.getPassword());

	        user.setAllergies(Arrays.asList("No allergies"));
	        assertEquals(Arrays.asList("No allergies"), user.getAllergies());

	        user.setRole("Admin");
	        assertEquals("Admin", user.getRole());

	        user.setFavoriteList(Arrays.asList("Movie2"));
	        assertEquals(Arrays.asList("Movie2"), user.getFavoriteList());

	        // Test getFavoriteList method
	        assertNotNull(user.getFavoriteList());

	        // Test setFavoriteList method
	        user.setFavoriteList(Arrays.asList("Movie3"));
	        assertEquals(Arrays.asList("Movie3"), user.getFavoriteList());
	    }

}
