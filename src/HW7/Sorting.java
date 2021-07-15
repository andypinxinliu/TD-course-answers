package HW7;
import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public static void mergeSort(int[] arr) {
		mergeSortHelper(arr, 0, arr.length-1);
	}
	
	private static void mergeSortHelper(int[] arr, int l, int r) {
		if(l < r) {
			int m = (l+r)/2;
			mergeSortHelper(arr, l,m);
			mergeSortHelper(arr, m+1, r);
			merge(arr,l,m,r);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		//merge two sorted array
		
		int[] left = new int[m-l+1];
		int[] right = new int[r-m];
		
		for(int i = 0; i < left.length; i ++) {
			left[i] = arr[l + i];
		}
		for(int i = 0; i < right.length; i ++) {
			right[i] = arr[m + 1 + i];
			
		}
		
		int i = 0, j = 0;
		
		int k = l;
		
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) {
				arr[k] = left[i];
				i ++;
			} else {
				arr[k] = right[j];
				j ++;
			}
			k ++;
		}
		
		while(i < left.length) {
			arr[k] = left[i];
			i ++; k ++;
		} 
		
		while(j < right.length) {
			arr[k] = right[j];
			j ++; k ++;
		}
		
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		for(int i = 0 ; i< arr.length; i++) {
			arr[i] = r.nextInt(20);
		}
		System.out.println("The unsorted array is " + Arrays.toString(arr));
		
		mergeSort(arr);
		
		System.out.println("The sorted is " + Arrays.toString(arr));
	}
}
