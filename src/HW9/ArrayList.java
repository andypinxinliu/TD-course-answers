package HW9;

import java.util.Collection;

public class ArrayList<E> {
	
	//Array to hold actual data
	private Object[] elementData;
	
	//ArrayList "conceptually" size
	private int size;
	
	private static final int DEFAULT_CAPACITY = 10;
	private static final Object[] EMPTY_DEFAULT_DATA = {};
	
	public ArrayList() {
		size = 0;
		elementData = EMPTY_DEFAULT_DATA;
	}
	
	
	public ArrayList(int initCapacity) {
		if(initCapacity > 0) {
			size = 0;
			elementData = new Object[initCapacity];
		} else if(initCapacity == 0) {
			size = 0;
			elementData = EMPTY_DEFAULT_DATA;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	//? is a wildcard that can be any type
	public ArrayList(Collection<? extends E> c) {
		elementData = c.toArray();
		size = elementData.length;
		//There might be a type difference that elementData could not be Object[]
		
		if(size == 0) {
			elementData = EMPTY_DEFAULT_DATA;
		}
	}
	/*
	 * 1. add(E obj) : add obj to the end
	 * 2. add(int index, E obj): add obj to index position
	 */
	public boolean add(E obj) {
		ensureCapacity(size + 1);
		elementData[size] = obj;
		size += 1;
		return true;
	}


	public void add(int index, E obj) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		//
	}
	private void ensureCapacity(int capacity) {
		if(elementData.length <= capacity) {
			grow();
		}
	}

	//grow the length of our capacity
	private void grow() {
		Object[] temp = new Object[(elementData.length+1) * 2];
		for(int i = 0; i < size; i ++) {
			temp[i] = elementData[i];
		}
		elementData = temp;
	}
	
	public String toString() {
		String result = "[";
		for(int i =0; i < size; i ++) {
			result += elementData[i];
			if(i != size -1) {
				result += ",";
			}
		}
		result += "]";
		return result;
	}
	
	public void printArrayList() {
		System.out.println(toString());
	}
	
	public int size() {
		return size;
	}
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.printArrayList();
		al.add(1.0);
		al.printArrayList();
		al.add(20.4);
		al.printArrayList();
		System.out.println(al.size());
	}
}
