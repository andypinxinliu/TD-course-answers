package HW11;

public class BinaryTree {

	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public static void main(String[] args) {
		/*
		 *      1
		 *     / \
		 *    2   3
		 *   / \   \
		 *  5   7  10
		 */
		
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(5);
		bt.root.left.right = new Node(7);
		bt.root.right.right = new Node(10);
		
	}
}
