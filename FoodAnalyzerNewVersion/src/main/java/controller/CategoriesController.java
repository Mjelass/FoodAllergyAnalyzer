package main.java.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.Main;
import main.java.model.Food;
import main.java.repository.CategoriesRepositoryImpl;
import main.java.repository.FoodRepositoryImpl;
import main.java.repository.UserRepositoryImpl;

public class CategoriesController {
	
    
	public static void lookUpCategoriesList() {
        System.out.println("Here are the categories of food with numbers:");
        CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
        List<List<Food>> categories = CategoriesRepositoryImpl.getAllCategories();
        for (int i = 0; i < categories.size(); i++) {
            List<Food> category = categories.get(i);
            System.out.println((i + 1) + ") " + "Category: " + category.get(0).getCategory());
        }

        // Ask the user to choose a category
        System.out.println("Enter the number of the category you want to explore (0 to exit):");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        scanner.nextInt();  

        if (userChoice < 0 || userChoice > categories.size()) {
            System.out.println("Invalid choice.");
            lookUpCategoriesList();
        } else if (userChoice == 0) {
            System.out.println("Exiting.");
            Main.afterLoginUser();
        } else {
            List<Food> chosenCategory = categories.get(userChoice - 1);
            getFoodsInCategory(chosenCategory);
        }
    }

	public static void getFoodsInCategory(List<Food> chosenCategory) {
	    CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
	    List<Food> foodsInCategory = CategoriesRepositoryImpl.getFoodsByCategory(chosenCategory);

	    System.out.println("Here are the foods in this category :");
	    for (Food food : foodsInCategory) {
	        System.out.println(food.getName());
	    }
	    chooseFoodToLookInto(foodsInCategory);
	    
	}
	
	public static void chooseFoodToLookInto(List<Food> foods) {
	    System.out.println("Choose a food to look into by entering its number (0 to exit):");

	    for (int i = 0; i < foods.size(); i++) {
	        System.out.println((i + 1) + ") " + foods.get(i).getName());
	    }

	    Scanner scanner = new Scanner(System.in);
	    int userChoice = scanner.nextInt();

	    if (userChoice < 0 || userChoice > foods.size()) {
	        System.out.println("Invalid choice.");
	        chooseFoodToLookInto(foods);
	    } else if (userChoice == 0) {
	        System.out.println("Exiting.");
	        Main.afterLoginUser();
	    } else {
	        Food chosenFood = foods.get(userChoice-1);
	        System.out.println("You've chosen to look into "+chosenFood.getName());
	        checkingFoodAllergies(chosenFood);
	    }
	}

	public static void checkingFoodAllergies(Food chosenFood) {
		System.out.println("What interests you about this food ?");
		System.out.println("1) Go back");
		System.out.println("2) Its information");
		System.out.println("3) Its list of potential allergies");
		System.out.println("0) Exit");
		CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
	    FoodRepositoryImpl foodRepository = new FoodRepositoryImpl();

		Scanner scanner = new Scanner(System.in);
		int userChoice3=scanner.nextInt();	
        scanner.nextLine();
		switch (userChoice3) {
        case 1:
        	lookUpCategoriesList();
        case 2:
            System.out.println("Information not implemented yet");
        case 3:
            System.out.println(chosenFood.getAllergies());
            System.out.println("Press any key to exit");
    		scanner.nextLine();
            Main.afterLoginUser();
        case 0:
	        System.out.println("Exiting.");
	        Main.afterLoginUser();
        default:
            System.out.println("Invalid choice");
            checkingFoodAllergies(chosenFood);
		}
        System.out.println("Press any key to exit");
		scanner.nextLine();
        Main.afterLoginUser();
	}

	public static void chooseFoodsByAllergies(String userName) {
		    CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
		 	List<String> myAllergies = UserRepositoryImpl.getUserAllergiesByUsername(userName);
	        List<Food> allFoods = CategoriesRepositoryImpl.getAllFoods();
		 
	        System.out.println("Choose an option:");
	        System.out.println("1) Look at foods you must not eat");
	        System.out.println("2) Look at foods you can eat");
	        System.out.println("0) Exit");
	        
		    Scanner scanner = new Scanner(System.in);
	        int userChoice = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        switch (userChoice) {
	            case 1:
	                getFoodsToAvoid(allFoods, myAllergies);
	                break;
	            case 2:
	                getSafeFoods(allFoods, myAllergies);
	                break;
	            case 0:
	                System.out.println("Exiting."); 
	    	        Main.afterLoginUser();
	            default:
	                System.out.println("Invalid choice. Please rechoose.");
	    	        chooseFoodsByAllergies(userName);
	        }
	    }
	
    public static void getFoodsToAvoid(List<Food> allFoods, List<String> userAllergies) {
    	List<Food> badFoods = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);

        for (Food food : allFoods) {
            if (containsAny(food.getAllergies(), userAllergies)) {
            	badFoods.add(food);
            }
        }
		if (badFoods.isEmpty()) {
            System.out.println("You can eat all the food you want !! (but not much food)");
	    }else {
		    System.out.println("The foods you should not eat are :");
		    for (Food element : badFoods) {
	            System.out.println(element.getName());
	        }	
		    System.out.println("BEUUURK...");
	    }
        System.out.println("Press any key to exit");
        scanner.nextLine();
        Main.afterLoginUser();
    }
    
	public static void getSafeFoods(List<Food> allFoods, List<String> userAllergies) {
        List<Food> safeFoods = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);

        for (Food food : allFoods) {
            if (!containsAny(food.getAllergies(), userAllergies)) {
                safeFoods.add(food);
            }
        }
        if (safeFoods.isEmpty()) {
            System.out.println("I'm sorry, but you can't eat anything I'm afraid");
	    }else {
		    System.out.println("The foods you can eat are :");
		    for (Food element : safeFoods) {
		    System.out.println(element.getName());	
		    }
		    System.out.println("YUMMY !");

	    }
        System.out.println("Press any key to exit");
        scanner.nextLine();
        Main.afterLoginUser();
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
