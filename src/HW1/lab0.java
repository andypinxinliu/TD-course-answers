package HW1;
/*
 * Author: 
 * 
 * In this lab, you are required to show your understanding in 
 * 	1. Escape character
 *  2. Print statement
 *  3. Variable declaration
 */


import java.util.*;

//大家好，数据结构第1次正课 已由Andy老师反馈：
//
//上课时间：2021-06-13 10:10-12:10
//
//1.本节课内容：
//1. 课程材料介绍 
//2. Github介绍 
//3. Git与linux命令使用以及方法（作业下载与提交）
//4. Java运作原理  
//5. Java Primitive Type介绍
//6. String的定义以及操作符
//7. 变量的声明与赋值
//8. final variable的定义与声明方式
//
//2.下节课预告：
//完成Programming Syntax的全部内容讲解，本节课前一个小时内容讲解了关于Git的使用以及作业下载。各位同学可以参照录屏内容一步一步的完成。Git的使用确实在一开始难度非常大（包括常见的linux指令），但是所有学校的cs专业一定会让同学们学习linux指令以及git的使用。所以希望大家能够多花时间在这个工具的学习上。
//
//3.作业：
//【大作业】 本周大作业网址：https://classroom.github.com/a/pmDdI3Fn
// 【打卡作业】
//1. 完成git，Java以及IDE的安装
//2. 完成Learn Git Branching的“Introduction Sequence”，以及“Ramping Up”部分
//3. 计算A4F(hex) to binary
//4. 完成lab0.java，文件已在附件中给出。
//
//4.附件：
//《lab0.java》https://tdfile.testdaily.cn/group1/M00/31/2A/rBHuyWDFiqaEXPS2AAAAADJ745425.java

public class lab0 {
	public static void main(String[] args) {
		
	/*
	 * Problem 1: Write a Java command that print the following (1 line): 
	 * 
	 * There is one thing every coder must understand:
	 * The System.out.println command.
	 * 
	 */
	
		//Your Answer
		
	 /* 
	  * Problem 2: Write down the following codes' output
	  * 
	  * System.out.println("Dear \"DoubleSlash\" magazine,");
		System.out.println();
		System.out.println("    You publication confusesme. Is it");
		System.out.println(" a \\\\ slash or a //// slash?");
		System.out.println("\nSincerely,");
		System.out.println("Andy \"Bob\" Smith");
	  * 
	  */
		
		System.out.println("Dear \"DoubleSlash\" magazine,");
		System.out.println();
		System.out.println("    You publication confusesme. Is it");
		System.out.println(" a \\\\ slash or a //// slash?");
		System.out.println("\nSincerely,");
		System.out.println("Andy \"Bob\" Smith");
		
		//Your Answer
		
	  /* Problem 3: Write codes to produce the following text (note you need
	   *  \' to print single quote '):
	   *  
	   *  What is the difference between
	   *  a ' and a "?  Or between a " and a \"?
       *
	   *  One is what we see when we're typing our program.
	   *  The other is what appears on the "console."
	   * 
	   */
		
		
		//Your Answer
		
	/*
	 * Problem 4: Calculate the sum of even number from 1 to 20 and store it to a variable
	 *  called sum. Then, print the average of your sum.
	 */
//	int sum = 0;	
//	int number = 0;
//	for(int i = 2; i <= 20; i+=2) {
//		sum = sum + i;
//		number++;
//	}
//	System.out.print(sum/number);
//	
//	int x = 10;
//	ArrayList<Integer> store = new ArrayList<>();
//	store.add(10);
//	store.add(20);
//	int current = 0;
//	if(x < 0 & store.remove(0) == 10)
//		current = 10;
//	System.out.print(store);
	
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
	
	
	System.out.println(qa);
	System.out.println(qb);
	System.out.println(qc);
	System.out.println(qd);
	System.out.println(qe);
	System.out.println(qf);
	System.out.println(qg);
	System.out.println(qh);
	System.out.println(qi);
	System.out.println(qj);
	
	}
	
	
}
