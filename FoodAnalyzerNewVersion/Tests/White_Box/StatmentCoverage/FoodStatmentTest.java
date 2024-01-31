package White_Box.StatmentCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import main.java.model.Food;

class FoodStatmentTest {
	@Test
    public void testGettersAndSetters() {
        // Create a Food instance
        Food food = new Food("Pizza", Arrays.asList("Dough", "Cheese"), Collections.singletonList("Gluten"), "Italian", 15L);

        // Test getters
        assertEquals("Pizza", food.getName());
        assertEquals(Arrays.asList("Dough", "Cheese"), food.getIngridients());
        assertEquals(Collections.singletonList("Gluten"), food.getAllergies());
        assertEquals("Italian", food.getCategory());
        assertEquals(15L, food.getPrice().longValue());

        // Test setters
        food.setName("Pasta");
        food.setIngridients(Arrays.asList("Flour", "Water"));
        food.setAllergies(Collections.emptyList());
        food.setCategory("Italian");
        food.setPrice(12L);

        // Verify changes
        assertEquals("Pasta", food.getName());
        assertEquals(Arrays.asList("Flour", "Water"), food.getIngridients());
        assertEquals(Collections.emptyList(), food.getAllergies());
        assertEquals("Italian", food.getCategory());
        assertEquals(12L, food.getPrice().longValue());
    }

    @Test
    public void testConstructor() {
        // Test constructor with different parameters
        Food food1 = new Food("Burger", Arrays.asList("Bun", "Patty", "Lettuce"), Collections.emptyList(), "Fast Food", 10L);
        Food food2 = new Food("Salad", Collections.singletonList("Lettuce"), Collections.singletonList("Nuts"), "Healthy", 8L);

        // Verify constructor values
        assertEquals("Burger", food1.getName());
        assertEquals(Arrays.asList("Bun", "Patty", "Lettuce"), food1.getIngridients());
        assertEquals(Collections.emptyList(), food1.getAllergies());
        assertEquals("Fast Food", food1.getCategory());
        assertEquals(10L, food1.getPrice().longValue());

        assertEquals("Salad", food2.getName());
        assertEquals(Collections.singletonList("Lettuce"), food2.getIngridients());
        assertEquals(Collections.singletonList("Nuts"), food2.getAllergies());
        assertEquals("Healthy", food2.getCategory());
        assertEquals(8L, food2.getPrice().longValue());
    }

    @Test
    public void testSetCategory() {
        // Test setCategory method
        Food food = new Food("Soup", Arrays.asList("Vegetables", "Broth"), Collections.emptyList(), "Healthy", 5L);
        assertEquals("Healthy", food.getCategory());

        food.setCategory("Comfort Food");
        assertEquals("Comfort Food", food.getCategory());
    }

    @Test
    public void testCheckNullAllergies() {
        // Test when allergies are null
        Food food = new Food("Sushi", Arrays.asList("Fish", "Rice", "Seaweed"), null, "Japanese", 20L);

        // Verify that getAllergies doesn't throw a NullPointerException
        assertNull(food.getAllergies());
    }
}
