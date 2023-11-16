package main.java.controller;
import main.java.model.User;
import main.java.repository.UserRepository;
import main.java.repository.UserRepositoryImpl;

public class UserController {
	private final UserRepository userRepository;
	
	public UserController() {
        this.userRepository =  new UserRepositoryImpl();
    }
	/**
	 * Take a password and then hash it
	 * @param password
	 * @return hached password
	 */
	public String HashPassword(String password) {
		return null;
	}
	/**
	 * Take a Hashed password and then check it
	 * @param password hashed
	 * @return password
	 */
	public String CheckHashedPassword(String password) {
		return null;
	}
	/**
	 * take username and password form user
	 * check username and password in db and return the user
	 * otherwise return null, and admin acouunt
	 * @param username
	 * @param password
	 * @return User
	 */
	public User UserLogin() {
		return null;
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
	public void createUserAccount(String name, String userName, String password, String[] allergies) {
        User newUser = new User(name, userName, password, allergies, "user"); // Create a new user
        userRepository.addUser(newUser); // Add the user to the repository
    }
	/**
	 * delete a user from the DB 
	 * @param UserName
	 * 
	 */
	public void deleteUserAccount(String UserName) {
		
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
		
	}
	/**
	 * Check a user  in the DB 
	 * @param username
	 * @param password
	 * @return User
	 */
	public void CheckUserAccount(String UserName) {
		
	}
}
