package veer;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WeatherAPI weatherAPI = new WeatherAPI();

        while (true) {
            System.out.println("1. Get weather");
            System.out.println("2. Get Wind Speed");
            System.out.println("3. Get Pressure");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int Str = sc.nextInt();

            switch (Str) {
                case 1:
                    System.out.print("Enter the date (YYYY-MM-DD): ");
                    String date = sc.next();
                    double temperature = weatherAPI.getTemperature(date);
                    System.out.println("The temperature on " + date + " is " + temperature + " degrees Celsius.\n+ london");
                    break;
                case 2:
                    System.out.print("Enter the date (YYYY-MM-DD): ");
                    date = sc.next();
                    double windSpeed = weatherAPI.getWindSpeed(date);
                    System.out.println("The wind speed on " + date + " is " + windSpeed + " km/h.\n + london");
                    break;
                case 3:
                    System.out.print("Enter the date (YYYY-MM-DD): ");
                    date = sc.next();
                    double pressure = weatherAPI.getPressure(date);
                    System.out.println("The pressure on " + date + " is " + pressure + " hPa.\n+ london");
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}

class WeatherAPI {
    // Replace these methods with your actual API calls to fetch weather data from an external source.
    public double getTemperature(String date) {
        // Code to fetch the temperature of the input date from the API
        // Replace this with your actual data retrieval code
        double temperature = 18.0; // Dummy temperature value for demonstration
        return temperature;
    }

    public double getWindSpeed(String date) {
        // Code to fetch the wind speed of the input date from the API
        // Replace this with your actual data retrieval code
        double windSpeed = 18.0; // Dummy wind speed value for demonstration
        return windSpeed;
    }

    public double getPressure(String date) {
        // Code to fetch the pressure of the input date from the API
        // Replace this with your actual data retrieval code
        double pressure = 1010.0; // Dummy pressure value for demonstration
        return pressure;
    }
}
