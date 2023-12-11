package White_Box.MutationCoverage; 

import static org.junit.Assert.assertEquals; 
import java.io.ByteArrayOutputStream; 
import java.io.PrintStream; 
import org.junit.jupiter.api.Test; 

public class ExtraInformationMutationTest { 
	
	public static void chooseTopicMutation(int userChoice) { 
		switch (userChoice) { 
		case 1: 
			System.out.println("Mutated Text 1"); 
			break; 
		case 2: 
			System.out.println("Mutated Text 2"); 
			break; 
		case 3: 
			System.out.println("Mutated Text 3"); 
			break; 
		case 4: 
			System.out.println("Mutated Text 4"); 
			break; 
		case 5: 
			System.out.println("Mutated Text 5"); 
			break; 
		case 6: 
			System.out.println("Mutated Text 6"); 
			break; 
		case 7: 
			System.out.println("Mutated Text 7"); 
			break; 
		case 8: 
			System.out.println("Mutated Text 8"); 
			break; 
		case 0: 
			System.out.println("Mutated Text 0"); 
			break; 
		default: 
			System.out.println("Mutated Text 9"); 
			break; 
		} 
	} 
	
	@Test 
	public void testExtraInformation1() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseTopicMutation(1); 
		assertEquals("Mutated Text 1", outputStream.toString().trim()); 
		System.setOut(System.out); 
		} 
	@Test 
	public void testExtraInformation2() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseTopicMutation(2); 
		assertEquals("Mutated Text 2", outputStream.toString().trim()); 
		System.setOut(System.out); 
		} 
	@Test 
	public void testExtraInformation3() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseTopicMutation(3); 
		assertEquals("Mutated Text 3", outputStream.toString().trim()); 
		System.setOut(System.out); 
		} 
	@Test 
	public void testExtraInformation4() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseTopicMutation(4); 
		assertEquals("Mutated Text 4", outputStream.toString().trim()); 
		System.setOut(System.out); 
		} 
	@Test 
	public void testExtraInformation5() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseTopicMutation(5); 
		assertEquals("Mutated Text 5", outputStream.toString().trim()); 
		System.setOut(System.out); 
		} 
	@Test 
	public void testExtraInformation6() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseTopicMutation(6); 
		assertEquals("Mutated Text 6", outputStream.toString().trim()); 
		System.setOut(System.out); 
		} 
	@Test 
	public void testExtraInformation7() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseTopicMutation(7); 
		assertEquals("Mutated Text 7", outputStream.toString().trim()); System.setOut(System.out); 
		} 
	@Test 
	public void testExtraInformation8() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseTopicMutation(8); 
		assertEquals("Mutated Text 8", outputStream.toString().trim()); 
		System.setOut(System.out); } 
	@Test 
	public void testExtraInformation0() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseTopicMutation(0); 
		assertEquals("Mutated Text 0", outputStream.toString().trim()); 
		System.setOut(System.out); } 
	@Test 
	public void testExtraInformation9() throws Exception { 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		System.setOut(new PrintStream(outputStream)); 
		chooseTopicMutation(9); 
		assertEquals("Mutated Text 9", outputStream.toString().trim()); 
		System.setOut(System.out); 
		} 
	}



















