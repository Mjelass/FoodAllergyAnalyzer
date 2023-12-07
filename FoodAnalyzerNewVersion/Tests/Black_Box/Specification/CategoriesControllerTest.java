package Black_Box.Specification;

import main.java.model.Food;
import main.java.model.User;
import main.java.repository.CategoriesRepositoryImpl;
import main.java.controller.CategoriesController;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoriesControllerTest { 

    static class FakeCategoriesRepository extends CategoriesRepositoryImpl {
        @Override
        public List<List<Food>> getAllCategories() {
            List<Food> category1 = Arrays.asList(
            new Food("Food1", Arrays.asList("Ingredient1"), Arrays.asList("Allergy1"), "Category1", 100L)
            );
            return Arrays.asList(category1); 
        } 
    } 
    
    @Test  
    public void testChooseCategory() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] userInputs = {"-1\n", "0\n", "1\n"};//Different inputs 
        InputStream inputStream = new ByteArrayInputStream(String.join("\n", userInputs).getBytes());
        System.setIn(inputStream);

        try {
            for (int i = 0; i < userInputs.length; i++) {
                CategoriesController.chooseCategory(i - 1);
                CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
                List<List<Food>> categories = categoriesRepository.getAllCategories();
 
                if (i - 1 < 0 || i - 1 >= categories.size()) {
                    assertEquals("Invalid choice.", outputStream.toString());
                } else if (i - 1 == 0) {
                    assertEquals("Exiting.", outputStream.toString());
                } else {
                    assertEquals("Here are the foods in this category : Sausage roll", outputStream.toString());
                }
                outputStream.reset(); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setOut(System.out);
            System.setIn(System.in);
        }
    }

    @Test
    public void testChooseFood() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] userInputs = {"-1\n", "0\n", "1\n"};//Different inputs   
        InputStream inputStream = new ByteArrayInputStream(String.join("\n", userInputs).getBytes());
        System.setIn(inputStream);
        CategoriesRepositoryImpl categoriesRepository = new FakeCategoriesRepository();
        try {
            for (int i = 0; i < userInputs.length; i++) {
                List<Food> chosenCategory = categoriesRepository.getAllCategories().get(0);
                CategoriesController.chooseFood(i - 1, chosenCategory);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setOut(System.out);
            System.setIn(System.in); 
        }
    }
    @Test
    public void testChooseInterest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] userInputs = {"1\n", "2\n", "0\n", "3\n"};//Different inputs  
        InputStream inputStream = new ByteArrayInputStream(String.join("\n", userInputs).getBytes());
        System.setIn(inputStream);
        CategoriesRepositoryImpl categoriesRepository = new FakeCategoriesRepository();
        try {
            for (int i = 0; i < userInputs.length; i++) {
                Food chosenFood = categoriesRepository.getAllCategories().get(0).get(0);
                CategoriesController.chooseInterest(i + 1, chosenFood);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setOut(System.out);
            System.setIn(System.in);
        }
    }
    @Test
    public void testChooseOption() {
        // Set up the output stream for capturing console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Set up the input stream with different inputs
        String[] userInputs = {"1\n", "2\n", "0\n", "-1\n"};
        InputStream inputStream = new ByteArrayInputStream(String.join("\n", userInputs).getBytes());
        System.setIn(inputStream);

        // Create a fake user for testing
        User fakeUser = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts", "Shellfish"), "User", Arrays.asList("FavoriteFood1", "FavoriteFood2"));

        try {
            // Loop through each input and test chooseOption method
            for (int i = 0; i < userInputs.length; i++) {
                // Call chooseOption method with the current input and fake user name
                CategoriesController.chooseOption(i, fakeUser.getUserName());

                // Validate the expected output based on the user choice
                switch (i) {
                    case 1:
                        assertEquals("", outputStream.toString().trim());
                        break;
                    case 2:
                        assertEquals("", outputStream.toString().trim());
                        break;
                    case 0:
                        assertEquals("Exiting.", outputStream.toString().trim());
                        break;
                    default:
                        assertEquals("Invalid choice. Please rechoose.", outputStream.toString().trim());
                        break;
                } 

                // Reset the output stream for the next iteration
                outputStream.reset();
            }
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
            // Reset the output and input streams
            System.setOut(System.out);
            System.setIn(System.in);
        }
    }

}
