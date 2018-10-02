// Avoid Scanner closing bugs in Java in this manner by passing it as an object

import java.util.Scanner;

class Operations {
	int n;

	void ask(Scanner sc) {
		System.out.println("Enter number:");
		n = sc.nextInt();
	}
}

public class ScannerFix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operations a = new Operations();
		a.ask(sc);
		Operations b = new Operations();
		b.ask(sc);
		sc.close();
	}
}