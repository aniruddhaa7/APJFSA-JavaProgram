package APJSC9550;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Add 10 elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        // Display the stack
        System.out.println("Stack after adding 10 elements: " + stack);
        // Output: Stack after adding 10 elements: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // Remove 4 elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        // Display the stack after removal
        System.out.println("Stack after removing 4 elements: " + stack);
        // Output: Stack after removing 4 elements: [1, 2, 3, 4, 5, 6]
    }
}
