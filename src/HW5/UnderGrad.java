package HW5;

//大家好，数据结构第5次正课 已由Andy老师反馈：
//
//上课时间：2021-06-22 10:10-12:10
//
//1.本节课内容：
//1. 继承概念 
//2. 子类constructor书写方式 
//3. 方法重写（method override）含义以及写法 
//4. 多态的使用以及多态的定义 
//5. static binding 与dynamic binding 原则 
//6. abstract class与abstract method 
//7. interface的概念以及与abstract class的区别 
//8. recursion的定义以及recursion函数的写法
//
//2.下节课预告：
//完成Recursion与Backtracking的讲解
//
//3.作业：
//【打卡作业】
//1. 完成recursion方法编写：从1到n的sum
//2. 复习这五节课的内容
//
//4.附件：
//《UnderGrad.java》https://tdfile.testdaily.cn/group1/M00/31/D2/rBHuyWDRZk-EL5D9AAAAAPOOHSo19.java
//《Student.java》https://tdfile.testdaily.cn/group1/M00/31/D2/rBHuyWDRZlOEKRm1AAAAANawk_A32.java

public class UnderGrad extends Student{
	private String major;
	private String advisor;
	
	/*
	 * 1. super() can be used to access superclass (default) constructor
	 * 		constructor can never inherit
	 * 2. super() will be called in default.
	 * 3. super(), if used, must in the first line of constructor
	 */
	public UnderGrad() {
		super();
		major = "NA";
		advisor = "NA";
	}
	
	public UnderGrad(String m, String a) {
		super();
		major = m;
		advisor = a;
	}
	
	/*
	 * 1. instance variable(state) can have the same name as local variable
	 * 2. local variable is prior to instance variable
	 */
	public UnderGrad(double g, String i, String major, String a) {
		super(g,i);
		this.major = major;
		this.advisor = a;
	}
	
	/*
	 * method header
	 * 
	 * method override: Student -- toString()
	 * 
	 * 1. complete method override
	 * 2. partial method override
	 */
	public String toString() {
//		return "major: " + major + "\nadvisor: " + advisor;
		return super.toString()+"\nmajor: " + major + "\nadvisor: " + advisor;
	}
}
