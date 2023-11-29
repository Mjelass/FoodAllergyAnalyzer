package WhiteBox.Controllers;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.java.Main;
import main.java.controller.CategoriesController;
import main.java.model.Food;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoriesControllerTest {

	@Test
	public void testUserChoosesToExit() {
        // Arrange
        String input = "0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        CategoriesController.lookUpCategoriesList();

        // Assert
        assertTrue(outContent.toString().contains("Exiting."), "Expected 'Exiting' message");
        Main.afterLoginUser();

        // Clean up
        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    public void testUserChoosesValidCategory() {
        // Arrange
        String input = "2\n";  // Assuming there are at least two categories
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        CategoriesController.lookUpCategoriesList();

        // Assert
        assertTrue(outContent.toString().contains("Enter the number of the category you want to explore"), 
                   "Expected prompt for category choice");

        // Clean up
        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    public void testUserChoosesInvalidCategory() {
        // Arrange
        String input = "-1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        CategoriesController.lookUpCategoriesList();

        // Assert
        assertTrue(outContent.toString().contains("Invalid choice. Exiting."), "Expected 'Invalid choice' message");

        // Clean up
        System.setIn(System.in);
        System.setOut(System.out);
    }
}
