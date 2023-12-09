package main.java.repository;
import org.bson.Document;

import com.mongodb.client.result.UpdateResult;

import main.java.model.User;

public interface UserRepository {
    
    Document addUser(User newUser);
    Document findUserbyUsername(String Username);
    void deleteUserbyUsername(String Username);
    UpdateResult updateUser(String userName, Document existingUserDocument);
	
}
