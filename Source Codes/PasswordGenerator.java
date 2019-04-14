// Generate random password of given length

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the password you require:\n");
		System.out.println(generatePswd(sc.nextInt()));
		sc.close();
	}

	static char[] generatePswd(int len) {
		System.out.println("\nYour password is:\n");
		String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String symbols = "!@#$%^&*_=+-/€.?<>)";
		String passSymbols = charsCaps + chars + nums + symbols;
		Random rnd = new Random();
		char[] password = new char[len];
		int index = 0;
		for (int i = 0; i < len; i++) {
			password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
		}
		return password;
	}
}
