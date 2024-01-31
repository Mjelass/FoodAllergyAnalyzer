package Black_Box.Specification;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.repository.Food_API;

public class Food_API_SpecificationTest {

    private static class MockFoodAPI extends Food_API {
        // Override the sendHttpRequest method to mock its behavior
        @Override
        public String sendHttpRequest(String apiUrl, int startIndex) throws Exception {
            return "Mocked Allergens Response";
        }
    }

    @Test
    public void testMainMethod_ReturnsCorrectAllergensList() {
        try {
            // Redirect standard output to capture the printed content
            final var originalOut = System.out;
            final var mockOut = new java.io.ByteArrayOutputStream();
            System.setOut(new java.io.PrintStream(mockOut));

            // Create an instance of MockFoodAPI
            MockFoodAPI mockAPI = new MockFoodAPI();

            // Run the main method
            mockAPI.main(null);

            // Reset standard output
            System.setOut(originalOut);

            // Get the captured output
            String result = mockOut.toString();

            // Perform assertions on the returned values
            assertTrue(result.contains("List of codes for allergens"));
        } catch (Exception e) {
            fail("Exception not expected: " + e.getMessage());
        }
    }
}
