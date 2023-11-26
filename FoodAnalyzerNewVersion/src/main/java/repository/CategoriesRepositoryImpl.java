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

import main.java.model.Food;
import main.java.model.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CategoriesRepositoryImpl {
	private static String connectionString;
	
    public CategoriesRepositoryImpl() {
        connectionString = "mongodb+srv://smagroup475:poiuy98765@cluster0.rz7navz.mongodb.net/?retryWrites=true&w=majority"; 
    }

	public static List<List<Food>> getAllCategories() {
	    List<List<Food>> categories = new ArrayList<>();

	    try (MongoClient mongoClient = MongoClients.create(connectionString)) {
	        // Connect to the "cluster0" database
	        MongoDatabase database = mongoClient.getDatabase("cluster0");

	        // Create a collection (if not exists)
	        MongoCollection<Document> collection = database.getCollection("Food");

	        // Use distinct to get unique values of the "Category" field
	        List<String> uniqueCategories = collection.distinct("Category", String.class).into(new ArrayList<>());

	        // Retrieve foods for each category
	        for (String category : uniqueCategories) {
	            Document query = new Document("Category", category);
	            List<Document> foodDocuments = collection.find(query).into(new ArrayList<>());

	            List<Food> foodsInCategory = new ArrayList<>();
	            for (Document foodDocument : foodDocuments) {
	                String name = foodDocument.getString("name");
	                List<String> ingridients = foodDocument.getList("ingridients", String.class);
	                List<String> allergies = foodDocument.getList("allergies", String.class);
	                String foodCategory = foodDocument.getString("Category");
	                Long price = foodDocument.getLong("Price");

	                Food food = new Food(name, ingridients, allergies, foodCategory, price);
	                foodsInCategory.add(food);
	            }

	            categories.add(foodsInCategory);
	        }

	    } catch (Exception e) {
	        // Log the exception or handle it more gracefully
	        e.printStackTrace();
	    }

	    return categories;
	}
	 public static List<Food> getFoodsByCategory(List<Food> category) {
		    List<Food> foodsInCategory = new ArrayList<>();

		    try (MongoClient mongoClient = MongoClients.create(connectionString)) {
		        // Connect to the "cluster0" database
		        MongoDatabase database = mongoClient.getDatabase("cluster0");

		        // Create a collection (if not exists)
		        MongoCollection<Document> collection = database.getCollection("Food");

		        // Create a query to find foods by category
		        if (!category.isEmpty()) {
		            String categoryValue = category.get(0).getCategory();
		            Document query = new Document("Category", categoryValue);

			        // Execute the query and retrieve the results
			        List<Document> foodDocuments = collection.find(query).into(new ArrayList<>());
	
			        // Convert the document results to Food objects
			        for (Document foodDocument : foodDocuments) {
			            String name = foodDocument.getString("name");
			            List<String> ingredients = foodDocument.getList("ingridients", String.class);
			            List<String> allergies = foodDocument.getList("allergies", String.class);
			            String foodCategory = foodDocument.getString("Category");
			            Long price = foodDocument.getLong("Price");
	
			            Food food = new Food(name, ingredients, allergies, foodCategory, price);
			            foodsInCategory.add(food);
			        }
		        }

		    } catch (Exception e) {
		        // Log the exception or handle it more gracefully
		        e.printStackTrace();
		    }

		    return foodsInCategory;
		}
	 
	 public static List<Food> getAllFoods() {
	        List<List<Food>> categories = CategoriesRepositoryImpl.getAllCategories();
	        List<Food> allFoods = new ArrayList<>();

	        for (List<Food> category : categories) {
	            allFoods.addAll(category);
	        }

	        return allFoods;
	    }
}
