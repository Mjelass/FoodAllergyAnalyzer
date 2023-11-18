package main.java.repository;
import org.bson.Document;

import main.java.model.User;

public interface UserRepository {
    
    void addUser(User newUser);
    Document findUserbyUsername(String Username);
    void deleteUserbyUsername(String Username);
	void updateUser(String userName, Document existingUserDocument);
    
}
