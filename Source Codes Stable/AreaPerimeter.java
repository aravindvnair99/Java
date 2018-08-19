import java.util.Scanner;

public class AreaPerimeter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double len, bre;
		System.out.println("Enter the lenth of the rectangle");
		len = sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle");
		bre = sc.nextDouble();
		System.out.println("Area of the rectangle is = " + ((len * bre)));
		System.out.println("Perimeter of the rectangle is = " + (2 * (len + bre)));
	}
}