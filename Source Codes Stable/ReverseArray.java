// Reverse and passing an array

import java.util.Scanner;

public class ReverseArray {
	static int[] Reverse(int[] a) {
		int c = 0;
		int[] b = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			b[c] = a[i];
			c++;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] x = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		int[] y = Reverse(x);
		for (int j = 0; j <= y.length - 1; j++) {
			System.out.print(y[j] + " ");
		}
	}
}