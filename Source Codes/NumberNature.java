import java.util.Scanner;

public class NumberNature {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println(num + " is positive");
		} else if (num == 0) {
			System.out.println(num + " is zero");
		} else {
			System.out.println(num + " is negative");
		}
		sc.close();
	}
}