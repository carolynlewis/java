
import java.util.Scanner;
import java.util.Random;

/*
* guess a random number
*/

public class E3_42 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Random random = new Random();
		
			int number = random.nextInt(99) + 1;
			int guess;
		
		System.out.println("I am thinking of a number between 1 and 99. Can you guess what it is?");
		
		System.out.print("Guess a number: ");
			guess = in.nextInt();
			
		System.out.println("Your guess is: " + guess);
		
		System.out.println("My favorite number is: " + number);
		
			int difference = number - guess;
			
		System.out.print("You were off by: ");
		System.out.println(Math.abs(difference));
		
	}
}