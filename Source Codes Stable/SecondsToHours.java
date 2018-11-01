import java.util.Scanner;

public class SecondsToHours {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sec, min, hr;
		System.out.println("Enter the time in seconds");
		sec = sc.nextInt();
		hr = sec / 3600;
		sec = sec % 3600;
		min = sec / 60;
		sec = sec % 60;
		System.out.println("The time is " + hr + ":" + min + ":" + sec);
		sc.close();
	}
}
