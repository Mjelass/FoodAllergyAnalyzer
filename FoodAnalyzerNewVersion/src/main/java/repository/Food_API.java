package main.java.repository;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Food_API {

    public static void main(String[] args) {
        try {
            // List of codes for allergens
            String allergensUrl = "http://data.food.gov.uk/food-alerts/def/allergens.json";
            String allergensResponse = sendHttpRequest(allergensUrl, 10);
            System.out.println("List of codes for allergens:\n" + allergensResponse);

            // List of codes for pathogen risks
            String pathogenRisksUrl = "http://data.food.gov.uk/food-alerts/def/pathogen-risks.json";
            String pathogenRisksResponse = sendHttpRequest(pathogenRisksUrl, 10);
            System.out.println("\nList of codes for pathogen risks:\n" + pathogenRisksResponse);

            // List of hazard categories
            String hazardsUrl = "http://data.food.gov.uk/food-alerts/def/hazards.json";
            String hazardsResponse = sendHttpRequest(hazardsUrl, 10);
            System.out.println("\nList of hazard categories:\n" + hazardsResponse);

            // List of reasons for alert
            String reasonsUrl = "http://data.food.gov.uk/food-alerts/def/reasons.json";
            String reasonsResponse = sendHttpRequest(reasonsUrl, 10);
            System.out.println("\nList of reasons for alert:\n" + reasonsResponse);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String sendHttpRequest(String apiUrl, int startIndex) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try {
            // Set request method
            connection.setRequestMethod("GET");

            // Get response code
            int responseCode = connection.getResponseCode();

            // Read response
            StringBuilder response = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                int count = 0;
                while ((line = reader.readLine()) != null) {
                    if (count >= startIndex) {
                        response.append(line);
                    }
                    count++;
                }
            }

            // Close the connection
            connection.disconnect();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                return response.toString();
            } else {
                throw new RuntimeException("Failed to fetch data. Response Code: " + responseCode);
            }
        } finally {
            // Ensure the connection is closed even if an exception is thrown
            connection.disconnect();
        }
    }
}
