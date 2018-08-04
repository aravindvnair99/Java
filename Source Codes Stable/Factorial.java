import java.util.Scanner;

public class Factorial {
	public static void main (String arg[]) {
	Scanner in = new Scanner (System.in); //Preparing input function
	int a, b=1, c; //Declaring variables
	System.out.print ("\n\t Enter the number: "); //Asking user for value of a
	a=in.nextInt(); //Storing first number as 'a' of data type 'int'
	c=a;
	if(a<2)
		System.out.println ("\n\t Factorial of " +a +" is 1."); //For 0 and 1
	else {
		do {
			b*=a;
			--a;
		} while (a>0); //Do-while loop for factorial of numbers other than 0 and 1
		System.out.println ("\n\t Factorial of " +c +" is "+b); //Output factorial
		}
	}
}