package APJSC9550;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int reverse = 0;

        // Reversing the number
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        // Checking if the original number is equal to the reversed number
        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}

/*
 * OUTPUT:
 * Enter a number to check if it's a palindrome: 121
 * 121 is a palindrome.
 * 
 * Enter a number to check if it's a palindrome: 123
 * 123 is not a palindrome.
 */
