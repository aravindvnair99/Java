// Passing array as objects

import java.util.Scanner;

public class PassingArray {
	static void display(int[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		display(a);
	}
}