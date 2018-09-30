import java.util.Scanner;

class test {
	static Scanner sc = new Scanner(System.in);

	void display() {

		int x;
		x = sc.nextInt();
		System.out.println("The value of x = " + x);

	}

	static void scanner_close() {
		sc.close();
	}

}

class ScannerFIx {
	static void display1() {
		Scanner sc1 = new Scanner(System.in);
		int y;
		y = sc1.nextInt();
		System.out.println("The value of y = " + y);
		sc1.close();
	}

	public static void main(String args[]) {
		test t = new test();
		t.display();
		display1();
		// t.scanner_close();
		test.sc.close();
	}
}
