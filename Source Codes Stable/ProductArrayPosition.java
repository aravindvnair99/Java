// Product of elements in odd and even positions.

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int odd, even;
		odd = even = 1;
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the number: ");
			a[i] = sc.nextInt();
			if (i % 2 == 0)
				even *= a[i];
			else
				odd *= a[i];
		}
		System.out.println("Odd position products are: " + odd + " and even position products are: " + even);
		sc.close();
	}
}