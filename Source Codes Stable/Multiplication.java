// Addition of two numbers from input

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:\n");
		double n1, n2, mult;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		mult = n1 * n2;
		System.out.println("\nMultiplication = " + mult);
		sc.close();
	}
}