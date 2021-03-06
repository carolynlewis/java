
import java.util.Scanner;

public class Chap3 {
	public static void main(String[] args) {
		
		System.out.println("Chapter 3");
		
		System.out.println("\n----- 3.1 ----- system class -----");
		
		System.out.println(System.out);
		
		System.out.println("\n----- 3.2 ----- using the scanner input -----");
		
			String line;
			Scanner in = new Scanner(System.in);
		
		System.out.print("Type something: ");
			line = in.nextLine();
		System.out.println("You said: " + line);
		
		System.out.print("Type something else: ");
			line = in.nextLine();
		System.out.println("You also said: " + line);
		
		System.out.println("\n----- 3.3 ----- java hierarchy -----");
		
		System.out.println("package > class > method > statement > expression > token");
		
		System.out.println("\n----- 3.4 ----- scanner input calculations -----");
		
			int inch;
			double cm;
			final double CM_PER_INCH = 2.54;
			Scanner inputInch = new Scanner(System.in);
		System.out.print("How many inches? ");
			inch =  inputInch.nextInt ();
			cm = inch * CM_PER_INCH;
		System.out.print(inch + " in = ");
		System.out.println(cm + " cm");
		
		System.out.println("\n----- 3.5 ----- formatting -----");
		
		System.out.println(4.0 / 3.0);
		System.out.printf("Four thirds = %.3f\n", 4.0/3.0);
		System.out.printf("%d in = %.3f cm\n", inch, cm);
		
		System.out.println("\n----- 3.6 ----- reading error messages -----");
		
		System.out.println("Error: read the first line to see what happened then read the last line to see where it happened");
		
		System.out.println("\n----- 3.7 ----- turning doubles into ints -----");
		
		System.out.println("int can automatically become a double, but double can't automatically become an int");
			double pi = 3.14159;
			int x = (int) pi;
		System.out.println("x = " + x);
			double xx = (int) pi *20.0;
		System.out.println(xx);
			inch = (int) (cm / CM_PER_INCH);
		System.out.printf("%f cm = %d in\n", cm, inch);

		System.out.println("\n----- 3.8 ----- modulo -----");
		
			int measure = 68;
			final int FOOT = 12;
			int feet = measure / FOOT;
			int inches = measure % FOOT;
		System.out.println(measure + " inches is equal to " + feet + " feet " + inches + " inches");
		
	}
}