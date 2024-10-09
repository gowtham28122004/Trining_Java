package dataStructure;

import java.util.Scanner;

class Node4 {
    int data;
    Node4 next;
    Node4(){};
    Node4(int data){
    	this.data = data;
    	this.next = null;
    }
}

class StackList {
    static Node4 top;
//    StackList(){
//    	this.top = null;
//    }

    // Method to push 'size' number of elements into the stack
    public static void push(int size) {
        Scanner s = new Scanner(System.in);
        
        // Create the first node (top of the stack)
        top = new Node4();
        System.out.print("Enter data for Node 1: ");
        top.data = s.nextInt();
        top.next = null;

        // Loop to push the remaining elements
        for (int i = 2; i <= size; i++) {
            Node4 current = new Node4();
            System.out.print("Enter data for Node " + i + ": ");
            current.data = s.nextInt();
            current.next = top; // The new node points to the previous top
            top = current;      // Update the top to the newly created node
        }
        s.close();
    }

    // Method to display the elements of the stack
    public static void display() {
        Node4 temp = top;
        System.out.println("Stack elements:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; // Move to the next node
        }
        System.out.println();
    }
    
    public static Node4 pop() {
    	if(top == null) {
    		System.out.println("Stack Underflow");
    	} else {
    		Node4 temp = top;
    		top = top.next;
    		return temp;
    	}
    	return null;
    }
    
    public static Node4 peek() {
    	if(top == null) {
    		System.out.println("Stack Empty");
    	}
    	else {
    		return top;
    	}
    	return null;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements to push into the stack: ");
        int size = s.nextInt();
        
        // Push elements to the stack and display them
        push(size);
        display();
        
        System.out.print("Popped : ");
        System.out.println(pop().data);
        display();
        
        System.out.print(peek().data);
        s.close();
    }
}
