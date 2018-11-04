//Infix to Postfix expression converter

import java.util.Scanner;

class Stack {
	private int maxSize;
	private char[] S;
	private int top; // points the current top of the stack

	public Stack() {
		maxSize = 10;
		S = new char[maxSize];
		top = -1;
	}

	public void push(char j) {
		if (isFull())
			System.out.println("Stack is full");
		else
			S[++top] = j;
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return '0';
		} else
			return S[top--];
	}

	public char topelement() {
		if (!isEmpty())
			return S[top];
		else
			return '0';
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}
}

public class InfixToPostfix {
	// A utility function to check if the given character is operand
	static boolean isOperand(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}

	// A utility function to return precedence of a given operator
	// Higher returned value means higher precedence
	static int Prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		}
		return -1;
	}

	// The main function that converts given infix expression
	// to postfix expression.
	static void infixToPostfix(String exp) {
		int i;

		// Create a stack of capacity
		Stack St = new Stack();

		for (i = 0; i < exp.length(); ++i) {

			// If the scanned character is an operand, add it to output.
			if (isOperand(exp.charAt(i)))
				System.out.print(exp.charAt(i));

			// If the scanned character is an ‘(‘, push it to the stack.
			else if (exp.charAt(i) == '(')
				St.push(exp.charAt(i));

			// If the scanned character is an ‘)’, pop and output from the stack
			// until an ‘(‘ is encountered.
			else if (exp.charAt(i) == ')') {
				while (!St.isEmpty() && St.topelement() != '(')
					System.out.print(St.pop());
				St.pop();
			} else // an operator is encountered
			{
				char f = St.topelement();
				char f2 = exp.charAt(i);
				while (!St.isEmpty() && (Prec(f2) <= Prec(f)))
					System.out.print(St.pop());
				St.push(exp.charAt(i));
			}
		}
		// pop all the operators from the stack
		while (!St.isEmpty())
			System.out.print(St.pop());
	}

	// Driver program to test above functions
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the infix expression:");
		infixToPostfix(sc.nextLine());
		sc.close();
	}
}