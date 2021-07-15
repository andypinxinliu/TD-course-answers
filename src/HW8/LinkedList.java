package HW8;

import java.util.NoSuchElementException;

public class LinkedList {
	
	class Node{
		int data;
		Node next;
		
		//dummy Node
		public Node() {
			data = Integer.MIN_VALUE;
			next = null;
		}
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public LinkedList(Node head) {
		this.head = head;
	}
	
	public void printList() {
		Node cur = head; //traverse node
		String result = "[";
		while(cur != null) {//cur has data
			result += cur.data;
			if(cur.next != null) { //ensure cur is not the last element
				result += ", ";
			}
			cur = cur.next; //let cur move to right 1 node
		}
		result += "]";
		System.out.println(result);
	}
	
	/*
	 * Insert
	 */
	//add data to the last position
	public void insertLast(int data) {
		//what if cur is null?
		if(head == null) {
			head = new Node(data);
			return;
		} 
		//which is current last node
		//last node's next points to new node
		Node cur = head;
		
		while(cur.next != null) {
			cur = cur.next;
		}
		//cur is the last node
		cur.next = new Node(data);
	}
	
	public void insert(int index, int data) {
		if(index <0) {
			throw new IndexOutOfBoundsException();
		}
		int i = 0;
		if(i == index) {
			Node old_head = head;
			head = new Node(data);
			head.next = old_head;
		} else {
			Node cur = head;
			while(cur != null && i != index -1) {
				cur = cur.next;
				i ++;
			}
			if(cur == null) {
				throw new IndexOutOfBoundsException();
			}
			//naive: i == index-1
			Node temp = cur.next;
			cur.next = new Node(data);
			cur.next.next = temp;	
		}
	}
	public void insertBeginning(int data) {
		Node old_head = head;
		head = new Node(data);
		head.next = old_head;
	}
	
	//implement insertAfter(Node node, int data) ?
	
	public void insertAfter(Node node, int data) {
		//TODO:
		Node current = head;
		while(current != node) {
			current = current.next;
		}
		Node temp = current.next;
		Node newNode = new Node(data);
		current.next = newNode;
		newNode.next = temp;
	}
	
	/*
	 * Remove
	 */
	
	public Node removeBeginning() {
		if(head == null) {
			throw new NoSuchElementException();
		}
		Node result = head;
		head = head.next;
		return result;
	}
	
	public Node removeLast() {
		if(head == null) {
			throw new NoSuchElementException();
		}	
		if(head.next == null) {	
			Node old_head = head;
			head = null;
			return old_head;
		} else {
			Node cur = head;
			while(cur.next.next != null) {
				cur = cur.next;
			}
			Node removed = cur.next;
			cur.next = null;
			return removed;
		}
	}
	
	//reverse an LinkedList
	//before reverse 3 -> 4 -> 5-> 1 
	//after reverse 1 -> 5 -> 4 ->3
	public void reverse() {
		Node pre = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = pre;
			//cannot use .next to access "next element", we changed next element!
			pre = current;
			current = next;	
		}
		head = pre;
	}
	
	/* 
	 * Implement merge
	 * 1. a, b sorted 
	 * 2. merge is the same as we did in mergeSort
	 */
	public LinkedList merge(LinkedList a, LinkedList b) {
		//TODO: 
		LinkedList result = new LinkedList();
		Node a1 = a.head;
		Node b1 = b.head;
		while(a1 != null && b1 != null) {
			if(a1.data <= b1.data) {
				result.insertLast(a1.data);
				a1 = a1.next;
			}
			if(a1.data > b1.data) {
				result.insertLast(b1.data);
				b1 = b1.next;
			}	
		}
		if(a1 == null && b1 != null) {
			while(b1 != null) {
				result.insertLast(b1.data);
				b1 = b1.next;
			}
		}
		if(a1 != null && b1 == null) {
			while(a1 != null) {
				result.insertLast(a1.data);
				a1 = a1.next;
			}
		}
			
		return result;
	}
	
	public int returnMiddle(LinkedList a) {
		Node fast = head;
		Node slow = head;
		while(fast != null && slow != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(0, 0);
		ll.insert(0, 10);
		ll.insert(1, 20);
		ll.insert(3, 40);
		ll.insertBeginning(15);
		ll.printList();
		ll.reverse();
		ll.printList();
		LinkedList ll2 = new LinkedList();
		for(int i = 0; i < 10; i = i + 2) {
			ll2.insertLast(i);
		}
		ll2.printList();
		LinkedList ll3 = new LinkedList();
		for(int i = 1; i < 10; i= i + 2) {
			ll3.insertLast(i);
		}
		LinkedList re = ll2.merge(ll3, ll2);
		re.printList();
		System.out.println(re.returnMiddle(re));
		
		
	}
}
