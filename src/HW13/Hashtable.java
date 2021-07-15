package HW13;

import java.util.Queue;
public interface Hashtable {

	/*
	 * return true if successfully added, false otherwise
	 */
	boolean insert(Object key, Object value);
	
	/*
	 * search for a specified key and return the collection
	 */
	Queue<Object> search(Object key);
	
	/*
	 * remove from table by specified key in the table entry
	 */
	Queue<Object> remove(Object key);
}
