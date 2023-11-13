import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DavidSprintOne {
	
	public static class Categories {
	        List<String> Bakery = new ArrayList<>();
	        List<String> Meat = new ArrayList<>();
	        List<String> Drinks = new ArrayList<>();
	        List<String> FruitsAndVegetables = new ArrayList<>();
	        List<String> Others = new ArrayList<>();
	        
	        public Categories() {
	        Bakery.add("Bread");//Wheat
	        Bakery.add("ChocolateCake");//milk and eggs 
	        Bakery.add("Biscuits");//milk and eggs 
	        Bakery.add("Cereals");//Wheat
	        Meat.add("Sausages");
	    	Meat.add("Vegan Meat");//soy
	    	Meat.add("Fish");//fish
	    	Meat.add("Ham");
	    	Drinks.add("Water");
	    	Drinks.add("Beer");//wheat
	    	Drinks.add("Coffee");
	    	Drinks.add("HotChocolate");//milk and peanuts
	    	FruitsAndVegetables.add("Banana");
	    	FruitsAndVegetables.add("Strawberries");//strawberries
	    	FruitsAndVegetables.add("Avocado");//avocado
	    	FruitsAndVegetables.add("Potatoes");//potatoes
	    	Others.add("Pasta");//sesame and wheat
	    	Others.add("Eggs");//eggs
	    	Others.add("Rice");
	    	Others.add("Mustard");//mustard
	    }

	/**
	 * Input a number and look up a list of categories
	 * @return list of categories
	 */
	public Categories lookUpCategoriesList(int number) {
		System.out.println("Please choose a topic :" );
		System.out.println("1) Search allergies by food" );
		System.out.println("2) Search foods by my allergies" );
		System.out.println("3) Look up account" );
		System.out.println("4) ??" );
		System.out.println("0) Go back" );
		switch (number) {
        case 0:
            return null;
        case 1:
    		System.out.println("Here are the categories of food : " );
        	return new Categories();
		}
	}
	
	/**
	 * Input a number and look up a list of Foods of a category
	 * @param Number
	 * @return list of food based on number
	 */
	public List<String> lookUpFoodsList(int choice) {
		System.out.println("Please choose a category :" );
		System.out.println("1) Bakery" );
		System.out.println("2) Meat" );
		System.out.println("3) Drinks" );
		System.out.println("4) Fruits And Vegetables" );
		System.out.println("5) Others" );
		System.out.println("0) Go back" );
		switch (choice) {
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
	public Food chooseAFood(int Number) {
		System.out.println("Which food who you like to look into ?" );
		switch (choice) {
		case 0 : 
			return null;
		case 1:
			return Bakery(Number);
        case 2:
			return Meat(Number);
		case 3:
			return Drinks(Number);
        case 4:
			return FruitsAndVegetables(Number);
        case 5:
			return Others(Number);
        default:
            return new ArrayList<>();
		}
		return null;
	}
	/**
	 * Input a number to choose to look up a Food's allergies
	 * @param food
	 * @return list of allergies based on a food
	 */
	public String[] checkingFoodAllergies(Food food) {
		return null;
	}
	/**
	 * Input a number to choose to look up a list of Foods based on my allergies
	 * @param MyAllergies
	 * @return list of foods based on my list of allergies
	 */
	public Food[] checkingFoodsByAllergies(String[] MyAllergies) {
		//return list of foods available for my allergies 
		return null;
	}
}
