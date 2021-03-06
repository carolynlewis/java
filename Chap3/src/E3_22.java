
import java.util.Scanner;

/*
* convert fahrenheit to celsius
*/

public class E3_22 {
	public static void main(String[] args) {
		
			double celsius;
			double fahrenheit;
			
			Scanner in = new Scanner(System.in);
			
		System.out.print("Enter a temperature in Fahrenheit: ");
			fahrenheit = in.nextDouble();
			
			final double CELSIUS_FORMULA = ( (fahrenheit - 32.0) * (5.0 / 9.0) );
			
		System.out.printf(fahrenheit + " F = %.2f C\n", CELSIUS_FORMULA);
		
		System.out.printf("FORMULA: %.2f C = (" + fahrenheit + " F - 32) * 5/9", CELSIUS_FORMULA);
		
	}
}