import java.util.*;
public class prime
    {
        public static void main (String arg[])
            {
                Scanner in=new Scanner (System.in);
                int a, b=2, c=1, d;
                System.out.print ("\n\t Enter first number = ");
                a = in.nextInt();
                System.out.print ("\n\t Enter second number = ");
                d = in.nextInt();
                a += d;
                System.out.println ("\n\t Sum of the numbers = "+a);
                while (b <= a/2)
                    {
                        if (a%b==0)
                            c = 0;
                            ++b;
                    }
                if (c==0)
                    System.out.println ("\n\t Sum of the numbers is NOT a prime number.");
                else 
                    System.out.println ("\n\t Sum of the numbers is a Prime number.");
            }
    }
