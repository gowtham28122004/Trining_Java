package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueList {
	
	public static void main(String[] args) {
		Queue<String> q = new ArrayDeque<>();
		q.add("Hi");
		q.add("Jack");
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println(q.isEmpty()?"Yes":"No");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
	
}
