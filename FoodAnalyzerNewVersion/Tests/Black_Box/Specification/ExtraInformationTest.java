package Black_Box.Specification;
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
	            +"10. Gluten: While celiac disease is distinct, gluten sensitivity affects a small percentage of individuals."
	            +"If you want to know more you about a certain allergy you can type in a number 1-10 as listes above (0 to exit):";
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
	    String expectedOutput =  "Invalid choice.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	
	
	@Test
	public void testAboutAllergies1() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.aboutAllergies(1);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Chosen Allergy: Peanuts:"
    			+ "How common is peanut allergy?"
    			+ "Peanut allergy affects around 2% (1 in 50) of children in the UK"
    			+ "It usually develops in early childhood but, occasionally, can appear in later life."
    			+ "Peanut allergy tends to be persistent and only approximately 1 in 5 children outgrow their allergy, usually by the age of 10"
    			+ "Mild to moderate symptoms include:"
    			+ "- Itchy mouth, tongue and throat"
    			+ "- Swelling of lips, around the eyes or face"
    			+ "- Red raised itchy rash (often called nettle rash, hives or urticaria)"
    			+ "- Vomiting, nausea, abdominal pain and diarrhoea"
    			+ "- Runny nose and sneezing"
    			+ "Any one or more of the following symptoms are a sign of a severe allergic reaction (anaphylaxis) and should be treated as a medical emergency."
    			+ "Severe symptoms of anaphylaxis include:"
    			+ "- Swelling of the tongue and/or throat"
    			+ "- Difficulty in swallowing or speaking"
    			+ "- Change in voice (hoarse voice)"
    			+ "- Wheeze (whistling noise) or persistent cough"
    			+ "- Difficult or noisy breathing"
    			+ "- Dizziness, collapse, loss of consciousness (due to a drop in blood pressure)"
    			+ "- Pale, floppy, sudden sleepiness in babies."
    			+ "More about peanuts."
    			+ "Peanuts are grown in areas of the world with warm climates such as America, Asia and Africa. They are grown from seed and grow under the ground."
    			+ "Different varieties of peanut are produced for different uses (for example, peanuts to be used in peanut butter and peanuts in the shell for roasting)."
    			+ "Peanuts are from a family of plants called legumes, the same family as garden peas, lentils, soya beans and chickpeas."
    			+ "Most people will be able to eat other types of legumes without any problems and it is rare for people with a peanut allergy to react to other legumes."
    			+ "Other members of the legume family that can affect people with peanut allergy is lupin as these seeds share similar proteins with peanuts."
    			+ "Lupin flour and seeds can be used in bread, pastry, and pasta."
    			+ "It is often used in wheat and gluten-free food."
    			+ "Lupin is more commonly used in other European countries, Brazil, and the Middle East."
    			+ "It is very important to be aware of this and seek medical advice from an allergy specialist if you or your child has ever had a severe reaction to peanut as allergy testing to these other foods may also be needed.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testAboutAllergies2() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.aboutAllergies(2);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Chosen Allergy Tree Nuts:"
    			+ "How common is tree nut allergy?"
    	        + "Tree nut allergy affects around 1-2% of the population."
    	        + "It can develop in childhood or adulthood and tends to persist throughout life."
    	        + "Most people with a tree nut allergy remain allergic to these nuts their entire lives."
    	        + "Mild to moderate symptoms may include:"
    	        + "- Itchy mouth, tongue, and throat"
    	        + "- Swelling of lips, face, or throat"
    	        + "- Skin reactions like hives or rashes"
    	        + "- Digestive issues such as nausea or diarrhea"
    	        + "- Runny nose and sneezing"
    	        + "Severe allergic reactions (anaphylaxis) symptoms:"
    	        + "- Swelling of the tongue and/or throat"
    	        + "- Difficulty swallowing or speaking"
    	        + "- Breathing difficulties such as wheezing or coughing"
    	        + "- Dizziness, fainting, or loss of consciousness"
    	        + "- Sudden drop in blood pressure"
    	        + "More about tree nuts:"
    	        + "Tree nuts include almonds, cashews, walnuts, hazelnuts, pistachios, and more."
    	        + "They grow on trees and are used in various cuisines and food products."
    	        + "Individuals allergic to one type of tree nut might react to others, but this isn't always the case."
    	        + "Cross-reactivity between different tree nuts is possible due to shared proteins."
    	        + "Some foods, like marzipan or nougat, often contain tree nuts."
    	        + "Medical advice should be sought if a severe reaction to tree nuts occurs, as other nut allergies may also be present.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testAboutAllergies3() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.aboutAllergies(3);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Chosen Allergy: Milk"
    	        + "How common is milk allergy?"
    	        + "Milk allergy is one of the most common allergies in infants and young children."
    	        + "It affects about 2-3% of infants and young children in the first few years of life."
    	        + "Most children outgrow milk allergy by age 3-5, but some may not outgrow it until later."
    	        + "Mild to moderate symptoms include:"
    	        + "- Hives (red spots that look like mosquito bites)"
    	        + "- Wheezing"
    	        + "- Itching or tingling feeling around the lips or mouth"
    	        + "- Swelling of the lips, tongue or throat"
    	        + "- Coughing or shortness of breath"
    	        + "- Vomiting"
    	        + "Severe symptoms of anaphylaxis include:"
    	        + "- Loose stools or diarrhea, which may contain blood"
    	        + "- Abdominal cramps"
    	        + "- Runny nose"
    	        + "- Watery eyes"
    	        + "- Colic, in babies"
    	        + "More about milk:"
    	        + "Milk is a common ingredient in many foods, including dairy products, baked goods, and processed foods."
    	        + "Some people with a milk allergy may also react to other dairy products like cheese or yogurt."
    	        + "There are alternative milk options available, such as soy, almond, or oat milk, for those with allergies."
    	        + "Reading labels and being cautious when dining out is essential for those with milk allergies."
    	        + "Seek medical advice for proper management and alternative dietary options if allergic to milk.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testAboutAllergies4() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.aboutAllergies(4);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Chosen Allergy: Egg"
    	        + "How common is egg allergy?"
    	        + "Egg allergy is one of the most common food allergies in children."
    	        + "It affects about 1-2% of young children but is often outgrown by school age."
    	        + "Most children outgrow egg allergy by age 5, but some may continue to have the allergy into adulthood."
    	        + "Mild to moderate symptoms include:"
    	        + "- Skin inflammation or hives — the most common egg allergy reaction"
    	        + "- Nasal congestion, runny nose and sneezing (allergic rhinitis)"
    	        + "- Digestive symptoms, such as cramps, nausea and vomiting"
    	        + "- Asthma signs and symptoms such as coughing, wheezing, chest tightness or shortness of breath"
    	        + "Severe symptoms of anaphylaxis include:"
    	        + "- Constriction of airways, including a swollen throat or a lump in your throat that makes it difficult to breathe"
    	        + "- Abdominal pain and cramping"
    	        + "- Rapid pulse"
    	        + "- Shock, with a severe drop in blood pressure felt as dizziness, lightheadedness or loss of consciousness"
    	        + "More about eggs:"
    	        + "Eggs are a common allergen present in various foods, including baked goods, sauces, and mayonnaise."
    	        + "People allergic to eggs might also react to egg-containing vaccines or flu shots."
    	        + "Egg allergies can sometimes persist into adulthood, requiring dietary adjustments and caution in food choices."
    	        + "Consult with an allergist for accurate diagnosis and guidance on managing an egg allergy.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testAboutAllergies5() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.aboutAllergies(5);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Chosen Allergy: Wheat"
    	        + "How common is wheat allergy?"
    	        + "Wheat allergy is relatively common, particularly in children."
    	        + "It affects about 0.4% of children, but some may outgrow it by adulthood."
    	        + "Most children with wheat allergy will outgrow it by the age of 12, but it can persist in some cases."
    	        + "Mild to moderate symptoms include:"
    	        + "- Swelling, itching or irritation of the mouth or throat"
    	        + "- Hives, itchy rash or swelling of the skin"
    	        + "- Nasal congestion"
    	        + "- Headache"
    	        + "- Difficulty breathing"
    	        + "- Cramps, nausea or vomiting"
    	        + "- Diarrhea"
    	        + "Severe symptoms of anaphylaxis include:"
    	        + "- Swelling or tightness of the throat"
    	        + "- Chest pain or tightness"
    	        + "- Trouble swallowing"
    	        + "- Pale, blue skin color"
    	        + "- Dizziness or fainting"
    	        + "More about wheat:"
    	        + "Wheat is a common ingredient in various foods like bread, pasta, cereals, and baked goods."
    	        + "Individuals allergic to wheat might need to avoid certain grains and processed foods."
    	        + "Gluten intolerance or celiac disease is different from wheat allergy and requires distinct management."
    	        + "Consult with an allergist or healthcare professional for proper diagnosis and dietary guidance.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testAboutAllergies6() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.aboutAllergies(6);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Chosen Allergy: Soy"
    	        + "How common is soy allergy?"
    	        + "Soy allergy is relatively common, especially in infants and children."
    	        + "It affects about 0.4% of children, but many may outgrow it by age 10."
    	        + "Most children with soy allergy will outgrow it, but it can persist into adulthood."
    	        + "Mild to moderate symptoms include:"
    	        + "- Skin reactions such as hives or eczema"
    	        + "- Digestive issues like stomach pain, nausea, or diarrhea"
    	        + "- Runny or stuffy nose, sneezing"
    	        + "- Asthma-like symptoms such as wheezing or coughing"
    	        + "- Swelling, itching, or tingling sensation in the mouth"
    	        + "Severe symptoms of anaphylaxis include:"
    	        + "- Difficulty breathing or swallowing"
    	        + "- Swelling of the lips, tongue, or throat"
    	        + "- Drop in blood pressure leading to dizziness or fainting"
    	        + "- Loss of consciousness"
    	        + "More about soy:"
    	        + "Soybeans are present in many processed foods, sauces, and Asian cuisine."
    	        + "Soy allergy may cross-react with other legumes but not always."
    	        + "People allergic to soy should read food labels carefully to avoid soy-based ingredients."
    	        + "Consult an allergist for accurate diagnosis and guidance on managing a soy allergy.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testAboutAllergies7() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.aboutAllergies(7);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Chosen Allergy: Fish"
    	        + "How common is fish allergy?"
    	        + "Fish allergy is relatively common and tends to be lifelong once developed."
    	        + "It affects about 0.4-0.5% of the population."
    	        + "Most individuals with fish allergy do not outgrow it and must avoid fish throughout their lives."
    	        + "Mild to moderate symptoms include:"
    	        + "- Hives, skin rash, or eczema"
    	        + "- Nausea, stomach cramps, vomiting, or diarrhea"
    	        + "- Runny or stuffy nose, sneezing"
    	        + "- Itchy, tingly, or swollen lips, tongue, or throat"
    	        + "- Asthma-like symptoms such as wheezing or coughing"
    	        + "Severe symptoms of anaphylaxis include:"
    	        + "- Difficulty breathing or swallowing"
    	        + "- Swelling of the lips, tongue, or throat"
    	        + "- Dizziness, lightheadedness, or fainting"
    	        + "- Drop in blood pressure leading to shock"
    	        + "- Loss of consciousness"
    	        + "More about fish:"
    	        + "Fish allergy is common in regions where fish is a dietary staple."
    	        + "It's crucial for individuals with fish allergy to avoid both fish and fish products."
    	        + "Some individuals with fish allergy may also react to cooking vapors or touching fish."
    	        + "Consult an allergist for accurate diagnosis and guidance on managing a fish allergy.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testAboutAllergies8() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.aboutAllergies(8);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Chosen Allergy: Shellfish"
    	        + "How common is shellfish allergy?"
    	        + "Shellfish allergy is relatively common and tends to be lifelong once developed."
    	        + "It affects about 1-2% of the population."
    	        + "Most individuals with shellfish allergy do not outgrow it and must avoid shellfish throughout their lives."
    	        + "Mild to moderate symptoms include:"
    	        + "- Hives, skin rash, or eczema"
    	        + "- Nausea, stomach cramps, vomiting, or diarrhea"
    	        + "- Runny or stuffy nose, sneezing"
    	        + "- Itchy, tingly, or swollen lips, tongue, or throat"
    	        + "- Asthma-like symptoms such as wheezing or coughing"
    	        + "Severe symptoms of anaphylaxis include:"
    	        + "- Difficulty breathing or swallowing"
    	        + "- Swelling of the lips, tongue, or throat"
    	        + "- Dizziness, lightheadedness, or fainting"
    	        + "- Drop in blood pressure leading to shock"
    	        + "- Loss of consciousness"
    	        + "More about shellfish:"
    	        + "Shellfish allergy includes two groups: crustaceans (shrimp, crab, lobster) and mollusks (clams, mussels)."
    	        + "Individuals allergic to one group might not react to the other, but cross-contamination is possible."
    	        + "Avoidance of shellfish and reading labels is crucial for those with shellfish allergy."
    	        + "Consult an allergist for accurate diagnosis and guidance on managing a shellfish allergy.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testAboutAllergies9() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.aboutAllergies(9);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Chosen Allergy: Sesame"
    	        + "How common is sesame allergy?"
    	        + "Sesame allergy is relatively common and can be lifelong once developed."
    	        + "It affects a small percentage of the population, but reactions can be severe."
    	        + "Most individuals with sesame allergy must avoid sesame products entirely."
    	        + "Mild to moderate symptoms include:"
    	        + "- Skin reactions such as hives or eczema"
    	        + "- Digestive issues like stomach pain, nausea, or diarrhea"
    	        + "- Runny or stuffy nose, sneezing"
    	        + "- Asthma-like symptoms such as wheezing or coughing"
    	        + "- Swelling, itching, or tingling sensation in the mouth"
    	        + "Severe symptoms of anaphylaxis include:"
    	        + "- Difficulty breathing or swallowing"
    	        + "- Swelling of the lips, tongue, or throat"
    	        + "- Drop in blood pressure leading to dizziness or fainting"
    	        + "- Loss of consciousness"
    	        + "More about sesame:"
    	        + "Sesame seeds are present in various foods, including bread, crackers, and tahini."
    	        + "Those with sesame allergy must carefully read labels and avoid foods containing sesame seeds."
    	        + "Consult an allergist for accurate diagnosis and guidance on managing a sesame allergy.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testAboutAllergies10() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.aboutAllergies(10);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "Chosen Allergy: Gluten"
    	        + "How common is gluten sensitivity?"
    	        + "Gluten sensitivity or intolerance is relatively common but differs from an allergy."
    	        + "It affects about 0.5-13% of the population."
    	        + "Gluten sensitivity involves digestive issues but doesn't trigger an allergic reaction."
    	        + "Symptoms may include:"
    	        + "- Bloating, gas, or abdominal pain"
    	        + "- Diarrhea or constipation"
    	        + "- Fatigue, headache, or joint pain"
    	        + "- Skin problems such as eczema"
    	        + "- Brain fog or irritability"
    	        + "More about gluten:"
    	        + "Gluten is a protein found in wheat, barley, and rye, commonly present in bread, pasta, and cereal."
    	        + "Individuals with gluten sensitivity should opt for gluten-free alternatives."
    	        + "Consult a healthcare professional for proper evaluation and dietary recommendations for gluten sensitivity.";
	    assertEquals(expectedOutput, actualOutput.trim());
	}
	@Test
	public void testAboutAllergies0() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExtraInformationController.chooseTopic(0);
        String actualOutput = outputStream.toString();
	    String expectedOutput = "";
	    assertEquals(expectedOutput, actualOutput.trim());
	}

}
