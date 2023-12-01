package WhiteBox.Controllers;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.java.Main;
import main.java.controller.CategoriesController;
import main.java.model.Food;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;
import static org.junit.Assert.*;


public class CategoriesControllerTest {

	@Test
	public void testUchooseCategory0() {
	      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	      System.setOut(new PrintStream(outputStream));
	      CategoriesController.chooseCategory(0);
	      String printedOutput = outputStream.toString().trim();
	      assertEquals("Exiting.", printedOutput);
	      System.setOut(System.out);
	}

}