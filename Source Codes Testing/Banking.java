import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		System.out.println("press 1 to create a account");
		System.out.println("press 2 to with draw amount from account");
		int option;
		Scanner obj = new Scanner(System.in);
		option = obj.nextInt();
		Bank st = new Bank();
		if (option == 1)
			st.create();
		else if (option == 2) {
			st.withdraw();
		}
	}
}

class Bank {
	public static long a_num;
	public static long balance;
	public static String name;
	public static long withdraw;
	public static long fine;
	public static long atm;
	public static long draw = 0;

	public static void create() {
		System.out.println("enter the name of the customer");
		Scanner obj1 = new Scanner(System.in);
		name = obj1.next();
		System.out.println("enter the balance to store in the account");
		balance = obj1.nextLong();
		System.out.println("the new account number of the customer is 123456789");
	}

	public static long withdraw() {
		System.out.println("enter the amount to with draw  from your account");
		Scanner ob = new Scanner(System.in);
		withdraw = ob.nextLong();
		Bank as = new Bank();
		draw++;
		fine = as.bankFine();
		atm = as.atm();
		withdraw = balance - (withdraw + fine + atm);
		return 0;
	}

	private static long bankFine() {
		long fine = 100;
		return fine;
	}

	private static long atm() {
		Bank aq = new Bank();
		long atm = 200;
		if (aq.draw < 4)
			return 0;
		else
			return (aq.draw - 4) * atm;
	}
}
