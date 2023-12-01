package main.java.controller;

import java.util.Scanner;

import main.java.Main;

public class ExtraInformation {
	
	public static void AllergyPrevention() {
		
		System.out.println("Which topic interests you ?");
    	System.out.println("1) Definition of food allergies");
    	System.out.println("2) Science behind food allergies");
    	System.out.println("3) History of food allergies");
    	System.out.println("4) Food allergies in numbers");
    	System.out.println("5) Famous food allergics");
    	System.out.println("6) Top 10 most common allergies");
    	System.out.println("7) Allergies preventions");
    	System.out.println("8) Reaction procedures");
    	System.out.println("0) Exit");

    	Scanner scanner = new Scanner(System.in);
    	int userChoice=scanner.nextInt();
    	chooseTopic(userChoice);
    	}
    	public static void chooseTopic(int userChoice) {
        	switch (userChoice) {
        case 1:
		    System.out.println("Food allergies involve an abnormal immune response to proteins in certain foods.");
		    System.out.println("Unlike food intolerances, which affect the digestive system, food allergies trigger an immune reaction.");
		    System.out.println("Common allergens include peanuts, tree nuts, milk, eggs, wheat, soy, fish, and shellfish.");
            System.out.println(" ");
            CategoriesController.exit(1);
        case 2:
            System.out.println("Allergens, which are usually harmless substances like proteins in certain foods, trigger an immune response.");
            System.out.println("The immune system produces antibodies, such as Immunoglobulin E (IgE), in response to the allergen.");
            System.out.println("These antibodies attach to mast cells, which are found in various tissues, especially in the skin, lungs, and digestive system.");
            System.out.println("When the person comes into contact with the allergen again, the antibodies on the mast cells recognize it and release chemicals, such as histamines.");
            System.out.println("Histamines cause the symptoms of an allergic reaction, including itching, swelling, and inflammation.");
            System.out.println("The severity of the reaction can range from mild symptoms, like sneezing and hives, to severe reactions, such as anaphylaxis.");
            System.out.println("Allergies are diagnosed through tests like skin prick tests or blood tests to measure IgE levels.");
            System.out.println("Treatment often involves avoiding the allergen, and in severe cases, individuals may carry an epinephrine auto-injector for emergencies.");
            System.out.println("Ongoing research aims to better understand the genetic and environmental factors influencing allergies and develop new treatments.");
            System.out.println(" ");
            CategoriesController.exit(1);
        case 3:
            System.out.println("In ancient civilizations, individuals experienced adverse effects after consuming specific foods, though the understanding of these reactions remained limited.");
            System.out.println("The 20th century marked significant milestones in the recognition and understanding of food allergies:");
            System.out.println("1. Identification of Allergens: In the early 1900s, researchers started identifying specific proteins in foods responsible for allergic reactions.");
            System.out.println("2. Peanut Allergy Recognition: Mid-20th century saw increased recognition of peanut allergies as a distinct and potentially severe condition.");
            System.out.println("3. Standardization of Allergy Testing: Advancements in diagnostic techniques, including skin prick tests and serum IgE measurement, contributed to more accurate diagnoses.");
            System.out.println("From the late 20th century to the present, several developments have shaped the understanding of food allergies:");
            System.out.println("1. Rise in Prevalence: The latter half of the 20th century and the early 21st century witnessed a significant increase in the prevalence of food allergies, especially among children.");
            System.out.println("2. Allergen Labeling Regulations: Governments implemented regulations requiring clear identification of common allergens on food labels to enhance consumer awareness and safety.");
            System.out.println("3. Research into Immunotherapy: Ongoing research explores various approaches to treat food allergies, including immunotherapy aimed at desensitizing individuals to specific allergens.");
            System.out.println("4. Global Collaboration and Advocacy: International efforts have raised awareness about food allergies, fostering understanding and supporting individuals living with this condition.");
            System.out.println("Challenges persist, including understanding the complex interplay of genetic and environmental factors contributing to food allergies.");
            System.out.println(" ");
            CategoriesController.exit(1);
        case 4:
            System.out.println("Food Allergies in Numbers:");
            double globalPrevalence = 3.5; 
            System.out.println("1. Global Prevalence: Approximately " + globalPrevalence + "% of the world's population has food allergies.");
            double pediatricPrevalence = 8.0; 
            System.out.println("2. Pediatric Prevalence: Among children, the prevalence is higher, with around " + pediatricPrevalence + "% affected.");
            System.out.println("3. Common Allergens: Peanuts, tree nuts, milk, eggs, wheat, soy, fish, and shellfish are among the most common food allergens.");
            int severeReactions = 40; 
            System.out.println("4. Severe Reactions: Approximately " + severeReactions + "% of individuals with food allergies experience severe reactions, including anaphylaxis.");
            double labelingAwareness = 90.5; 
            System.out.println("5. Allergen Labeling Awareness: Over " + labelingAwareness + "% of consumers actively check food labels for allergen information.");
            double researchFunding = 150.0; 
            System.out.println("6. Research Funding: Annual research funding for food allergy studies exceeds $" + researchFunding + " million.");
            System.out.println(" ");
            CategoriesController.exit(1);
        case 5:
        	System.out.println("Famous People with Food Allergies:");
            String serenaWilliams = "Serena Williams";
            String serenaAllergen = "Peanuts";
            System.out.println("1. " + serenaWilliams + ": The tennis legend is allergic to " + serenaAllergen + ".");
            String drewBrees = "Drew Brees";
            String drewAllergen = "Gluten (Wheat)";
            System.out.println("2. " + drewBrees + ": The NFL quarterback has a gluten allergy, avoiding wheat products.");
            String zooeyDeschanel = "Zooey Deschanel";
            String zooeyAllergen = "Dairy";
            System.out.println("3. " + zooeyDeschanel + ": The actress has a dairy allergy, leading to a dairy-free lifestyle.");
            String billyBobThornton = "Billy Bob Thornton";
            String billyBobAllergen = "Shellfish";
            System.out.println("4. " + billyBobThornton + ": The actor is allergic to " + billyBobAllergen + ".");
            String halleBerry = "Halle Berry";
            String halleAllergen = "Shrimp";
            System.out.println("5. " + halleBerry + ": The Academy Award-winning actress has a shrimp allergy.");
            System.out.println(" ");
            CategoriesController.exit(1);
        case 6:
            System.out.println("Top 10 Most Common Food Allergies:");
            System.out.println("1. Peanuts: Approximately 2% of the global population has a peanut allergy.");
            System.out.println("2. Tree Nuts: Tree nut allergies, including almonds, walnuts, and cashews, affect around 1% of people.");
            System.out.println("3. Milk: Dairy allergies, particularly cow's milk, are prevalent in about 2-3% of young children.");
            System.out.println("4. Eggs: Egg allergies impact roughly 1-2% of children, and many outgrow this allergy over time.");
            System.out.println("5. Wheat: Wheat allergies, distinct from gluten sensitivity, affect approximately 0.4% of the population.");
            System.out.println("6. Soy: Soy allergies are estimated to affect 0.4% of children and are often outgrown.");
            System.out.println("7. Fish: Fish allergies are less common, impacting about 0.1-0.2% of the population.");
            System.out.println("8. Shellfish: Shellfish allergies, including shrimp and crab, affect around 1.2% of the population.");
            System.out.println("9. Sesame: Sesame allergies are becoming increasingly recognized, with an estimated prevalence of 0.1-0.2%.");
            System.out.println("10. Gluten: While celiac disease is distinct, gluten sensitivity affects a small percentage of individuals.");
            System.out.println(" ");
            CategoriesController.exit(1);
       case 7:
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
            System.out.println(" ");
            CategoriesController.exit(1);
		case 8:
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
            System.out.println(" ");
            CategoriesController.exit(1);
		case 0:
            System.out.println(" ");
            CategoriesController.exit(1);

		default:
            System.out.println(" ");
            System.out.println("Invalid choice");
            AllergyPrevention();
		}
	}
}
