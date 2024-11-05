package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Collection {
	
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(5, "Hello");
		m.put(6, "Hello");
		m.put(40, "Fine");
		m.put(7, "us");
		
		System.out.println(m);
		System.out.println(m.get(5));
		System.out.println(m.containsKey(5));
		System.out.println(m.containsValue("Hello"));
	}
	
}
