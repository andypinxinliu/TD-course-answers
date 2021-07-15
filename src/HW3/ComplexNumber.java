package HW3;

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
	public ComplexNumber() {
		re = 1.0;
		im = 2.0;
	}
	
	public ComplexNumber(double r, double i) {
		re = r;
		im = i;
	}
	/*
	 * Function declaration format: 
	 * 	public <return type> <name>(<parameter_list>)
	 */
	
	public ComplexNumber add(ComplexNumber other) {
		
		//TODO: dummy return
		/*
		 * null: empty
		 * 1. null cannot access anything
		 * 2. null can pass the value
		 */
		return null;
	}
	
	public ComplexNumber minus(ComplexNumber other) {
		
		//TODO: dummy return
		return null;
	}
}
