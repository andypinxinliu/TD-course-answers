package HW14;

import java.util.LinkedList;
import java.util.Queue;

import HW13.Hashtable;

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
	private static final int DOUBLE_HASHING= 2;
	private Entry[] table;
	
	private int probeType = LINEAR;
	
	public OpenHashtable(int size, int probeType) {
		if(size <= 0) {
			throw new IllegalArgumentException("size must be positive");
		} 
		if(probeType != 0 && probeType != 1 && probeType != 2) {
			throw new IllegalArgumentException("ProbeType incorrect");
		}
		
		table = new Entry[size];
		this.probeType = probeType;
	}
	
	public OpenHashtable(int size) {
		this(size,LINEAR);
	}
	
	// hash function
	private int h1(Object key) {
		int hash = key.hashCode() % table.length;
		if(hash < 0) {
			hash += table.length;
		}
		
		return hash;
	}
	
	//second hash
	private int h2(Object key) {
		int hash = key.hashCode() % 5;
		if (hash < 0) {
			hash += 5;
		}
		
		return hash;
	}
	
	private int probe(Object key) {
		int i = h1(key);
		int h2 = h2(key);
		int numChecked = 1;
		while(table[i] != null && !key.equals(table[i].key)) {
			if(numChecked == table.length) {
				return -1;
			}
			
			i = (i + probeIncr(numChecked,h2)) % table.length;
			numChecked++;
		}
		
		return i;
	}
	private int probeIncr(int numChecked, int h2) {
		if(probeType == LINEAR) {
			return 1;
		} else if (probeType == QUADRATIC) {
			/*
			 * i = 3
			 * i = 3 + 1 => 4 numChecked 1    1
			 * i = 3 + 4 => 7 numChecked 2    3
			 * i = 3 + 9 => 12 numChecked 3   5
			 * i = 3 + 16 => 19 numChecked 4  7
			 */
			
			return numChecked * 2 - 1;
		} else {//double hashing
			return h2;
		}
		
	}

	@Override
	public boolean insert(Object key, Object value) {
		if(key == null) {
			throw new IllegalArgumentException("key must be non-null value");
		}
		int i = h1(key);
		int h2 = h2(key);
		int numChecked = 1;
		int firstRemoved = -1;
		//find appropriate position
		while(table[i] != null && !key.equals(table[i].key)) {
			//record first remove index if there is
			if(table[i].key == null && firstRemoved == -1) {
				firstRemoved = i;
			}
			
			if(numChecked == table.length) {
				break;
			}
			
			i = (i + probeIncr(numChecked,h2)) % table.length;
			numChecked ++;
		}
		//case 1: not null, key is the same
		if(table[i] != null && table[i].key.equals(key)) {
			table[i].values.add(value);
		} else if(firstRemoved != -1) { //was removed before
			table[firstRemoved] = new Entry(key, value);
		} else if(table[i] == null) { //empty entry
			table[i] = new Entry(key, value);
		} else {
			return false;
		}

		return true;
	}

	@Override
	public Queue<Object> search(Object key) {
		if(key == null) {
			throw new IllegalArgumentException();
		}
		
		int i = probe(key);
		if(i == -1 || table[i] == null) {
			return null;
		}
		
		return table[i].values;
	}

	@Override
	public Queue<Object> remove(Object key) {
		if(key == null) {
			throw new IllegalArgumentException();
		}
		int i = probe(key);
		if(i == -1 || table[i] == null) {
			return null;
		} 
		Queue<Object> removedQueue = table[i].values;
		table[i].key = null;
		table[i].values = null;
		return removedQueue;
	}

}
