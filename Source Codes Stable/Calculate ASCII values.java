import java.util.Scanner;

public class Main {
    public static void main (String arg[])
    throws java.io.IOException {
        int b;
        char a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character:");
        a = (char) System.in.read();
        b = (int) a;
        System.out.println("The ASCII value of " + a + " is = " + b);
    }
}