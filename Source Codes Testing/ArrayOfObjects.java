import java.util.Scanner;

class Donor {
	String blood_group, name;
	void save(Scanner sc) {
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the blood group:");
		blood_group = sc.next();
	}
	void print() {
		System.out.println("Name is " + name + " and blood group is " + blood_group + ".");
	}
}
public class ArrayOfObjects {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of donors: ");
		int n = sc.nextInt();
		Donor[] d = new Donor[n];
		for (int i = 0; i < n; i++) {
			d[i] = new Donor();
			d[i].save(sc);
		}
		for (int i = 0; i < n; i++) {
			if (d[i].blood_group .equals("B+")) {
				System.out.println("Donor ID is " + i);
				d[i].print();
			}
			else
				continue;
		}
		sc.close();
	}
}