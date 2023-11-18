package WhiteBox.Models;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

import main.java.model.User;

public class userModelTest {

	@Test
    public void testGetName() {
        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user");
        assertEquals("John Doe", user.getName());
    }

    @Test
    public void testSetName() {
        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user");
        user.setName("Jane Doe");
        assertEquals("Jane Doe", user.getName());
    }

    @Test
    public void testGetUserName() {
        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user");
        assertEquals("johndoe", user.getUserName());
    }

    @Test
    public void testSetUserName() {
        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user");
        user.setUserName("janedoe");
        assertEquals("janedoe", user.getUserName());
    }

    @Test
    public void testGetPassword() {
        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user");
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testSetPassword() {
        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user");
        user.setPassword("newpassword456");
        assertEquals("newpassword456", user.getPassword());
    }

    @Test
    public void testGetAllergies() {
        User user = new User("John Doe", "johndoe", "password123", Arrays.asList("nuts", "dairy"), "user");
        assertEquals(Arrays.asList("nuts", "dairy"), user.getAllergies());
    }

    @Test
    public void testSetAllergies() {
        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user");
        user.setAllergies(Arrays.asList("gluten", "soy"));
        assertEquals(Arrays.asList("gluten", "soy"), user.getAllergies());
    }

    @Test
    public void testGetRole() {
        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "admin");
        assertEquals("admin", user.getRole());
    }

    @Test
    public void testSetRole() {
        User user = new User("John Doe", "johndoe", "password123", Collections.emptyList(), "user");
        user.setRole("admin");
        assertEquals("admin", user.getRole());
    }

 

}
