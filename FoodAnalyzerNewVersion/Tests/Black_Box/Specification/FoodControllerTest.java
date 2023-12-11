package Black_Box.Specification;
import main.java.model.Food;
import main.java.model.User;
import main.java.controller.FoodController;
import main.java.repository.CategoriesRepositoryImpl;
import main.java.repository.FoodRepositoryImpl;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FoodControllerTest {
	private FoodController controller;
    private FoodRepositoryImpl foodRepository;

    @BeforeEach
    void setUp() {
        foodRepository = new FoodRepositoryImpl();
        controller = new FoodController();
        Food newFood = new Food("TestFood", Arrays.asList("Peanuts"), Arrays.asList("Nuts"),"cat1", 100);
        foodRepository.addFood(newFood);
    }
   

    /*@Test
    public void testCreateFood() {
    	String inputCreate = "TestFood\nTestCategory\nSugar,Salt\nPeanuts\n100\n";
        System.setIn(new ByteArrayInputStream(inputCreate.getBytes()));
        /*if the console pops up and doesnt autofill, 
         * just type TestFood into the Name and key in 
         * random numerical values for the rest
         
        controller.createfood();
        assertTrue(foodRepository.checkIfFoodExists("TestFood"));
        
    }*/
    /*@Test
    public void testCheckProduct( ) {
    	 String inputCheck = "TestFood\n";
    	 
    	 System.setIn(new ByteArrayInputStream(inputCheck.getBytes()));
    	 ByteArrayOutputStream output = new ByteArrayOutputStream();
    	 System.setOut(new PrintStream(output));
    	 controller.checkproduct();
    	 
    	 String consoleOutput = output.toString();
    	 assertTrue(consoleOutput.contains("TestFood"));
    	 
    }  */
  
    @Test
    public void testDeleteFood() {
    	
    	String simulatedUserInput = "TestFood\n";
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        controller.deletefood();

        System.setIn(stdin); // Restore original System.in

        // Verify that the food was deleted
        assertFalse(foodRepository.checkIfFoodExists("TestFood"));
    }


}
