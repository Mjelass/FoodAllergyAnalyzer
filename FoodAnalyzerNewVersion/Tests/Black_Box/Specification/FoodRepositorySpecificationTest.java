package Black_Box.Specification;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.junit.jupiter.api.Test;

import main.java.model.Food;
import main.java.repository.FoodRepositoryImpl;

public class FoodRepositorySpecificationTest {
	
private FoodRepositoryImpl foodrepo = new FoodRepositoryImpl();
	
	@Test
	public void testAddFood() {
		Food food = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		foodrepo.addFood(food);
		
		assertNotNull(food);
		assertEquals("food1", food.getName());
		assertEquals(Arrays.asList("Peanuts"), food.getIngridients());
		assertEquals(Arrays.asList("Nuts"), food.getAllergies());
		assertEquals("cat1", food.getCategory());
		assertEquals(100, food.getPrice());
	}
	
	@Test
	public void testDeleteFoodByName() {
		Food food = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		foodrepo.addFood(food);
		
		foodrepo.deleteFoodByName("food1");
		
		Food gone = foodrepo.findFoodByName("food1");
		assertNull(gone);
	}
	@Test
	public void testUpdateFoodByName() {
		Food food = new Food("food1", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
		foodrepo.addFood(food);
		Food food2 = new Food("food2", Arrays.asList("Cocao", "Milk"), Arrays.asList("Dairy"),"cat2", 10);
		foodrepo.UpdateFoodByName("food1", food2);
		
		Food gone = foodrepo.findFoodByName("food1");
		assertNull(gone);
		assertNotNull(food2);
		assertEquals("food2", food2.getName());
		assertEquals(Arrays.asList("Cocao", "Milk"), food2.getIngridients());
		assertEquals(Arrays.asList("Dairy"), food2.getAllergies());
		assertEquals("cat2", food2.getCategory());
		assertEquals(10, food2.getPrice());
	}


}