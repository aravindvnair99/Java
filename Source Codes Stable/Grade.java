// Print grade based on marks

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		System.out.println("Enter your mark:");
		Scanner sc = new Scanner(System.in);
		float mark = sc.nextFloat();
		if (mark >= 80 && mark <= 100)
			System.out.println("Honors");
		else if (mark >= 60 && mark <= 79)
			System.out.println("First");
		else if (mark >= 50 && mark <= 59)
			System.out.println("Second");
		else if (mark >= 40 && mark <= 49)
			System.out.println("Third");
		else if (mark >= 0 && mark <= 39)
			System.out.println("Fail");
		else
			System.out.println("Invalid marks");
		sc.close();
	}
}
