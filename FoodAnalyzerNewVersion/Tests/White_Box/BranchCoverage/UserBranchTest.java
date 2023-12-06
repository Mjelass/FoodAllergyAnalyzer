package White_Box.BranchCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.java.model.User;

class UserBranchTest {

	@Test
    public void testBranchCoverage() {
        // Test with "User" role
        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));

        if (user1.getRole().equals("User")) {
            assertTrue(user1.getFavoriteList().contains("Movie1"));
        } else {
            assertTrue(user1.getFavoriteList().isEmpty());
        }

        

        // Additional branch coverage scenarios
        User user3 = new User("Guest User", "guest", "guest123", Arrays.asList("Shellfish"), "Guest", Arrays.asList("Movie3"));

        if (user3.getRole().equals("User")) {
            assertTrue(user3.getFavoriteList().isEmpty());
        } else if (user3.getRole().equals("Admin")) {
            assertTrue(user3.getFavoriteList().isEmpty());
        } else {
            assertTrue(user3.getFavoriteList().contains("Movie3"));
        }

        // Test edge cases
        User user4 = new User("No Role User", "no.role", "nopassword", Arrays.asList("No allergies"), null, Arrays.asList("Movie4"));

        if (user4.getRole() == null) {
            assertTrue(user4.getFavoriteList().contains("Movie4"));
        } else {
            assertTrue(user4.getFavoriteList().isEmpty());
        }

        // Test scenario with empty allergies
        User user5 = new User("Empty Allergies", "empty.allergies", "password", Arrays.asList(), "User", Arrays.asList("Movie5"));

        if (user5.getAllergies().isEmpty()) {
            assertTrue(user5.getFavoriteList().contains("Movie5"));
        } else {
            assertTrue(user5.getFavoriteList().isEmpty());
        }
    }

}
