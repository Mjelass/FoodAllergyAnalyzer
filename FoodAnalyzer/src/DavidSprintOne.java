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
	        //creating all the foods
	        //Bread
	        List<String> breadIngridients = new ArrayList<>();
	        breadIngridients.add("Floor");
	        breadIngridients.add("Water");
	        breadIngridients.add("Yeast");
	        breadIngridients.add("Salt");
	        breadIngridients.add("Wheat");
	        List<String> breadAllergies = new ArrayList<>();
	        breadAllergies.add("wheat");
	        Food Bread=new Food("Bread",breadIngridients,breadAllergies,"Bakery",1)
	        //Chocolate Cake		
	        List<String> chocolateCakeIngridients = new ArrayList<>();
	        chocolateCakeIngridients.add("Floor");
	        chocolateCakeIngridients.add("Sugar");
	        chocolateCakeIngridients.add("Eggs");
	        chocolateCakeIngridients.add("Chocolate");
	        chocolateCakeIngridients.add("Milk");
	        List<String> chocolateCakeAllergies = new ArrayList<>();
	        chocolateCakeAllergies.add("Eggs");
	        chocolateCakeAllergies.add("Mile");
	        Food ChocolateCake=new Food("Chocolate Cake",chocolateCakeIngridients,chocolateCakeAllergies,"Bakery",3);
	        //Cookies		
	        List<String> cookiesIngridients = new ArrayList<>();
	        cookiesIngridients.add("Floor");
	        cookiesIngridients.add("Butter");
	        cookiesIngridients.add("Eggs");
	        cookiesIngridients.add("Milk");
	        cookiesIngridients.add("Sugar");
	        List<String> cookiesAllergies = new ArrayList<>();
	        cookiesAllergies.add("Milk");
	        cookiesAllergies.add("Eggs");
	        Food Cookies=new Food("Cookies",cookiesIngridients,cookiesAllergies,"Bakery",2);	        
	        //Cereals
	        List<String> cerealsIngridients = new ArrayList<>();
	        cerealsIngridients.add("Wheat");
	        cerealsIngridients.add("Sugar");
	        cerealsIngridients.add("Oats");
	        List<String> cerealsAllergies = new ArrayList<>();
	        cerealsAllergies.add("Wheat");
	        Food Cereals=new Food("Cereals",cerealsIngridients,cerealsIngridients,"Bakery",1);	  
	    	//Sausages       		
	        List<String> sausagesIngridients = new ArrayList<>();
	        sausagesIngridients.add("Meat");
	        List<String> sausagesAllergies = new ArrayList<>();
	        sausagesAllergies.add("None");
	        Food Sausages=new Food("Sausages",sausagesIngridients,sausagesAllergies,"Meat",4);	        		
	    	//Vegan Meat
	        List<String> veganMeatIngridients = new ArrayList<>();
	        veganMeatIngridients.add("Proteins");
	        veganMeatIngridients.add("Soy");
	        List<String> veganMeatAllergies = new ArrayList<>();
	        veganMeatAllergies.add("Soy");
	        Food VeganMeat=new Food("Vegan Meat",veganMeatIngridients,veganMeatAllergies,"Meat",4);
	        //Fish
	        List<String> fishIngridients = new ArrayList<>();
	        fishIngridients.add("Fish");
	        List<String> fishAllergies = new ArrayList<>();
	        fishAllergies.add("Fish");
	        Food Fish=new Food("Fish",fishIngridients,fishAllergies,"Meat",3);
	        //Ham
	        List<String> hamIngridients = new ArrayList<>();
	        hamIngridients.add("Meat");
	        List<String> hamAllergies = new ArrayList<>();
	        hamAllergies.add("Meat");
	        Food Ham=new Food("Ham",hamIngridients,hamAllergies,"Meat",3);
	        //Water
	        List<String> waterIngridients = new ArrayList<>();
	        waterIngridients.add("Water");
	        List<String> waterAllergies = new ArrayList<>();
	        waterAllergies.add("None");
	        Food Water=new Food("Water",waterIngridients,waterAllergies,"Drinks",1);	        
	        //Beer
	        List<String> beerIngridients = new ArrayList<>();
	        beerIngridients.add("Water");
	        beerIngridients.add("Wheat");
	        List<String> beerAllergies = new ArrayList<>();
	        beerAllergies.add("Wheat");
	        Food Beer=new Food("Beer",beerIngridients,beerAllergies,"Drinks",5);      
	        //Coffee
	        List<String> coffeeIngredients = new ArrayList<>();
	        coffeeIngredients.add("Caffeine");
	        List<String> coffeeAllergies = new ArrayList<>();
	        coffeeAllergies.add("None");
	        Food Coffee=new Food("Coffee",coffeeIngredients,coffeeAllergies,"Drinks",2); 
	        //Hot chocolate
	        List<String> hotChocolateIngredients = new ArrayList<>();
	        hotChocolateIngredients.add("Milk");
	        hotChocolateIngredients.add("Peanuts");
	        List<String> hotChocolateAllergies = new ArrayList<>();
	        hotChocolateAllergies.add("Milk");
	        hotChocolateAllergies.add("Peanuts");
	        Food HotChocolate=new Food("Hot chocolate",hotChocolateIngredients,hotChocolateAllergies,"Drinks",2); 
	        //Banana
	        List<String> bananaIngredients = new ArrayList<>();
	        bananaIngredients.add("Banana");
	        List<String> bananaAllergies = new ArrayList<>();
	        bananaAllergies.add("None");
	        Food Banana=new Food("Banana",bananaIngredients,bananaAllergies,"Fruits and Vegetables",1); 
	        //Strawberries
	        List<String> strawberriesIngredients = new ArrayList<>();
	        strawberriesIngredients.add("Strawberries");
	        List<String> strawberriesAllergies = new ArrayList<>();
	        strawberriesAllergies.add("Strawberries");
	        Food Strawberries=new Food("Strawberries",strawberriesIngredients,strawberriesAllergies,"Fruits and Vegetables",3); 
	        //Avocado
	        List<String> avocadoIngredients = new ArrayList<>();
	        avocadoIngredients.add("Avocado");
	        List<String> avocadoAllergies = new ArrayList<>();
	        avocadoAllergies.add("Avocado");
	        Food Avocado=new Food("Avocado",avocadoIngredients,avocadoAllergies,"Fruits and Vegetables",3); 	        
	        //Potatoes
	        List<String> potatoesIngredients = new ArrayList<>();
	        potatoesIngredients.add("Potatoes");
	        List<String> potatoesAllergies = new ArrayList<>();
	        potatoesAllergies.add("Potatoes");
	        Food Potatoes=new Food("Potatoes",potatoesIngredients,potatoesAllergies,"Fruits and Vegetables",1); 	
	        //Pasta
	        List<String> pastaIngredients = new ArrayList<>();
	        pastaIngredients.add("Sesame");
	        pastaIngredients.add("Salt");
	        pastaIngredients.add("Wheat");
	        List<String> pastaAllergies = new ArrayList<>();
	        pastaAllergies.add("Sesame");
	        pastaAllergies.add("Wheat");
	        Food Pasta=new Food("Pasta",pastaIngredients,pastaAllergies,"Others",1); 	
	        //Eggs
	        List<String> eggsIngredients = new ArrayList<>();
	        eggsIngredients.add("Eggs");
	        List<String> eggsAllergies = new ArrayList<>();
	        eggsAllergies.add("Eggs");
	        Food Eggs=new Food("Eggs",eggsIngredients,eggsAllergies,"Others",3); 	
	        //Rice
	        List<String> riceIngredients = new ArrayList<>();
	        riceIngredients.add("Rice");
	        List<String> riceAllergies = new ArrayList<>();
	        riceAllergies.add("None");
	        Food Rice=new Food("Rice",riceIngredients,riceAllergies,"Others",2); 	
	        //Mustard
	        List<String> mustardIngredients = new ArrayList<>();
	        mustardIngredients.add("Water");
	        mustardIngredients.add("Vinegar");
	        mustardIngredients.add("Salt");
	        List<String> mustardAllergies = new ArrayList<>();
	        mustardAllergies.add("Vinegar");
	        Food Mustard=new Food("Mustard",mustardIngredients,mustardAllergies,"Others",3); 	
	        
	        public Categories() {

	        Bakery.add(Bread);//Wheat
	        Bakery.add(Chocolate Cake);//milk and eggs 
	        Bakery.add(Cookies);//milk and eggs 
	        Bakery.add(Cereals);//Wheat
	        Meat.add(Sausages);
	    	Meat.add(Vegan Meat);//soy
	    	Meat.add(Fish);//fish
	    	Meat.add(Ham);
	    	Drinks.add(Water);
	    	Drinks.add(Beer);//wheat
	    	Drinks.add(Coffee);
	    	Drinks.add(Hot Chocolate);//milk and peanuts
	    	FruitsAndVegetables.add(Banana);
	    	FruitsAndVegetables.add(Strawberries);//strawberries
	    	FruitsAndVegetables.add(Avocado);//avocado
	    	FruitsAndVegetables.add(Potatoes);//potatoes
	    	Others.add(Pasta);//sesame and wheat
	    	Others.add(Eggs);//eggs
	    	Others.add(Rice);
	    	Others.add(Mustard);//Vinegar
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
			string food=Bakery(Number);
			return food.name;
        case 2:
        	string food=Meat(Number);
			return food.name;
		case 3:
			string food=Drinks(Number);
			return food.name;
        case 4:
        	string food=FruitsAndVegetables(Number);
			return food.name;
        case 5:
        	string food=Others(Number);
			return food.name;
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
		System.out.println("What interests you about this food ?");
		System.out.println("1) Its list of ingredients");
		System.out.println("2) Its list of potential allergies");
		System.out.println("3) Its price");
		System.out.println("0) Choose another food");
		Scanner scanner=new scanner;
		if (scanner==1) {
			return food.ingridients;
		}if (scanner==2) {
			return food.allergies;
		}if (scanner==3) {
			return food.Price;
		}if (scanner==0) {
			chooseAFood();
		}else {
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
