import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Food_API {

    private static final String BASE_URL = "http://data.food.gov.uk/food-alerts/";

    public static void main(String[] args) {
        try {
            // List of codes for allergens
            String allergensUrl = BASE_URL + "def/allergens";
            String allergensResponse = sendGetRequest(allergensUrl);
            System.out.println("List of Codes for Allergens:\n" + allergensResponse);

            // List of reasons for alert
            String reasonsUrl = BASE_URL + "def/reasons";
            String reasonsResponse = sendGetRequest(reasonsUrl);
            System.out.println("\nList of Reasons for Alert:\n" + reasonsResponse);

            // List of codes for pathogen risks
            String pathogenRisksUrl = BASE_URL + "def/pathogen-risks";
            String pathogenRisksResponse = sendGetRequest(pathogenRisksUrl);
            System.out.println("\nList of Codes for Pathogen Risks:\n" + pathogenRisksResponse);

            // Additional calls (up to five)
            // ...

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String sendGetRequest(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            throw new RuntimeException("HTTP GET request failed with response code: " + responseCode);
        }
    }
}
