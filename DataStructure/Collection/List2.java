package collections;

import java.util.LinkedList;

public class List2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> a = new LinkedList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		a.set(0, 5);
		
		a.remove();
		a.add(2,1);
		System.out.println(a);
		
	}

}
