import java.util.Scanner;
public class prime
    {
        public static void main (String arg[])
            {
                Scanner in=new Scanner (System.in); //Preparing input function
                double a, b=2, c=1; //Declaring variables and assigning values
                System.out.print ("\n\t Enter the number: "); //Asking user for the number
                a = in.nextDouble(); //Storing number as 'a' of data type 'double'
                if (a==0 || a==1)
                    System.out.println ("\n\t Neither prime nor composite."); //For 0 and 1
                else
                    {
                        while (b <= a/2)
                            {
                                if (a%b==0) //Check for modulus equal to 0
                                    c = 0;
                                ++b;
                            }
                        if (c==0) //Check for prime
                            System.out.println ("\n\t Is a composite number."); //Output not prime
                        else 
                            System.out.println ("\n\t Is a Prime number."); //Output prime
                    }
            }
    }
