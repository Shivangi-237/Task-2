#REST API CLIENT

*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: SHIVANGI SHARMA

*INTERN ID*: CT08RVQ

*DOMAIN*: JAVA

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

#This Java program is a simple yet effective **weather application** that fetches **real-time weather data** for a specified city using the **OpenWeatherMap API**. It retrieves essential weather details such as **temperature, humidity, and overall weather conditions**, then presents the information in a structured and readable format. By demonstrating key concepts such as **API integration, HTTP requests, and JSON parsing**, this program serves as a fundamental example of interacting with external web services in Java.The execution begins by defining the **API key** and the **base URL** for the OpenWeatherMap API. The program sets a **default city, Dehradun**, but the city name can be easily changed to fetch data for any desired location. The **API URL** is then constructed dynamically by appending the city name and API key to the base URL, along with a **query parameter** that ensures the temperature is returned in Celsius. This approach allows flexibility, enabling modifications without changing the core logic of the program.To **fetch weather data**, the program makes an **HTTP GET request** using Java’s **HttpURLConnection** class. This class facilitates sending and receiving data over the web. The response from the API is retrieved and read using a **BufferedReader**, ensuring efficient handling of large amounts of data. The raw **JSON response** is then stored in a **StringBuilder**, which optimizes text manipulation and allows for easy parsing. Since API responses are often structured in JSON format, the program utilizes the **JSONObject** class from the **org.json** library to extract key weather details efficiently.Once the JSON data is parsed, the program extracts important **weather parameters**, including:  
- **City name** (to confirm the requested location)  
- **Current temperature** (representing the actual temperature at the given location)  
- **Feels-like temperature** (providing a more accurate representation of how the temperature feels due to external factors)  
- **Humidity level** (expressed as a percentage, indicating the moisture in the air)  
- **Weather description** (e.g., *"clear sky"*, *"light rain"*, *"overcast clouds"*, giving an easy-to-understand summary of current conditions)  

The extracted weather details are then displayed in a **user-friendly format**, making the information accessible and easy to interpret. The program ensures that users can quickly understand the **current weather conditions** without the need for complex analysis.  

To handle potential issues, the program includes **basic error handling** using **try-catch blocks**. This ensures that any **exceptions**—such as network failures, invalid city names, or API errors—are properly caught and managed, preventing unexpected crashes. However, the error-handling mechanism could be further improved by **providing more detailed error messages** or implementing a **fallback mechanism** in case of API failures.  

Several enhancements could be made to **improve functionality**. One improvement would be to **allow user input**, enabling users to specify a city dynamically instead of relying on a hardcoded value. Additionally, the program could implement **better error handling** by checking for **invalid responses** or providing alternative suggestions when a city is not found. Furthermore, additional weather parameters, such as **wind speed, atmospheric pressure, and sunrise/sunset times**, could be integrated to provide a **more comprehensive** weather report.  

Overall, this program effectively demonstrates **real-time API integration**, **JSON data processing**, and **handling HTTP requests in Java**. While it serves as a strong foundation, implementing additional **features and optimizations** could make it even more robust and user-friendly.
