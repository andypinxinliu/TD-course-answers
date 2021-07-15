package HW3;

import java.util.Scanner;

public class SystemInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //open a scanner
		
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			if(input.equals("exit")) { // When compare content of string is equal, use .equals() 
				System.out.println("the program is terminated");
				break;//exit current loop
				/*
				 * another keyword: continue
				 * start from the loop beginning, start a new loop
				 */
			}
			if(input.equals("skip")) {
				continue;
			}
			System.out.println("My input is " + input);
		}
		sc.close();//close a scanner
	}
}
