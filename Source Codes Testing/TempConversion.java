import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double far, cel;
		System.out.println("Enter the temperature in Farheniet");
		far = sc.nextDouble();
		cel = ((far - 32) * 5) / 9;
		System.out.println("The temperature in Celsius is " + cel);
		sc.close();
	}
}