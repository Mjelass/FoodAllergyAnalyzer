package main.java.controller;

import java.util.Scanner;

public class ExtraInformation {
	public static void AllergyPrevention() {
		
		System.out.println("Which topic interests you ?");
    	System.out.println("1) Allergies preventions");
    	System.out.println("2) Reaction procedures");
    	Scanner scanner = new Scanner(System.in);
    	int userChoice=scanner.nextInt();
    	switch (userChoice) {
        case 0:
        	 break;
        case 1:
			System.out.println("1. Identify Allergens:");
			System.out.println("   - Work with an allergist to identify specific allergens that trigger your reactions.");
			System.out.println("   - Be aware of common allergens such as pollen, dust mites, pet dander, certain foods, and insect stings.\n");
			System.out.println("2. Control Your Environment:");
			System.out.println("   - Keep living spaces clean and well-ventilated to reduce exposure to indoor allergens.");
			System.out.println("   - Use air purifiers and allergen-proof bedding to create a safer environment.\n");
			System.out.println("3. Read Labels Carefully:");
			System.out.println("   - Scrutinize food labels for potential allergens, and be cautious with skincare and household products.");
			System.out.println("   - Familiarize yourself with alternative names for common allergens listed on product labels.\n");
			System.out.println("4. Communicate Allergies to Others:");
			System.out.println("   - Inform friends, family, coworkers, and school personnel about your allergies.");
			System.out.println("   - Encourage open communication to avoid accidental exposure.\n");
        case 2:
        	System.out.println("\nReacting to Allergic Reactions:");
            System.out.println("1. Know the Signs:");
            System.out.println("   - Recognize the symptoms of an allergic reaction, which may include hives, swelling, difficulty breathing, and anaphylaxis.");
            System.out.println("   - Act promptly at the first sign of an allergic response.\n");
            System.out.println("2. Carry Medications:");
            System.out.println("   - Always have prescribed allergy medications on hand, such as antihistamines or epinephrine.");
            System.out.println("   - Ensure that family members, friends, and coworkers are aware of the location of your medications.\n");
            System.out.println("3. Use Epinephrine as Directed:");
            System.out.println("   - If prescribed an epinephrine auto-injector, learn how to use it correctly.");
            System.out.println("   - Administer epinephrine immediately in case of a severe allergic reaction and seek emergency medical help.\n");
            System.out.println("4. Seek Emergency Assistance:");
            System.out.println("   - Call emergency services (911 or your local emergency number) if you experience a severe allergic reaction.");
            System.out.println("   - Do not hesitate to seek professional medical help even after using an epinephrine auto-injector.\n");
        default:
            System.out.println("Invalid choice");
		}
    	scanner.close();
	}
}
