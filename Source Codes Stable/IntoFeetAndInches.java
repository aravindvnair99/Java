import java.util.Scanner;

public class IntoFeetAndInches {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int inch, feet;
		System.out.println("Enter the size in inches");
		inch = sc.nextInt();
		feet = inch / 12;
		inch = inch % 12;
		System.out.println(feet + " Feet and " + inch + " inches");
	}
}
