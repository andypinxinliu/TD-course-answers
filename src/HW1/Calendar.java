package HW1;

public class Calendar {
	/*
	 * Robust program: 
	 * 1. Program cannot throw exception due to incorrect format
	 * 2. Program MUST always give the correct results
	 * 3. Program MUST NOT crash.
	 */
	public static void main(String[] args) {
		/*
		 * 1. Not divisible by 4, is not a leap year ex. 2021
		 * 2. Divisible by 4, but not divisible by 100, leap year, ex. 2020
		 * 3. Divisible by 100, but not divisible by 400, not leap year, ex. 1900
		 * 4. Divisible by 400, leap year ex. 2000
		 */
		/*
		 * Exception Handling
		 * try {
		 * 
		 * } catch(Exception e) {
		 * 
		 * }
		 */
		try {
			int year = Integer.parseInt(args[0]);
			if ((year % 4 == 0 && year % 100 != 0)|| year% 400 == 0) {
				System.out.println("Current year " + year + " is a leap year");

			} else {
				System.out.println("Current year " + year + " is NOT a leap year");
			}
		} catch(Exception e) {
			System.err.println("Current input value is not in correct format!");
		}	

	}
}
