package main.java.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.Main;
import main.java.model.Food;
import main.java.repository.CategoriesRepository;
import main.java.repository.CategoriesRepositoryImpl;
import main.java.repository.FoodRepositoryImpl;
import main.java.repository.UserRepositoryImpl;

public class CategoriesController {
	
    public static void showCategories() {
        System.out.println("Here are the categories of food with numbers:");
        CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
        List<List<Food>> categories = categoriesRepository.getAllCategories();
        for (int i = 0; i < categories.size(); i++) {
            List<Food> category = categories.get(i);
            System.out.println((i + 1) + ") " + "Category: " + category.get(0).getCategory());
        }
        System.out.println("Enter the number of the category you want to explore (0 to exit):");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        chooseCategory(userChoice);
	}
	
	public static void chooseCategory(int userChoice) {
        CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
        List<List<Food>> categories = categoriesRepository.getAllCategories();
        if (userChoice < 0 || userChoice > categories.size()) {
            System.out.println("Invalid choice.");
            showCategories();
        } else if (userChoice == 0) {
            System.out.println("Exiting.");
            
        } else {
            List<Food> chosenCategory = categories.get(userChoice - 1);
            System.out.println("Here are the foods in this category :");
    	    for (Food food : chosenCategory) {
    	        System.out.println(food.getName());
    	    }
    	    showFoods(chosenCategory);
        }
    }
	    
	public static void showFoods(List<Food> chosenCategory) {
	    System.out.println("Choose a food to look into by entering its number (0 to exit):");
	    for (int i = 0; i < chosenCategory.size(); i++) {
	        System.out.println((i + 1) + ") " + chosenCategory.get(i).getName());
	    }
	    Scanner scanner = new Scanner(System.in);
	    int userChoice2 = scanner.nextInt();
	    chooseFood(userChoice2,chosenCategory);
	}
	
	public static void chooseFood(int userChoice2,List<Food> chosenCategory) {
	    if (userChoice2 < 0 || userChoice2 > chosenCategory.size()) {
	        System.out.println("Invalid choice.");
	        showFoods(chosenCategory);
	    } else if (userChoice2 == 0) {
	        System.out.println("Exiting.");
            exit(0);
	    } else {
	        Food chosenFood = chosenCategory.get(userChoice2-1);
	        System.out.println("You've chosen to look into "+chosenFood.getName());
	        showInterest(chosenFood);
	    }
	}

	public static void showInterest(Food chosenFood) {
		System.out.println("What interests you about this food ?");
		System.out.println("1) Go back");
		System.out.println("2) Its list of potential allergies");
		System.out.println("0) Exit");
		Scanner scanner = new Scanner(System.in);
		int userChoice3=scanner.nextInt();	
        chooseInterest(userChoice3,chosenFood);
	}
	
	public static void chooseInterest(int userChoice3, Food chosenFood) {
		switch (userChoice3) {
        case 1:
        	showCategories();
        case 2:
            System.out.println(chosenFood.getAllergies());
            exit(1);
        case 0:
	        System.out.println("Exiting.");
            exit(0);
        default:
            System.out.println("Invalid choice");
            showInterest(chosenFood);
		}
        exit(1);
	}
	
	
	
	
	
	
	
	
	

	public static void showOptions(String userName) {		 
	        System.out.println("Choose an option:");
	        System.out.println("1) Look at foods you must not eat");
	        System.out.println("2) Look at foods you can eat");
	        System.out.println("0) Exit");	        
		    Scanner scanner = new Scanner(System.in);
	        int userChoice4 = scanner.nextInt();
	        chooseOption(userChoice4,userName);
	        
	}
	public static void chooseOption(int userChoice4, String userName) {
	 	List<String> myAllergies = UserRepositoryImpl.getUserAllergiesByUsername(userName);
        List<Food> allFoods = CategoriesRepositoryImpl.getAllFoods();
	        switch (userChoice4) {
	            case 1:
	                getFoodsToAvoid(allFoods, myAllergies);
	                break;
	            case 2:
	                getSafeFoods(allFoods, myAllergies);
	                break;
	            case 0:
	                System.out.println("Exiting."); 
	                exit(0);
	            default:
	                System.out.println("Invalid choice. Please rechoose.");
	                showOptions(userName);
	        }
	    }
	
    public static void getFoodsToAvoid(List<Food> allFoods, List<String> userAllergies) {
    	List<Food> badFoods = new ArrayList<>();
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
        exit(1);
    }
    
	public static void getSafeFoods(List<Food> allFoods, List<String> userAllergies) {
        List<Food> safeFoods = new ArrayList<>();
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
        exit(1);
    }
	
	public static boolean containsAny(List<String> foodAllergies, List<String> userAllergies) {
        for (String allergy : userAllergies) {
            if (foodAllergies.contains(allergy)) {
                return true; 
            }
        }
        return false; 

	}
	public static void exit(int userChoice0) {
		if (userChoice0==0) {
	        System.out.println(" ");
	        Main.afterLoginUser();
		}else {
		    Scanner scanner = new Scanner(System.in);
	        System.out.println("Press any key to exit");
	        String exit = scanner.nextLine();
	        Main.afterLoginUser();
	        scanner.close();
		}
	}
}
