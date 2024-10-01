package dataStructure;

import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;
    Node1 pre;
}

public class DoublyLinkedList {

    Node1 head;

    // Method to create a doubly linked list with 'n' nodes
    void createNode(int size) {
        Scanner s = new Scanner(System.in);
        // Create the head node
        head = new Node1();
        System.out.print("Enter data for node 1: ");
        head.data = s.nextInt();
        head.pre = null; // Head's previous should be null
        Node1 temp = head;

        // Loop to create the rest of the nodes
        for (int i = 2; i <= size; i++) {
            Node1 newNode = new Node1();
            System.out.print("Enter data for node " + i + ": ");
            newNode.data = s.nextInt();
            newNode.pre = temp; // Link the new node to the previous node
            temp.next = newNode; // Link the previous node to the new node
            temp = newNode;      // Move temp to the new node
        }
        temp.next = null; // Last node's next should be null
    }

    // Method to insert at the beginning
    void insertAtBeggining(int data) {
        Node1 newNode = new Node1();
        newNode.data = data;
        newNode.pre = null; // New node's previous should be null
        newNode.next = head; // New node's next points to the current head
        if (head != null)
            head.pre = newNode; // Update head's previous to new node
        head = newNode; // New node becomes the head
    }

    // Method to insert at the end
    void insertAtEnding(int n) {
        Node1 newNode = new Node1();
        newNode.data = n;
        newNode.next = null; // New node's next should be null
        if (head == null) {
            head = newNode;
            return;
        }
        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.pre = temp; // Link the new node to the last node
    }

    // Method to delete at the beginning
    void delAtBigg() {
        if (head != null) {
            head = head.next;
            if (head != null)
                head.pre = null; // Update head's previous to null
        }
    }

    // Method to delete at the end
    void delAtEnd() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.pre.next = null; // Update second last node's next to null
    }

    // Method to delete at a specific position
    void delAtPos(int p) {
        if (head == null)
            return;
        Node1 temp = head;
        for (int i = 1; i < p && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position Out Of Bound");
            return;
        }
        if (temp.pre != null)
            temp.pre.next = temp.next; // Update previous node's next
        if (temp.next != null)
            temp.next.pre = temp.pre; // Update next node's previous
        if (temp == head) // If head is to be deleted
            head = temp.next;
    }

    // Method to insert at a specific position
    void insertPosision(int data, int p) {
        Node1 current = new Node1();
        current.data = data;
        if (p == 0) {
            insertAtBeggining(data);
            return;
        }
        Node1 temp = head;
        for (int i = 0; i < p - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null && p > 0) {
            System.out.println("Position out of bounds");
            return;
        }
        current.next = temp.next;
        current.pre = temp;
        if (temp.next != null)
            temp.next.pre = current;
        temp.next = current;
    }

    // Display the list
    void display() {
        Node1 temp = head;
        System.out.println("Doubly Linked List:");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createNode(5); // Create a list with 5 nodes
        dll.display();     // Display the list

        dll.insertAtBeggining(25); // Insert at the beginning
        dll.insertAtEnding(6);     // Insert at the end
        dll.display();

        dll.insertPosision(8, 2);  // Insert at position 2
        dll.display();

        dll.delAtBigg();           // Delete at the beginning
        dll.display();

        dll.delAtEnd();            // Delete at the end
        dll.display();

        dll.delAtPos(2);           // Delete at position 2
        dll.display();
    }
}
