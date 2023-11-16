import java.util.Scanner;
import java.util.Arrays;

public class zachSprintOne {
	
	public void createfood(String name, String[] ingridients, String[] allergies) {
		/* Create a new product and add to the database*/
	}
	
	public void deletefood(String name) {
		/* Delete a food from the database*/
		
		
	}
	public void editfoodinfo(String name, String[] ingridients, String[] allergies, Long price ) {
		/* edit product information from the data base*/
	}
	public void checkproduct(String name, String[] ingridients, String[] allergies, Long price ) {
		Scanner scanner = new Scanner(System.in);

        // Display products
        System.out.println("Available Products:");
        for (int i = 0; i < food.length; i++) {
            System.out.println((i + 1) + ". " + food[i].name);
        }

        // Select a product
        System.out.print("Enter the number of the product to view details: ");
        int productIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume the newline

        if (productIndex >= 0 && productIndex < food.length) {
            Food selectedProduct = food[productIndex];

            // Display product details
            System.out.println("Product Name: " + selectedProduct.name);
            System.out.println("Ingredients: " + String.join(", ", selectedProduct.ingridients));
            System.out.println("Price: $" + selectedProduct.Price);
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
                    } else {
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

            // Update the user's allergies
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
