import java.util.Scanner;

public class PassingArray {
	static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		System.out.println("Enter the array numbers ");
		for (int i = 0; i < 5; i++) {
			n[i] = sc.nextInt();
		}
		display(n);
	}

}
