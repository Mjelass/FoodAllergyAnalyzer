package main.java.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        for (int i = 1; i < categories.size(); i++) {
            List<Food> category = categories.get(i);
            System.out.println((i) + ") " + "Category: " + category.get(0).getCategory());
        }
        System.out.println("Enter the number of the category you want to explore (0 to exit):");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        chooseCategory(userChoice);
        if (userChoice < 0 || userChoice > categories.size()) {
            showCategories();
        } else if (userChoice == 0) {
            exiting(0);
        } else {
            List<Food> chosenCategory = categories.get(userChoice);
    	    showFoods(chosenCategory);
        }
	}
	
	public static String chooseCategory(int userChoice) {
        CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
        List<List<Food>> categories = categoriesRepository.getAllCategories();
        if (userChoice < 0 || userChoice > categories.size()) {
            System.out.print("Invalid choice.");
        } else if (userChoice == 0) {
            System.out.print("Exiting."); 
        } else {
            List<Food> chosenCategory = categories.get(userChoice);
            System.out.print("Here are the foods in this category : ");
    	    for (Food food : chosenCategory) {
    	        System.out.print(food.getName());
    	    }
    	    
        }
		return null;
    }
	    
	public static void showFoods(List<Food> chosenCategory) {
	    System.out.println("\nChoose a food to look into by entering its number (0 to exit):");
	    for (int i = 0; i < chosenCategory.size(); i++) {
	        System.out.println((i + 1) + ") " + chosenCategory.get(i).getName());
	    }
	    Scanner scanner = new Scanner(System.in);
	    int userChoice2 = scanner.nextInt();
	    chooseFood(userChoice2,chosenCategory);
	    if (userChoice2 < 0 || userChoice2 > chosenCategory.size()) {
	        showFoods(chosenCategory);
	    } else if (userChoice2 == 0) {
	        exiting(0);
	    } else {
	        Food chosenFood = chosenCategory.get(userChoice2-1);
	        showInterest(chosenFood);
	    }
	}
	
	public static void chooseFood(int userChoice2,List<Food> chosenCategory) {
	    if (userChoice2 < 0 || userChoice2 > chosenCategory.size()) {
	        System.out.println("Invalid choice.");
	    } else if (userChoice2 == 0) {
	        System.out.println("Exiting.");
	    } else {
	        Food chosenFood = chosenCategory.get(userChoice2-1);
	        System.out.println("You've chosen to look into "+chosenFood.getName()
	        +".\nWhat interests you about this food ?\n"
			+"1) Go back\n"
			+"2) Its list of potential allergies\n"
			+"0) Exit\n");
	    } 
	}

	public static void showInterest(Food chosenFood) {
		Scanner scanner = new Scanner(System.in);
		int userChoice3=scanner.nextInt();	
        chooseInterest(userChoice3,chosenFood);
	    switch (userChoice3) {
        case 1:
            showCategories();
            break;
        case 2:
            exiting(1);
            break;
        case 0:
            exiting(0);
            break;
        default:
            showInterest(chosenFood);
            break;
    } 
	}
	
	public static void chooseInterest(int userChoice3, Food chosenFood) {
	    switch (userChoice3) {
	        case 1:
	            System.out.println("Going back.");
	            break;
	        case 2:
	            System.out.println(chosenFood.getAllergies());
	            break;
	        case 0:
	            System.out.println("Exiting.");
	            break;
	        default:
	            System.out.println("Invalid choice");
	            break;
	    }
	}
	
	
	
	
	
	
	
	
	

	public static void showOptions(String userName) {

		CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
	    List<String> myAllergies = UserRepositoryImpl.getUserAllergiesByUsername(userName);
	    List<Food> allFoods = categoriesRepository.getAllFoods();
	    
	    if (myAllergies==null) {
        	System.out.println("Your have no relevant allergies. Exiting");
            exiting(0);
		}
        	System.out.println("Please choose an option :");
            System.out.println("1) Check foods to avoid");
            System.out.println("2) Check foods to eat");
            System.out.println("0) Exit");
		    Scanner scanner = new Scanner(System.in);
	        int userChoice4 = scanner.nextInt();
	        chooseOption(userChoice4,userName);
	        switch (userChoice4) {
	        case 1:
	            getFoodsToAvoid(allFoods, myAllergies);
	            break;
	        case 2:
	            getSafeFoods(allFoods, myAllergies);
	            break; 
	        case 0:
	            exiting(0);
	            break;
	        default:
	            showOptions(userName); 
	    }
	}
	
	
	public static void chooseOption(int userChoice4, String userName) {
		switch (userChoice4) {
	        case 1:
	            System.out.println(" ");
	            break;
	        case 2:
	            System.out.println(" ");
	            break; 
	        case 0:
	            System.out.println("Exiting.");
	            break;
	        default:
	            System.out.println("Invalid choice. Please rechoose.");
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
		exiting(1);
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
        exiting(1);
    }
	
	public static boolean containsAny(List<String> foodAllergies, List<String> userAllergies) {
        for (String allergy : userAllergies) {
        	if (foodAllergies==null) {
        		return false;
        	}else {
            if (foodAllergies.contains(allergy)) {
                return true; 
            }
        	}
        }
		return false;

	}
	public static void exiting(int userChoice0) {
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
	
	public static List<Food> getfoodinCategories() {
	    System.out.println("Available Categories:");
	    CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
	    List<List<Food>> categories = categoriesRepository.getAllCategories();
	    for (int i = 0; i < categories.size(); i++) {
	        List<Food> category = categories.get(i);
	        System.out.println((i + 1) + ") " + "Category: " + category.get(0).getCategory());
	    }
	    System.out.println("Enter choice of category by number:");
	    Scanner scanner = new Scanner(System.in);
	    int userChoice = scanner.nextInt();
	    if (userChoice < 0 || userChoice > categories.size()) {
	        return new ArrayList<>(); 
	    } else if (userChoice == 0) {
	        return new ArrayList<>(); 
	    } else {
	        return categories.get(userChoice - 1);
	    }
	}
	
	public static void RankCategories() {
	    CategoriesRepositoryImpl categoriesRepository = new CategoriesRepositoryImpl();
	    List<List<Food>> categories = categoriesRepository.getAllCategories();
	   
	    Map<String, Integer> categoryCounts = new HashMap<>();
	    for (List<Food> category : categories) {
	        if (!category.isEmpty()) {
	            String categoryName = category.get(0).getCategory();
	            categoryCounts.put(categoryName, category.size());
	        }
	    }	    
	    List<String> sortedCategories = new ArrayList<>(categoryCounts.keySet());
	    sortedCategories.sort((c1, c2) -> categoryCounts.get(c2).compareTo(categoryCounts.get(c1)));	    
	    System.out.println("Most common types of food:");
	    for (String categoryName : sortedCategories) {
	        System.out.println("Category: " + categoryName);
	    }
	}

}
