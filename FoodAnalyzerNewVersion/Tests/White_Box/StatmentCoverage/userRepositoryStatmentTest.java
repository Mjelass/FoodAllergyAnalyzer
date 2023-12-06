package White_Box.StatmentCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;

import main.java.model.User;
import main.java.repository.UserRepositoryImpl;

class userRepositoryStatmentTest {

	@Test
    public void testAddUser() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));

        userRepository.addUser(user);

        // Validate that the user has been added to the collection
        Document addedUser = userRepository.findUserbyUsername("john.doe");
        assertNotNull(addedUser);
    }

    @Test
    public void testFindUserByUsername() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));

        // Add a user to the collection for testing
        userRepository.addUser(user);

        // Validate that the user can be found by username
        Document foundUser = userRepository.findUserbyUsername("john.doe");
        assertNotNull(foundUser);
    }

    @Test
    public void testDeleteUserByUsername() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));

        // Add a user to the collection for testing
        userRepository.addUser(user);

        // Delete the user by username
        userRepository.deleteUserbyUsername("john.doe");

        // Validate that the user has been deleted
        Document deletedUser = userRepository.findUserbyUsername("john.doe");
        assertNull(deletedUser);
    }

    @Test
    public void testUpdateUser() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));

        // Add a user to the collection for testing
        userRepository.addUser(user);

        // Update the user information
        Document updatedUserInfo = new Document("name", "Updated Name")
                .append("userName", "john.doe")
                .append("PasswordHash", "newpassword")
                .append("allergies", Arrays.asList("Updated Allergies"))
                .append("Role", "Admin")
                .append("FavoriteList", Arrays.asList("Updated Movie"));

        userRepository.updateUser("john.doe", updatedUserInfo);

        // Validate that the user information has been updated
        Document updatedUser = userRepository.findUserbyUsername("john.doe");
        assertNotNull(updatedUser);
    }

    @Test
    public void testGetUserAllergiesByUsername() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));

        // Add a user to the collection for testing
        userRepository.addUser(user);

        // Get user allergies by username
        List<String> allergies = userRepository.getUserAllergiesByUsername("john.doe");

        // Validate that the user allergies are retrieved
        assertNotNull(allergies);
    }

}
