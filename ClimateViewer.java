package org.example;

import java.util.Scanner;

public class ViewClimate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which city's climate do you want to view?");
        String city = scanner.nextLine();


        String climateConditions = fetchClimateConditions(city);


        System.out.println("Current climatic conditions in " + city + ": " + climateConditions);


        System.out.println("Would you like to know the weather of the day? (yes/no)");
        String userInput = scanner.nextLine().toLowerCase();


        if (userInput.equals("yes")) {

            String weatherOfTheDay = fetchWeatherOfTheDay(city);

            System.out.println("Weather of the day in " + city + ": " + weatherOfTheDay);

            if (isWeatherGood(weatherOfTheDay)) {
                System.out.println("Enjoy your day in " + city );
            } else {
                System.out.println("Stay safe in " + city + "! Here are some advice that may be useful for you: " + getAdvices());
            }
        } else {
            System.out.println("Thank you. You may exit.");
        }

        scanner.close();
    }


    private static String fetchClimateConditions(String city) {
        // In a real scenario, this method would fetch data from an external source based on the city
        return "Sunny with occasional clouds";
    }

    // Simulated method to fetch weather of the day for a specific city
    private static String fetchWeatherOfTheDay(String city) {
        // In a real scenario, this method would fetch data from an external source based on the city
        return "Temperature: 25°C, Humidity: 60%, Wind: 10 km/h";
    }

    // Check if the weather is good based on conditions
    private static boolean isWeatherGood(String weatherOfTheDay) {
        // In a real scenario, this method would analyze weather data to determine if it's good or bad
        // For simplicity, let's assume good weather if temperature is above 20°C and no rain
        return weatherOfTheDay.contains("Temperature: 25°C") && !weatherOfTheDay.contains("Rain");
    }

    // Simulated method to get preventive measures based on weather conditions
    private static String getAdvices() {
        // In a real scenario, this method would provide preventive measures based on weather conditions
        return "Carry an umbrella, stay indoors, and stay hydrated.";
    }
}
