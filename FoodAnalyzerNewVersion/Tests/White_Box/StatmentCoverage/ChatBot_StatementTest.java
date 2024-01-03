package White_Box.StatmentCoverage;

import org.junit.jupiter.api.Test;

import main.java.repository.ChatBot;

import static org.junit.jupiter.api.Assertions.*;

import java.net.http.HttpClient;

public class ChatBot_StatementTest {

    @Test
    public void testGenerateResponseWithValidPrompt() {
        ChatBot chatBot = new ChatBot(HttpClient.newHttpClient());
        String userPrompt = "Tell me a joke";

        String response = chatBot.generateResponse(userPrompt);

        assertNotNull(response);
        assertTrue(response.length() > 0);
    }
}
