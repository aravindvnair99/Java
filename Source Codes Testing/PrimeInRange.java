import java.util.Scanner;

public class PrimeInRange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0, j;
		System.out.println("Enter lower limit:");
		int ll = sc.nextInt();
		System.out.println("Enter upper limit:");
		int ul = sc.nextInt();
		for( int i=ll;i<=ul;i++){
			count =0;
			for(j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count == 2){
				System.out.println(i);
			}
		}
	}
}
