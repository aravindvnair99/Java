//Reverse an array using stack

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array:");
		n = sc.nextInt();
		Stack<Integer> as = new Stack<Integer>();
		int[] a = new int[n];
		System.out.println("\nEnter the elements of the array:");
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			as.push(a[i]);
		}
		System.out.println("\nArray after reversing:");
		for (int i=0; i<n; i++) {
			System.out.println(a[i] = as.pop());
		}
		sc.close();
	}
}