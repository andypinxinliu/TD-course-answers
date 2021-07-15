package HW1;

import java.io.*;
import java.util.Scanner;
public class JavaBasics {
	
	public static void main(String args[]) throws IOException{
		System.out.print("Enter your problem ( 1 or 2): ");
		//Read the input line and split the string into three
		BufferedReader line1 = new BufferedReader(new InputStreamReader(System.in));
		String res = line1.readLine();
		int problem = Integer.parseInt(res);
		if(problem == 1)
			problem1helper();
		else if(problem == 2)
			problem2helper();
		else
			System.out.print("Wrong input!!");
		
	}
	
	static void problem1helper(){
		int f = 15;
		int g = 2;
		double h = 2.0;
		double i = 2;
		double j = 10.0;
		
		Object qa = f + g;
		Object qb = f + "g";
		Object qc = f + h;
		Object qd = f / g;
		Object qe = f / h;
		Object qf = f / i;
		Object qg = (int)j / f * f;
		Object qh = (int)(j / f) * f;
		Object qi = "1" + 1 + 2;
		Object qj = 1 + 1 + "2";
		
		
		System.out.println(qa + " is " + qa.getClass().getName());
		System.out.println(qb + " is " + qb.getClass().getName());
		System.out.println(qc + " is " + qc.getClass().getName());
		System.out.println(qd + " is " + qd.getClass().getName());
		System.out.println(qe + " is " + qe.getClass().getName());
		System.out.println(qf + " is " + qf.getClass().getName());
		System.out.println(qg + " is " + qg.getClass().getName());
		System.out.println(qh + " is " + qh.getClass().getName());
		System.out.println(qi + " is " + qi.getClass().getName());
		System.out.println(qj + " is " + qj.getClass().getName());
	}
	
	static void problem2helper() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a <= b) { 
			if (b > c || c < 4) 
			{ 
				System.out.println("diamond");
			} 
			else 
			{ 
				System.out.println("ruby");
			} 
			System.out.println("pearl");
		} 
		else if (b >= c) { 
			if (!(a > b)) {
				System.out.println("copper"); 
			} 
			else if (b == c && b < 5) 
			{
				System.out.println("bronze"); 
			} 
			System.out.println("silver"); 
			if (a < c) 
			{
				System.out.println("gold"); 	
			}
		} 
		else {
			System.out.println("penny"); 
			if (a == b) 
			{ 
				System.out.println("dime");
			} 
			else 
			{ 
				System.out.println("nickel"); 
			}
		}
		System.out.println("done");
	}

}
