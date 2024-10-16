package dataStructure;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MergeList {
    public static void main(String[] args) {
        SinglyLinkList l1 = new SinglyLinkList();
        SinglyLinkList l2 = new SinglyLinkList();
        Scanner s = new Scanner(System.in);

        try {
            // Input for Linked List 1
            System.out.print("Enter the size of Linked List 1: ");
            if (s.hasNextInt()) {
                int m = s.nextInt();
                l1.create(m);
            } else {
                System.out.println("Invalid input for Linked List 1 size.");
                return;
            }

//            // Input for Linked List 2
//            System.out.print("Enter the size of Linked List 2: ");
//            if (s.hasNextInt()) {
//                int n = s.nextInt();
//                l2.create(n);
//            } else {
//                throw new NoSuchElementException("No input provided for Linked List 2.");
//            }
//
//            // Merging and displaying the merged list
//            System.out.println("Merged List: ");
//            l1.merge(l2);
            l1.set();
            l1.display();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (NoSuchElementException e) {
            System.out.println("No more input elements available.");
        } finally {
            s.close();
        }
    }
}
