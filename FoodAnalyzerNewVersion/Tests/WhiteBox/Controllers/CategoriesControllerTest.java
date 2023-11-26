package WhiteBox.Controllers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import main.java.controller.CategoriesController;
import main.java.model.Food;

public class CategoriesControllerTest {

	@Test
	public void testLookUpCategoriesList() {
	    // Set up
	    String input = "1\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());

	    // Act and Assert
	    try {
	        CategoriesController.lookUpCategoriesList();
	        // You may add assertions based on the expected behavior of this method
	    } catch (Exception e) {
	        fail("Unexpected exception thrown during lookUpCategoriesList: " + e.getMessage());
	    }
	}

    @Test
    public void testGetFoodsInCategory() {
        // Set up
        List<Food> sampleCategory = new ArrayList<>(); 
        String input = "0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Act and Assert
        try {
            CategoriesController.getFoodsInCategory(sampleCategory);
        } catch (Exception e) {
            fail("Unexpected exception thrown during getFoodsInCategory: " + e.getMessage());
        }
    }

    @Test
    public void testChooseFoodToLookInto() {
        // Set up
        List<Food> sampleFoods = new ArrayList<>(); 
        String input = "0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Act and Assert
        try {
            CategoriesController.chooseFoodToLookInto(sampleFoods);
        } catch (Exception e) {
            fail("Unexpected exception thrown during chooseFoodToLookInto: " + e.getMessage());
        }
    }

    @Test
    public void testCheckingFoodAllergies() {
        // Set up
        Food sampleFood = new Food("Strawberry Jam",Arrays.asList("Strawberries","Sugar"), Arrays.asList("Wheat"), "Jam", 2) ;
        String input = "0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Act and Assert
        try {
            CategoriesController.checkingFoodAllergies(sampleFood);
        } catch (Exception e) {
            fail("Unexpected exception thrown during checkingFoodAllergies: " + e.getMessage());
        }
    }

    @Test
    public void testChooseFoodsByAllergies() {
        // Set up
        String input = "0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Act and Assert
        try {
            CategoriesController.chooseFoodsByAllergies("Jack");
        } catch (Exception e) {
            fail("Unexpected exception thrown during chooseFoodsByAllergies: " + e.getMessage());
        }
    }

    @Test
    public void testGetFoodsToAvoid() {
        // Set up
        List<Food> allFoods = new ArrayList<>(); 
        List<String> userAllergies = Arrays.asList("Wheat", "Mushrooms");

        // Act and Assert
        try {
            CategoriesController.getFoodsToAvoid(allFoods, userAllergies);
        } catch (Exception e) {
            fail("Unexpected exception thrown during getFoodsToAvoid: " + e.getMessage());
        }
    }

    @Test
    public void testGetSafeFoods() {
        // Set up
        List<Food> allFoods = new ArrayList<>(); 
        List<String> userAllergies = Arrays.asList("Wheat", "Mushrooms");

        // Act and Assert
        try {
            CategoriesController.getSafeFoods(allFoods, userAllergies);
        } catch (Exception e) {
            fail("Unexpected exception thrown during getSafeFoods: " + e.getMessage());
        }
    }
}
