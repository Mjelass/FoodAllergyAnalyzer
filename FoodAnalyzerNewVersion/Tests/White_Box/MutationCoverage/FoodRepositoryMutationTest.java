package White_Box.MutationCoverage;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import main.java.model.Food;
import main.java.repository.FoodRepositoryImpl;

public class FoodRepositoryMutationTest {
	private static final String connectionString = "mongodb+srv://smagroup475:poiuy98765@cluster0.rz7navz.mongodb.net/?retryWrites=true&w=majority";
	
	public void cleanData() {
		try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("cluster0");
            MongoCollection<Document> collection = database.getCollection("Food");
            collection.deleteMany(Filters.in("name", "food1", "nonexistent.food"));
		}
	}
	
	@Test
	public void testAddFood() throws Exception{
		FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
		 // Test adding a user with valid data
		Food newFood = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		foodrepo.addFood(newFood);
		Food addedfood = foodrepo.findFoodByName("food1");
		assertNotNull("Food not added successfully", addedfood);
		
		// Test adding a Food with null Category
		foodrepo.addFood(new Food("food2", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),null, 100));  
		
		// Test adding a user with an existing username
		foodrepo.addFood(newFood);
		 System.out.println("Expected: food already exists. Please enter a different food.");
		 
		 cleanData();
	}
	
	@Test
	public void testdeleteFoodByName() {
		FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
		
		// Test deleting an existing food by name
        foodrepo.deleteFoodByName("food1");
        Food deletedfood = foodrepo.findFoodByName("food1");
        assertNull("food not deleted successfully", deletedfood);
        
        // Test deleting a non-existing food
        foodrepo.deleteFoodByName("nonexistent.food");
        System.out.println("Expected: Food not found. Deletion failed.");
        cleanData();
	}
	
	@Test
	public void testUpdateFoodByName() {
		FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
		foodrepo.addFood(new Food("food1", Arrays.asList("Ingredient"), Arrays.asList("Allergy"), "cat1", 100));
		Food newfood2 = new Food("food2", Arrays.asList("Cocao", "Milk"), Arrays.asList("Dairy"),"cat2", 10);
		foodrepo.addFood(newfood2);
		
		foodrepo.UpdateFoodByName("food1", newfood2);
		Food updatedfood = foodrepo.findFoodByName("food2");
		assertNotNull("food not updated successfully", updatedfood);
		// Test updating a non-existing food
		foodrepo.UpdateFoodByName("nonexistent.food", newfood2);
		 System.out.println("Expected: Food not found. Deletion failed.");
		cleanData();
		
	}
	
	@Test
	public void testCheckFoodByName() throws Exception {
	    FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
	    
	    foodrepo.addFood(new Food("food1", Arrays.asList("Ingredient"), Arrays.asList("Allergy"), "cat1", 100));
	    foodrepo.checkFoodByName("food1");
	    Food addedfood = foodrepo.findFoodByName("food1");
		assertNotNull("Food does not exist", addedfood);
		
		
	    
	}
	
}
