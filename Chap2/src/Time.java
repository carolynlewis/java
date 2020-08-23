
public class Time {
	public static void main(String[] args) {
		System.out.println("Exercise 2.3");
		System.out.println("---------");
		
			int hour = 22;
			int minute = 57;
			int second = 32;
			
		System.out.print( (hour * 60 * 60) + (minute * 60) + (second) );
		System.out.println(" seconds have passed today");
		
		System.out.print( (24 * 60 *60) - ( (hour * 60 * 60) + (minute * 60) + (second) ) );
		System.out.println(" seconds remaining in the day");
		
			double dhour = 22.0;
			double dminute = 57.0;
			double dsecond = 32.0;
		
		System.out.print( ( (dhour * 60.0 * 60.0) + (dminute * 60.0) + (dsecond) ) / (24.0 * 60.0 * 60.0) * 100);
		System.out.println(" % of the day has passed");
		
			int hour2 = 23;
			int minute2 = 13;
			int second2 = 22;
			int previousSeconds = 82652;		// seconds passed today
		
		System.out.print( ( ( hour2 * 60 * 60) + (minute2 * 60) + (second2) ) - (previousSeconds) );
												// find difference of previous seconds and current seconds
		System.out.println(" seconds have elapsed since I started working on this exercise");
		
			int differenceSeconds = 950;		// difference of previous seconds and current seconds
		
		System.out.print( (differenceSeconds / 60) +" minutes and ");
												// divide int by 60 to get whole minutes
		System.out.println( (differenceSeconds % 60) + " seconds have elapsed since I started working on this exercise");
												// use modulo to find remainder which is amount of seconds left

	}
}

