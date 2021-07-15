package HW10;

public class ArrayStack<E> implements Stack<E> {

	private int top;
	private E[] elementData;
	
	private final static int DEFAULT_CAPACITY = 10;
	
	//default constructor: set max capacity to a default value
	public ArrayStack() {
		top = -1;
		elementData = (E[]) new Object[DEFAULT_CAPACITY];
	}
	
	public ArrayStack(int maxCapacity) {
		top = -1;
		elementData = (E[]) new Object[maxCapacity];
	}
	@Override
	public boolean push(E obj) {
		if(obj == null) {
			throw new IllegalArgumentException();
		}
		if (isFull()) {
			return false;//prevent stack overflow
		}
		top ++;
		elementData[top] = obj;
		return true;
	}

	@Override
	public E pop() {
		if(isEmpty()) {
			return null; //prevent stack underflow
		}
		E oldValue = elementData[top];
		elementData[top] = null;
		top --;
		return oldValue;
	}

	@Override
	public E peek() {
		return elementData[top];
	}

	@Override
	public boolean isFull() {
		return top == elementData.length -1;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void printStack() {
		System.out.println(toString());
	}
	
	public String toString() {
		String result = "---------\n";
		for(int i = this.top; i >= 0; i --) {
			result += elementData[i] + "\n";
		}
		
		return result + "---------";
	}
	public static void main(String[] args) {
		
		ArrayStack<Integer> s = new ArrayStack<Integer>();
		s.push(10);
		s.printStack();
		s.push(20);
		s.printStack();
		s.pop();
		s.printStack();
		
	}

}
