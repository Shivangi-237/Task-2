import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherApp {

    // Replace with your OpenWeatherMap API key
    private static final String API_KEY = "2b83efcb36dae0de76bc9a8eef398cb7";
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    public static void main(String[] args) {
        String city = "Dehradun"; // Replace with the desired city
        String apiUrl = BASE_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";

        try {
            // Fetch weather data
            String jsonResponse = sendHttpGetRequest(apiUrl);

            // Parse JSON response
            JSONObject jsonObject = new JSONObject(jsonResponse);

            // Extract and display weather data
            displayWeatherData(jsonObject);
        } catch (IOException e) {
            System.err.println("Error fetching weather data: " + e.getMessage());
        }
    }

    private static String sendHttpGetRequest(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Read the response
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }

    private static void displayWeatherData(JSONObject jsonObject) {
        // Extract relevant data from the JSON response
        String cityName = jsonObject.getString("name");
        JSONObject main = jsonObject.getJSONObject("main");
        double temperature = main.getDouble("temp");
        double feelsLike = main.getDouble("feels_like");
        int humidity = main.getInt("humidity");
        JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);
        String weatherDescription = weather.getString("description");

        // Display the data in a structured format
        System.out.println("Weather in " + cityName + ":");
        System.out.println("---------------------------------");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Feels like: " + feelsLike + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Description: " + weatherDescription);
        System.out.println("---------------------------------");
    }
}
