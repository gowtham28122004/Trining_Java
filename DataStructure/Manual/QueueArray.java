package dataStructure;
import java.util.Scanner;

public class QueueArray {

    static int queue[];
    static int front = -1;
    static int rear = -1;
    static int size;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Initialize the queue
        System.out.print("Enter the size of the array: ");
        size = s.nextInt();
        queue = new int[size];
        
        boolean exit = false;

        while (!exit) {
            System.out.println("\nEnter 1 for Enqueue");
            System.out.println("Enter 2 for Dequeue");
            System.out.println("Enter 3 for Peek");
            System.out.println("Enter 4 to check if Queue is Empty");
            System.out.println("Enter 5 for Display");
            System.out.println("Enter 6 to Exit");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int data = s.nextInt();
                    enqueue(data);
                    break;
                case 2:
                    System.out.println("Dequeued: " + dequeue());
                    break;
                case 3:
                    System.out.println("Peek: " + peek());
                    break;
                case 4:
                    if (isEmpty()) {
                        System.out.println("Queue is Empty");
                    } else {
                        System.out.println("Queue is not Empty");
                    }
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Please Enter the right choice");
            }
        }
        s.close();
    }

    public static void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;  // Set front to 0 on the first enqueue
            }
            queue[++rear] = data;
        }
    }

    public static int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int dequeued = queue[front];
            if (front == rear) {
                 // Reset the queue when all elements are dequeued
                front = rear = -1;
            } else {
                front++;
            }
            return dequeued;
        }
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            return queue[front];
        }
    }

    public static boolean isEmpty() {
        return front == -1;
    }

    public static void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}
