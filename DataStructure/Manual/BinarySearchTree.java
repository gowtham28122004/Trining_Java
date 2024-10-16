package dataStructure;

class Node8{
	int data;
	Node8 left,right;
	
	Node8(int data){
		this.data = data;
		left = right = null;
	}
}

public class BinarySearchTree {
	
	static Node8 root;
	
	public BinarySearchTree() {
		@SuppressWarnings("unused")
		Node8 root = null;
	}
		
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = tree.insert(tree.root,50);
		tree.insert(tree.root,30);
		tree.insert(tree.root,20);
		tree.insert(tree.root,40);
		tree.insert(tree.root,70);
		tree.insert(tree.root,60);
		tree.insert(tree.root,80);
		
		int searchdata = 50;
		System.out.print(searchdata+":"+(tree.search(tree.root,searchdata)?"Found":"Not Found"));
	}
	
	public Node8 insert(Node8 root,int data) {
		if(root == null) {
			root = new Node8(data);
			return root;
		}
		if(data < root.data) { //20<50 //20<30
			root.left = insert(root.left,data);
		}
		else if(data > root.data) {
			root.right = insert(root.right, data);
		}
		return root; //30 
	}
	
	public boolean search(Node8 root,int data) {
		if(root==null) 
			return false;
		if(root.data==data) 
			return true;
		else if(data < root.data)
			return search(root.left,data);
		else
			return search(root.right,data);
	}
	
	public static void preOrder(Node8 node) {
		if(node != null) {
			System.out.print(node.data+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public static void inOrder(Node8 node) {
		if(node != null) {
			inOrder(node.left);
			System.out.print(node.data+" ");
			inOrder(node.right);
		}
	}
	
	public static void postOrder(Node8 node) {
		if(node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data+" ");
		}
	}
	
}
