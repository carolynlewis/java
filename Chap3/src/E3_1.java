
/*
 * using %d (format as integer) and %f (format as decimal)
 */

public class E3_1 {
	public static void main(String[] args) {
		
			int x = 12;
			double y = 3.14;
		System.out.println(x + " " + y);
		System.out.printf("x = " + x + " - but also %08d\n", x);
		System.out.printf("y = " + y + " - but also %.8f\n", y);
		
	}
}