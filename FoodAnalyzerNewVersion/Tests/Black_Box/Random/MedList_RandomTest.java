package Black_Box.Random;

import org.junit.jupiter.api.Test;

import main.java.Main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class MedList_RandomTest {

    @Test
    public void testRandomScenario() {
        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Redirect System.in to provide input
        String input = "1\n2\nMedicineA\n2023-12-31\n3\nMedicineA\n4\nMedicineA\n2024-12-31\n0\n";
        InputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        // Run the scenario
        assertDoesNotThrow(() -> Main.manageMedicationList());

        // Restore System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);

        
        assertTrue(outContent.toString().contains("Medication added successfully!"));
        assertTrue(outContent.toString().contains("Medication removed successfully!"));
        assertTrue(outContent.toString().contains("Medication updated successfully!"));
    }
}
