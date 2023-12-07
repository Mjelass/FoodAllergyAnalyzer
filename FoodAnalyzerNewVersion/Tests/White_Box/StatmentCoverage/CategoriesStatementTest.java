package White_Box.StatmentCoverage;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.controller.CategoriesController;
import main.java.model.Food;
import main.java.model.User;
import main.java.repository.CategoriesRepositoryImpl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

class CategoriesStatementTest { 

	CategoriesController    labObject    =    new    CategoriesController();
    CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
    List<List<Food>> categories = categoriesRepository.getAllCategories();
    List<Food> firstCategory = categories.get(0);
    Food firstFood = firstCategory.get(0);
    String nameFirstFood=firstFood.getName();
    User fakeUser = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts", "Shellfish"), "User", Arrays.asList("FavoriteFood1", "FavoriteFood2"));
	
    @Test
    void testChooseCategoryInvalid() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseCategory(-1); 
        assertEquals("Invalid choice.", outputStream.toString().trim());
        System.setOut(System.out);    
        }
    @Test
    void testChooseCategoryExit() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseCategory(0); 
        assertEquals("Exiting.", outputStream.toString().trim());
        System.setOut(System.out);    
        }
    @Test
    void testChooseCategoryValid() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseCategory(1); 
        assertEquals("Here are the foods in this category : "+nameFirstFood, outputStream.toString().trim());
        System.setOut(System.out);    
        }
    
    
    @Test
    void testChooseFoodInvalid() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseFood(-1,firstCategory); 
        assertEquals("Invalid choice.", outputStream.toString().trim());
        System.setOut(System.out);    
        }
    @Test
    void testChooseFoodExit() throws Exception {
    	ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseFood(0,firstCategory); 
        assertEquals("Exiting.", outputStream.toString().trim());
        System.setOut(System.out);    
        }
    @Test
    void testChooseFoodValid() throws Exception {       
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseFood(1,firstCategory); 
        assertEquals("You've chosen to look into "+nameFirstFood
        		+"What interests you about this food ?"
    			+"1) Go back"
    			+"2) Its list of potential allergies"
    			+"0) Exit", 
    			outputStream.toString().trim());
        System.setOut(System.out);    
        } 
    
    
    @Test
    void testChooseInterest1() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseInterest(1,firstFood); 
        assertEquals("Going back.", outputStream.toString().trim());
        System.setOut(System.out);    
        } 
    @Test
    void testChooseInterest2() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseInterest(2,firstFood); 
        assertEquals(firstFood.getAllergies().toString(),outputStream.toString().trim());
        System.setOut(System.out);   
        }
    @Test
    void testChooseInterestExit() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseInterest(0,firstFood); 
        assertEquals("Exiting.", outputStream.toString().trim());
        System.setOut(System.out);   
        }
    
    
    @Test
    void testChooseOptionInvalid() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseOption(-1,fakeUser.getUserName());  
        assertEquals("Invalid choice. Please rechoose.", outputStream.toString().trim());
        System.setOut(System.out);   
        }
    @Test
    void testChooseOption1() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseOption(1,fakeUser.getUserName()); 
        assertEquals("", outputStream.toString().trim());
        System.setOut(System.out);   
        }
    @Test
    void testChooseOption2() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseOption(2,fakeUser.getUserName()); 
        assertEquals("", outputStream.toString().trim());
        System.setOut(System.out);   
        }
    @Test
    void testChooseOptionExit() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        CategoriesController.chooseOption(0,fakeUser.getUserName()); 
        assertEquals("Exiting.", outputStream.toString().trim());
        System.setOut(System.out);   
        }
}

