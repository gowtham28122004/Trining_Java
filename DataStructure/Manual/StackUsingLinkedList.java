import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    Node top;

    StackUsingLinkedList() {
        this.top = null;
    }

    // Method to push an element into the stack
    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    // Method to display elements of the stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Method to pop an element from the stack
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;  // Returning -1 to indicate underflow
        } else {
            int t = top.data;
            top = top.next;
            return t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingLinkedList s = new StackUsingLinkedList();  // Defining Stack class and Object
        boolean continueLoop = true;

        while (continueLoop) {
            // Display menu of choices
            System.out.println("\nChoose an operation:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("4: Exit");

            // Take user input for the choice
            int choice = sc.nextInt();

            switch (choice) {
                case 1:  // Push operation
                    System.out.print("Enter element to Push: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;
                
                case 2:  // Pop operation
                    int poppedValue = s.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;

                case 3:  // Display stack
                    System.out.println("Stack data: ");
                    s.display();
                    break;

                case 4:  // Exit the program
                    System.out.println("Exiting...");
                    continueLoop = false;
                    break;

                default:  // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close();
    }
}
