import java.util.Scanner;
public class FirstTen {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0,num =0, count = 0;
		while(count!=10){
			num = sc.nextInt();
			if(num%2 == 0){
				sum = sum + num;
				count++;
			}
			
		}
		System.out.println("Sum is : "+sum);
		sc.close();
	}

}
