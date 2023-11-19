package main.java.model;
import java.util.ArrayList;
import java.util.List;

public class Categorie {
	

    /*List<Food> Bakery = new ArrayList<>();
    List<Food> Meat = new ArrayList<>();
    List<Food> Drinks = new ArrayList<>();
    List<Food> FruitsAndVegetables = new ArrayList<>();
    List<Food> Others = new ArrayList<>();
=======
public class Categories {
	
	public static List<Food> Bakery = new ArrayList<>();
	public static List<Food> Meat = new ArrayList<>();
	public static List<Food> Drinks = new ArrayList<>();
	public static List<Food> FruitsAndVegetables = new ArrayList<>();
	public static List<Food> Others = new ArrayList<>();
>>>>>>> 01133de574f151e0c91cb4b524912c00172558ef:FoodAnalyzerNewVersion/src/main/java/model/Categories.java
    
	static String[] breadIngredients = {"Floor", "Water", "Yeast", "Salt", "Wheat"};
    static String[] breadAllergies = {"wheat"};
    static Food Bread=new Food("Bread",breadIngredients,breadAllergies,"Bakery",1);
    static String[] chocolateCakeIngredients = {"Floor", "Sugar", "Eggs", "Chocolate", "Milk"};
    static String[] chocolateCakeAllergies = {"Eggs","Milk"};
    static Food ChocolateCake=new Food("Chocolate Cake",chocolateCakeIngredients,chocolateCakeAllergies,"Bakery",3);
    static String[] cookiesIngredients = {"Floor", "Butter", "Eggs", "Milk", "Sugar"};
    static String[] cookiesAllergies = {"Eggs","Milk"};
    static Food Cookies=new Food("Cookies",cookiesIngredients,cookiesAllergies,"Bakery",2);	        
    static String[] cerealsIngredients = {"Wheat", "Sugar", "Oats"};
    static String[] cerealsAllergies = {"Wheat"};
    static Food Cereals=new Food("Cereals",cerealsIngredients,cerealsAllergies,"Bakery",1);	 
	
    public static void createBakeryList() {//create a list of food
	    Bakery.add(Bread);//Wheat
	    Bakery.add(ChocolateCake);//milk and eggs 
	    Bakery.add(Cookies);//milk and eggs 
	    Bakery.add(Cereals);//Wheat
    }
    static String[] sausagesIngredients = {"Meat"};
    static String[] sausagesAllergies = {"None"};
    static Food Sausages=new Food("Sausages",sausagesIngredients,sausagesAllergies,"Meat",4);	        		
    static String[] veganMeatIngredients = {"Proteins","Soy"};
    static String[] veganMeatAllergies = {"Soy"};
    static Food VeganMeat=new Food("Vegan Meat",veganMeatIngredients,veganMeatAllergies,"Meat",4);
    static String[] fishIngredients = {"Fish"};
    static String[] fishAllergies = {"Fish"};
    static Food Fish=new Food("Fish",fishIngredients,fishAllergies,"Meat",3);
    static String[] hamIngredients = {"Meat"};
    static String[] hamAllergies = {"None"};
    static Food Ham=new Food("Ham",hamIngredients,hamAllergies,"Meat",3);
    
    public static void createMeatList() {//create a list of food
    	Meat.add(Sausages);
    	Meat.add(VeganMeat);//soy
    	Meat.add(Fish);//fish
    	Meat.add(Ham);
    }
    static String[] waterIngredients = {"Water"};
    static String[] waterAllergies = {"None"};
    static Food Water=new Food("Water",waterIngredients,waterAllergies,"Drinks",1);	        
    static String[] beerIngredients = {"Water","Wheat"};
    static String[] beerAllergies = {"Wheat"};	        
    static Food Beer=new Food("Beer",beerIngredients,beerAllergies,"Drinks",5);      
    static String[] coffeeIngredients = {"Caffeine"};
    static String[] coffeeAllergies = {"None"};	  
    static Food Coffee=new Food("Coffee",coffeeIngredients,coffeeAllergies,"Drinks",2); 
    static String[] hotChocolateIngredients = {"Milk","Peanuts"};
    static String[] hotChocolateAllergies = {"Milk","Peanuts"};
    static Food HotChocolate=new Food("Hot chocolate",hotChocolateIngredients,hotChocolateAllergies,"Drinks",2); 
    
    public static void createDrinksList() {//create a list of food
		Drinks.add(Water);
		Drinks.add(Beer);//wheat
		Drinks.add(Coffee);
		Drinks.add(HotChocolate);//milk and peanuts
    }
    static String[] bananaIngredients = {"Banana"};
    static String[] bananaAllergies = {"None"};
    static Food Banana=new Food("Banana",bananaIngredients,bananaAllergies,"Fruits and Vegetables",1); 
    static String[] strawberriesIngredients = {"Strawberries"};
    static String[] strawberriesAllergies = {"Strawberries"};
    static Food Strawberries=new Food("Strawberries",strawberriesIngredients,strawberriesAllergies,"Fruits and Vegetables",3); 
    static String[] avocadoIngredients = {"Avocado"};
    static String[] avocadoAllergies = {"Avocado"};
    static Food Avocado=new Food("Avocado",avocadoIngredients,avocadoAllergies,"Fruits and Vegetables",3); 	        
    static String[] potatoesIngredients = {"Potatoes"};
    static String[] potatoesAllergies = {"Potatoes"};
    static Food Potatoes=new Food("Potatoes",potatoesIngredients,potatoesAllergies,"Fruits and Vegetables",1); 	
    static String[] pastaIngredients = {"Sesame","Salt","Wheat"};
    static String[] pastaAllergies = {"Sesame","Wheat"};
    static Food Pasta=new Food("Pasta",pastaIngredients,pastaAllergies,"Others",1); 	

    public static void createFruitsAndVegetablesList() {//create a list of food
		FruitsAndVegetables.add(Banana);
		FruitsAndVegetables.add(Strawberries);//strawberries
		FruitsAndVegetables.add(Avocado);//avocado
		FruitsAndVegetables.add(Potatoes);//potatoes
    } 
    static String[] eggsIngredients = {"Eggs"};
    static String[] eggsAllergies = {"Eggs"};
    static Food Eggs=new Food("Eggs",eggsIngredients,eggsAllergies,"Others",3); 	
    static String[] riceIngredients = {"Rice"};
    static String[] riceAllergies = {"None"};
    static Food Rice=new Food("Rice",riceIngredients,riceAllergies,"Others",2); 	
    static String[] mustardIngredients = {"Water","Vinegar","Salt"};
    static String[] mustardAllergies = {"None"};
    static Food Mustard=new Food("Mustard",mustardIngredients,mustardAllergies,"Others",3); 	
    
    public static void createOthersList() {//create a list of food
		Others.add(Pasta);//sesame and wheat
		Others.add(Eggs);//eggs
		Others.add(Rice);
		Others.add(Mustard);//Vinegar
<<<<<<< HEAD:FoodAnalyzerNewVersion/src/main/java/model/Categorie.java
	}*/
