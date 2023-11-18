package main.java.repository;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
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
    private final String filePath = "src\\main\\resources\\data\\users.json";
    private final ObjectMapper objectMapper = new ObjectMapper();
    private List<User> users;
    private String connectionString;

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

            // Insert a document into the collection
            Document document = new Document("name", user.getName())
                    .append("userName", user.getUserName())
                    .append("PasswordHash", user.getPassword()) // Consider using a secure hash, not plain text
                    .append("allergies", user.getAllergies())
                    .append("Role", user.getRole());

            collection.insertOne(document);

            System.out.println("Document inserted successfully.");

        } catch (Exception e) {
            // Log the exception or handle it more gracefully
            e.printStackTrace();
        }
        //users.add(user);
        //saveUsers();
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

}