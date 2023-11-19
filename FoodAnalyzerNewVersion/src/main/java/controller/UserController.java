package main.java.controller;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.bson.Document;
import org.mindrot.jbcrypt.BCrypt;

import main.java.model.User;
import main.java.repository.UserRepository;
import main.java.repository.UserRepositoryImpl;

public class UserController {
	public final UserRepository userRepository;
	
	public UserController() {
        this.userRepository =  new UserRepositoryImpl();
    }
	 // Hash a password
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }

	/**
	 * take username and password form user
	 * check username and password in db and return the user
	 * otherwise return null, and admin acouunt
	 * @param username
	 * @param password
	 * @return User
	 */
	public boolean UserLogin(String username,String password) {
		  // Assuming userRepository.findUserbyUsername(username) returns a Document
	    Document userDocument = userRepository.findUserbyUsername(username);

	    // Check if the userDocument is not null to avoid NullPointerException
	    if (userDocument != null) {
	        String dbPass = userDocument.getString("PasswordHash");

	        // Directly return the result of checkPassword
	        return checkPassword(password, dbPass);
	    } else {
	        // User not found, return false or handle accordingly
	        return false;
	    }
		
	}
	
	/**
	 * Create a user and insert it into the DB 
	 * thake those params from user
	 * @param name
	 * @param UserName
	 * @param password
	 * @param Allergies
	 * @return User
	 */
	public void createUserAccount(String name, String userName, String password, List<String> allergies) {
		String PasswordHash = hashPassword(password);
        User newUser = new User(name, userName, PasswordHash, allergies, "user"); // Create a new user
        userRepository.addUser(newUser); // Add the user to the repository
    }
	/**
	 * delete a user from the DB 
	 * @param UserName
	 * 
	 */
	public void deleteUserAccount(String UserName) {
		userRepository.deleteUserbyUsername(UserName);
	}
	/**
	 * Update a user and  into the DB 
	 * @param name
	 * @param UserName
	 * @param password
	 * @param Allergies
	 * @return User
	 */
	public void UpdateUserAccount(String name,String UserName,String Password,List<String> Allergies,String CurrentUserName) {
	    // Retrieve the existing user document from the repository
	    Document existingUserDocument = userRepository.findUserbyUsername(CurrentUserName);

	    // Check if the user exists
	    if (existingUserDocument != null) {
	        // Update the relevant fields
	        existingUserDocument.put("name", name);
	        existingUserDocument.put("userName", UserName);
	        existingUserDocument.put("PasswordHash", hashPassword(Password));
	        existingUserDocument.put("allergies", Allergies);

	        // Update the user document in the repository
	        userRepository.updateUser(CurrentUserName, existingUserDocument);
	        
	        System.out.println("User updated successfully.");
	    } else {
	        System.out.println("User not found. Update failed.");
	    }
	
	}
	/**
	 * Check a user  in the DB 
	 * @param username
	 * @param password
	 * @return User
	 */
	public Document CheckUserAccount(String UserName) {
		return userRepository.findUserbyUsername(UserName);
		
	}
}
