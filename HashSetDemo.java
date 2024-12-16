package APJSC9550;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();

		// Adding elements to the HashSet
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");

		System.out.println("Before removal:");
		for (String item : set) {
			System.out.println(item);
		}

		// Removing all elements from the HashSet
		set.clear();

		System.out.println("\nAfter removal:");
		for (String item : set) {
			System.out.println(item);
		}
	}
}

/* Output:
Before removal:
Apple
Banana
Cherry

After removal:
(no output)
*/
