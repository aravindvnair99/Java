import java.util.*;
public class prime
	{
		public static void main (String arg[])
			{
				Scanner in=new Scanner (System.in); //Preparing input function
				double a, b=2, c=1, d; //Declaring variables and assigning values
				System.out.print ("\n\t Enter first number: "); //Asking user for value of a
				a = in.nextDouble(); //Storing first number as 'a' of data type 'double'
				System.out.print ("\n\t Enter second number: "); //Asking user for value of d
				d = in.nextDouble(); //Storing second number as 'b' of data type 'double'
				a += d; //a = a + d (Sum)
				System.out.println ("\n\t Sum of the numbers = "+a); //Output sum
				while (b <= a/2)
					{
						if (a%b==0) //Check for modulus equal to 0
							c = 0;
							++b;
					}
				if (c==0) //Check for prime
					System.out.println ("\n\t Sum of the numbers is NOT a prime number."); //Output not prime
				else 
					System.out.println ("\n\t Sum of the numbers is a Prime number."); //Output prime
			}
	}
