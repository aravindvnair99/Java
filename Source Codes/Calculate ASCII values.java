import java.util.*;
public class ascii
    {
        public static void main (String arg[])
        throws java.io.IOException
            {
                int b; //Declaration for storing ASCII number
                char a; //Declaration for storing user input
                Scanner in=new Scanner (System.in); //Preparing input function
                System.out.print ("\n\t Enter a character = "); //Asking user for value of a
                a=(char) System.in.read(); //Live read value entered by user
                b=(int)a; //Convert from char to int data type
                System.out.println ("\n\t The ASCII value of "+a+" is = "+b); //Output ASCII value
            }
    }
