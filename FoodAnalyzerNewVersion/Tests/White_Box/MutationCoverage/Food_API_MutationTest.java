package White_Box.MutationCoverage;

import main.java.repository.Food_API;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Food_API_MutationTest {
	 @Test
	    public void testAllergensEndpoint() {
	        Food_API foodAPI = new Food_API();
	        
	        // Using an invalid URL
	        assertThrows(Exception.class, () -> {
	            String allergensResponse = foodAPI.sendHttpRequest("http://this.is.an.invalid.url", 10);
	        });


	    }
	


}
