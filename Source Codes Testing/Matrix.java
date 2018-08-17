import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    int r1, c1, r2, c2;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of rows for 1st matrix");
	    r1 = sc.nextInt();
	    System.out.println("Enter the number of columns for 1st matrix");
	    c1 = sc.nextInt();
	    int[][] a = new int[r1][c1];
	    System.out.println("Enter the elements of 1st matrix:");
    	for (int i=0; i<r1; i++) {
    		for (int j=0; j<c1; j++) {
    			a[i][j] = sc.nextInt();
    		}
    	}
	    System.out.println("Enter the number of rows for 2nd matrix");
	    r2 = sc.nextInt();
	    System.out.println("Enter the number of columns for 2nd matrix");
	    c2 = sc.nextInt();
    	int[][] b = new int[r2][c2];
    	System.out.println("Enter the elements of 2nd matrix:");
    	for (int i=0; i<r2; i++) {
    		for (int j=0; j<c2; j++) {
    			a[i][j] = sc.nextInt();
    		}
    	}
		int[][] c = new int[r1][c1];
		if (r1==r2 && c1==c2) {
    		for (int i=0; i<r1; i++) {
    			for(int j=0;j<c1;j++) {
    				c[i][j]=a[i][j]+b[i][j];
    			}
    		}
		    System.out.println("The addition of the matrices are \n");
    		for (int i=0; i<r1; i++) {
    			for (int j=0; j<c1; j++) {
    				System.out.println(c[i][j] + "\t");
    			}
    			System.out.println("\n");
    		}
    	}
    	else {
    		System.out.println("Dimensions are wrong! \n");
    	}
		int[][] d = new int[r1][c1];
		if (r1==r2 && c1==c2) {
			for (int i=0; i<r1; i++) {
				for (int j=0; j<c1; j++) {
					d[i][j] = a[i][j] - b[i][j];
				}
			}
			System.out.println("\nThe subtraction of the matrices are \n");
			for (int i=0; i<r1; i++) {
				for(int j=0; j<c1; j++) {
					System.out.println(d[i][j] + "\t");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Dimensions are wrong!\n");
		}
		int[][] m = new int[r1][c2];
		if (c1==r2) {
			for (int i=0; i<r1; i++) {
				for (int j=0; j<c2; j++) {
					for (int k=0; k<c1; k++) {
						m[i][j] = 0;
						m[i][j] = m[i][j] + (a[i][k] * b[k][j]);
					}
				}
			}
			System.out.println("The multiplication of the matrices are");
			for (int i=0; i<r1; i++) {
				for (int j=0; j<c2; j++) {
					System.out.println(m[i][j] + "\t");
				}
				System.out.println("\n");
			}
		}
		else {
			System.out.println("Matrix multiplication is not possible\n");
		}
		int[][] at = new int[r1][c1];
		if (r1==c1) {
			for (int i=0; i<r1; i++) {
				for (int j=0; j<c1; j++) {
					at[j][i] = a[i][j];
				}
			}
			System.out.println("The transpose of A is");
			for (int i=0; i<r1; i++) {
				for (int j=0; j<c1; j++) {
					System.out.println(at[i][j] + "\t");
				}
				System.out.println("\n");
			}
		}
		else {
			System.out.println("The transpose of A is not possible");
		}
		int[][] bt = new int[r2][c2];
		if (r2==c2) {
			for (int i=0; i<r2; i++) {
				for (int j=0; j<c2; j++) {
					bt[j][i] = b[i][j];
				}
			}
			System.out.println("The transpose of B is \n");
			for (int i=0; i<r2; i++) {
				for (int j=0; j<c2; j++) {
					System.out.println(bt[i][j] + "\t");
				}
				System.out.println("\n");
			}
		}
		else {
			System.out.println("The transpose of B is not possible.\n");
		}
	}
}