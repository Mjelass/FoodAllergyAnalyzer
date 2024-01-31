package Black_Box.Random;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import main.java.repository.Food_API;
import static org.junit.jupiter.api.Assertions.*;

public class Food_API_RandomTest {

    private static final String[] ENDPOINTS = {
            "http://data.food.gov.uk/food-alerts/def/allergens.json",
            "http://data.food.gov.uk/food-alerts/def/pathogen-risks.json",
            "http://data.food.gov.uk/food-alerts/def/hazards.json",
            "http://data.food.gov.uk/food-alerts/def/reasons.json"
    };

    @RepeatedTest(5) // Repeat the test 5 times with random endpoints
    public void testRandomEndpoint() {
        Food_API foodAPI = new Food_API();

        // Generate a random index to select a random endpoint
        int randomIndex = (int) (Math.random() * ENDPOINTS.length);
        String randomEndpoint = ENDPOINTS[randomIndex];

        try {
            String response = foodAPI.sendHttpRequest(randomEndpoint, 10);
            assertNotNull(response);
        } catch (Exception e) {
            fail("Exception not expected: " + e.getMessage());
        }
    }
}
