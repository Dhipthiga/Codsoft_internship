package temconv;
import java.util.Scanner;

public class Tempconver {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the temperature value: ");
	        double temperature = scanner.nextDouble();
	        
	        System.out.println("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin): ");
	        char tempunit = scanner.next().toUpperCase().charAt(0);
	        
	        switch (tempunit) {
	            case 'C':
	                convertFromCelsius(temperature);
	                break;
	            case 'F':
	                convertFromFahrenheit(temperature);
	                break;
	            case 'K':
	                convertFromKelvin(temperature);
	                break;
	            default:
	                System.out.println("Invalid unit entered. \n Please enter C, F, or K.");
	        }
	        
	        scanner.close();
	    }

	    public static void convertFromCelsius(double celsius) {
	        double fahrenheit = (celsius * 9/5) + 32;
	        double kelvin = celsius + 273.15;
	        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F and " + kelvin + "K.");
	    }

	    public static void convertFromFahrenheit(double fahrenheit) {
	        double celsius = (fahrenheit - 32) * 5/9;
	        double kelvin = celsius + 273.15;
	        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C and " + kelvin + "K.");
	    }

	    public static void convertFromKelvin(double kelvin) {
	        double celsius = kelvin - 273.15;
	        double fahrenheit = (celsius * 9/5) + 32;
	        System.out.println(kelvin + "K is equal to " + celsius + "°C and " + fahrenheit + "°F.");
	    }
	}

