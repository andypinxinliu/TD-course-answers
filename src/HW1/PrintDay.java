package HW1;


import java.io.*;

public class PrintDay {
	
	//If you use the BufferedReader, it needs a IOException threw in the main function, always remember!!!
	public static void main(String args[]) throws IOException{
		
		String dayOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		System.out.print("Enter your date (dd/mm/yyyy): ");
		//Read the input line and split the string into three
		BufferedReader line1 = new BufferedReader(new InputStreamReader(System.in));
		String date = line1.readLine();
		String[] result = date.split("/");
		
		// This is to convert the readline into the corresponding day, month and year
		int day = Integer.parseInt(result[0]);
		int month = Integer.parseInt(result[1]);
		int year = Integer.parseInt(result[2]);
		
		int y = year-(14-month)/12;
        int x = y + y/4 - y/100 +y/400;
        int m = month + 12*((14-month)/12)-2;
        int d = (day + x + 31*m/12)%7;
		
		//This is to output the result day of week
		System.out.println(dayOfWeek[d]);
	}
}
