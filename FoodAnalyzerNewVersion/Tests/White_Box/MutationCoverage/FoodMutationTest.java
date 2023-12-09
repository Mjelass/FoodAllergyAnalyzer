package White_Box.MutationCoverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.model.Food;

class FoodMutationTest {

	@Test
    public void testCategoryMutatedMethods() {
        Food food = new Food("Original Food", null, null, "Original Category", 100);

        // Mutated: Changed method name
        assertEquals("Original Category", food.getCategory());
        food.setCategory("Mutated Category");
        assertEquals("Mutated Category", food.getCategory());
    }

    @Test
    public void testNameMutatedMethods() {
        Food food = new Food("Original Food", null, null, "Original Category", 100);

        // Mutated: Changed method name
        assertEquals("Original Food", food.getName());
        food.setName("Mutated Food");
        assertEquals("Mutated Food", food.getName());
    }

    @Test
    public void testIngredientsMutatedMethods() {
        Food food = new Food("Original Food", null, null, "Original Category", 100);

        // Mutated: Changed method name
        assertNull(food.getIngridients());
        food.setIngridients(List.of("Ingredient1", "Ingredient2"));
        assertEquals(List.of("Ingredient1", "Ingredient2"), food.getIngridients());
    }

    @Test
    public void testAllergiesMutatedMethods() {
        Food food = new Food("Original Food", null, null, "Original Category", 100);

        // Mutated: Changed method name
        assertNull(food.getAllergies());
        food.setAllergies(List.of("Allergy1", "Allergy2"));
        assertEquals(List.of("Allergy1", "Allergy2"), food.getAllergies());
    }

    @Test
    public void testPriceMutatedMethods() {
        Food food = new Food("Original Food", null, null, "Original Category", 100);

        // Mutated: Changed method name and return type
        assertEquals(100, food.getPrice().longValue());
        food.setPrice(150L);
        assertEquals(150, food.getPrice().longValue());
    }

}
