import java.util.Scanner;
public class Grade {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of the student:");
		int marks = sc.nextInt();
		if(marks>=80 && marks<=100){
			System.out.println("Grade is: Honours");
		}
		else if(marks>=60 && marks<=79){
			System.out.println("Grade is: First");
		}
		else if(marks>=50 && marks<=59){
			System.out.println("Grade is: Second");
		}
		else if(marks>=40 && marks<=49){
			System.out.println("Grade is: Third");
		}
		else if(marks>=0 && marks<=39){
			System.out.println("Grade is: Fail");
		}
		else{
			System.out.println("Enter appropraite marks");
		}
	}

}
