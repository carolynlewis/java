
import java.util.Scanner;

/*
* guess my favorite number
*/

public class E3_4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
			int number = 52;
			int guess;
		
		System.out.println("My favorite number is between 1 and 99. Can you guess what it is?");
		
		System.out.print("Guess a number: ");
			guess = in.nextInt();
			
		System.out.println("Your guess is: " + guess);
		
		System.out.println("My favorite number is: " + number);
		
			int difference = number - guess;
			
		System.out.print("You were off by: ");
		System.out.println(Math.abs(difference));
		
	}
}