/*
Program to print pattern:
*****
****
***
**
*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

public class PatternOne {
	public static void main(String args[]) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j >= 0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}