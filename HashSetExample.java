package APJSC9550;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add initial elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Display the HashSet before appending
        System.out.println("HashSet before appending: " + set);
        // Output: HashSet before appending: [Apple, Banana, Cherry] (Order may vary)

        // Append a new element to the HashSet
        set.add("Date");

        // Display the HashSet after appending
        System.out.println("HashSet after appending: " + set);
        // Output: HashSet after appending: [Apple, Banana, Cherry, Date] (Order may vary)
    }
}
