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
}
