package main.java.controller;

import main.java.model.User;

import java.util.Arrays;
import java.util.Scanner;

import main.java.model.Food;

public class FoodController {
	public void createfood(String name, String[] ingridients, String[] allergies) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String Name = scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Enter price: ");
        long price = scanner.nextLong();
        scanner.nextLine(); 

        Food newFood = new Food(name, new String[0], new String[0], category, price);
        foodDatabase.addFood(newFood);
        System.out.println("Product added successfully: " + name);/
	}
	
	public void deletefood(String name) {
		Scanner scanner = new Scanner(System.in);

        if (foodDatabase.getFoodDatabase().isEmpty()) {
            System.out.println("No products available to delete.");
            return;
        }

        System.out.println("Select a product to delete:");
        List<Food> foods = foodDatabase.getFoodDatabase();
        for (int i = 0; i < foods.size(); i++) {
            System.out.println((i + 1) + ". " + foods.get(i).getName());
        }

        System.out.print("Enter the number of the products to delete: ");
        int choice = scanner.nextInt() - 1;
        scanner.nextLine(); 

        if (choice >= 0 && choice < foods.size()) {
            Food foodToDelete = foods.get(choice);
            foodDatabase.removeFood(foodToDelete.getName());
            System.out.println("Food item deleted: " + foodToDelete.getName());
        } else {
            System.out.println("Invalid selection.");
        }
		
		
	}
	public void editfoodinfo(String name, String[] ingridients, String[] allergies, Long price ) {
		Scanner scanner = new Scanner(System.in);

	    if (foodDatabase.getFoodDatabase().isEmpty()) {
	        System.out.println("No products available to edit.");
	        return;
	    }

	    System.out.println("Select a food item to edit:");
	    List<Food> foods = foodDatabase.getFoodDatabase();
	    for (int i = 0; i < foods.size(); i++) {
	        System.out.println((i + 1) + ". " + foods.get(i).getName());
	    }

	    System.out.print("Enter the number of the product to edit: ");
	    int choice = scanner.nextInt() - 1;
	    scanner.nextLine(); 

	    if (choice < 0 || choice >= foods.size()) {
	        System.out.println("Invalid selection.");
	        return;
	    }

	    Food foodToEdit = foods.get(choice);

	    System.out.println("Editing product: " + foodToEdit.getName());
	    System.out.println("1. Edit Price");
	    System.out.println("2. Edit Ingredients");
	    System.out.print("Enter your choice: ");
	    int editChoice = scanner.nextInt();
	    scanner.nextLine(); // Consume the newline character

	    switch (editChoice) {
	        case 1: // Edit Price
	            System.out.print("Enter new price: ");
	            long newPrice = scanner.nextLong();
	            scanner.nextLine(); // Consume the newline character
	            foodToEdit.setPrice(newPrice);
	            System.out.println("Price updated to $" + newPrice);
	            break;
	        case 2: // Edit Ingredients
	            System.out.print("Enter new ingredients (comma separated): ");
	            String[] newIngredients = scanner.nextLine().split(",");
	            foodToEdit.setIngredients(newIngredients);
	            System.out.println("Ingredients updated.");
	            break;
	        default:
	            System.out.println("Invalid choice.");
	    }
	}
	public void checkproduct(String name, String[] ingridients, String[] allergies, Long price ) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Available Products:");
	    for (int i = 0; i < foodDatabase.getFoodDatabase().size(); i++) {
	        System.out.println((i + 1) + ". " + foodDatabase.getFoodDatabase().get(i).getName());
	    }

	    System.out.print("Enter the number of the product to view details: ");
	    int productIndex = scanner.nextInt() - 1;

	    if (productIndex >= 0 && productIndex < foodDatabase.getFoodDatabase().size()) {
	        Food selectedProduct = foodDatabase.getFoodDatabase().get(productIndex);

	        System.out.println("Product Name: " + selectedProduct.getName());
	        System.out.println("Ingredients: " + String.join(", ", selectedProduct.getIngredients()));
	        System.out.println("Category: " + selectedProduct.getCategory());
	        System.out.println("Price: $" + selectedProduct.getPrice());
	    } else {
	        System.out.println("Invalid selection.");
	    }
	}
	
	public void editallergy(String[] allergies, User user) {
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Allergy manager:");
            System.out.println("1. View Allergies");
            System.out.println("2. Add Allergy");
            System.out.println("3. Delete Allergy");
            System.out.println("4. Edit Allergy");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1: // View Allergies
                    System.out.println("Allergies:");
                    for (int i = 0; i < allergies.length; i++) {
                        if (allergies[i] != null) {
                            System.out.println((i + 1) + ". " + allergies[i]);
                        }
                    }
                    break;
                case 2: // Add Allergy
                    System.out.print("Enter new allergy: ");
                    String newAllergy = scanner.nextLine();
                    allergies = Arrays.copyOf(allergies, allergies.length + 1);
                    allergies[allergies.length - 1] = newAllergy;
                    break;
                case 3: // Delete Allergy
                    System.out.println("Select an allergy to delete:");
                    for (int i = 0; i < allergies.length; i++) {
                        if (allergies[i] != null) {
                            System.out.println((i + 1) + ". " + allergies[i]);
                        }
                    }
                    System.out.print("Enter the number of the allergy to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < allergies.length && allergies[deleteIndex] != null) {
                        allergies = removeElement(allergies, deleteIndex);
                    } 
                    else {
                        System.out.println("Invalid selection.");
                    }
                    break;
                case 4: // Edit Allergy
                    System.out.print("Enter the number of the allergy to edit: ");
                    int editIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume the newline
                    if (editIndex >= 0 && editIndex < allergies.length && allergies[editIndex] != null) {
                        System.out.print("Enter new allergy: ");
                        allergies[editIndex] = scanner.nextLine();
                    } else {
                        System.out.println("Invalid selection.");
                    }
                    break;
                case 5: // Exit
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            
            user.setAllergies(allergies);
        }
	}
	private String[] removeElement(String[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            return array;
        }

        String[] newArray = new String[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[k++] = array[i];
        }
        return newArray;           
	}
}
