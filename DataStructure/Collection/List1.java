package collections;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;
import java.util.List;

public class List1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Size of the Array : ");
		int size = s.nextInt();
		
		for(int i = 0;i < size;i++) {
			System.out.print("Enter Element "+(i+1)+": ");
			a.add(s.nextInt());
		}
		
		Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
//		System.out.println(a.get(4));
//		a.set(0, 3);
//		System.out.println(a);
		
		List<Integer> b = new ArrayList<>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		System.out.println(b);
//		a.addAll(b);
		System.out.println(a);
		System.out.println(a.equals(b));
		
		int[] c = new int[] {1,2,3,4};
		System.out.println(b.equals(c));
		
		ArrayList<String> d = new ArrayList<String>();
		d.add("hello");
		d.add("hi");
		d.add("Welcome");
		d.add("World!");
		int n = s.nextInt();
		
		for(int i1 = 0;i1 < n;i1++) {
			d.add(s.next());
		}
		System.out.println(d);
		s.close();
	}
	
}
