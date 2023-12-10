package White_Box.BranchCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;

import main.java.model.Food;
import main.java.repository.FoodRepositoryImpl;

public class FoodRespositoryBranchTest {
	@Test
	public void testAddFood() {
		FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
		Food newFood = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		foodrepo.addFood(newFood);
		
		boolean addedfood = foodrepo.checkIfFoodExists("food1");
		assertNotNull(addedfood);
		assertTrue((foodrepo.checkIfFoodExists("food1")));
	}
	
	@Test
	public void testDeleteFoodByName() {
		FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
		Food newFood = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		foodrepo.addFood(newFood);
		
		foodrepo.deleteFoodByName("food1");
		assertFalse((foodrepo.checkIfFoodExists("food1")));
	}
	
	@Test
	public void testUpdateFoodByName() {
		FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
		Food newFood1 = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		foodrepo.addFood(newFood1);
		
		Food newfood2 = new Food("food2", Arrays.asList("Cocao", "Milk"), Arrays.asList("Dairy"),"cat2", 10);
				
		foodrepo.UpdateFoodByName("food1", newfood2);
		
		Food updatedfood = foodrepo.findFoodByName("food2");
		assertNotNull(updatedfood);
		assertFalse((foodrepo.checkIfFoodExists("food1")));
		assertTrue((foodrepo.checkIfFoodExists("food2")));      
	}
	
	@Test
	public void testCheckFoodByName() {
	    FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
	    Food newFood = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"), "cat1", 100);
	    foodrepo.addFood(newFood);

	    // Check if the details are correctly retrieved and printed for an existing food
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    foodrepo.checkFoodByName("food1");

	    String consoleOutput = outContent.toString();
	    assertTrue(consoleOutput.contains("food1"));
	    assertTrue(consoleOutput.contains("cat1"));

	    
	    foodrepo.deleteFoodByName("food1");
	}

}



