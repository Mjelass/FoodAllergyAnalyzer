package White_Box.MutationCoverage; 

import static org.junit.Assert.assertEquals; 
import java.io.ByteArrayInputStream; 
import java.io.ByteArrayOutputStream; 
import java.io.InputStream; 
import java.io.PrintStream; 
import java.util.Arrays; 
import java.util.List; 
import org.junit.jupiter.api.Test; 
import main.java.controller.CategoriesController; 
import main.java.model.Food; 
import main.java.model.User; 
import main.java.repository.CategoriesRepositoryImpl; 

public class CategoriesMutationTest { 
	
	static class FakeCategoriesRepository extends CategoriesRepositoryImpl { 
		@Override public List<List<Food>> getAllCategories() { 
			List<Food> category1 = Arrays.asList( new Food("Food1", Arrays.asList("Ingredient1"), Arrays.asList("Allergy1"), "Category1", 100L) ); return Arrays.asList(category1); 
			} 
		} CategoriesController labObject = new CategoriesController(); 
			static CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl(); static List<List<Food>> categories = categoriesRepository.getAllCategories(); 
			static List<Food> firstCategory = categories.get(0); 
			static Food firstFood = firstCategory.get(0); 
			String nameFirstFood=firstFood.getName(); 
			User fakeUser = new User("John Doe", "john.doe", "password123", Arrays.asList("Peanuts", "Shellfish"), "User", Arrays.asList("FavoriteFood1", "FavoriteFood2")); 
			
			
	public static String chooseCategoryMutation(int userChoice) { 
				CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl(); List<List<Food>> categories = categoriesRepository.getAllCategories(); 
				if (userChoice < 0 || userChoice > categories.size()) { 
					System.out.print("Invalid choice."); 
				} else if (userChoice == 1) {//mutation  
					System.out.print("Exiting."); } 
				else { 
					List<Food> chosenCategory = categories.get(userChoice - 1); 
					System.out.print("Here are the foods in this category : "); 
					for (Food food : chosenCategory) { 
						System.out.print(food.getName()); 
					} 
				} return null; 
			} 
	
	@Test 
	public void testChooseCategoryMutation1() { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		String[] userInputs = {"-1\n", "0\n", "1\n"};//Different inputs 
		InputStream inputStream = new ByteArrayInputStream(String.join("\n", userInputs).getBytes()); 
		System.setIn(inputStream); try { for (int i = 0; i < userInputs.length; i++) 
		{ chooseCategoryMutation(i - 1);//mutated method called 
		CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl(); 
		List<List<Food>> categories = categoriesRepository.getAllCategories(); 
		if (i - 1 < 0 || i - 1 >= categories.size()) { 
			assertEquals("Invalid choice.", outputStream.toString()); 
		} else if (i - 1 == 1) {//mutation 
			assertEquals("Exiting.", outputStream.toString()); 
		} else { 
			assertEquals("Here are the foods in this category : Sausage roll", outputStream.toString()); } outputStream.reset(); 
		} 
	} catch (Exception e) { 
		e.printStackTrace(); 
	} finally { 
			System.setOut(System.out); System.setIn(System.in); } } 
	
	//new mutation 
	public static void chooseFoodMutation(int userChoice2,List<Food> chosenCategory) { 
		if (userChoice2 < 1 || userChoice2 >= chosenCategory.size()) {//mutation 
			System.out.println("Invalid choice."); 
			} else if (userChoice2 == 1) {//mutation 
				System.out.println("Exiting."); } 
			else { 
				Food chosenFood = chosenCategory.get(userChoice2-1); 
				System.out.println("You've chosen to look into "+chosenFood.getName() +".\n What interests you about this food ?\n" +"1) Go back\n" +"2) Its list of potential allergies\n" +"0) Exit"); 
				} 
		} 
	@Test 
	public void testChooseFoodMutation() { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		String[] userInputs = {"0\n", "1\n", "2\n"};//Different inputs mutated 
		InputStream inputStream = new ByteArrayInputStream(String.join("\n", userInputs).getBytes()); 
		System.setIn(inputStream); CategoriesRepositoryImpl categoriesRepository = new FakeCategoriesRepository(); 
		try { 
			for (int i = 0; i < userInputs.length; i++) { 
				List<Food> chosenCategory = categoriesRepository.getAllCategories().get(0); 
				chooseFoodMutation(i, chosenCategory); 
				} 
			} catch (Exception e) { e.printStackTrace(); 
		} finally { 
			System.setOut(System.out); System.setIn(System.in); 
			}
		
		} 
	//new mutation 
	public static void chooseInterestMutation(int userChoice3, Food chosenFood) { 
		switch (userChoice3) { 
		case 1: 
			System.out.println("Going back."); 
			break; 
		case 2: 
			System.out.println(chosenFood.getAllergies()); 
			break; 
		case 0: 
			System.out.println("Exitiiiiiiiiiiiiing.");//mutation
		break; 
		default: 
			System.out.println("Invalid choice"); 
			break; 
			} 
		} 
	
	@Test 
	public void testChooseInterestExitMutation() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseInterestMutation(0, firstFood); 
		assertEquals("Exitiiiiiiiiiiiiing.", outputStream.toString().trim());//mutation 
		System.setOut(System.out); } 
	
	
	//new mutation 
	public static void chooseOptionMutation(int userChoice4, String userName) { 
		switch (userChoice4) { 
		case 1: 
			System.out.println(" "); 
			break; 
		case 2: 
			System.out.println("MUTATION ! ");//mutation 
			break; 
		case 0: 
			System.out.println("Exiting."); 
			break; 
		default: 
			System.out.println("Invalid choice. Please rechoose."); 
		} 
	} 
	
	@Test 
	public void testChooseOption2() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseOptionMutation(2,fakeUser.getUserName()); 
		assertEquals("MUTATION !", outputStream.toString().trim());//mutation
		System.setOut(System.out); 
		} 
	} 




