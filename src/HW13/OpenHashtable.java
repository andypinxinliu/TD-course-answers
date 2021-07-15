package HW13;

import java.util.LinkedList;
import java.util.Queue;

public class OpenHashtable implements Hashtable{

	class Entry {
		private Object key;
		private Queue<Object> values;
		
		public Entry(Object key, Object value) {
			this.key = key;
			values = new LinkedList<Object>();
			values.add(value);
		}
	}

	private static final int LINEAR = 0;
	private static final int QUADRATIC = 1;
	private Entry[] table;
	
	private int probeType = LINEAR;
	
	public OpenHashtable(int size, int probeType) {
		if(size <= 0) {
			throw new IllegalArgumentException("size must be positive");
		} 
		if(probeType != 0 && probeType != 1) {
			throw new IllegalArgumentException("ProbeType incorrect");
		}
		
		table = new Entry[size];
		this.probeType = probeType;
	}
	
	public OpenHashtable(int size) {
		this(size,LINEAR);
	}
	private int h(Object key) {
		int hash = key.hashCode() % table.length;
		if(hash < 0) {
			hash += table.length;
		}
		
		return hash;
	}
	@Override
	public boolean insert(Object key, Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Queue<Object> search(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Queue<Object> remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

}
