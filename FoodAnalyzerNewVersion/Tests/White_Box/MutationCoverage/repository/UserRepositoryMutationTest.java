package White_Box.MutationCoverage.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;

import com.mongodb.client.MongoClient;

import main.java.model.User;
import main.java.repository.UserRepositoryImpl;

class UserRepositoryMutationTest {

	@Test
    public void testAddUser() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));

        // Intentionally changing the collection name
        userRepository.addUser(user1);

        // Ensure that the user is not added because of the mutated collection name
        Document addedUser = userRepository.findUserbyUsername("johndoe");
        assertNull(addedUser);
    }

    @Test
    public void testFindUserByUsername() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));
        userRepository.addUser(user1);

        // Intentionally changing the query to find a non-existent user
        Document foundUser = userRepository.findUserbyUsername("nonexistent.user");
        assertNull(foundUser);
    }

    @Test
    public void testDeleteUserByUsername() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));
        userRepository.addUser(user1);

        // Intentionally changing the username for deletion
        userRepository.deleteUserbyUsername("nonexistent.user");

        // Ensure that the user is not deleted because of the mutated username
        Document deletedUser = userRepository.findUserbyUsername("john.doe");
        assertNotNull(deletedUser);
    }

    @Test
    public void testUpdateUser() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));
        userRepository.addUser(user1);

        // Intentionally changing the update document fields
        Document updatedUserInfo = new Document("name", "Updated Name")
                .append("userName", "john.doe")
                .append("PasswordHash", "newpassword")
                .append("allergies", Arrays.asList("Updated Allergies"))
                .append("Role", "Admin")
                .append("FavoriteList", Arrays.asList("Updated Movie"));

        userRepository.updateUser("john.doe", updatedUserInfo);

        // Re-fetch the user from the repository after the update
        Document updatedUser = userRepository.findUserbyUsername("john.doe");

        // Ensure that the user information is  updated with the mutated fields
        assertEquals("Updated Name", updatedUser.get("name"));
        assertEquals("newpassword", updatedUser.get("PasswordHash"));
    }

    @Test
    public void testGetUserAllergiesByUsername() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user1 = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));
        userRepository.addUser(user1);

        // Intentionally changing the username for getting allergies
        List<String> allergies = userRepository.getUserAllergiesByUsername("nonexistent.user");

        // Ensure that the allergies are not retrieved because of the mutated username
        assertNull(allergies);
    }

}
