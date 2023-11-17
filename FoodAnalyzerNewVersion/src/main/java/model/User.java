package main.java.model;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	private String name;
	private String UserName;
	private String Password;
	private String[] Allergies;
	private String Role;
	
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	public User(String name,
             String userName,
             String password,
             String[] allergies,
             String role) {
		super();
		this.name = name;
		UserName = userName;
		Password = password;
		Allergies = allergies;
		Role = role;
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
	public String[] getAllergies() {
		return Allergies;
	}
	public void setAllergies(String[] allergies) {
		Allergies = allergies;
	}
	
	
}
