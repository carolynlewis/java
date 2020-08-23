
import java.util.Scanner;

/**
 * Takes in name and age
 */

public class Name {
	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			String name;
			int age;
		System.out.print("What is your name? ");
			name = in.nextLine();
		System.out.print("What is your age? ");
			age = in.nextInt();
		System.out.println("Hello " + name + ", age " + age);
		
	}
}