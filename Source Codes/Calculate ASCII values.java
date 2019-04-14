// Calculate ASCII value of character

public class Main {
	public static void main(String arg[]) throws java.io.IOException {
		int b;
		char a;
		System.out.println("Enter a character:");
		a = (char) System.in.read();
		b = (int) a;
		System.out.println("The ASCII value of " + a + " is = " + b);
	}
}