package HW2;

//大家好，数据结构第2次正课 已由Andy老师反馈：
//
//上课时间：2021-06-15 10:10-12:10
//
//1.本节课内容：
//1. 算术操作符以及规则
//2. Math class中的常见方法
//3. 常见数据类型转换方式
//4. Compound assignment operator用法
//5. 逻辑符：and，or，xor
//6. if statement以及用法
//7. short-circuit evaluation以及computer architecture model
//8. switch的用法
//9. array的property以及用法
//10. while循环与for循环 
//11. Exception Handling
//
//2.下节课预告：
//完成OOP的讲解
//
//3.作业：
//【打卡作业】
//1. 复习本节课所讲解知识，尤其是要对照本节课所写的Calendar.java文件理解细节内容
//2. 完成附件Java Basic
//
//4.附件：
//《Java Basics .pdf》https://tdfile.testdaily.cn/group1/M00/31/45/rBHuyWDIKoGEP9nCAAAAAMYFaAs830.pdf
//《Calendar.java》https://tdfile.testdaily.cn/group1/M00/31/45/rBHuyWDIKpiELkHBAAAAAJ-OIlU50.java

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
