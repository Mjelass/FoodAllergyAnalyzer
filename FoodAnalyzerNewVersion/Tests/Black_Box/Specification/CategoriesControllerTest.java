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
                validateOutput(i - 1, outputStream.toString());
                outputStream.reset();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setOut(System.out);
            System.setIn(System.in);
        }
    }
    private void validateOutput(int userChoice, String output) {
        CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
        List<List<Food>> categories = categoriesRepository.getAllCategories();

        if (userChoice < 0 || userChoice >= categories.size()) {
            assertEquals("Invalid choice.\n", output);
        } else if (userChoice == 0) {
            assertEquals("Exiting.\n", output);
        } else {
            List<Food> chosenCategory = categories.get(userChoice);
            assertEquals("Here are the foods in this category :\n", output);
            for (Food food : chosenCategory) {
                assertEquals(food.getName() + "\n", output);
            }
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
        String[] userInputs = {"-1\n", "0\n", "1\n", "2\n", "3\n"};//Different inputs  
        InputStream inputStream = new ByteArrayInputStream(String.join("\n", userInputs).getBytes());
        System.setIn(inputStream);
        CategoriesRepositoryImpl categoriesRepository = new FakeCategoriesRepository();
        try {
            for (int i = 0; i < userInputs.length; i++) {
                CategoriesController.chooseOption(i - 1, "testUser");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setOut(System.out);
            System.setIn(System.in);
        }
    }
}
