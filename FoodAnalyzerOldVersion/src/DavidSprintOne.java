import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Categories {

    List<Food> Bakery = new ArrayList<>();
    List<Food> Meat = new ArrayList<>();
    List<Food> Drinks = new ArrayList<>();
    List<Food> FruitsAndVegetables = new ArrayList<>();
    List<Food> Others = new ArrayList<>();
    
    public Categories() {
    //creating all the foods
    //Bread
		String[] breadIngredients = {"Floor", "Water", "Yeast", "Salt", "Wheat"};
	    String[] breadAllergies = {"wheat"};
	    Food Bread=new Food("Bread",breadIngredients,breadAllergies,"Bakery",1);
	    //Chocolate Cake		
	    String[] chocolateCakeIngredients = {"Floor", "Sugar", "Eggs", "Chocolate", "Milk"};
	    String[] chocolateCakeAllergies = {"Eggs","Milk"};
	    Food ChocolateCake=new Food("Chocolate Cake",chocolateCakeIngredients,chocolateCakeAllergies,"Bakery",3);
	    //Cookies		
	    String[] cookiesIngredients = {"Floor", "Butter", "Eggs", "Milk", "Sugar"};
	    String[] cookiesAllergies = {"Eggs","Milk"};
	    Food Cookies=new Food("Cookies",cookiesIngredients,cookiesAllergies,"Bakery",2);	        
	    //Cereals
	    String[] cerealsIngredients = {"Wheat", "Sugar", "Oats"};
	    String[] cerealsAllergies = {"Wheat"};
	    Food Cereals=new Food("Cereals",cerealsIngredients,cerealsAllergies,"Bakery",1);	  
		//Sausages       		
	    String[] sausagesIngredients = {"Meat"};
	    String[] sausagesAllergies = {"None"};
	    Food Sausages=new Food("Sausages",sausagesIngredients,sausagesAllergies,"Meat",4);	        		
		//Vegan Meat
	    String[] veganMeatIngredients = {"Proteins","Soy"};
	    String[] veganMeatAllergies = {"Soy"};
	    Food VeganMeat=new Food("Vegan Meat",veganMeatIngredients,veganMeatAllergies,"Meat",4);
	    //Fish
	    String[] fishIngredients = {"Fish"};
	    String[] fishAllergies = {"Fish"};
	    Food Fish=new Food("Fish",fishIngredients,fishAllergies,"Meat",3);
	    //Ham
	    String[] hamIngredients = {"Meat"};
	    String[] hamAllergies = {"None"};
	    Food Ham=new Food("Ham",hamIngredients,hamAllergies,"Meat",3);
	    //Water
	    String[] waterIngredients = {"Water"};
	    String[] waterAllergies = {"None"};
	    Food Water=new Food("Water",waterIngredients,waterAllergies,"Drinks",1);	        
	    //Beer
	    String[] beerIngredients = {"Water","Wheat"};
	    String[] beerAllergies = {"Wheat"};	        
	    Food Beer=new Food("Beer",beerIngredients,beerAllergies,"Drinks",5);      
	    //Coffee
	    String[] coffeeIngredients = {"Caffeine"};
	    String[] coffeeAllergies = {"None"};	  
	    Food Coffee=new Food("Coffee",coffeeIngredients,coffeeAllergies,"Drinks",2); 
	    //Hot chocolate
	    String[] hotChocolateIngredients = {"Milk","Peanuts"};
	    String[] hotChocolateAllergies = {"Milk","Peanuts"};
	    Food HotChocolate=new Food("Hot chocolate",hotChocolateIngredients,hotChocolateAllergies,"Drinks",2); 
	    //Banana
	    String[] bananaIngredients = {"Banana"};
	    String[] bananaAllergies = {"None"};
	    Food Banana=new Food("Banana",bananaIngredients,bananaAllergies,"Fruits and Vegetables",1); 
	    //Strawberries
	    String[] strawberriesIngredients = {"Strawberries"};
	    String[] strawberriesAllergies = {"Strawberries"};
	    Food Strawberries=new Food("Strawberries",strawberriesIngredients,strawberriesAllergies,"Fruits and Vegetables",3); 
	    //Avocado
	    String[] avocadoIngredients = {"Avocado"};
	    String[] avocadoAllergies = {"Avocado"};
	    Food Avocado=new Food("Avocado",avocadoIngredients,avocadoAllergies,"Fruits and Vegetables",3); 	        
	    //Potatoes
	    String[] potatoesIngredients = {"Potatoes"};
	    String[] potatoesAllergies = {"Potatoes"};
	    Food Potatoes=new Food("Potatoes",potatoesIngredients,potatoesAllergies,"Fruits and Vegetables",1); 	
	    //Pasta
	    String[] pastaIngredients = {"Sesame","Salt","Wheat"};
	    String[] pastaAllergies = {"Sesame","Wheat"};
	    Food Pasta=new Food("Pasta",pastaIngredients,pastaAllergies,"Others",1); 	
	    //Eggs
	    String[] eggsIngredients = {"Eggs"};
	    String[] eggsAllergies = {"Eggs"};
	    Food Eggs=new Food("Eggs",eggsIngredients,eggsAllergies,"Others",3); 	
	    //Rice
	    String[] riceIngredients = {"Rice"};
	    String[] riceAllergies = {"None"};
	    Food Rice=new Food("Rice",riceIngredients,riceAllergies,"Others",2); 	
	    //Mustard
	    String[] mustardIngredients = {"Water","Vinegar","Salt"};
	    String[] mustardAllergies = {"None"};
	    Food Mustard=new Food("Mustard",mustardIngredients,mustardAllergies,"Others",3); 	
	    
	    Bakery.add(Bread);//Wheat
	    Bakery.add(ChocolateCake);//milk and eggs 
	    Bakery.add(Cookies);//milk and eggs 
	    Bakery.add(Cereals);//Wheat
	    Meat.add(Sausages);
		Meat.add(VeganMeat);//soy
		Meat.add(Fish);//fish
		Meat.add(Ham);
		Drinks.add(Water);
		Drinks.add(Beer);//wheat
		Drinks.add(Coffee);
		Drinks.add(HotChocolate);//milk and peanuts
		FruitsAndVegetables.add(Banana);
		FruitsAndVegetables.add(Strawberries);//strawberries
		FruitsAndVegetables.add(Avocado);//avocado
		FruitsAndVegetables.add(Potatoes);//potatoes
		Others.add(Pasta);//sesame and wheat
		Others.add(Eggs);//eggs
		Others.add(Rice);
		Others.add(Mustard);//Vinegar
	}
}	       
public class DavidSprintOne {
	/**
	 * Input a number and look up a list of categories
	 * @return list of categories
	 */
	public Categories lookUpCategoriesList() {
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
        	return new Categories();
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
		switch (choice) {
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
