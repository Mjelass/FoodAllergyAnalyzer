package main.java.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.model.Categorie;
import main.java.model.Food;

public class CategoriesController {
	/**
	 * Input a number and look up a list of categories
	 * @return list of categories
	 */
	public Categorie lookUpCategoriesList() {
		System.out.println("Please choose a topic :" );
		System.out.println("1) Search allergies by food" );
		System.out.println("2) Search foods by my allergies" );
		System.out.println("3) Look up account" );
		System.out.println("4) ??" );
		System.out.println("0) Go back" );
		
		int userChoice = getUserInput();
		switch (userChoice) {
        case 0:
            return null;
        case 1:
    		System.out.println("Here are the categories of food : " );
        	return new Categorie();
        default:
            System.out.println("Invalid choice");
            return null;
		}
	}
	
	/**
	 * Input a number and look up a list of Foods of a category
	 * @param Number
	 * @return list of food based on number
	 */
	public List<String> lookUpFoodsList() {
		System.out.println("Please choose a category :" );
		System.out.println("1) Bakery" );
		System.out.println("2) Meat" );
		System.out.println("3) Drinks" );
		System.out.println("4) Fruits And Vegetables" );
		System.out.println("5) Others" );
		System.out.println("0) Go back" );
		
		int userChoice = getUserInput();
		switch (userChoice) {
		case 0 : 
			return null;
		case 1:
			System.out.println("Here are the bakery foods :" );
            return Bakery;
        case 2:
			System.out.println("Here are the meats :" );
			return Meat;
        case 3:
			System.out.println("Here are the drinks :" );
            return Drinks;
        case 4:
			System.out.println("Here are the fruits and vegetables :" );
			return FruitsAndVegetables;
        case 5:
			System.out.println("Here are the rest of foods analysable :" );
            return Others;
        default:
            return new ArrayList<>();
		}
	}
	/**
	 * Input a number to choose a Food among the list
	 * @param number
	 * @return name of a food based on a number
	 */
	public Food chooseAFood() {
		System.out.println("Which food who you like to look into ?" );
		
		int userChoice = getUserInput();
		switch (userChoice) {
		case 0 : 
			return null;
		case 1:
			return Bakery.get(0);
        case 2:
			return Meat.get(0);
		case 3:
			return Drinks.get(0);
        case 4:
			return FruitsAndVegetables.get(0);
        case 5:
			return Others.get(0);
        default:
            return new ArrayList<>();
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
		
		int userChoice = getUserInput();
		switch (userChoice) {
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
	
	
	private List<String> getFoodNames(List<Food> foods) {
        List<String> foodNames = new ArrayList<>();
        for (Food food : foods) {
            foodNames.add(food.getName());
        }
        return foodNames;
    }

    private int getUserInput() {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextInt();
    }
}
