package HW1;

public class IndexOutOfBound {
	public static void main(String args[]) {
		int[] arr = new int[5];

		for(int i = 0; i < 6; i++) {
			arr[i] = 5;
		}
	}
}
