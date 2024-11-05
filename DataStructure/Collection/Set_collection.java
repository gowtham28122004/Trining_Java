package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class Set_collection {

	public static void main(String[] args) {

		SortedSet<Integer> s = new TreeSet<>();
		s.add(5);
		s.add(5);
		s.add(4);
		s.add(9);
		s.add(14);
		s.add(11);
		s.add(21);
		
		System.out.println(s);

	}

}
