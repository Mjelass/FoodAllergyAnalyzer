package main.java;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import main.java.model.User;
import main.java.controller.UserController;

/**
 *
 * Starts the console UI for the CoffeeMaker
 */
public class Main {
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
        System.out.print("Please enter your name: ");
        String name_k = scanner.nextLine();
        System.out.print("Please enter your userName: ");
        String userName_k = scanner.nextLine();
        System.out.print("Please enter your password: ");
        String password_k = scanner.nextLine();
        System.out.print("Please enter your allergies(write the numbers separated by ','): ");
        String allergies_k = scanner.nextLine();
        UserController uc=new UserController();
        String[] allergies = new String[]{"Milk"};
        uc.createUserAccount(name_k,userName_k,password_k,allergies);
        System.out.print("Congratulation, Account created !!");
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
		UserController uc=new UserController();
		String[] allergies;
		if (userInput >= 0 && userInput <=2) {
			//if (userInput == 1) uc.UserLogin();
			if (userInput == 2)  UserRegister();
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
