package HW4;

/*
 * Access modifier
 * 
 * default:(less restriction) current class & other class in the same package
 * public : (no restriction) all people can use
 * private : (max restriction) only at own class
 * 
 * protected: (medium restriction)
 */
public class ComplexNumber {
	/*
	 * In general, all instance variable should be private
	 */
	private double re;//real part
	private double im;//imaginary part
	
	/*
	 * In general, most instance function/methods should be public
	 */
	
	/*
	 * Constructor doesn't have return type
	 * 
	 * constructor with no parameter -- default constructor
	 */
	private ComplexNumber() {
		re = 1.0;
		im = 2.0;
	}
	
	private ComplexNumber(double r, double i) {
		re = r;
		im = i;
	}
	
	/*
	 * construct in a polar way
	 */
	private ComplexNumber(float r, float t) {
		re = r * Math.cos(t);
		im = r * Math.sin(t);
	}
	/*
	 * Function declaration format: 
	 * 	public <return type> <name>(<parameter_list>)
	 */
	
	/*
	 * x = a + bi;
	 * y = c + di;
	 * 
	 */
	public ComplexNumber add(ComplexNumber other) {
		/*
		 * null: empty
		 * 1. null cannot access anything
		 * 2. null can pass the value
		 * 
		 * . : dot operator
		 */
		double real = re + other.re;
		double imagine = im + other.im;
		return new ComplexNumber(real, imagine);
	}
	
	public ComplexNumber minus(ComplexNumber other) {
		
		/*
		 * a - b --> a + (-b)
		 */
		return add(new ComplexNumber(-other.re, -other.im));
	}
	
	public ComplexNumber multiply(ComplexNumber other) {
		
		//TODO: dummy return
		double real = re * other.re - im * other.im;
		double imagine = re * other.im + im * other.re;
		return new ComplexNumber(real, imagine);
	}
	
	public ComplexNumber divide(ComplexNumber other) {
		
		//TODO: dummy return
		double real = (re * other.re + im * other.im) / (Math.pow(other.re, 2) + Math.pow(other.im, 2));
		double imagine = (im * other.re - re * other.im) / (Math.pow(other.re, 2) + Math.pow(other.im, 2));
		return new ComplexNumber(real, imagine);
	}
	
	/*
	 * toString() -- String representation of an object
	 * 
	 * re + im i
	 */
	
	public String toString() {
		String result = "";
		if (im < 0) {
			result += "" + re + im + "i";
		} else {
			result += re + "+" + im + "i";
		}
		return result;
	}
	
	public static ComplexNumber constructInPolarWay(float r , float t) {
		return new ComplexNumber(r, t);
	}
	
	public static ComplexNumber constructInCartWay(double r, double i) {
		return new ComplexNumber(r, i);
	}
}
