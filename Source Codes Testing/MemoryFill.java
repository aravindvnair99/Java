import java.util.Scanner;

public class MemoryFill {
	public static void main(String[] args) {
		long ini_time, fin_time, time;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		n = in.nextInt();
		in.close();
		ini_time = System.nanoTime();
		double a[] = new double[n];
		for (int i = 0; i < n; i++) {
			 a[i] = 999.999;
			 time = System.nanoTime();
			 System.out.println(time);
			 double b[] = new double[n];
				for (int j = 0; j < n; j++) {
					 b[j] = 999.999;
					 time = System.nanoTime();
					 System.out.println(time);
				}
		}
		fin_time = System.nanoTime();
		time = fin_time - ini_time;
		System.out.println("Execution time is " + time);
	}
}