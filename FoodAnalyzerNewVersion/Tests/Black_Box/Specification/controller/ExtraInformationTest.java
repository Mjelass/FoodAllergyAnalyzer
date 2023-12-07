package Black_Box.Specification.controller;
import static org.junit.Assert.assertEquals;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.Test;

import main.java.controller.ExtraInformationController;

public class ExtraInformationTest {

	@Test
	public void testChooseTopic1() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(1);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Food allergies involve an abnormal immune response to proteins in certain foods."
	            + "Unlike food intolerances, which affect the digestive system, food allergies trigger an immune reaction."
	            + "Common allergens include peanuts, tree nuts, milk, eggs, wheat, soy, fish, and shellfish.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test 
	public void testChooseTopic2() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(2);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Allergens, which are usually harmless substances like proteins in certain foods, trigger an immune response."
	            +"The immune system produces antibodies, such as Immunoglobulin E (IgE), in response to the allergen."
	            +"These antibodies attach to mast cells, which are found in various tissues, especially in the skin, lungs, and digestive system."
	            +"When the person comes into contact with the allergen again, the antibodies on the mast cells recognize it and release chemicals, such as histamines."
	            +"Histamines cause the symptoms of an allergic reaction, including itching, swelling, and inflammation."
	            +"The severity of the reaction can range from mild symptoms, like sneezing and hives, to severe reactions, such as anaphylaxis."
	            +"Allergies are diagnosed through tests like skin prick tests or blood tests to measure IgE levels."
	            +"Treatment often involves avoiding the allergen, and in severe cases, individuals may carry an epinephrine auto-injector for emergencies."
	            +"Ongoing research aims to better understand the genetic and environmental factors influencing allergies and develop new treatments.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testChooseTopic3() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(3);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "In ancient civilizations, individuals experienced adverse effects after consuming specific foods, though the understanding of these reactions remained limited."
	            +"The 20th century marked significant milestones in the recognition and understanding of food allergies:"
	            +"1. Identification of Allergens: In the early 1900s, researchers started identifying specific proteins in foods responsible for allergic reactions."
	            +"2. Peanut Allergy Recognition: Mid-20th century saw increased recognition of peanut allergies as a distinct and potentially severe condition."
	            +"3. Standardization of Allergy Testing: Advancements in diagnostic techniques, including skin prick tests and serum IgE measurement, contributed to more accurate diagnoses."
	            +"From the late 20th century to the present, several developments have shaped the understanding of food allergies:"
	            +"1. Rise in Prevalence: The latter half of the 20th century and the early 21st century witnessed a significant increase in the prevalence of food allergies, especially among children."
	            +"2. Allergen Labeling Regulations: Governments implemented regulations requiring clear identification of common allergens on food labels to enhance consumer awareness and safety."
	            +"3. Research into Immunotherapy: Ongoing research explores various approaches to treat food allergies, including immunotherapy aimed at desensitizing individuals to specific allergens."
	            +"4. Global Collaboration and Advocacy: International efforts have raised awareness about food allergies, fostering understanding and supporting individuals living with this condition."
	            +"Challenges persist, including understanding the complex interplay of genetic and environmental factors contributing to food allergies.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testChooseTopic4() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(4);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Food Allergies in Numbers:"
	            +"1. Global Prevalence: Approximately 3.5% of the world's population has food allergies."
	            +"2. Pediatric Prevalence: Among children, the prevalence is higher, with around 8.0% affected."
	            +"3. Common Allergens: Peanuts, tree nuts, milk, eggs, wheat, soy, fish, and shellfish are among the most common food allergens."
	            +"4. Severe Reactions: Approximately 40 of individuals with food allergies experience severe reactions, including anaphylaxis."
	            +"5. Allergen Labeling Awareness: Over 90.5% of consumers actively check food labels for allergen information."
	            +"6. Research Funding: Annual research funding for food allergy studies exceeds $ 150.0 million.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testChooseTopic5() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(5);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Famous People with Food Allergies:"
	            +"- Serena Williams : The tennis legend is allergic to Peanuts."
	            +"- Drew Brees: The NFL quarterback has a gluten allergy, avoiding wheat products."
	            +"- Zooey Deschanel: The actress has a dairy allergy, leading to a dairy-free lifestyle."
	            +"- Billy Bob Thornton: The actor is allergic to Shellfish."
	            +"- Halle Berry: The Academy Award-winning actress has a shrimp allergy.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testChooseTopic6() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(6);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Top 10 Most Common Food Allergies:"
	            +"1. Peanuts: Approximately 2% of the global population has a peanut allergy."
	            +"2. Tree Nuts: Tree nut allergies, including almonds, walnuts, and cashews, affect around 1% of people."
	            +"3. Milk: Dairy allergies, particularly cow's milk, are prevalent in about 2-3% of young children."
	            +"4. Eggs: Egg allergies impact roughly 1-2% of children, and many outgrow this allergy over time."
	            +"5. Wheat: Wheat allergies, distinct from gluten sensitivity, affect approximately 0.4% of the population."
	            +"6. Soy: Soy allergies are estimated to affect 0.4% of children and are often outgrown."
	            +"7. Fish: Fish allergies are less common, impacting about 0.1-0.2% of the population."
	            +"8. Shellfish: Shellfish allergies, including shrimp and crab, affect around 1.2% of the population."
	            +"9. Sesame: Sesame allergies are becoming increasingly recognized, with an estimated prevalence of 0.1-0.2%."
	            +"10. Gluten: While celiac disease is distinct, gluten sensitivity affects a small percentage of individuals.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testChooseTopic7() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(7);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "1. Identify Allergens:"
				+"   - Work with an allergist to identify specific allergens that trigger your reactions."
				+"   - Be aware of common allergens such as pollen, dust mites, pet dander, certain foods, and insect stings.\n"
				+"2. Control Your Environment:"
				+"   - Keep living spaces clean and well-ventilated to reduce exposure to indoor allergens."
				+"   - Use air purifiers and allergen-proof bedding to create a safer environment.\n"
				+"3. Read Labels Carefully:"
				+"   - Scrutinize food labels for potential allergens, and be cautious with skincare and household products."
				+"   - Familiarize yourself with alternative names for common allergens listed on product labels.\n"
				+"4. Communicate Allergies to Others:"
				+"   - Inform friends, family, coworkers, and school personnel about your allergies."
				+"   - Encourage open communication to avoid accidental exposure.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testChooseTopic8() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(8);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Reacting to Allergic Reactions:"
	            +"1. Know the Signs:"
	            +"   - Recognize the symptoms of an allergic reaction, which may include hives, swelling, difficulty breathing, and anaphylaxis."
	            +"   - Act promptly at the first sign of an allergic response.\n"
	            +"2. Carry Medications:"
	            +"   - Always have prescribed allergy medications on hand, such as antihistamines or epinephrine."
	            +"   - Ensure that family members, friends, and coworkers are aware of the location of your medications.\n"
	            +"3. Use Epinephrine as Directed:"
	            +"   - If prescribed an epinephrine auto-injector, learn how to use it correctly."
	            +"   - Administer epinephrine immediately in case of a severe allergic reaction and seek emergency medical help.\n"
	            +"4. Seek Emergency Assistance:"
	            +"   - Call emergency services (911 or your local emergency number) if you experience a severe allergic reaction."
	            +"   - Do not hesitate to seek professional medical help even after using an epinephrine auto-injector.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testChooseTopic0() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(0);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testChooseTopic9() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(9);
        String actualOutput = outputStream.toString();
	    String expectedOutput =  "Invalid choice";
	    assertEquals(expectedOutput, actualOutput.trim());
	}

}
