//Check if sum of two numbers is prime or composite

import java.util.Scanner;

public class SumPrimeComposite {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in); // Preparing input function
		double a, b = 2, c = 1, d; // Declaring variables and assigning values
		System.out.print("\n\tEnter first number: "); // Asking user for value of a
		a = in.nextDouble(); // Storing first number as 'a' of data type 'double'
		System.out.print("\n\tEnter second number: "); // Asking user for value of d
		d = in.nextDouble(); // Storing second number as 'b' of data type 'double'
		a += d; // a = a + d (Sum)
		System.out.println("\n\tSum of the numbers = " + a); // Output sum
		while (b <= a / 2) {
			if (a % b == 0) // Check for modulus equal to 0
				c = 0;
			++b;
		}
		if (c == 0) // Check for prime
			System.out.println("\n\tSum of the numbers is NOT a prime number."); // Output not prime
		else
			System.out.println("\n\tSum of the numbers is a Prime number."); // Output prime
		in.close();
	}
}