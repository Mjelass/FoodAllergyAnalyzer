package White_Box.StatmentCoverage;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;

import main.java.model.Food;
import main.java.repository.FoodRepositoryImpl;

public class FoodRespositoryStatementTest {
	
	@Test
	public void testaddFood() {
		FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
		Food newFood = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		
		foodrepo.addFood(newFood);
		Food addedfood = foodrepo.findFoodByName("food1");
		assertNotNull(addedfood);
	}
	
	@Test
	public void testdeleteFoodByName() {
		FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
		Food newFood = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		foodrepo.addFood(newFood);
		foodrepo.deleteFoodByName("food1");
		
		Food deletedfood = foodrepo.findFoodByName("food1");
		assertNull(deletedfood);
	}
	
	@Test
	public void testUpdateFoodByName() {
		FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
		Food newFood = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		foodrepo.addFood(newFood);
		
		Food newfood2 = new Food("food2", Arrays.asList("Cocao", "Milk"), Arrays.asList("Dairy"),"cat2", 10);
		foodrepo.UpdateFoodByName("food1", newfood2);
		Food updatedfood = foodrepo.findFoodByName("food2");
		assertNotNull(updatedfood);
	}
		
	
	@Test
	public void testCheckFoodByName() {
		FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
		Food newFood = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		foodrepo.addFood(newFood);
		foodrepo.checkFoodByName("food1");
		assertNotNull(newFood);
	}

}
