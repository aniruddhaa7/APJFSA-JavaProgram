package APJSC9550;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		// Adding elements to the HashMap
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");

		// Printing the HashMap
		for (Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}
	}
}
/*OUTPUT
Key: 1, Value: One
Key: 2, Value: Two
Key: 3, Value: Three
Key: 4, Value: Four
Key: 5, Value: Five
*/
