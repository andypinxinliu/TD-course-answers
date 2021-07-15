package HW1;

import java.util.ArrayList;

public class HeapTest {
	byte[] a  = new byte[1024 * 100];
	
	public static void main(String args[]) {
		ArrayList<HeapTest> heaptests = new ArrayList<>();
		while(true) {
			heaptests.add(new HeapTest());
		}
	}
}
