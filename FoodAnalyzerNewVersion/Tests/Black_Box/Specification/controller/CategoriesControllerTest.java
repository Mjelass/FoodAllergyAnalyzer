package Black_Box.Specification.controller;

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
        String[] userInputs = {"-1\n", "0\n", "1\n"};  
        InputStream inputStream = new ByteArrayInputStream(String.join("\n", userInputs).getBytes());
        System.setIn(inputStream);
        CategoriesRepositoryImpl categoriesRepository = new FakeCategoriesRepository();
        try {
            for (int i = 0; i < userInputs.length; i++) {
                CategoriesController.chooseCategory(i - 1);
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
        String[] userInputs = {"-1\n", "0\n", "1\n"};  
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
        String[] userInputs = {"1\n", "2\n", "0\n", "3\n"};  
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
        String[] userInputs = {"-1\n", "0\n", "1\n", "2\n", "3\n"};  
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
