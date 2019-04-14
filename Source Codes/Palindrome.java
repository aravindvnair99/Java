import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		while (num != 0) {
			int rem = num % 10;
			ans = (ans * 10) + rem;
			num = num / 10;
		}
		if (temp == ans) {
			System.out.println(temp + " is a palindrome numebr");
		} else {
			System.out.println(temp + " is not a palindrome numebr");
		}
		sc.close();
	}
}