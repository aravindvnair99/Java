// Average of two numbers

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b;
		System.out.println("Enter the first number:");
		a = in.nextDouble();
		System.out.println("Enter the second number:");
		b = in.nextDouble();
		a += b;
		System.out.println("Sum = " + a + " Average = " + (a / 2.0));
		in.close();
	}
}