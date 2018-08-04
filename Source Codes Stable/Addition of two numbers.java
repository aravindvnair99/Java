import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:\n");
		double n1, n2, sum;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		sum = n1 + n2;
		System.out.println("\nSum = " + sum);
		sc.close();
	}
}