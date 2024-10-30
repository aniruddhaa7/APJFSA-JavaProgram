package APJSC9550;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a 3-digit number: ");
	        int num = sc.nextInt();

	        int reversed = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        System.out.println("Reversed Number: " + reversed);


	}

}
//OUTPUT
/*
Enter a 3-digit number: 123
Reversed Number: 321
*/

