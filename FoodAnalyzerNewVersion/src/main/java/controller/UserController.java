package main.java.controller;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.bson.Document;

import main.java.model.User;
import main.java.repository.UserRepository;
import main.java.repository.UserRepositoryImpl;

public class UserController {
	private final UserRepository userRepository;
	
	public UserController() {
        this.userRepository =  new UserRepositoryImpl();
    }
	 public String hashPassword(String password) {
	        try {
	            // Generate a random salt
	            SecureRandom secureRandom = new SecureRandom();
	            byte[] salt = new byte[16];
	            secureRandom.nextBytes(salt);

	            // Combine password and salt
	            byte[] combined = concatenateByteArrays(salt, password.getBytes());

	            // Create MessageDigest instance for SHA-256
	            MessageDigest md = MessageDigest.getInstance("SHA-256");

	            // Update the digest with the combined bytes
	            byte[] hashedBytes = md.digest(combined);

	            // Encode the hashed bytes as a Base64 string
	            return Base64.getEncoder().encodeToString(concatenateByteArrays(salt, hashedBytes));
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	            // Handle the exception according to your needs
	            return null;
	        }
	    }

	    public static boolean checkPassword(String userInputPassword, String storedHashedPassword) {
	        // Decode the stored hashed password from Base64
	        byte[] storedHashBytes = Base64.getDecoder().decode(storedHashedPassword);

	        // Extract the salt from the stored hash
	        byte[] salt = new byte[16];
	        System.arraycopy(storedHashBytes, 0, salt, 0, 16);

	        // Combine the provided password and the stored salt
	        byte[] combined = concatenateByteArrays(salt, userInputPassword.getBytes());

	        try {
	            // Create MessageDigest instance for SHA-256
	            MessageDigest md = MessageDigest.getInstance("SHA-256");

	            // Update the digest with the combined bytes
	            byte[] hashedBytes = md.digest(combined);

	            // Compare the generated hash with the stored hash
	            return MessageDigest.isEqual(storedHashBytes, Base64.getDecoder().decode(Base64.getEncoder().encodeToString(hashedBytes)));
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	            // Handle the exception according to your needs
	            return false;
	        }
	    }

	    private static byte[] concatenateByteArrays(byte[] a, byte[] b) {
	        byte[] result = new byte[a.length + b.length];
	        System.arraycopy(a, 0, result, 0, a.length);
	        System.arraycopy(b, 0, result, a.length, b.length);
	        return result;
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
		//userRepository.deleteUser(UserName);
	}
	/**
	 * Update a user and  into the DB 
	 * @param name
	 * @param UserName
	 * @param password
	 * @param Allergies
	 * @return User
	 */
	public void UpdateUserAccount(String name,String UserName,String Password,String[] Allergies) {
		//User user = userRepository.getUser(UserName);
	
	}
	/**
	 * Check a user  in the DB 
	 * @param username
	 * @param password
	 * @return User
	 */
	public void CheckUserAccount(String UserName) {
		//User user = userRepository.getUser(UserName);
	}
}
