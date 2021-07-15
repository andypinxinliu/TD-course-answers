package HW4;

public class Student {
	private double gpa;
	private String id;
	
	public Student() {
		gpa = 0.0;
		id = "NA";
	}
	
	public Student(double g, String i) {
		gpa = g;
		id = i;
	}
	/*
	 * Accessor: only access state variable
	 * Mutator: Modify state variable
	 */
	
	/*
	 * Accessor
	 */
	public double getGpa() {	
		return gpa;
	}
	
	public String getId() {
		return id;
	}
	
	/*
	 * Mutator
	 */
	public void setGpa(double g) { //void: no return value
		gpa = g;
	}
	
	public void setId(String i) {
		id = i;
	}
}
