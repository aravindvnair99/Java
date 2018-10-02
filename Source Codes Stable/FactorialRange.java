// Factorial of numbers within a range using separate objects

import java.util.Scanner;

class Fact {
	int ans;

	public int factorial(int num) {
		ans = 1;
		for (int i = 1; i <= num; i++) {
			ans = ans * i;
		}
		return ans;
	}
}

public class FactorialRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower range");
		int ll = sc.nextInt();
		Fact f = new Fact();
		System.out.println("Enter the upper range");
		int ul = sc.nextInt();
		for (int i = ll; i <= ul; i++) {
			int pr = f.factorial(i);
			System.out.println("The factorial of " + i + " is " + pr);
		}
	}
}