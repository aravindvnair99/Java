package abhishek;
import java.util.Scanner;
public class ReverseArray {
	static int[] Reverse(int[] a){
		int c =0;
		int[] b = new int[a.length];
		for(int i = a.length-1; i>=0;i--){
				b[c] = a[i];
				c++;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		System.out.println("Enter the array numbers ");
		for(int i =0;i<5;i++){
			n[i] = sc.nextInt();
		}
		int[] y = Reverse(n);
		for(int j = 0; j<=y.length-1;j++){
			System.out.print(y[j]+" ");
		}
	}

}
