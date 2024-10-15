package dataStructure;

import java.util.Scanner;

class Node7{
	int data;
	Node7 left, right;
	
	Node7(int data){
		this.data = data;
		left=right=null;
	}
}

public class Binarytreetraversal {
	
	static Node7 root;
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		Node7 root = new Node7(7);
		root.left = new Node7(1);
		root.right = new Node7(2);
		root.left.left = new Node7(3);
		root.left.right = new Node7(4);
		root.right.right = new Node7(5);
		root.right.left = new Node7(6);
		
		System.out.print("Preorder:");
		preOrder(root);
		System.out.println();
		System.out.print("Inorder:");
		inOrder(root);
		System.out.println();
		System.out.print("Postorder:");
		postOrder(root);
	}
	
	public static void createNode(int data) {
		
		root = new Node7(data);

	}
	
	public static void leftChild(int data) {

		 root.left = new Node7(data);
		 
	}
	
	public static void rightChild(int data) {
		
		root.right = new Node7(data);
		
	}
	
	public static void preOrder(Node7 node) {
		if(node != null) {
			System.out.print(node.data+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public static void inOrder(Node7 node) {
		if(node != null) {
			inOrder(node.left);
			System.out.print(node.data+" ");
			inOrder(node.right);
		}
	}
	
	public static void postOrder(Node7 node) {
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data+" ");
		}
	}

}
