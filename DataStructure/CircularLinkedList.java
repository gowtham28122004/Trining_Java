package dataStructure;

import java.util.Scanner;

class Node3 {
    int data;
    Node3 next;
}

public class CircularLinkedList {
	Node3 head;
	

    // Method to create a linked list with 'n' Node3s
    void create(int n) {
    	
        Scanner s = new Scanner(System.in);
        head = new Node3();
        System.out.print("Enter data for Node3 1: ");
        head.data = s.nextInt();
        head.next = head;
        Node3 temp = head;

        // Loop to create additional Node3s
        for (int i = 2; i <= n; i++) {
            Node3 current = new Node3();
            System.out.print("Enter data for Node3 " + i + ": ");
            current.data = s.nextInt();
            current.next = head;
            temp.next = current;
            temp = temp.next;
        }
        s.close();
    }

//    void deletionAtBeggining() {
//        if (head.next != head) {
//            head = head.next;
//        }
//    }
//
//    void deletionAtEnding() {
//        Node3 temp = head;
//        Node3 temp1 = null;
//        while (temp.next != null) {
//            temp1 = temp;
//            temp = temp.next;
//        }
//        temp1.next = null;
//    }

    // Method to insert a Node3 at a specific position
    void insertPosision(int data, int p) {
        Node3 temp = head;
        Node3 current = new Node3();
        current.data = data;

        if (p == 0) {
        	new CircularLinkedList().insertAtBeginning(7);
            return;
        }

        for (int i = 0; i < p - 1 && temp != head; i++) {
            temp = temp.next;
        }

        if (temp == head || temp.next == head && p > 0) {
            System.out.println("Position out of bounds");
            return;
        }

        current.next = temp.next;
        temp.next = current;
    }

//    void deletionAtPos(int pos) {
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        if (pos == 0) {
//            head = head.next;
//            return;
//        }
//
//        Node3 temp = head;
//        Node3 temp1 = null;
//
//        // Traverse to the position
//        for (int i = 1; i < pos && temp != null; i++) {
//            temp1 = temp;
//            temp = temp.next;
//        }
//
//        if (temp == null) {
//            System.out.println("Position out of bounds");
//            return;
//        }
//
//        temp1.next = temp.next;
//    }

    void display() {
        Node3 temp = head;
        System.out.println("The linked list contains:");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(temp.data);
    }

    void insertAtBeginning(int n) {
        Node3 newHead = new Node3();  // Create a new node
        newHead.data = n;

        if (head == null) {
            // If the list is empty
            head = newHead;
            newHead.next = newHead;  // Self-loop for a single node circular list
        } else {
            // Traverse to the last node
            Node3 temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            // Insert new node at the beginning
            temp.next = newHead;
            newHead.next = head;
            head = newHead;  // Update head to the new node
        }
    }

    void insertAtEnding(int n) {
        Node3 newNode3 = new Node3();
        Node3 temp = head;
        newNode3.data = n;
        newNode3.next = head;
        do {
            temp = temp.next;
        } while (temp.next != head);
        
        temp.next = newNode3;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CircularLinkedList r = new CircularLinkedList();

        System.out.print("Enter the number of Node3s: ");
        int n = s.nextInt();

        r.create(n);
        r.display();

        System.out.println("Inserting 7 at the beginning:");
        r.insertAtBeginning(7);
        r.display();

        System.out.print("Enter data to insert: ");
        int data = s.nextInt();
        System.out.print("Enter position to insert (0-indexed): ");
        int pos = s.nextInt();
        r.insertPosision(data, pos);
        r.display();

        r.insertAtEnding(5);
        r.display();
//
//        r.deletionAtBeggining();
//        r.display();
//
//        r.deletionAtEnding();
//        r.display();
//
//        r.deletionAtPos(4);
//        r.display();
        s.close();
    }
}
