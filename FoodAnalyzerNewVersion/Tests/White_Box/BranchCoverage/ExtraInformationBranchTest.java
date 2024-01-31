package White_Box.BranchCoverage;
import org.junit.jupiter.api.Test;

import main.java.controller.CategoriesController;
import main.java.controller.ExtraInformationController;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExtraInformationBranchTest {
	@Test
	void testChooseTopic() {
	    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outputStream));

	    ExtraInformationController.chooseTopic(1);
	    assertTrue(outputStream.toString().contains("Food allergies involve an abnormal immune response"));
	    outputStream.reset();

	    ExtraInformationController.chooseTopic(2);
	    assertTrue(outputStream.toString().contains("Allergens, which are usually harmless substances"));
	    outputStream.reset();

	    ExtraInformationController.chooseTopic(3);
	    assertTrue(outputStream.toString().contains("In ancient civilizations,"));
	    outputStream.reset();
	    
	    ExtraInformationController.chooseTopic(4);
	    assertTrue(outputStream.toString().contains("Food Allergies in Numbers:"));
	    outputStream.reset();
	    
	    ExtraInformationController.chooseTopic(5);
	    assertTrue(outputStream.toString().contains("Famous People with Food Allergies:"));
	    outputStream.reset();
	    
	    ExtraInformationController.chooseTopic(6);
	    assertTrue(outputStream.toString().contains("Top 10 Most Common Food Allergies:"));
	    outputStream.reset();
	    
	    ExtraInformationController.chooseTopic(7);
	    assertTrue(outputStream.toString().contains("1. Identify Allergens:"));
	    outputStream.reset();
	    
	    ExtraInformationController.chooseTopic(8);
	    assertTrue(outputStream.toString().contains("Reacting to Allergic Reactions:"));
	    outputStream.reset();
	    ExtraInformationController.chooseTopic(0);
	    assertTrue(outputStream.toString().contains(""));
	    outputStream.reset();
	    
	    ExtraInformationController.chooseTopic(-1);
	    assertTrue(outputStream.toString().contains("Invalid choice."));
	    outputStream.reset();
	}
	@Test
	void testChooseAboutAllergies() {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outputStream));
	    
		ExtraInformationController.aboutAllergies(1);
	    assertTrue(outputStream.toString().contains("Peanut allergy affects around 2% (1 in 50) of children in the UK"));
	    outputStream.reset();

	    ExtraInformationController.aboutAllergies(2);
	    assertTrue(outputStream.toString().contains("They grow on trees and are used in various cuisines and food products."));
	    outputStream.reset();

	    ExtraInformationController.aboutAllergies(3);
	    assertTrue(outputStream.toString().contains("Milk is a common ingredient in many foods, including dairy products, baked goods, and processed foods."));
	    outputStream.reset();
	    
	    ExtraInformationController.aboutAllergies(4);
	    assertTrue(outputStream.toString().contains("Eggs are a common allergen present in various foods, including baked goods, sauces, and mayonnaise."));
	    outputStream.reset();
	    
	    ExtraInformationController.aboutAllergies(5);
	    assertTrue(outputStream.toString().contains("Gluten intolerance or celiac disease is different from wheat allergy and requires distinct management."));
	    outputStream.reset();
	    
	    ExtraInformationController.aboutAllergies(6);
	    assertTrue(outputStream.toString().contains("People allergic to soy should read food labels carefully to avoid soy-based ingredients."));
	    outputStream.reset();
	    
	    ExtraInformationController.aboutAllergies(7);
	    assertTrue(outputStream.toString().contains("Fish allergy is common in regions where fish is a dietary staple."));
	    outputStream.reset();
	    
	    ExtraInformationController.aboutAllergies(8);
	    assertTrue(outputStream.toString().contains("Shellfish allergy is relatively common and tends to be lifelong once developed."));
	    outputStream.reset();
	    
	    ExtraInformationController.aboutAllergies(9);
	    assertTrue(outputStream.toString().contains("Sesame seeds are present in various foods, including bread, crackers, and tahini."));
	    outputStream.reset();
	    
	    ExtraInformationController.aboutAllergies(10);
	    assertTrue(outputStream.toString().contains("Consult a healthcare professional for proper evaluation and dietary recommendations for gluten sensitivity."));
	    outputStream.reset();
	    
	    ExtraInformationController.aboutAllergies(0);
	    assertTrue(outputStream.toString().contains(""));
	    outputStream.reset();
	    
	    ExtraInformationController.aboutAllergies(-1);
	    assertTrue(outputStream.toString().contains("Invalid choice."));
	    outputStream.reset();
	}
}
