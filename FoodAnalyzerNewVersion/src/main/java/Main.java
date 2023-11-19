package main.java;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;

import main.java.model.User;
import main.java.controller.FoodController;
import main.java.controller.UserController;

/**
 *
 * Starts the console UI for the CoffeeMaker
 */
public class Main {
	private static String loggedUSername;
	private static UserController uc=new UserController();
	private static FoodController fd=new FoodController();


	/**
	 * Passes a prompt to the user and returns the user specified 
	 * string.
	 * @param message
	 * @return int
	 */
	private static int inputOutput(String message) {
		System.out.println(message);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int returnValue = 0;
		try {
			returnValue = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Error reading in integer value");
			mainMenu();
		}
		catch (IOException e){
			System.out.println("Error reading in value");
			mainMenu();
		}
		return returnValue;
	}
	
	private static void UserRegister() {
		Scanner scanner = new Scanner(System.in);
		String name_k;
		String userName_k;
		String password_k;
        do {
            System.out.print("Please enter your name(cant be empty): ");
            name_k = scanner.nextLine(); 
        } while (name_k.isEmpty());
		do {
            System.out.print("Please enter your userName(cant be empty): ");
            userName_k = scanner.nextLine(); 
        } while (userName_k.isEmpty());
		do {
            System.out.print("Please enter your password(cant be empty): ");
            password_k = scanner.nextLine(); 
        } while (password_k.isEmpty());
        System.out.print("Please enter your allergies(write the allergies separated by ','): ");
        String allergies_k = scanner.nextLine();
        String[] elementsArray = allergies_k.split(",");
        List<String> allergies = new ArrayList<>(Arrays.asList(elementsArray));
        uc.createUserAccount(name_k,userName_k,password_k,allergies);
        mainMenu();
	}
	
	private static void UserLogin() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your userName: ");
        String userName_k = scanner.nextLine();
        System.out.print("Please enter your password: ");
        String password_k = scanner.nextLine();
        if("admin".equals(userName_k) && "admin".equals(password_k)) {
        	afterLoginAdmin();
    	}
        boolean res = uc.UserLogin(userName_k,password_k);
        if(res) {
        	loggedUSername = userName_k;
        	System.out.println("Congratulation, You are Loged IN As a User!!");
        	afterLogin();
        }else {
        	System.out.println("Sorry UserName or Password false !!");
        	mainMenu();
        }
        
	}
	
	private static void afterLoginAdmin() {
		System.out.println("Congratulation, You are Loged IN As an Admin!!");
		System.out.println("1. check the information of a product");
		System.out.println("2. update the information of a product");
		System.out.println("3. delete a product");
		System.out.println("4. check the information of a user");
		System.out.println("5. update the information of a user");
		System.out.println("6. delete a user");
		System.out.println("0. Exit\n");

		//Get user input
		int userInput = inputOutput("Please press the number that corresponds to what you would like the food analyzer to do.");
		if (userInput >= 0 && userInput <=6) {
			if (userInput == 1) fd.checkproduct();
			if (userInput == 2)  UpdateUserInformation();
			if (userInput == 3) CheckAccount(loggedUSername);
			if (userInput == 4)  UpdateUserInformation();
			if (userInput == 5) CheckAccount(loggedUSername);
			if (userInput == 6)  UpdateUserInformation();
			if (userInput == 0) System.exit(0);
		} else {
			System.out.println("Please enter a number from 0 - 6");
			afterLoginAdmin();
		}
		
	}

	private static void CheckAccount(String loggedUSername) {
		Document res = uc.CheckUserAccount(loggedUSername);
		System.out.println("name :"+res.getString("name"));
		System.out.println("userName :"+res.getString("userName"));
		List<String> allergyList = res.getList("allergies", String.class);
		String s="";
		if(allergyList != null) {
			for (String allergy : allergyList) {
	            s= s +" "+allergy;
	        }
		}
		System.out.println("allergies :"+s);
		System.out.println("Role :"+res.getString("Role"));
		int userInput = inputOutput("Please press the number 0 to return.");
		if (userInput == 0) afterLogin();
	}
	
	private static void UpdateUserInformation() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your New name: ");
        String name_k = scanner.nextLine();
        System.out.print("Please enter your New userName: ");
        String userName_k = scanner.nextLine();
        System.out.print("Please enter your New password: ");
        String password_k = scanner.nextLine();
        System.out.print("Please enter your New allergies(write the allergies separated by ','): ");
        String allergies_k = scanner.nextLine();
        String[] elementsArray = allergies_k.split(",");
        List<String> allergies = new ArrayList<>(Arrays.asList(elementsArray));
        uc.UpdateUserAccount(name_k,userName_k,password_k,allergies,loggedUSername);
        loggedUSername = userName_k;
        System.out.println("Your new information is : ");
        CheckAccount(loggedUSername);
        int userInput = inputOutput("Please press the number 0 to return.");
		if (userInput == 0) afterLogin();
        
	}
	


	/**
	 * Prints the main menu and handles user input for 
	 * main menu commands.
	 */
	public static void mainMenu() {
		System.out.println("1. Login if you already have an account");
		System.out.println("2. Create an account");
		System.out.println("0. Exit\n");

		//Get user input
		int userInput = inputOutput("Please press the number that corresponds to what you would like the food analyzer to do.");
		if (userInput >= 0 && userInput <=2) {
			if (userInput == 1) UserLogin();
			if (userInput == 2)  UserRegister();
			if (userInput == 0) System.exit(0);
		} else {
			System.out.println("Please enter a number from 0 - 4");
			mainMenu();
		}
	}
	
	public static void afterLogin() {
		System.out.println("1. check the information of my account");
		System.out.println("2. update the information of my account");
		System.out.println("0. Exit\n");

		//Get user input
		int userInput = inputOutput("Please press the number that corresponds to what you would like the food analyzer to do.");
		if (userInput >= 0 && userInput <=2) {
			if (userInput == 1) CheckAccount(loggedUSername);
			if (userInput == 2)  UpdateUserInformation();
			if (userInput == 0) System.exit(0);
		} else {
			System.out.println("Please enter a number from 0 - 4");
			mainMenu();
		}
	}

	/**
	 * Starts the coffee maker program.
	 * @param args
	 */
	public static void main(String[] args) {	
		System.out.println("Welcome to the FoodAnalyzer!\n");
		mainMenu();
	}
}
