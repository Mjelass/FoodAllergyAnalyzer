package White_Box.MutationCoverage;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import main.java.model.User;
import main.java.repository.UserRepositoryImpl;

class UserRepositoryMutationTest {

	private static final String connectionString = "mongodb+srv://smagroup475:poiuy98765@cluster0.rz7navz.mongodb.net/?retryWrites=true&w=majority";

    
    public void cleanupData() {
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("cluster0");
            MongoCollection<Document> collection = database.getCollection("UsersSoftMes");
            collection.deleteMany(Filters.in("userName", "john.doe", "nonexistent.user"));
        }
    }

    @Test
    public void testAddUser() throws Exception {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();

        // Test adding a user with valid data
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));
        userRepository.addUser(user );
        Document addedUser = userRepository.findUserbyUsername("john.doe");
        assertNotNull("User not added successfully", addedUser);

        // Test adding a user with null username
        userRepository.addUser(new User("Alice", null, "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1")));

        // Test adding a user with an existing username
        userRepository.addUser(user );
        System.out.println("Expected: Username already exists. Please choose a different username.");
        
     

        // Clean up data
        cleanupData();
    }

    @Test
    public void testFindUserByUsername() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();

        // Test finding an existing user by username
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));
        userRepository.addUser(user);
        Document userDocument = userRepository.findUserbyUsername("john.doe");
        assertNotNull("Existing user not found", userDocument);

        // Test finding a non-existing user by username
        Document nonExistingUserDocument = userRepository.findUserbyUsername("nonexistent.user");
        assertNull("Non-existing user found", nonExistingUserDocument);

        // Additional test cases for exception scenarios
        try {
            // Test with a null username
            userRepository.findUserbyUsername(null);
        } catch (Exception e) {
            assertNotNull("Exception not handled correctly", e.getMessage());
        }

        // Clean up data
        cleanupData();
    }

    @Test
    public void testDeleteUserByUsername() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();

        // Test deleting an existing user by username
        userRepository.deleteUserbyUsername("john.doe");
        Document deletedUser = userRepository.findUserbyUsername("john.doe");
        assertNull("User not deleted successfully", deletedUser);

        // Test deleting a non-existing user by username
        userRepository.deleteUserbyUsername("nonexistent.user");
        System.out.println("Expected: User not found. Deletion failed.");

        // Clean up data
        cleanupData();
    }

    @Test
    public void testUpdateUser() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));
        userRepository.addUser(user);

        // Test updating an existing user
        Document existingUserDocument = userRepository.findUserbyUsername("john.doe");
        existingUserDocument.put("name", "Updated Name");
        userRepository.updateUser("john.doe", existingUserDocument);
        Document updatedUser = userRepository.findUserbyUsername("john.doe");
        assertEquals("Updated Name", updatedUser.getString("name"));

        // Test updating a non-existing user
        Document nonExistingUserDocument = new Document("name", "NonExistingUser");
        userRepository.updateUser("nonexistent.user", nonExistingUserDocument);
        System.out.println("Expected: User not found or no changes made. Update failed.");
        
        

        // Clean up data
        cleanupData();
    }

    @Test
    public void testGetUserAllergiesByUsername() {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        User user = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts"), "User", Arrays.asList("Movie1"));
        userRepository.addUser(user);

        // Test getting allergies for an existing user
        List<String> allergies = userRepository.getUserAllergiesByUsername("john.doe");
        assertNotNull("Allergies not retrieved successfully", allergies);

        // Test getting allergies for a non-existing user
        List<String> nonExistingUserAllergies = userRepository.getUserAllergiesByUsername("nonexistent.user");
        assertNull("Allergies retrieved for non-existing user", nonExistingUserAllergies);

        // Additional test cases for exception scenarios
        try {
            // Test with a null username
            userRepository.getUserAllergiesByUsername(null);
        } catch (Exception e) {
            assertNotNull("Exception not handled correctly", e.getMessage());
        }

        // Clean up data
        cleanupData();
    }

}
