package White_Box.BranchCoverage;

import org.junit.jupiter.api.Test;
import main.java.repository.Food_API;
import static org.junit.jupiter.api.Assertions.*;

public class Food_API_BranchBasedTest {

    @Test
    public void testAllergensEndpoint() {
        Food_API foodAPI = new Food_API();
        String allergensResponse = foodAPI.sendHttpRequest("http://data.food.gov.uk/food-alerts/def/allergens.json", 10);
        assertNotNull(allergensResponse);
    }

    @Test
    public void testPathogenRisksEndpoint() {
        Food_API foodAPI = new Food_API();
        String pathogenRisksResponse = foodAPI.sendHttpRequest("http://data.food.gov.uk/food-alerts/def/pathogen-risks.json", 10);
        assertNotNull(pathogenRisksResponse);
    }

    @Test
    public void testHazardsEndpoint() {
        Food_API foodAPI = new Food_API();
        String hazardsResponse = foodAPI.sendHttpRequest("http://data.food.gov.uk/food-alerts/def/hazards.json", 10);
        assertNotNull(hazardsResponse);
    }

    @Test
    public void testReasonsEndpoint() {
        Food_API foodAPI = new Food_API();
        String reasonsResponse = foodAPI.sendHttpRequest("http://data.food.gov.uk/food-alerts/def/reasons.json", 10);
        assertNotNull(reasonsResponse);
    }
}
