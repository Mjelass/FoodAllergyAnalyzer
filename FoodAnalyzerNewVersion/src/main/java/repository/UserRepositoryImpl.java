package main.java.repository;
import com.mongodb.client.MongoClients;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.java.model.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private static String connectionString;

    public UserRepositoryImpl() {
        //users = loadUsers();
        connectionString = "mongodb+srv://smagroup475:poiuy98765@cluster0.rz7navz.mongodb.net/?retryWrites=true&w=majority"; // Modify this based on your MongoDB server configuration

        
    }

  
    

    @Override
    public void addUser(User user) {
    	try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Connect to the "cluster0" database
            MongoDatabase database = mongoClient.getDatabase("cluster0");

            // Create a collection (if not exists)
            MongoCollection<Document> collection = database.getCollection("UsersSoftMes");
            
            Document existingUser = collection.find(eq("userName", user.getUserName())).first();


            if (existingUser == null) {
                // Insert a document into the collection
                Document document = new Document("name", user.getName())
                        .append("userName", user.getUserName())
                        .append("PasswordHash", user.getPassword()) 
                        .append("allergies", user.getAllergies())
                        .append("Role", user.getRole())
                		.append("FavoriteList", user.getFavoriteList());

                collection.insertOne(document);

                System.out.println("User inserted successfully.");
            } else {
                System.out.println("Username already exists. Please choose a different username.");
            }

        } catch (Exception e) {
            // Log the exception or handle it more gracefully
            e.printStackTrace();
        }
        
    }

	@Override
	public Document findUserbyUsername(String Username) {
		try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Connect to the "cluster0" database
            MongoDatabase database = mongoClient.getDatabase("cluster0");

            // Create a collection (if not exists)
            MongoCollection<Document> collection = database.getCollection("UsersSoftMes");

         // Create a query to find a user by username
            Document query = new Document("userName", Username);

            // Execute the query and retrieve the result
            return collection.find(query).first();

        } catch (Exception e) {
            // Log the exception or handle it more gracefully
            e.printStackTrace();
        }
		return null;
	}
	
	@Override
	public void deleteUserbyUsername(String Username) {
		try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Connect to the "cluster0" database
            MongoDatabase database = mongoClient.getDatabase("cluster0");

            // Create a collection (if not exists)
            MongoCollection<Document> collection = database.getCollection("UsersSoftMes");

         // Specify the filter to find the user to delete
            Document filter = new Document("userName", Username);

            // Perform the delete
            collection.deleteOne(filter);
            System.out.println("Succefully deleated");
        } catch (Exception e) {
            // Log the exception or handle it more gracefully
            e.printStackTrace();
        }
		
	}




	@Override
	public void updateUser(String userName, Document existingUserDocument) {
		 try (MongoClient mongoClient = MongoClients.create(connectionString)) {
		        // Connect to the "cluster0" database
		        MongoDatabase database = mongoClient.getDatabase("cluster0");

		        // Create a collection (if not exists)
		        MongoCollection<Document> collection = database.getCollection("UsersSoftMes");

		        // Specify the filter to find the user to update
		        Document filter = new Document("userName", userName);

		        // Create an update document with the modified fields
		        Document updateDocument = new Document("$set", existingUserDocument);

		        // Perform the update
		        UpdateResult updateResult = collection.updateOne(filter, updateDocument);

		        if (updateResult.getModifiedCount() > 0) {
		            System.out.println("User updated successfully.");
		        } else {
		            System.out.println("User not found or no changes made. Update failed.");
		        }

		    } catch (Exception e) {
		        // Log the exception or handle it more gracefully
		        e.printStackTrace();
		    }
		
	}
	//New methods 25.11.2023
	public static List<String> getUserAllergiesByUsername(String username) {
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Connect to the "cluster0" database
            MongoDatabase database = mongoClient.getDatabase("cluster0");

            // Create a collection (if not exists)
            MongoCollection<Document> collection = database.getCollection("UsersSoftMes");

            // Create a query to find a user by username
            Document query = new Document("userName", username);

            // Execute the query and retrieve the result
            Document userDocument = collection.find(query).first();

            if (userDocument != null) {
                // Retrieve and return the user's allergies
                return userDocument.getList("allergies", String.class);
            } else {
                System.out.println("User not found.");
            }

        } catch (Exception e) {
            // Log the exception or handle it more gracefully
            e.printStackTrace();
        }

        return null;
    }

}