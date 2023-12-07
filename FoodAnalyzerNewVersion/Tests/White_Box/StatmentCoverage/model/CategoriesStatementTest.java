package White_Box.StatmentCoverage.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.controller.CategoriesController;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CategoriesStatementTest {

	CategoriesController    labObject    =    new    CategoriesController();
			
    @Test
    void testObesity() throws Exception {
        CategoriesController labObject = new CategoriesController();

        // Redirect the System.out for testing console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Simulate user input for an invalid choice
        ByteArrayInputStream inputStream = new ByteArrayInputStream("-1\n".getBytes());
        System.setIn(inputStream);

        // Execute the method under test
        labObject.chooseCategory(-1); // Call chooseCategory directly

        // Assert that the first line contains "Invalid choice."
        assertTrue(outputStream.toString().startsWith("Invalid choice."));

        // Reset System.out and close streams
        System.setOut(System.out);
        System.setIn(System.in);
    }
}
