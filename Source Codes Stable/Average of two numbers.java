import java.util.Scanner;

public class average {
	public static void main(String[] args) {   
		Scanner in=new Scanner (System.in); //Preparing input function
		double a, b, avg; //Declaring variables
		System.out.print("\n\t Enter the first number: "); //Asking user for value of a
		a = in.nextDouble(); //Storing first number as 'a' of data type 'double'
		System.out.println("Enter the second number: "); //Asking user for value of b
		b = in.nextDouble(); //Storing second number as 'b' of data type 'double'
		a += b; //a = a + b (Sum)
		avg = a / 2.0; //Average
		System.out.println ("\n\t Sum = " + a + " Average = "+avg); //Output sum and average
	}
}