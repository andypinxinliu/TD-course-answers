package HW11;

public interface Queue<E> {

	boolean insert(E item);
	
	E remove();
	
	E peek();//head
	boolean isEmpty();
	boolean isFull();
	
}
