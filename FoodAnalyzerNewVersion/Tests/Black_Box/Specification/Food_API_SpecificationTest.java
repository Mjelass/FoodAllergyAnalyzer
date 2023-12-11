package Black_Box.Specification;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.repository.Food_API;

public class Food_API_SpecificationTest {

    private static class MockFoodAPI extends Food_API {
        public String sendHttpRequest(String apiUrl, int startIndex) throws Exception {
            // Mock the behavior of sendHttpRequest
            return "Mocked Allergens Response";
        }
    }

    @Test
    public void testMainMethod_ReturnsCorrectAllergensList() {
        try {
            // Create an instance of MockFoodAPI
            MockFoodAPI mockAPI = new MockFoodAPI();

            // Run the main method
            String result = mockAPI.main(null);

            // Perform assertions on the returned values
            assertTrue(result.contains("List of codes for allergens"));
        } catch (Exception e) {
            fail("Exception not expected: " + e.getMessage());
        }
    }
}
