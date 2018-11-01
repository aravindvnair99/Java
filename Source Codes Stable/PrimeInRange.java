import java.util.Scanner;

public class PrimeInRange {
	static void check(int l, int u) {
		int count = 0, prime = 0;
		for (int i = l; i <= u; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count != 2) {
				count = 0;
				continue;
			} else {
				count = 0;
				System.out.println(i);
				prime++;
			}
		}
		System.out.println("The number of primes are: " + prime);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower range:");
		int l = sc.nextInt();
		System.out.println("Enter the upper range:");
		int u = sc.nextInt();
		System.out.println("The primes are:");
		check(l, u);
		sc.close();
	}
}
