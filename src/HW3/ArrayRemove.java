package HW3;

import java.util.Arrays;

public class ArrayRemove<T> {
	

	
	public static void main(String args[]) {
		Integer[] arr = {1,23,0,7,9};
		Object[] temp =  remove(arr, 2);
		
		//can't directly assign cast object to integer actually, so we need to assign value one by one
		//arr = (Integer[]) temp;

		Integer[] integerArray = Arrays.copyOf(temp, temp.length, Integer[].class);
		arr = integerArray;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	// The following two methods are exactlly the same
	
	
	public static <T> T[] remove(T[] array, int index) {
		Object [] newarr = new Object[array.length - 1];
		for(int i = 0; i < index; i++) {
			newarr[i] = array[i];
		}
		for(int i = index; i < newarr.length; i++) {
			newarr[i] = array[i + 1];
		}
		array = (T[])newarr;
		return array;
	}
	
//	public static  Object[] remove(Object[] array, int index) {
//		Object [] newarr = new Object[array.length - 1];
//		for(int i = 0; i < index; i++) {
//			newarr[i] = array[i];
//		}
//		for(int i = index; i < newarr.length; i++) {
//			newarr[i] = array[i + 1];
//		}
//		array = newarr;
//		return array;
//	}
}
