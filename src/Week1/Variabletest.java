package Week1;

public class Variabletest {
	static int num = 20;
	static String str = "Hello";
	static int[] array;
	
	public static void main(String args[]) {
		num = 30;
		str = "World";
		array = new int[10];
		numchange(num);
		strchange(str);
		System.out.println(num);
		System.out.println(str);
		
		
		
		changearray(array);
		System.out.println();
		for(int each : array)
			System.out.print(each + " ");
		System.out.println();
		
		
		
		modifyarray(array);
		System.out.println();
		for(int each : array)
			System.out.print(each + " ");
		
		
		changeindex(array);
		System.out.println();
		for(int each : array)
			System.out.print(each + " ");
		
		System.out.println();
		print();
		
	}
	
	static void print() {
		System.out.print(num);
	}
	
	static void numchange(int num) {
		num = 10;
	}
	
	static void strchange(String str) {
		str = "You are Wrong!";
	}
	
	static void changearray(int[] arr) {
		arr = new int[5];
		for(int each : arr)
			System.out.print(each + " ");
	}
	
	
	static void modifyarray(int[] arr) {
		int[] arr2 = {1, 2, 3, 4};
		arr = arr2;
		for(int each : arr)
			System.out.print(each + " ");
	}
	
	static void changeindex(int[] arr) {
		arr[0] = 10;
	}
	
}
