package dataStructure;

import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class SinglyLinkList {

    Node head;

    // Method to create a linked list with 'n' nodes
    void create(int n) {
        Scanner s = new Scanner(System.in);
        head = new Node();
        System.out.print("Enter data for node 1: ");
        head.data = s.nextInt();
        head.next = null;
        Node temp = head;

        // Loop to create additional nodes
        for (int i = 2; i <= n; i++) {
            Node current = new Node();
            System.out.print("Enter data for node " + i + ": ");
            current.data = s.nextInt();
            current.next = null;
            temp.next = current;
            temp = temp.next;
        }
    }

    void deletionAtBeggining() {
        if (head != null) {
            head = head.next;
        }
    }

    void deletionAtEnding() {
        Node temp = head;
        Node temp1 = null;
        while (temp.next != null) {
            temp1 = temp;
            temp = temp.next;
        }
        temp1.next = null;
    }

    // Method to insert a node at a specific position
    void insertPosision(int data, int p) {
        Node temp = head;
        Node current = new Node();
        current.data = data;

        if (p == 0) {
            current.next = head;
            head = current;
            return;
        }

        for (int i = 0; i < p - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null && p > 0) {
            System.out.println("Position out of bounds");
            return;
        }

        current.next = temp.next;
        temp.next = current;
    }

    void deletionAtPos(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node temp1 = null;

        // Traverse to the position
        for (int i = 1; i < pos && temp != null; i++) {
            temp1 = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        temp1.next = temp.next;
    }

    void display() {
        Node temp = head;
        System.out.println("The linked list contains:");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void insertAtBeginning(int n) {
        Node newHead = new Node();
        newHead.data = n;
        newHead.next = head;
        head = newHead;
    }

    void insertAtEnding(int n) {
        Node newNode = new Node();
        Node temp = head;
        newNode.data = n;
        newNode.next = null;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SinglyLinkList r = new SinglyLinkList();

        System.out.print("Enter the number of nodes: ");
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

        r.deletionAtBeggining();
        r.display();

        r.deletionAtEnding();
        r.display();

        r.deletionAtPos(4);
        r.display();
    }
}
