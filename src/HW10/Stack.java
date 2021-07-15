package HW10;

public interface Stack<E> {
	boolean push(E obj);
	
	E pop();
	E peek();//top()
	boolean isFull();
	
	boolean isEmpty();
	
}
