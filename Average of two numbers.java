import java.util.Scanner;
public class average
	{
		public static void main(String[] args) {   
              Scanner in=new Scanner (System.in);
int a,b,avg;
System.out.print ("\n\t Enter first number = ");
a=in.nextInt();
System.out.print ("\n\t Enter second number = ");
b=in.nextInt();
a+=b;
avg=(a)/2;
if (avg>50)
System.out.println ("\n\t Error ");
else 
System.out.println ("\n\t Sum = "+a+"    Average = "+avg);
		}
	}
