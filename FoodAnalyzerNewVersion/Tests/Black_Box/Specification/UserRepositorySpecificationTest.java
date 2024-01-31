package Black_Box.Specification;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;

import main.java.model.User;
import main.java.repository.UserRepositoryImpl;

class UserRepositorySpecificationTest {

	private UserRepositoryImpl userRepository = new UserRepositoryImpl();

    @Test
    public void testAddUser() {
        User user = new User("John Doe", "john_doe", "password123", new ArrayList<>(), "user", null, "", "");
        userRepository.addUser(user);

        Document retrievedUser = userRepository.findUserbyUsername("john_doe");
        assertNotNull(retrievedUser);
        assertEquals("John Doe", retrievedUser.getString("name"));
        assertEquals("john_doe", retrievedUser.getString("userName"));
        assertEquals("password123", retrievedUser.getString("PasswordHash"));
        assertEquals("user", retrievedUser.getString("Role"));
        assertEquals(new ArrayList<>(), retrievedUser.getList("allergies", String.class));
        assertNull(retrievedUser.getList("FavoriteList", String.class));
    }

    @Test
    public void testAddUserDuplicateUsername() {
        User existingUser = new User("Existing User", "existing_user", "existing_password", new ArrayList<>(), "user", null, "", "");
        userRepository.addUser(existingUser);

        User duplicateUser = new User("Duplicate User", "existing_user", "password123", new ArrayList<>(), "user", null, "", "");
        userRepository.addUser(duplicateUser);

        Document retrievedUser = userRepository.findUserbyUsername("existing_user");
        assertNotNull(retrievedUser);
        assertEquals("Existing User", retrievedUser.getString("name"));
    }

    @Test
    public void testFindUserByUsername() {
        User user = new User("Find User", "find_user", "password123", new ArrayList<>(), "user", null, "", "");
        userRepository.addUser(user);

        Document retrievedUser = userRepository.findUserbyUsername("find_user");
        assertNotNull(retrievedUser);
        assertEquals("Find User", retrievedUser.getString("name"));
    }

    @Test
    public void testDeleteUserByUsername() {
        User user = new User("Delete User", "delete_user", "password123", new ArrayList<>(), "user", null, "", "");
        userRepository.addUser(user);

        userRepository.deleteUserbyUsername("delete_user");

        Document retrievedUser = userRepository.findUserbyUsername("delete_user");
        assertNull(retrievedUser);
    }

    @Test
    public void testUpdateUser() {
        User user = new User("Update User", "update_user", "password123", new ArrayList<>(), "user", null, "", "");
        userRepository.addUser(user);

        Document existingUserDocument = userRepository.findUserbyUsername("update_user");
        existingUserDocument.put("name", "Updated User");
        existingUserDocument.put("allergies", List.of("Updated Allergy"));

        userRepository.updateUser("update_user", existingUserDocument);

        Document updatedUser = userRepository.findUserbyUsername("update_user");
        assertNotNull(updatedUser);
        assertEquals("Updated User", updatedUser.getString("name"));
        assertEquals(List.of("Updated Allergy"), updatedUser.getList("allergies", String.class));
    }

    @Test
    public void testGetUserAllergiesByUsername() {
        User user = new User("Allergy User", "allergy_user", "password123", List.of("Peanuts", "Shellfish"), "user", null, "", "");
        userRepository.addUser(user);

        List<String> allergies = UserRepositoryImpl.getUserAllergiesByUsername("allergy_user");
        assertNotNull(allergies);
        assertEquals(List.of("Peanuts", "Shellfish"), allergies);
    }

}
