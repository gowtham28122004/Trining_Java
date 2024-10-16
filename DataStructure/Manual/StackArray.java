package dataStructure;

import java.util.Scanner;

public class StackArray {
    static int[] stack; // Array to store stack elements
    static int top = -1; // Index of the top element

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the stack: "); // Move the stack size input outside of the loop
        int size = s.nextInt();
        stack = new int[size]; // Initialize stack with the specified size

        boolean run = true;
        while (run) {
            System.out.println("Enter 1 to push");
            System.out.println("Enter 2 to pop");
            System.out.println("Enter 3 to peek");
            System.out.println("Enter 4 to Display");
            System.out.println("Enter 5 to Exit");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to push: ");
                    push(s.nextInt(), size);
                    break;
                case 2:
                    System.out.println("Popped: " + pop());
                    break;
                case 3:
                    System.out.println("Top element: " + peek());
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("Please Enter a valid choice");
            }
        }
        s.close(); // Close the scanner to prevent resource leaks
    }

    static void push(int data, int size) {
        if (top >= size - 1) { // Fix the overflow condition
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = data; // Push data onto the stack
        }
    }

    static int pop() {
        if (top == -1) { // Check for underflow
            System.out.println("Stack Underflow");
            return -1; // Return a sentinel value
        } else {
            return stack[top--]; // Return and remove the top element
        }
    }

    static int peek() {
        if (top == -1) { // Check if the stack is empty
            System.out.println("Stack is empty");
            return -1; // Return a sentinel value
        }
        return stack[top]; // Return the top element
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty"); // Check if stack is empty before displaying
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " "); // Display elements from top to bottom
            }
            System.out.println(); // Move to the next line
        }
    }
}
