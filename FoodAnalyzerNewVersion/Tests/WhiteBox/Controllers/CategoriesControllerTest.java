package WhiteBox.Controllers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.java.controller.CategoriesController;
import main.java.model.Food;

public class CategoriesControllerTest {

    private CategoriesController categoriesController;

    @Test
    public void testLookUpCategoriesList() {
        // Mock user input to simulate user choosing the first category
        String simulatedUserInput = "1\n";
        InputStream savedSystemIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Perform the test
        categoriesController = new CategoriesController();
        categoriesController.lookUpCategoriesList();

        // Reset System.in to its original
        System.setIn(savedSystemIn);
    }

    @Test
    public void testGetFoodsInCategory() {
        // Mock a category with some foods
        List<Food> mockCategory = Arrays.asList(
                new Food("Food1", Arrays.asList("Ingredient1"), Arrays.asList("Allergy1"), "Category1", 10L),
                new Food("Food2", Arrays.asList("Ingredient2"), Arrays.asList("Allergy2"), "Category1", 15L)
        );

        // Perform the test
        categoriesController = new CategoriesController();
        categoriesController.getFoodsInCategory(mockCategory);
    }

    @Test
    public void testChooseFoodToLookInto() {
        // Mock a list of foods
        List<Food> mockFoods = Arrays.asList(
                new Food("Food1", Arrays.asList("Ingredient1"), Arrays.asList("Allergy1"), "Category1", 10L),
                new Food("Food2", Arrays.asList("Ingredient2"), Arrays.asList("Allergy2"), "Category1", 15L)
        );

        // Mock user input to simulate user choosing the first food
        String simulatedUserInput = "1\n";
        InputStream savedSystemIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Perform the test
        categoriesController = new CategoriesController();
        categoriesController.chooseFoodToLookInto(mockFoods);

        // Reset System.in to its original
        System.setIn(savedSystemIn);
    }

    @Test
    public void testCheckingFoodAllergies() {
        // Mock a food with allergies
        Food mockFood = new Food("Food1", Arrays.asList("Ingredient1"), Arrays.asList("Allergy1", "Allergy2"), "Category1", 10L);

        // Mock user input to simulate user choosing to check allergies
        String simulatedUserInput = "2\n";
        InputStream savedSystemIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Perform the test
        categoriesController = new CategoriesController();
        List<String> result = categoriesController.checkingFoodAllergies(mockFood);

        // Verify the result
        assertNotNull(result);
        assertEquals(Arrays.asList("Allergy1", "Allergy2"), result);

        // Reset System.in to its original
        System.setIn(savedSystemIn);
    }

    @Test
    public void testChooseFoodsByAllergies() {
        // Mock user input to simulate user choosing the first option
        String simulatedUserInput = "1\n";
        InputStream savedSystemIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Perform the test
        categoriesController = new CategoriesController();
        List<Food> result = categoriesController.chooseFoodsByAllergies("testUser");

        // Reset System.in to its original
        System.setIn(savedSystemIn);
    }

    @Test
    public void testGetSafeFoods() {
        // Mock a list of foods with and without allergies
        List<Food> mockFoods = Arrays.asList(
                new Food("Food1", Arrays.asList("Ingredient1"), Arrays.asList("Allergy1"), "Category1", 10L),
                new Food("Food2", Arrays.asList("Ingredient2"), new ArrayList<>(), "Category1", 15L)
        );

        // Mock user allergies
        List<String> userAllergies = Arrays.asList("Allergy1");

        // Perform the test
        categoriesController = new CategoriesController();
        List<Food> result = categoriesController.getSafeFoods(mockFoods, userAllergies);

        // Verify the result
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Food2", result.get(0).getName());
    }

    @Test
    public void testGetFoodsToAvoid() {
        // Mock a list of foods with and without allergies
        List<Food> mockFoods = Arrays.asList(
                new Food("Food1", Arrays.asList("Ingredient1"), Arrays.asList("Allergy1"), "Category1", 10L),
                new Food("Food2", Arrays.asList("Ingredient2"), new ArrayList<>(), "Category1", 15L)
        );

        // Mock user allergies
        List<String> userAllergies = Arrays.asList("Allergy1");

        // Perform the test
        categoriesController = new CategoriesController();
        List<Food> result = categoriesController.getFoodsToAvoid(mockFoods, userAllergies);

        // Verify the result
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Food1", result.get(0).getName());
    }

    @Test
    public void testContainsAny() {
        // Mock food allergies and user allergies
        List<String> foodAllergies = Arrays.asList("Allergy1", "Allergy2");
        List<String> userAllergies = Arrays.asList("Allergy2", "Allergy3");

        // Perform the test
        categoriesController = new CategoriesController();
        boolean result = categoriesController.containsAny(foodAllergies, userAllergies);

        // Verify the result
        assertTrue(result);
    }
}
