
/* If divisible by 3 and 5, then insert at front in SLL. Then count and even and odd. Then display*/

import java.util.Scanner;

class node {
	int item;
	node next;

	node(int ele) {
		item = ele;
		next = null;
	}

	node(int ele, node n) {
		item = ele;
		next = n;
	}
}

class list {
	node head, tail;

	list() {
		head = tail = null;
	}

	boolean isEmpty() {
		return (head == null);
	}

	void addFront(int ele) {
		if (isEmpty()) {
			head = new node(ele);
		} else {
			head = new node(ele, head);
		}
	}

	void display() {
		if (isEmpty())
			System.out.println("The list is empty.");
		else {
			node temp = head;
			do {
				System.out.println(temp.item);
				temp = temp.next;
			} while (temp != null);
		}
	}

	void count() {
		int even = 0, odd = 0;
		if (!isEmpty()) {
			node temp = head;
			do {
				if (temp.item % 2 == 0)
					even++;
				else
					odd++;
				temp = temp.next;
			} while (temp != null);
		} else
			System.out.println("List is empty.");
		System.out.println("Number of even: " + even);
		System.out.println("Number of odd: " + odd);
	}
}

public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		list l = new list();
		System.out.println("Enter the number of element:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element:");
			int t = sc.nextInt();
			if ((t % 3 == 0) && (t % 5 == 0)) {
				l.addFront(t);
			}
		}
		l.count();
		System.out.println("The list is:");
		l.display();
		sc.close();
	}
}