package main.java.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.java.model.Food;
import main.java.repository.CategoriesRepositoryImpl;
import main.java.repository.UserRepositoryImpl;

public class CategoriesController {

	public static void lookUpCategoriesList() {
	    System.out.println("Here are the categories of food with numbers:");

	    List<List<Food>> categories = CategoriesRepositoryImpl.getAllCategories();

	    for (int i = 0; i < categories.size(); i++) {
	        System.out.println((i + 1) + ") " + categories.get(i));
	    }

	    // Ask the user to choose a category
	    System.out.println("Enter the number of the category you want to explore (0 to exit):");
	    Scanner scanner = new Scanner(System.in);
	    int userChoice = scanner.nextInt();

	    if (userChoice < 0 || userChoice > categories.size()) {
	        System.out.println("Invalid choice. Exiting.");
	    } else if (userChoice == 0) {
	        System.out.println("Exiting.");
	    } else {
	        List<Food> chosenCategory = categories.get(userChoice - 1);
	        getFoodsInCategory(chosenCategory);
	    }
	}

	public static void getFoodsInCategory(List<Food> chosenCategory) {
	    List<Food> foodsInCategory = CategoriesRepositoryImpl.getFoodsByCategory(chosenCategory);

	    System.out.println("Here are the foods in the category " + chosenCategory + ":");
	    for (Food food : foodsInCategory) {
	        System.out.println(food.getName());
	    }
	}
	public static void chooseFoodToLookInto(List<Food> foods) {
	    System.out.println("Choose a food to look into by entering its number (0 to exit):");

	    for (int i = 0; i < foods.size(); i++) {
	        System.out.println((i + 1) + ") " + foods.get(i).getName());
	    }

	    Scanner scanner = new Scanner(System.in);
	    int userChoice = scanner.nextInt();

	    if (userChoice < 0 || userChoice > foods.size()) {
	        System.out.println("Invalid choice. Exiting.");
	    } else if (userChoice == 0) {
	        System.out.println("Exiting.");
	    } else {
	        Food chosenFood = foods.get(userChoice - 1);
	        System.out.println("You've chosen to look into "+chosenFood.getName());
	        checkingFoodAllergies(chosenFood);
	    }
	}

	public static List<String> checkingFoodAllergies(Food food) {
		System.out.println("What interests you about this food ?");
		System.out.println("1) Its information");
		System.out.println("2) Its list of potential allergies");
		
		Scanner scanner = new Scanner(System.in);
		int userChoice3=scanner.nextInt();	
		switch (userChoice3) {
        case 1:
            // Return information about the food
            System.out.println("Information not implemented yet");
        case 2:
            // Return the list of potential allergies
            return food.getAllergies();
        default:
            System.out.println("Invalid choice");
            return null;
     }
	}

	 public static List<Food> chooseFoodsByAllergies(String userName) {
		 	List<String> myAllergies = UserRepositoryImpl.getUserAllergiesByUsername(userName);
	        List<Food> allFoods = CategoriesRepositoryImpl.getAllFoods();
		 
	        System.out.println("Choose an option:");
	        System.out.println("1) Look at foods with allergies");
	        System.out.println("2) Look at foods without allergies");
	        System.out.println("0) Exit");
	        
		    Scanner scanner = new Scanner(System.in);
	        int userChoice = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        switch (userChoice) {
	            case 1:
	                return getFoodsToAvoid(allFoods, myAllergies);
	            case 2:
	                return getSafeFoods(allFoods, myAllergies);
	            case 0:
	                System.out.println("Exiting.");
	                return List.of(); // Return an empty list if the user chooses to exit
	            default:
	                System.out.println("Invalid choice. Exiting.");
	                return List.of(); // Return an empty list for an invalid choice
	        }
	    }

	
	public static List<Food> getSafeFoods(List<Food> allFoods, List<String> userAllergies) {
        List<Food> safeFoods = new ArrayList<>();

        for (Food food : allFoods) {
            if (!containsAny(food.getAllergies(), userAllergies)) {
                safeFoods.add(food);
            }
        }
        return safeFoods;
    }
	
    public static List<Food> getFoodsToAvoid(List<Food> allFoods, List<String> userAllergies) {
        List<Food> foodsToAvoid = new ArrayList<>();

        for (Food food : allFoods) {
            if (!containsAny(food.getAllergies(), userAllergies)) {
                foodsToAvoid.add(food);
            }
        }
        return foodsToAvoid;
    }
    
	public static boolean containsAny(List<String> foodAllergies, List<String> userAllergies) {
        for (String allergy : userAllergies) {
            if (foodAllergies.contains(allergy)) {
                return true; // Food contains at least one allergy from the user's list
            }
        }
        return false; // Food doesn't contain any of the user's allergies
    }


}
