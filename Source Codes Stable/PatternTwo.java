/*
Program to print pattern:
*****
***
*
*/
public class PatternTwo {
	public static void main(String args[]) {
		for (int i = 1; i <= 5; i = i + 2) {
			for (int j = 5 - i; j >= 0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}