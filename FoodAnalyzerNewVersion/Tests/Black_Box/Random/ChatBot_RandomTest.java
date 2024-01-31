package Black_Box.Random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import main.java.repository.ChatBot;

class ChatBot_RandomTest {

    @Test
    void testExitCommand() {
        String exitCommand = "exit";
        assertTrue(runChatBot(exitCommand).contains("Goodbye!"));
    }


    // Helper method to run the ChatBot and capture console output
    private String runChatBot(String input) {
        try {
            // Redirect System.out to capture console output
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));

            // Redirect System.in to provide input
            InputStream originalIn = System.in;
            ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
            System.setIn(inContent);

            // Run the ChatBot
            ChatBot.main(new String[]{});

            // Restore original System.out and System.in
            System.setOut(originalOut);
            System.setIn(originalIn);

            // Sleep for a short time to allow asynchronous operations to complete
            Thread.sleep(1000);

            return outContent.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error running main method.", e);
        }
    }
}
