package dataStructure;
import java.util.Scanner;

// Class to represent a Node in a linked list
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
        s.close();
    }

    // Method to delete a node at the beginning
    void deletionAtBeggining() {
        if (head != null) {
            head = head.next;
        }
    }

    // Method to delete a node at the end
    void deletionAtEnding() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
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
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        current.next = temp.next;
        temp.next = current;
    }

    // Method to delete a node at a specific position
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

    // Method to display the linked list
    void display() {
        Node temp = head;
        System.out.println("The linked list contains:");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Method to insert a node at the beginning
    void insertAtBeginning(int n) {
        Node newHead = new Node();
        newHead.data = n;
        newHead.next = head;
        head = newHead;
    }

    // Method to insert a node at the end
    void insertAtEnding(int n) {
        Node newNode = new Node();
        newNode.data = n;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to merge another linked list
    void merge(SinglyLinkList l) {
        if (head == null) {
            head = l.head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = l.head;
        }
    }

    // Method to remove duplicate nodes
    void set() {
        Node temp = head;
        while (temp != null && temp.next != null) {
            Node s1 = temp;
            while (s1.next != null) {
                if (temp.data == s1.next.data) {
                    s1.next = s1.next.next;
                } else {
                    s1 = s1.next;
                }
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SinglyLinkList r = new SinglyLinkList();

        // Create and display linked list
        System.out.print("Enter the number of nodes: ");
        int n = s.nextInt();
        r.create(n);
        r.display();

        // Insert at beginning
        System.out.println("Inserting 7 at the beginning:");
        r.insertAtBeginning(7);
        r.display();

        // Insert at specific position
        System.out.print("Enter data to insert: ");
        int data = s.nextInt();
        System.out.print("Enter position to insert (0-indexed): ");
        int pos = s.nextInt();
        r.insertPosision(data, pos);
        r.display();

        // Insert at end
        r.insertAtEnding(5);
        r.display();

        // Deletion at beginning
        r.deletionAtBeggining();
        r.display();

        // Deletion at end
        r.deletionAtEnding();
        r.display();

        // Deletion at specific position
        r.deletionAtPos(4);
        r.display();

        s.close();
    }
}
