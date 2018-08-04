import java.util.Scanner;

public class PrimeComposite {
	public static void main (String arg[]) {
		Scanner in = new Scanner (System.in);
		double a, b = 2, c = 1;
		System.out.println("Enter the number:");
		a = in.nextDouble();
		if (a==0 || a==1)
			System.out.println("Neither prime nor composite.");
		else {
			while (b <= a/2) {
				if (a%b==0)
					c = 0;
				++b;
			}
			if (c==0)
				System.out.println("Is a composite number.");
			else 
				System.out.println("Is a Prime number.");
		}
	}
}