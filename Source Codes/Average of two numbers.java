import java.util.Scanner;
public class average
	{
		public static void main(String[] args)
			{   
				Scanner in=new Scanner (System.in);
				double a, b, avg;
				System.out.print ("\n\t Enter the first number: ");
				a = in.nextDouble();
				System.out.print ("\n\t Enter the second number: ");
				b = in.nextDouble();
				a += b;
				avg = (a)/2.0;
				System.out.println ("\n\t Sum = "+a+"    Average = "+avg);
	}
			}
