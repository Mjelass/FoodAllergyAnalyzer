package main.java.model;
import java.util.List;


public class User {
	private String name;
	private String UserName;
	private String Password;
	private List<String> Allergies;
	private String Role;
	private List<String> FavoriteList;
	private String EmergencyContactEmail;
	private String EmergencyContactNumber;
	
	public List<String> getFavoriteList() {
		return FavoriteList;
	}
	public void setFavoriteList(List<String> favoriteList) {
		FavoriteList = favoriteList;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	public User(String name, String userName, String password, List<String> allergies, String role,
			List<String> favoriteList, String emergencyContactEmail, String emergencyContactNumber) {
		super();
		this.name = name;
		UserName = userName;
		Password = password;
		Allergies = allergies;
		Role = role;
		FavoriteList = favoriteList;
		EmergencyContactEmail = emergencyContactEmail;
		EmergencyContactNumber = emergencyContactNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public List<String> getAllergies() {
		return Allergies;
	}
	public void setAllergies(List<String> allergies) {
		Allergies = allergies;
	}
	public String getEmergencyContactEmail() {
		return EmergencyContactEmail;
	}
	public void setEmergencyContactEmail(String newEmergencyContactEmail) {
		EmergencyContactEmail = newEmergencyContactEmail;
	}
	public String getEmergencyContactNumber() {
		return EmergencyContactNumber;
	}
	public void setEmergencyContactNumber(String newEmergencyContactNumber) {
		EmergencyContactNumber = newEmergencyContactNumber;
	}
	
}
