
import java.util.Scanner;

/*
* convert celcius to fahrenheit
*/

public class E3_2 {
	public static void main(String[] args) {
		
			double celsius;
			double fahrenheit;
			
			Scanner in = new Scanner(System.in);
			
		System.out.print("Enter a temperature in Celsius: ");
			celsius = in.nextDouble();
			
			final double FAHRENHEIT_FORMULA = ( ( (celsius * (9.0 / 5.0) ) + 32.0 ) );
			
		System.out.println(celsius + " C = " + FAHRENHEIT_FORMULA + " F");
		
		System.out.printf("FORMULA: " + FAHRENHEIT_FORMULA + " F = (" + celsius + " C * 9/5) + 32");
		
	}
}