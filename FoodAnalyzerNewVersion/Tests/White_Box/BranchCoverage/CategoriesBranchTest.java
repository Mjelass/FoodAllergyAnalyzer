package White_Box.BranchCoverage;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.controller.CategoriesController;
import main.java.model.Food;
import main.java.model.User;
import main.java.repository.CategoriesRepositoryImpl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CategoriesBranchTest {
	CategoriesController    labObject    =    new    CategoriesController();
    CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
    List<List<Food>> categories = categoriesRepository.getAllCategories();

    User fakeUser = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts", "Shellfish"), "User", Arrays.asList("FavoriteFood1", "FavoriteFood2"));
	
    @Test
    public void testChooseCategory() {
        CategoriesController categoriesController = new CategoriesController();
        String output1 = captureSystemOut(() -> categoriesController.chooseCategory(-1));
        assertEquals("Invalid choice.", output1.trim());
        String output3 = captureSystemOut(() -> categoriesController.chooseCategory(0));
        assertEquals("Exiting.", output3.trim());
        String output4 = captureSystemOut(() -> categoriesController.chooseCategory(1));
        assertTrue(output4.contains("Here are the foods in this category"));
    }
    private String captureSystemOut(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        try {
            action.run();
            return outputStream.toString();
        } finally {
            System.setOut(System.out);
        }
    }
    @Test
    void testChooseFood() {

        // Prepare user inputs for the test
        String[] userInputs = {"-1\n", "0\n", "1\n"}; // Different inputs
        InputStream inputStream = new ByteArrayInputStream(String.join("\n", userInputs).getBytes());
        System.setIn(inputStream);

        // Create a sample chosenCategory
        List<Food> firstCategory = categories.get(0);
        Food firstFood = firstCategory.get(0);
        String nameFirstFood=firstFood.getName();

        try {
            for (String userInput : userInputs) {
                if (userInput=="-1\n") {
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    System.setOut(new PrintStream(outputStream));
                    CategoriesController.chooseFood(-1, firstCategory);
                    assertEquals("Invalid choice.",outputStream.toString().trim()); 
                }else if (userInput=="0\n") {
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    System.setOut(new PrintStream(outputStream));
                    CategoriesController.chooseFood(0, firstCategory);
                    assertEquals("Exiting.",outputStream.toString().trim());            
                }else {
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    System.setOut(new PrintStream(outputStream));
                    CategoriesController.chooseFood(1, firstCategory);
                    assertEquals("You've chosen to look into "+nameFirstFood
                    		+"What interests you about this food ?"
                			+"1) Go back"
                			+"2) Its list of potential allergies"
                			+"0) Exit", 
                			outputStream.toString().trim());
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setOut(System.out);
            System.setIn(System.in);
        }
    }
    @Test
    void testChooseInterest() {
    	Food someFood = new Food("Sample Food", Arrays.asList("Ingredient1", "Ingredient2"),
                Arrays.asList("Allergy1", "Allergy2"), "Sample Category", 10);

        // Case 1: Going back
        ByteArrayOutputStream outputStream1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream1));
        CategoriesController.chooseInterest(1, someFood);
        assertEquals("Going back.", outputStream1.toString().trim());

        // Case 2: Display allergies
        ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream2));
        CategoriesController.chooseInterest(2, someFood);
        assertEquals(someFood.getAllergies().toString(), outputStream2.toString().trim());

        // Case 0: Exiting
        ByteArrayOutputStream outputStream3 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream3));
        CategoriesController.chooseInterest(0, someFood);
        assertEquals("Exiting.", outputStream3.toString().trim());

        // Case default: Invalid choice
        ByteArrayOutputStream outputStream4 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream4));
        CategoriesController.chooseInterest(99, someFood);
        assertEquals("Invalid choice", outputStream4.toString().trim());
    }
    
    @Test
    void testChooseOptionCase1() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseOption(1, "john.doe");
        assertTrue(outputStream.toString().contains(" "));
        System.setOut(System.out);
    }

    @Test
    void testChooseOptionCase2() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseOption(2, "john.doe");
        assertTrue(outputStream.toString().contains(" "));
        System.setOut(System.out);
    }

    @Test
    void testChooseOptionCase0() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseOption(0, "john.doe");
        assertTrue(outputStream.toString().contains("Exiting."));
        System.setOut(System.out);
    }

    @Test
    void testChooseOptionDefault() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseOption(-1, "john.doe");
        assertTrue(outputStream.toString().contains("Invalid choice. Please rechoose."));
        System.setOut(System.out);
    }
    
    
}
