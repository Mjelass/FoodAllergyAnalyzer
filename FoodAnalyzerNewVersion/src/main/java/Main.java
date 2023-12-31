package main.java;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;
import main.java.repository.FoodRepositoryImpl;
import main.java.repository.UserRepositoryImpl;
import main.java.model.Food;
import main.java.repository.Food_API;
import main.java.repository.ChatBot;

import main.java.model.User;
import main.java.controller.CategoriesController;
import main.java.controller.ExtraInformationController;
import main.java.controller.FoodController;
import main.java.controller.MedicationController;
import main.java.controller.UserController;

/**
 *
 * Starts the console UI for the CoffeeMaker
 */
public class Main {
	private static String loggedUSername;
	private static UserController uc=new UserController();
	private static FoodController fd=new FoodController();
	private static Scanner scanner;
	


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
	
	private static void manageFavList() {
		System.out.println("1. check your favorite list");
		System.out.println("2. add product to your your favorite list");
		System.out.println("3. delete a product form your favorite list");
		System.out.println("0. return");
		//Get user input
				int userInput = inputOutput("Please press the number that corresponds to what you would like the food analyzer to do.");
				if (userInput >= 0 && userInput <=3) {
					if (userInput == 1) {uc.checkFavList(loggedUSername);manageFavList();}
					if (userInput == 2)  {
						scanner=new Scanner(System.in);
						String Prod;
						do {
				            System.out.print("Enter product name to add to your favorite List: ");
				            Prod = scanner.nextLine();

				            if (Prod.isEmpty()) {
				                System.out.println("Product name cannot be empty. Please try again.");
				            }

				        } while (Prod.isEmpty());
						uc.addFavList(loggedUSername,Prod);
						manageFavList();
						}
					if (userInput == 3) {
						scanner=new Scanner(System.in);
						String Prod;
						do {
				            System.out.print("Enter product name to add to your favorite List: ");
				            Prod = scanner.nextLine();

				            if (Prod.isEmpty()) {
				                System.out.println("Product name cannot be empty. Please try again.");
				            }

				        } while (Prod.isEmpty());
						uc.deleteFavList(loggedUSername,Prod);
						manageFavList();
						}
					if (userInput == 0) afterLoginUser();
				} else {
					System.out.println("Please enter a number from 0 - 6");
					afterLoginAdmin();
				}
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
        	loggedUSername="admin";
        	System.out.println("Congratulation, You are Loged IN As an Admin!!");
        	afterLoginAdmin();
    	}
        boolean res = uc.UserLogin(userName_k,password_k);
        if(res) {
        	loggedUSername = userName_k;
        	System.out.println("Congratulation, You are Loged IN As a User!!");
        	afterLoginUser();
        }else {
        	System.out.println("Sorry UserName or Password false !!");
        	mainMenu();
        }
        
	}
	
	private static void afterLoginAdmin() {
		
		System.out.println("1. check the information of a product");
		System.out.println("2. update the information of a product");
		System.out.println("3. Add a new food product");
		System.out.println("4. delete a product");
		System.out.println("5. check the information of a user");
		System.out.println("6. update the information of a user");
		System.out.println("7. delete a user");
		System.out.println("0. Exit\n");

		//Get user input
		int userInput = inputOutput("Please press the number that corresponds to what you would like the food analyzer to do.");
		if (userInput >= 0 && userInput <=7) {
			if (userInput == 1) checkProd();
			if (userInput == 2) 
				{
				fd.editfoodinfo();
				int Input = inputOutput("Please press the number 0 to return.");
				if (Input == 0) {afterLoginAdmin();}else {afterLoginAdmin();}
				};
			if (userInput == 3)  {fd.createfood(); afterLoginAdmin();}
			if (userInput == 4)  {fd.deletefood();afterLoginAdmin();}
			if (userInput == 5)  {
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Please enter the username of the account you wanna check: ");
		        String userName_k = scanner.nextLine();
		        CheckAccount(userName_k);
			};
			if (userInput == 6) {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Please enter the username of the account you wanna update information for: ");
		        String userName_k = scanner.nextLine();
		        System.out.println("1 - Update username");
		        System.out.println("2 - Update name");
		        System.out.println("3 - Update password");
		        System.out.println("4 - Update Emergency Contact Email");
		        System.out.println("5 - Update Emergency Contact Number");
		        System.out.println("0 - Go back");
		        int input = inputOutput("Please press the number that corresponds to what you would like to do");
		        if (input >= 0 && input <=5) {
		        	if (input == 1) {
		        		System.out.print("Enter new username : ");
		        		String newUsername = scanner.nextLine();
		        		uc.updateUserName(userName_k,newUsername);
		        		afterLoginAdmin();
		        	}
		        	if (input == 2) {
		        		System.out.print("Enter new name : ");
		        		String newName = scanner.nextLine();
		        		uc.updateName(userName_k,newName);
		        		afterLoginAdmin();
		        	}
		        	if (input == 3) {
		        		System.out.print("Enter new password : ");
		        		String newPassword = scanner.nextLine();
		        		uc.updatePassword(userName_k,newPassword);
		        		afterLoginAdmin();
		        	}
		        	if (input == 4) {
		        		System.out.print("Enter new Emergency Contact Email : ");
		        		String newECEmail = scanner.nextLine();
		        		uc.updateUserEmergencyEmail(userName_k, newECEmail);
		        		afterLoginAdmin();
		        	}
		        	if (input == 5) {
		        		System.out.print("Enter new Emergency Contact Email : ");
		        		String newECNumber = scanner.nextLine();
		        		uc.updateUserEmegencyNumber(userName_k, newECNumber);;
		        		afterLoginAdmin();
		        	}
		        	if (input == 0) {
		        		afterLoginAdmin();
		        	}
		        	
		        } else {
	        		System.out.println("Pease write a number between 0 and 5!!!! ");
	        		afterLoginAdmin();
	        	}
			}
			if (userInput == 7)  {
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Please enter the username of the account you wanna delete: ");
		        String userName_k = scanner.nextLine();
				uc.deleteUserAccount(userName_k);
				afterLoginAdmin();
			};
			if (userInput == 0) System.exit(0);
		} else {
			System.out.println("Please enter a number from 0 - 6");
			afterLoginAdmin();
		}
		
	}

	private static void checkProd() {
		fd.checkproduct();
		int userInput = inputOutput("Please press the number 0 to return.");
		if (userInput == 0) {
		if(loggedUSername.equals("admin")) {
			afterLoginAdmin();
		}else {
			afterLoginUser();
		}
		}else {
			System.out.println("Error , please enter 0 next time ");
			mainMenu();
		};
		
	}

	private static void CheckAccount(String username) {
		Document res = uc.CheckUserAccount(username);
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
		System.out.println("Emergency Contact Email :"+res.getString("ECEmail"));
		System.out.println("Emergency Contact Number :"+res.getString("ECNumber"));
		int userInput = inputOutput("Please press the number 0 to return.");
		if (userInput == 0) {
			if(loggedUSername.equals("admin")) {
				afterLoginAdmin();
			}else {
				afterLoginUser();
			}
		}else {
			System.out.println("Error , please enter 0 next time ");
			mainMenu();
		};
	}
	
	private static void UpdateUserInformation() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the New name: ");
        String name_k = scanner.nextLine();
        System.out.print("Please enter the New userName: ");
        String userName_k = scanner.nextLine();
        System.out.print("Please enter the New password: ");
        String password_k = scanner.nextLine();
        System.out.print("Please enter youther New allergies(write the allergies separated by ','): ");
        String allergies_k = scanner.nextLine();
        String[] elementsArray = allergies_k.split(",");
        List<String> allergies = new ArrayList<>(Arrays.asList(elementsArray));
        System.out.print("Please enter the New Emergency Contact Email: ");
        String ECEmail_k = scanner.nextLine();
        System.out.print("Please enter the New Emergency Contact Number: ");
        String ECNumber_k = scanner.nextLine();
        uc.UpdateUserAccount(name_k,userName_k,password_k,allergies,loggedUSername, ECEmail_k, ECNumber_k);
        if(!loggedUSername.equals("admin")) {
        	loggedUSername = userName_k;
        }
        
        System.out.println("the new information is : ");
        CheckAccount(userName_k);
        int userInput = inputOutput("Please press the number 0 to return.");
        if (userInput == 0) {
			if(loggedUSername.equals("admin")) {
				afterLoginAdmin();
			}else {
				afterLoginUser();
			}
		}else {
			System.out.println("Error , please enter 0 next time ");
			mainMenu();
		}
        
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
	
	public static void afterLoginUser() {
		System.out.println("1. check the information of my account");
		System.out.println("2. update the information of my account");
		System.out.println("3. check the information of a product");
		System.out.println("4. Search up foods");
		System.out.println("5. Check foods by my allergies");
		System.out.println("6. manage your favorite list");
		System.out.println("7. Extra Information");
		System.out.println("8. User preference search based on Category and User allergy ");
		System.out.println("9. Show Most Common Types of Foods");
		System.out.println("10. Food Alerts From Govt.");
		System.out.println("11. ChatBot.");
		System.out.println("12. Medication List");
		System.out.println("0. Exit\n");

		//Get user input
		int userInput = inputOutput("Please press the number that corresponds to what you would like the food analyzer to do.");
		if (userInput >= 0 && userInput <=12) {
			if (userInput == 1) CheckAccount(loggedUSername);
			if (userInput == 2) UpdateUserInformation();
			if (userInput == 3) checkProd();		
			if (userInput == 4) CategoriesController.showCategories();
			if (userInput == 5) CategoriesController.showOptions(loggedUSername);
			if (userInput == 6) manageFavList();
			if (userInput == 7) ExtraInformationController.extraInformation();
			if (userInput == 8) showPreference();
			if (userInput == 9) CategoriesController.RankCategories();		
			if (userInput == 10) Food_API.main(null);	
			if (userInput == 11) ChatBot.main(null);
			if (userInput == 12) manageMedicationList();
			if (userInput == 0) System.exit(0);
		} else {
			System.out.println("Please enter a number from 0 - 4");
			mainMenu(); 
		}
	}
	
	private static void showPreference() {
	    List<Food> suggestedFoods = CategoriesController.getfoodinCategories();
	    List<String> userAllergies = UserRepositoryImpl.getUserAllergiesByUsername(loggedUSername); // Replace 'loggedUsername' with the actual variable
	    List<Food> filteredFoods = filterFoodsWithAllergy(suggestedFoods, userAllergies);

	    System.out.println("Products based on you preference:");
	    for (Food food : filteredFoods) {
	        System.out.println(food.getName()); 
	    }
	}
	private static List<Food> filterFoodsWithAllergy(List<Food> foods, List<String> allergies) {
	    List<Food> filteredFoods = new ArrayList<>();
	    for (Food food : foods) {
	        if (Collections.disjoint(food.getAllergies(), allergies)) {
	            filteredFoods.add(food);
	        }
	    }
	    return filteredFoods;
	}
	private static MedicationController medicationController = new MedicationController();

	public static void manageMedicationList() {
	    System.out.println("1. Show Medication List");
	    System.out.println("2. Add Medication");
	    System.out.println("3. Remove Medication");
	    System.out.println("4. Update Medication");
	    System.out.println("0. Return");

	    // Get user input
	    int userInput = inputOutput("Please press the number that corresponds to what you would like to do with the medication list.");
	    switch (userInput) {
	        case 1:
	        	showMedicationList();
	            break;
	        case 2:
	            addMedication();
	            break;
	        case 3:
	            removeMedication();
	            break;
	        case 4:
	            updateMedication();
	            break;
	        case 0:
	            afterLoginUser();
	            break;
	        default:
	            System.out.println("Please enter a valid option.");
	            manageMedicationList();
	            break;
	    }
	}
	private static void showMedicationList() {
        medicationController.listMedications();
        System.out.println("9. Return to Medication List");
        
        // Get user input
        int userInput = inputOutput("Please press the number that corresponds to your choice.");
        if (userInput == 9) {
            manageMedicationList();
        } else {
            System.out.println("Invalid option. Returning to main menu.");
            manageMedicationList();
        }
    }

	private static void addMedication() {
	    Scanner scanner = new Scanner(System.in);

	    // Get user input for medication details
	    System.out.print("Enter medication name: ");
	    String name = scanner.nextLine();

	    System.out.print("Enter expiration date (yyyy-MM-dd): ");
	    String dateString = scanner.nextLine();
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    Date expirationDate;
	    try {
	        expirationDate = dateFormat.parse(dateString);
	    } catch (ParseException e) {
	        System.out.println("Invalid date format. Please enter a date in the format yyyy-MM-dd.");
	        addMedication();
	        return;
	    }

	    medicationController.addMedication(name, expirationDate);
	    System.out.println("Medication added successfully!");
	    manageMedicationList();
	}

	private static void removeMedication() {
	    Scanner scanner = new Scanner(System.in);

	    // Get user input for medication name
	    System.out.print("Enter medication name to remove: ");
	    String name = scanner.nextLine();

	    medicationController.removeMedication(name);
	    System.out.println("Medication removed successfully!");
	    manageMedicationList();
	}

	private static void updateMedication() {
	    Scanner scanner = new Scanner(System.in);

	    // Get user input for medication details
	    System.out.print("Enter medication name to update: ");
	    String name = scanner.nextLine();

	    System.out.print("Enter new expiration date (yyyy-MM-dd): ");
	    String dateString = scanner.nextLine();
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    Date expirationDate;
	    try {
	        expirationDate = dateFormat.parse(dateString);
	    } catch (ParseException e) {
	        System.out.println("Invalid date format. Please enter a date in the format yyyy-MM-dd.");
	        // Provide the user with another chance to input the correct date
	        updateMedication();
	        return;
	    }

	    medicationController.updateMedication(name, expirationDate);
	    System.out.println("Medication updated successfully!");
	    manageMedicationList();
	}



	
	public static void main(String[] args) {	
		System.out.println("Welcome to the FoodAnalyzer!\n");
		mainMenu();
		
	}

}