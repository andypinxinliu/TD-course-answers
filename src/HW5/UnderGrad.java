package HW5;

//��Һã����ݽṹ��5������ ����Andy��ʦ������
//
//�Ͽ�ʱ�䣺2021-06-22 10:10-12:10
//
//1.���ڿ����ݣ�
//1. �̳и��� 
//2. ����constructor��д��ʽ 
//3. ������д��method override�������Լ�д�� 
//4. ��̬��ʹ���Լ���̬�Ķ��� 
//5. static binding ��dynamic binding ԭ�� 
//6. abstract class��abstract method 
//7. interface�ĸ����Լ���abstract class������ 
//8. recursion�Ķ����Լ�recursion������д��
//
//2.�½ڿ�Ԥ�棺
//���Recursion��Backtracking�Ľ���
//
//3.��ҵ��
//������ҵ��
//1. ���recursion������д����1��n��sum
//2. ��ϰ����ڿε�����
//
//4.������
//��UnderGrad.java��https://tdfile.testdaily.cn/group1/M00/31/D2/rBHuyWDRZk-EL5D9AAAAAPOOHSo19.java
//��Student.java��https://tdfile.testdaily.cn/group1/M00/31/D2/rBHuyWDRZlOEKRm1AAAAANawk_A32.java

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
