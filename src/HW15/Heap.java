package HW15;

import java.util.Arrays;

public class Heap {

	private int[] items; //root is in index 0
	
	public Heap(int[] arr) {
		items = arr;
	}
	
	//max-heapify
	public void heapify() {
		int lastNode = items.length -1;
		for(int i = findParent(lastNode); i >= 0; i --) {
			heapifyHelper(items.length, i);
		}
		
	}
	
	private int findParent(int i) {
		return (i-1)/2;
	}

	private void heapifyHelper(int size, int i) { //i is the parent node index
		int leftChild = findLeftChild(i);
		int rightChild = findRightChild(i);
		int largest = i;
		
		if(leftChild < size && items[largest] < items[leftChild]) {
			largest = leftChild;
		}
		
		if(rightChild < size && items[largest] < items[rightChild]) {
			largest = rightChild;
		}
		
		//if not max heap
		if(largest != i) {
			int temp = items[largest];
			items[largest] = items[i];
			items[i] = temp;
			
			heapifyHelper(size, largest);
			
		}
	}

	
	private int findRightChild(int i) {
		return i * 2  + 2;
	}

	private int findLeftChild(int i) {
		return i * 2 + 1;
	}
	
	
	public void heapSort() {
		heapify();
		
		for(int i = items.length - 1 ; i > 0 ; i -- ) { 
			//items[0] max 
			
			int temp = items[i];
			items[i] = items[0];
			items[0] = temp;
			heapifyHelper(i, 0);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 16,5,30,27,17,20,2,57,3,90};
		Heap h = new Heap(arr);
		h.heapSort();
		System.out.println(Arrays.toString(h.items));
	}
}
