package White_Box.MutationCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.java.model.User;

class UserMutationTest {

	@Test
    public void testMutationCoverage() {
        // Original User object
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));

        // Mutate the user's name (introduce a defect)
        user.setName("Mutated Name");

        // Validate that the mutation is detected
        assertFalse(user.getName().equals("John Doe"));

        // Mutate the user's username (introduce a defect)
        user.setUserName("mutated.username");

        // Validate that the mutation is detected
        assertFalse(user.getUserName().equals("john.doe"));

        // Mutate the user's password (introduce a defect)
        user.setPassword("mutatedPassword");

        // Validate that the mutation is detected
        assertFalse(user.getPassword().equals("password123"));

        // Mutate the user's role (introduce a defect)
        user.setRole("MutatedRole");

        // Validate that the mutation is detected
        assertFalse(user.getRole().equals("User"));

        // Mutate the user's favorite list (introduce a defect)
        user.setFavoriteList(Arrays.asList("MutatedMovie"));

        // Validate that the mutation is detected
        assertFalse(user.getFavoriteList().contains("Movie1"));

        // Mutate the user's allergies list (introduce a defect)
        user.setAllergies(Arrays.asList("MutatedAllergy"));

        // Validate that the mutation is detected
        assertFalse(user.getAllergies().contains("Peanuts"));

        

    }

}
