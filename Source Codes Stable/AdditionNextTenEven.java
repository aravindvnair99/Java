import java.util.Scanner;

public class AdditionNextTenEven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
		    if (num % 2 == 0)
		        sum += num;
		  num++;
		}
		System.out.print("Sum of next 10 even numbers are: " + sum);
		sc.close();
	}
}