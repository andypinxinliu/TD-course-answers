package HW4;

//大家好，数据结构第4次正课 已由Andy老师反馈：
//
//上课时间：2021-06-20 10:10-12:10
//
//1.本节课内容：
//1. class与object方法的运用 
//2. static与non-static function 的区别 
//3. 方法设计以及user friendly 
//4. Java Memory Management 
//5. Stack与Heap的初步介绍 
//6. Java Garbage Collector 
//7. 继承概念
//
//2.下节课预告：
//完成继承与多态的讲解
//
//3.作业：
//【打卡作业】 
//完成ComplexNumber的multiply与divide方法
//
//4.附件：
//《ComplexNumberDriver.java》https://tdfile.testdaily.cn/group1/M00/31/AD/rBHuyWDOwmaEXzMQAAAAADulS3o14.java
//《ComplexNumber.java》https://tdfile.testdaily.cn/group1/M00/31/AD/rBHuyWDOwmmEHGvqAAAAAKodMno76.java
//《UnderGrad.java》https://tdfile.testdaily.cn/group1/M00/31/AD/rBHuyWDOwm-EW78yAAAAACjrUtw91.java
//《InheritanceDriver.java》https://tdfile.testdaily.cn/group1/M00/31/AD/rBHuyWDOwnOEb9tXAAAAALYWtdE63.java
//《Student.java》https://tdfile.testdaily.cn/group1/M00/31/AD/rBHuyWDOwnaEX74SAAAAAAX9tHU50.java

public class ComplexNumberDriver {

	public static void main(String[] args) {
		ComplexNumber x = ComplexNumber.constructInCartWay(4.0,2.0);//1
		ComplexNumber y = ComplexNumber.constructInCartWay(3,1); //i
		//1 + i
		
		x.add(y);
		ComplexNumber d = x.divide(y);
		System.out.println(d);
		ComplexNumber polar = ComplexNumber.constructInPolarWay(2.0f, (float)(Math.PI/3.0));
		System.out.println(polar);	
	}

}
