package HW11;

public class ArrayQueue<E> implements Queue<E> {

	private E[] items;
	private int head;//front
	private int tail;//rear
	private int numItems;
	
	public ArrayQueue(int maxSize) {
		if(maxSize <= 0) {
			throw new IllegalArgumentException("max size must be positive");
		}
		numItems = 0;
		items = (E[]) new Object[maxSize];
		head = 0;
		tail = -1;
	}
	@Override
	public boolean insert(E item) {
		if(isFull()) {
			return false;
		} else if (item == null) {
			throw new IllegalArgumentException();
		}
		
		tail = (tail + 1) % items.length;
		items[tail] = item;
		numItems ++;
		return true;
	}

	@Override
	public E remove() {
		if(isEmpty()) {
			return null;
		}
		E removed = items[head];
		items[head] = null;
		head = (head + 1) % items.length;
		numItems --;
		return removed;
	}

	@Override
	public E peek() {
		if(isEmpty()) {
			return null;
		}
		return items[head];
	}

	@Override
	public boolean isEmpty() {
		return numItems == 0;
	}

	@Override
	public boolean isFull() {
		return numItems == items.length;
	}
	
	public String toString() {
		String result = "{";
		for(int i = 0; i < numItems; i ++) {
			int j = (head + i) % items.length;
			result += items[j];
			if(i != numItems - 1) {
				result += ", ";
			}
		}
		result +="}";
		return result;
	}
	
	public void printQueue() {
		System.out.println(toString());
	}
	
	public static void main(String[] args) {
		Queue<String> q = new ArrayQueue<String>(10);
		q.insert("hello");
		q.insert("world");
		q.insert("!");
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
	}

}
