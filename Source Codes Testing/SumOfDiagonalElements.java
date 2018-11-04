import java.util.Scanner;

public class SumOfDiagonalElements {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int r = sc.nextInt();
		System.out.println("Enter the number of columns ");
		int c = sc.nextInt();
		if (r == c) {
			int[][] a = new int[r][c];
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == j) {
						sum = sum + a[i][j];
					}
				}
				System.out.println();
			}
			System.out.println("The sum is " + sum);
		} else {
			System.out.println("Not a sqaure matrix");
		}
	}
}