package main.java.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;
import java.util.Scanner;
import main.java.model.Categories;
import main.java.model.Food;

public class CategoriesController {
	/**
	 * Input a number and look up a list of categories
	 */
    public static void lookUpCategoriesList() {
    	System.out.println("Which topic do you want to look into ?");
    	System.out.println("1) Categories of products");
    	System.out.println("2) Products based on my allergies");
    	System.out.println("3) My profil");
    	System.out.println("4) ??");
    	System.out.println("0) Exit");
    	Scanner scanner = new Scanner(System.in);
    	int userChoice=scanner.nextInt();
    	switch (userChoice) {
        case 0:
        	 break;
        case 1:
	    	List<List<Food>> categories2 = Categories.getCategories2List();
	        lookUpFoodsList(categories2);
            break;
		default:
            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            break;
        }
        scanner.close();
    }

	
	/**
	 * Input a number and look up a list of Foods of a category
	 * @param categories 
	 * @param Number
	 * @return 
	 * @return list of food based on number
	 */
	 public static void lookUpFoodsList(List<List<Food>> categories2) {
		System.out.println(" ");
		System.out.println("Which category would you like to look into ?");
    	System.out.println("1) Bakery");
    	System.out.println("2) Meat");
    	System.out.println("3) Drinks");
    	System.out.println("4) Fruits And Vegetables?");
    	System.out.println("5) Others");
    	System.out.println("0) Exit?");
    	List<String> categories = Categories.getCategoriesList();
		Scanner scanner = new Scanner(System.in);
	    int userChoice2=scanner.nextInt();
	    switch(userChoice2) {
	    case 1: 
			System.out.println("You've chosen to look into the "+categories.get(0));
			Categories.createBakeryList();
			List<Food> category1=Categories.getBakeryList();
			chooseFood(category1);
			break;
		case 2 : 
			System.out.println("You've chosen to look into the "+categories.get(1));
			Categories.createMeatList();
			List<Food> category2=Categories.getMeatList();
			chooseFood(category2);
			break;
	    case 3 :
			System.out.println("You've chosen to look into the "+categories.get(2));
			Categories.createDrinksList();
			List<Food> category3=Categories.getDrinksList();
			chooseFood(category3);
			break;
	    case 4 :
			System.out.println("You've chosen to look into the "+categories.get(3));
			Categories.createFruitsAndVegetablesList();
			List<Food> category4=Categories.getFruitsAndVegetablesList();
			chooseFood(category4);
			break;
	    case 5 :
			System.out.println("You've chosen to look into the "+categories.get(4));
			Categories.createOthersList();
			List<Food> category5=Categories.getOthersList();
			chooseFood(category5);
			break;
	    case 0 :
	    	break;
	    }
        scanner.close();
	 }

	/**
	 * Input a number to choose a Food among the list
	 * @param categories 
	 * @param number
	 * @return name of a food based on a number
	 */
	 
	 public static void chooseFood(List<Food> category) {
		 System.out.println("Here the foods in that category :");
		 for (Food element : category) {
	            System.out.println(element.getName());
	        }
    }
	/**
	 * Input a number to choose to look up a Food's allergies
	 * @param food
	 * @return list of allergies based on a food
	 */
	public String[] checkingFoodAllergies(Food food) {
		System.out.println("What interests you about this food ?");
		System.out.println("1) Its information");
		System.out.println("2) Its list of potential allergies");
		
		Scanner scanner = new Scanner(System.in);
		int userChoice3=scanner.nextInt();	
		switch (userChoice3) {
        case 1:
            // Return information about the food
            return new String[]{"Information not implemented yet"};
        case 2:
            // Return the list of potential allergies
            return food.getAllergies();
        default:
            System.out.println("Invalid choice");
            return null;
     }
	}
	/**
	 * Input a number to choose to look up a list of Foods based on my allergies
	 * @param MyAllergies
	 * @return list of foods based on my list of allergies
	 */
	public Food[] checkingFoodsByAllergies(String[] MyAllergies) {
		 System.out.println("Here are the foods you can eat:");

	        List<Food> safeFoods = new ArrayList<>();
	        for (Food food : Bakery) {
	            if (!containsAny(food.getAllergies(), myAllergies)) {
	                safeFoods.add(food);
	            }
	        }for (Food food : Meat) {
	            if (!containsAny(food.getAllergies(), myAllergies)) {
	                safeFoods.add(food);
	            }
	        }for (Food food : Drinks) {
	            if (!containsAny(food.getAllergies(), myAllergies)) {
	                safeFoods.add(food);
	            }
	        }for (Food food : FruitsAndVegetables) {
	            if (!containsAny(food.getAllergies(), myAllergies)) {
	                safeFoods.add(food);
	            }
	        }for (Food food : Others) {
	            if (!containsAny(food.getAllergies(), myAllergies)) {
	                safeFoods.add(food);
	            }
	        }return safeFoods;
	    }


}
