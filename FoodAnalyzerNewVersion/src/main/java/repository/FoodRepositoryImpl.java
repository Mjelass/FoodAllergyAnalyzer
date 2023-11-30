package main.java.repository;

import static com.mongodb.client.model.Filters.eq;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;

import main.java.model.Food;

public class FoodRepositoryImpl implements FoodRepository {
	private String connectionString;

    public FoodRepositoryImpl() {
        //users = loadUsers();
        connectionString = "mongodb+srv://smagroup475:poiuy98765@cluster0.rz7navz.mongodb.net/?retryWrites=true&w=majority"; // Modify this based on your MongoDB server configuration   
    }
	@Override
	public void addFood(Food newFood) {
		try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Connect to the "cluster0" database
            MongoDatabase database = mongoClient.getDatabase("cluster0");

            // Create a collection (if not exists)
            MongoCollection<Document> collection = database.getCollection("Food");
            
            Document existingFood = collection.find(eq("name", newFood.getName())).first();

            if (existingFood == null) {
                // Insert a document into the collection
                Document document = new Document("name", newFood.getName())
                        .append("ingridients", newFood.getIngridients())
                        .append("allergies", newFood.getAllergies()) 
                        .append("Category", newFood.getCategory())
                        .append("Price", newFood.getPrice());

                collection.insertOne(document);

                System.out.println("Food inserted successfully.");
            } else {
                System.out.println("Food name already exists. Please choose a differentname.");
            }

        } catch (Exception e) {
            // Log the exception or handle it more gracefully
            e.printStackTrace();
        }
		
	}
	@Override
	public void deleteFoodByName(String name) {
		try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Connect to the "cluster0" database
            MongoDatabase database = mongoClient.getDatabase("cluster0");

            // Create a collection (if not exists)
            MongoCollection<Document> collection = database.getCollection("Food");
            
            Document existingFood = collection.find(eq("name", name)).first();

            if (existingFood != null) {
            	// Specify the filter to find the user to delete
                Document filter = new Document("name", name);

                // Perform the delete
                collection.deleteOne(filter);

                System.out.println("Food deleted successfully.");
            } else {
                System.out.println("Error, Food does not  exists.");
            }

        } catch (Exception e) {
            // Log the exception or handle it more gracefully
            e.printStackTrace();
        }
		
	}
	
	@Override
	public void UpdateFoodByName(String nameFoodToEdit,Food newFood) {
		try (MongoClient mongoClient = MongoClients.create(connectionString)) {
	        // Connect to the "cluster0" database
	        MongoDatabase database = mongoClient.getDatabase("cluster0");

	        // Create a collection (if not exists)
	        MongoCollection<Document> collection = database.getCollection("Food");
	        Document existingFoodDocument = collection.find(eq("name", nameFoodToEdit)).first();

		    // Check if the food exists
		    if (existingFoodDocument != null) {
		        // Update the relevant fields
		    	existingFoodDocument.put("name", newFood.getName());
		    	existingFoodDocument.put("ingridients", newFood.getIngridients());
		    	existingFoodDocument.put("allergies", newFood.getAllergies());
		    	existingFoodDocument.put("Category", newFood.getCategory());
		    	existingFoodDocument.put("Price", newFood.getPrice());

		    	// Specify the filter to find the food to update
		        Document filter = new Document("name", nameFoodToEdit);

	        // Create an update document with the modified fields
	        Document updateDocument = new Document("$set", existingFoodDocument);

	        // Perform the update
	        UpdateResult updateResult = collection.updateOne(filter, updateDocument);
            System.out.println("Food apdated Successfully!!");

	        
	        } else {
	            System.out.println("Food not found or no changes made. Update failed.");
	        }

	    } catch (Exception e) {
	        // Log the exception or handle it more gracefully
	        e.printStackTrace();
	    }
		
	}
	@Override
	public void checkFoodByName(String nameFoodTocheck) {
		try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Connect to the "cluster0" database
            MongoDatabase database = mongoClient.getDatabase("cluster0");

            // Create a collection (if not exists)
            MongoCollection<Document> collection = database.getCollection("Food");

         // Create a query to find a food by name
            Document query = new Document("name", nameFoodTocheck);

            // Execute the query and retrieve the result
            Document res= collection.find(query).first();
            
            if(res != null) {
            	System.out.println("name :"+res.getString("name"));
        		List<String> ingridients = res.getList("ingridients", String.class);
        		String s="";
        		if(ingridients != null) {
        			for (String ing : ingridients) {
        	            s= s +" "+ing;
        	        }
        		}
        		System.out.println("ingridients :"+s);
        		
        		List<String> allergyList = res.getList("allergies", String.class);
        		s="";
        		if(allergyList != null) {
        			for (String allergy : allergyList) {
        	            s= s +" "+allergy;
        	        }
        		}
        		System.out.println("allergies :"+s);
        		System.out.println("Category :"+res.getString("Category"));
        		System.out.println("Price :"+res.getLong("Price"));
            }else {
        		System.out.println("ERROR, The product "+nameFoodTocheck+" Does not exist");
        		System.exit(0);
            }
    		

        } catch (Exception e) {
            // Log the exception or handle it more gracefully
            e.printStackTrace();
        }
		
	}
}

