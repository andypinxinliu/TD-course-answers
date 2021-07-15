package HW4;

//子类可以无条件的继承父类除构造器以外的全部public 信息
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
}
