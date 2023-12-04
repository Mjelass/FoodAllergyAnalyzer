package main.java.controller;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.bson.Document;
import org.mindrot.jbcrypt.BCrypt;

import main.java.model.User;
import main.java.repository.FoodRepository;
import main.java.repository.FoodRepositoryImpl;
import main.java.repository.UserRepository;
import main.java.repository.UserRepositoryImpl;

public class UserController {
	public final UserRepository userRepository;
	public final FoodRepository foodRepository;
	private Scanner scanner;
	
	public UserController() {
        this.userRepository =  new UserRepositoryImpl();
        this.scanner=new Scanner(System.in);
		this.foodRepository = new FoodRepositoryImpl();
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
        User newUser = new User(name, userName, PasswordHash, allergies, "user",null); // Create a new user
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
	 * @return 
	 * @return User
	 */
	public Document UpdateUserAccount(String name,String UserName,String Password,List<String> Allergies,String CurrentUserName) {
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
	        return userRepository.findUserbyUsername(UserName);
	    } else {
	        System.out.println("User not found. Update failed.");
	        return null;
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
	
	public void addFavList(String UserName, String Prod) {
		foodRepository.checkFoodByName(Prod);
		Document existingUserDocument = userRepository.findUserbyUsername(UserName);
		if(existingUserDocument!=null) {
		List<String> favList = existingUserDocument.getList("FavoriteList", String.class);
		if(favList != null && favList.contains(Prod)) {
			System.out.println("Sorry but "+Prod+" already included in your list.");
		} else {
			if (favList == null) {
		        favList = new ArrayList<>();
		    }
			favList.add(Prod);
			existingUserDocument.put("FavoriteList", favList);
			userRepository.updateUser(UserName, existingUserDocument);
			System.out.println("product added succesfully to your favorite List");
		}}
		
		
	}
	public void deleteFavList(String UserName, String Produ) {
		foodRepository.checkFoodByName(Produ);
		Document existingUserDocument = userRepository.findUserbyUsername(UserName);
		if(existingUserDocument!= null) {
			List<String> favList = existingUserDocument.getList("FavoriteList", String.class);
		
		
		if(favList != null && favList.contains(Produ)) {
			favList.remove(Produ);
			existingUserDocument.put("FavoriteList", favList);
			userRepository.updateUser(UserName, existingUserDocument);
			System.out.println("product deleated succesfully from your favorite List");
		} else {
			System.out.println("Sorry but "+Produ+" dosen't exist in your  favorite list.");
		}}
		
	}
	public void checkFavList(String UserName) {
		Document existingUserDocument = userRepository.findUserbyUsername(UserName);
		List<String> favList = existingUserDocument.getList("FavoriteList", String.class);
		if (favList != null && !favList.isEmpty()) {
		    System.out.println("Content of your favorite list:");
		    for (String item : favList) {
		        System.out.println(item);
		    }
		} else {
		    System.out.println("Your favorite list is empty");
		}
	}
		

	public void updatePassword(String userName, String newPassword) {
		Document existingUserDocument = userRepository.findUserbyUsername(userName);

	    if (existingUserDocument != null) {
	        existingUserDocument.put("PasswordHash", hashPassword(newPassword));
	        userRepository.updateUser(userName, existingUserDocument);
	        System.out.println("Password updated successfully.");
	    } else {
	        System.out.println("User not found. Update failed.");
	    }
	}

	public void updateName(String userName, String newName) {
	    Document existingUserDocument = userRepository.findUserbyUsername(userName);
	    
	    if (existingUserDocument != null) {
	        existingUserDocument.put("name", newName);
	        userRepository.updateUser(userName, existingUserDocument);
	        System.out.println("Name updated successfully.");
	    } else {
	        System.out.println("User not found. Update failed.");
	    }
	}
	public void updateUserName(String userName, String newUserName) {
	    Document existingUserDocument = userRepository.findUserbyUsername(userName);

	    if (existingUserDocument != null) {
	        existingUserDocument.put("userName", newUserName);
	        userRepository.updateUser(userName, existingUserDocument);
	        System.out.println("Name updated successfully.");
	    } else {
	        System.out.println("User not found. Update failed.");
	    }
	}
}
