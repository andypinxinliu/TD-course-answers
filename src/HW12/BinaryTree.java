package HW12;

import java.util.*;

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
	
	
	public static void printInorder(Node root) {
		//left root right
		
		//base case : root null, do nothing
		if(root == null) {
			return;
		}
		
		printInorder(root.left);
		System.out.print(root.data + " ");
		printInorder(root.right);
	
	}
	
	public static void printPreorder(Node root) {
		//root left right
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printPreorder(root.left);
		printPreorder(root.right);
		
	}
	
	public static void printPostorder(Node root) {
		if(root == null) {
			return;
		}
		
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data + " ");
	}
	
	public int maxDepth(Node root) {
		if(root == null) {
			return 0;
		}
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		return Math.max(leftDepth, rightDepth) + 1;
	}
	
	public boolean isBST() {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private boolean isBST(Node node, int minValue, int maxValue) {
		if(node == null) {
			return true;
		}
		if(node.data <minValue || node.data > maxValue) {
			return false;
		}
		return isBST(node.left, minValue, node.data - 1) && 
				isBST(node.right, node.data + 1, maxValue);
	}

	public static Node search(Node node, int key) {
		if (node == null || node.data == key) {
			return node;
		}
		if(key < node.data) {
			return search(node.left, key);
		} else {
			return search(node.right, key);
		}
	}
	
	public void insert(int key) {
		root = insert(root, key);
	}
	private Node insert(Node node, int key) {
		if(node == null) {
			node = new Node(key);
			return node;
		}
		if(key < node.data) {
			node.left = insert(node.left, key);
		} else if(key > node.data) {
			node.right = insert(node.right, key);
		}
		return node;
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
//		bt.root = new Node(1);
//		bt.root.left = new Node(2);
//		bt.root.right = new Node(3);
//		bt.root.left.left = new Node(5);
//		bt.root.left.right = new Node(7);
//		bt.root.right.right = new Node(10);
		/*
		 * 		4
		 * 	   /  \
		 *    2    5
		 *   / \
		 *  1   3
		 */
//		bt.root = new Node(4);
//		bt.root.left = new Node(2);
//		bt.root.right = new Node(5);
//		bt.root.left.left = new Node(1);
//		bt.root.left.right = new Node(3);
		bt.insert(5);
		bt.insert(4);
		bt.insert(2);
		
		bt.insert(1);
		bt.insert(3);
		printPostorder(bt.root);
		System.out.println("");
		System.out.println("This Binary Tree has height " + bt.maxDepth(bt.root));
		System.out.println("Is a BST? : " + bt.isBST());

	}
}
