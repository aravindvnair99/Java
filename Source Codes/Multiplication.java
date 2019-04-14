// Multiplication of two numbers from input

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers:\n");
		double n1, n2;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		System.out.println("\nMultiplication = " + (n1*n2));
		sc.close();
	}
}
