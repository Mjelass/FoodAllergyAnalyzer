package main.java.controller;

import main.java.model.User;
import main.java.repository.FoodRepository;
import main.java.repository.FoodRepositoryImpl;
import main.java.repository.UserRepository;
import main.java.repository.UserRepositoryImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import main.java.model.Food;

public class FoodController { 
public final FoodRepository foodRepository;
private Scanner scanner;
	
	public FoodController() {
        this.foodRepository =  new FoodRepositoryImpl();
        scanner = new Scanner(System.in);
    }

	public void createfood() {
		
        System.out.print("Enter product name: ");
        String Name = scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        
        System.out.print("Please enter the ingridients(write the ingridients separated by ','): ");
        String ingridients_k = scanner.nextLine();
        String[] elementsArray = ingridients_k.split(",");
        List<String> ingridients = new ArrayList<>(Arrays.asList(elementsArray));
        
        System.out.print("Please enter the allergies(write the allergies separated by ','): ");
        String allergies_k = scanner.nextLine();
        elementsArray = allergies_k.split(",");
        List<String> allergies = new ArrayList<>(Arrays.asList(elementsArray));

        System.out.print("Enter price: ");
        long price = scanner.nextLong();
        scanner.nextLine(); 

        Food newFood = new Food(Name, ingridients,allergies, category, price);
        foodRepository.addFood(newFood);
        
	}
	
	public void deletefood() {
        System.out.print("Please enter the the name of the food to delete: ");
        String Name = scanner.nextLine();
        foodRepository.deleteFoodByName(Name);
		
	}
	
	public void editfoodinfo() {
        System.out.print("Please enter the the name of the food to edit: ");
		String nameFoodToEdit=scanner.nextLine();
		 System.out.print("Enter New product name: ");
	        String Name = scanner.nextLine();

	        System.out.print("Enter New category: ");
	        String category = scanner.nextLine();
	        
	        System.out.print("Please enter the New ingridients(write the ingridients separated by ','): ");
	        String ingridients_k = scanner.nextLine();
	        String[] elementsArray = ingridients_k.split(",");
	        List<String> ingridients = new ArrayList<>(Arrays.asList(elementsArray));
	        
	        System.out.print("Please enter the New allergies(write the allergies separated by ','): ");
	        String allergies_k = scanner.nextLine();
	        elementsArray = allergies_k.split(",");
	        List<String> allergies = new ArrayList<>(Arrays.asList(elementsArray));

	        System.out.print("Enter price: ");
	        long price = scanner.nextLong();
	        scanner.nextLine(); 

	        Food newFood = new Food(Name, ingridients,allergies, category, price);
	        foodRepository.UpdateFoodByName(nameFoodToEdit,newFood);
	}
	
	public void checkproduct() {
		System.out.print("Please enter the the name of the food to check: ");
		String nameFoodTocheck=scanner.nextLine();
		foodRepository.checkFoodByName(nameFoodTocheck);
	}
	
	
}
