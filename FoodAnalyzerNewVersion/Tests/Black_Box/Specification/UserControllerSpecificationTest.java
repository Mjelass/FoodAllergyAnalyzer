package Black_Box.Specification;
import org.bson.Document;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.java.model.User;
import main.java.repository.UserRepositoryImpl;
import main.java.controller.UserController;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;



public class UserControllerSpecificationTest {
	private UserRepositoryImpl userRepository = new UserRepositoryImpl();
	private static UserController uc = new UserController();
	
	
	@AfterAll
	static void setup() {
		uc.deleteUserAccount("TestUpdateUserName");
		uc.deleteUserAccount("TestUpdateName");
		uc.deleteUserAccount("TestUpdatePassword");
		uc.deleteUserAccount("TestUpdateEmergencyEmail");
		uc.deleteUserAccount("TestUpdateEmergencyNumber");
	}
	
	@Test
	public void TestUpdateUserName() {
		User TestUser = new User("Existing User", "TestUpdateUserName", "existing_password", new ArrayList<>(), "user", null, "", "");
		userRepository.addUser(TestUser);
		
		uc.updateUserName("TestUpdateUserName", "TestUpdateUserName_Updated");
		
		Document ETestUesr = userRepository.findUserbyUsername("TestUpdateUserName_Updated");
		assertNotNull(ETestUesr);
		assertEquals("TestUpdateUserName_Updated", ETestUesr.getString("userName"));
	}
	
	@Test
	public void TestUpdateName() {
		User TestUser = new User("Existing User", "TestUpdateName", "existing_password", new ArrayList<>(), "user", null, "", "");
		userRepository.addUser(TestUser);
		
		uc.updateName("TestUpdateName", "Existing User Update");
		
		Document ETestUser = userRepository.findUserbyUsername("TestUpdateName");
		assertNotNull(ETestUser);
		assertEquals("Existing User Update", ETestUser.getString("name"));
	}
	
	@Test
	public void TestUpdatePassword() {
		User TestUser = new User("Existing User", "TestUpdatePassword", "existing_password", new ArrayList<>(), "user", null, "", "");
		userRepository.addUser(TestUser);
		
		uc.updatePassword("TestUpdatePassword", "existing_password_update");
		
		Document ETestUser = userRepository.findUserbyUsername("TestUpdatePassword");
		boolean HashP = UserController.checkPassword("existing_password_update", ETestUser.getString("PasswordHash"));
		assertNotNull(ETestUser);
		assertTrue("works", HashP);
	}
	
	@Test
	public void TestUpdateEmergencyEmail() {
		User TestUser = new User("Existing User", "TestUpdateEmergencyEmail", "existing_password", new ArrayList<>(), "user", null, "", "");
		userRepository.addUser(TestUser);
		
		uc.updateUserEmergencyEmail("TestUpdateEmergencyEmail", "New@gmail.com");
		
		Document ETestUser = userRepository.findUserbyUsername("TestUpdateEmergencyEmail");
		assertNotNull(ETestUser);
		assertEquals("New@gmail.com", ETestUser.getString("ECEmail"));
	}
	
	@Test
	public void TestUpdateEmergencyNumber() {
		User TestUser = new User("Existing User", "TestUpdateEmergencyNumber", "existing_password", new ArrayList<>(), "user", null, "", "");
		userRepository.addUser(TestUser);
		
		uc.updateUserEmegencyNumber("TestUpdateEmergencyNumber", "123456789");
		
		Document ETestUser = userRepository.findUserbyUsername("TestUpdateEmergencyNumber");
		assertNotNull(ETestUser);
		assertEquals("123456789",  ETestUser.getString("ECNumber"));
	}
	
}
