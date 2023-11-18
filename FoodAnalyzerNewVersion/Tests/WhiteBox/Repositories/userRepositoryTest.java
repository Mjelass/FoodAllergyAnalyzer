package WhiteBox.Repositories;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import main.java.model.User;
import main.java.repository.UserRepositoryImpl;

import org.bson.Document;
import org.junit.Test;




public class userRepositoryTest {

	   @Test
	    public void testAddUser() {
	        UserRepositoryImpl userRepository = new UserRepositoryImpl();

	        // Create a user for testing
	        User userToAdd = new User("John Doe", "johndoe", "password123", null, "user");

	        // Add the user
	        userRepository.addUser(userToAdd);

	        // Retrieve the added user
	        Document retrievedUser = userRepository.findUserbyUsername("johndoe");

	        // Check if the user was added successfully
	        assertEquals("John Doe", retrievedUser.getString("name"));
	        assertEquals("johndoe", retrievedUser.getString("userName"));
	        assertEquals("password123", retrievedUser.getString("PasswordHash"));
	        assertNull(retrievedUser.get("allergies"));
	        assertEquals("user", retrievedUser.getString("Role"));

	        // Clean up: Delete the added user
	        userRepository.deleteUserbyUsername("johndoe");
	    }

	    @Test
	    public void testFindUserbyUsername() {
	        UserRepositoryImpl userRepository = new UserRepositoryImpl();

	        // Attempt to find a user that doesn't exist
	        Document result = userRepository.findUserbyUsername("nonexistentuser");

	        // Check that the result is null for a nonexistent user
	        assertNull(result);
	    }

	    @Test
	    public void testDeleteUserbyUsername() {
	        UserRepositoryImpl userRepository = new UserRepositoryImpl();

	        // Create a user for testing
	        User userToDelete = new User("Jane Doe", "janedoe", "password456", null, "admin");

	        // Add the user
	        userRepository.addUser(userToDelete);

	        // Delete the added user
	        userRepository.deleteUserbyUsername("janedoe");

	        // Attempt to find the deleted user
	        Document result = userRepository.findUserbyUsername("janedoe");

	        // Check that the result is null for a deleted user
	        assertNull(result);
	    }
	    
	    @Test
	    public void testUpdateUser() {
	        UserRepositoryImpl userRepository = new UserRepositoryImpl();

	        // Add a user for testing
	        User userToAdd = new User("existinguser", "existinguser", "password123", null, "user");
	        userRepository.addUser(userToAdd);

	        // Create an existing user document with modified fields
	        Document existingUserDocument = new Document("name", "Updated Name")
	                .append("allergies", Collections.singletonList("New Allergy"));

	        // Perform the update
	        userRepository.updateUser("existinguser", existingUserDocument);

	        // Retrieve the updated user
	        Document updatedUser = userRepository.findUserbyUsername("existinguser");

	        // Check if the user's name is updated correctly
	        assertEquals("Updated Name", updatedUser.getString("name"));

	        // Check if the user's allergies are updated correctly
	        List<?> allergies = (List<?>) updatedUser.get("allergies");
	        assertNotNull(allergies);
	        assertEquals(1, allergies.size());
	        assertEquals("New Allergy", allergies.get(0));

	        // Clean up: Delete the added user
	        userRepository.deleteUserbyUsername("existinguser");
	    }
}
