import java.util.Scanner;

class stack {
	int top = -1;
	char s[];
	int n;

	stack() {
		s = new char[20];
		n = 20;
	}

	void push(char e) {
		if (top == n - 1)
			System.out.println("Full");
		else
			s[++top] = e;
	}

	char pop() {
		if (top != -1)
			return (s[top--]);
		else
			return '0';
	}
}

public class Main {
	public static void main(String[] args) {
		stack st = new stack();
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] str1 = str.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] == '#')
				str1[i] = 's';
			st.push(str1[i]);
		}
		for (int i = 0; i < str1.length; i++)
			System.out.print(st.pop());
		sc.close();
	}
}