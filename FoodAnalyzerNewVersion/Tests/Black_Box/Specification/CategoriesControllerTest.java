package Black_Box.Specification;

import main.java.model.Food;
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
                    assertEquals("Here are the foods in this category : Chicken and Mushroom", outputStream.toString());
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
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        String[] userInputs = {"1\n", "2\n", "0\n","-1\n"};
        InputStream inputStream = new ByteArrayInputStream(String.join("\n", userInputs).getBytes());
        System.setIn(inputStream);

        try {
            CategoriesController.chooseOption(1, "mockUserName");
            if (outputStream.toString().contains("foods you should not eat")) {
                assertTrue(outputStream.toString().contains("BEUUURK"));
            } else {
                fail("Expected output for case 1 not found");
            }
            outputStream.reset();
            CategoriesController.chooseOption(2, "mockUserName");
            if (outputStream.toString().contains("foods you can eat")) {
                assertTrue(outputStream.toString().contains("YUMMY"));
            } else {
                fail("Expected output for case 2 not found");
            }
            outputStream.reset();
            CategoriesController.chooseOption(0, "mockUserName");
            if (outputStream.toString().contains("Exiting")) {
            } else {
                fail("Expected output for case 0 not found");
            }
            CategoriesController.chooseOption(-1, "mockUserName");
            if (outputStream.toString().contains("Invalid choice")) {
            } else {
                fail("Expected output for default case not found");
            }
            } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setOut(System.out);
            System.setIn(System.in);
        }
    } 
 
}
