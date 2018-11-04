import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int r1 = sc.nextInt();
		System.out.println("Enter the number of columns ");
		int c1 = sc.nextInt();
		System.out.println("Enter the number of rows ");
		int r2 = sc.nextInt();
		System.out.println("Enter the number of columns ");
		int c2 = sc.nextInt();
		if (r1 == r2 && c1 == c2) {
			int[][] a = new int[r1][c1];
			int[][] b = new int[r2][c2];
			int[][] sum = new int[r2][c2];
			System.out.println("Enter elements of matrix one ");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter elements of matrix two ");
			for (int i = 0; i < r2; i++) {
				for (int j = 0; j < c2; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					sum[i][j] = a[i][j] + b[i][j];
				}
			}
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					System.out.print(sum[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Not a compatible matrix");
		}
		sc.close();
	}
}