package White_Box.MutationCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.java.model.User;

class UserMutationTest {

	@Test
    public void testMutationCoverage() {
		 // Original User object
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"), "", "");

        // Mutate the user's name (introduce a defect)
        user.setName("Mutated Name");
        assertNotEquals("John Doe", user.getName());

        // Mutate the user's username (introduce a defect)
        user.setUserName("mutated.username");
        assertNotEquals("john.doe", user.getUserName());

        // Mutate the user's password (introduce a defect)
        user.setPassword("mutatedPassword");
        assertNotEquals("password123", user.getPassword());

        // Mutate the user's role (introduce a defect)
        user.setRole("MutatedRole");
        assertNotEquals("User", user.getRole());

        // Mutate the user's favorite list (introduce a defect)
        user.setFavoriteList(Arrays.asList("MutatedMovie"));
        assertTrue(user.getFavoriteList().contains("MutatedMovie"));

        // Mutate the user's allergies list (introduce a defect)
        user.setAllergies(Arrays.asList("MutatedAllergy"));
        assertTrue(user.getAllergies().contains("MutatedAllergy"));

        // Additional mutations for coverage
        // Mutate the user's name to be empty (introduce a defect)
        user.setName("");
        assertTrue(user.getName().isEmpty());

        // Mutate the user's password to be empty (introduce a defect)
        user.setPassword("");
        assertTrue(user.getPassword().isEmpty());

        // Mutate the user's role to be null (introduce a defect)
        user.setRole(null);
        assertTrue(user.getRole() == null);

        // Mutate the user's favorite list to be empty (introduce a defect)
        user.setFavoriteList(Arrays.asList());
        assertTrue(user.getFavoriteList().isEmpty());

        // Mutate the user's allergies list to be null (introduce a defect)
        user.setAllergies(null);
        assertTrue(user.getAllergies() == null);

        // Introduce more mutations for better coverage
        // Mutate the user's username to an empty string (introduce a defect)
        user.setUserName("");
        assertTrue(user.getUserName().isEmpty());

        // Mutate the user's favorite list to be null (introduce a defect)
        user.setFavoriteList(null);
        assertTrue(user.getFavoriteList() == null);

        // Mutate the user's allergies list to be an empty list (introduce a defect)
        user.setAllergies(Arrays.asList());
        assertTrue(user.getAllergies().isEmpty());

        // Mutate the user's password to be null (introduce a defect)
        user.setPassword(null);
        assertTrue(user.getPassword() == null);

        // Introduce more mutations for better coverage
        // Mutate the user's name to be null (introduce a defect)
        user.setName(null);
        assertTrue(user.getName() == null);

        // Mutate the user's role to be an empty string (introduce a defect)
        user.setRole("");
        assertTrue(user.getRole().isEmpty());

        // Mutate the user's favorite list to be null (introduce a defect)
        user.setFavoriteList(null);
        assertTrue(user.getFavoriteList() == null);

        // Mutate the user's allergies list to be an empty list (introduce a defect)
        user.setAllergies(Arrays.asList());
        assertTrue(user.getAllergies().isEmpty());

        

    }

}
