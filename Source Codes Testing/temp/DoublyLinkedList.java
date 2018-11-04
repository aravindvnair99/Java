import java.util.*;

class dnode {
	int data;
	dnode next, prev;

	dnode(int x) {
		data = x;
		next = prev = null;
	}
}

class dlist {
	dnode head, tail;

	dlist() {
		head = tail = null;
	}

	void insertFirst(int x) {
		dnode temp = new dnode(x);
		if (head == null)
			head = tail = temp;
		else {
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
	}

	void insertLast(int x) {
		dnode temp = new dnode(x);
		if (head == null)
			head = tail = temp;
		else {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
	}

	int deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return -1;
		} else if (head == tail) {
			int x = head.data;
			head = tail = null;
			return x;
		} else {
			int x = head.data;
			head.next.prev = null;
			head = head.next;
			return x;
		}
	}

	int deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return -1;
		} else if (head == tail) {
			int x = head.data;
			head = tail = null;
			return x;
		} else {
			dnode t = head;
			int x = tail.data;
			while (t.next != tail)
				t = t.next;
			t.next = null;
			tail = t;
			return x;
		}
	}

	void insertAfter(int x, int y) {
		dnode temp = new dnode(y);
		dnode t = head;
		while (t != null && t.data != x)
			t = t.next;
		if (head == null)
			System.out.println("List is empty");
		else if (t == tail) {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		} else if (t == null)
			System.out.println("Element not found");
		else {
			temp.next = t.next;
			temp.prev = t;
			t.next.prev = temp;
			t.next = temp;
		}
	}

	void insertBefore(int x, int y) {
		dnode temp = new dnode(y);
		dnode t = head;
		while (t != null && t.data != x)
			t = t.next;
		if (head == null)
			System.out.println("List is empty");
		else if (t == head) {
			temp.next = head;
			head.prev = temp;
			head = temp;
		} else if (t == null)
			System.out.println("Element  not found");
		else {
			temp.next = t;
			t.prev.next = temp;
			temp.prev = t.prev;
			t.prev = temp;
		}
	}

	int deleteAfter(int x) {
		dnode t = head;
		while (t != tail && t.data != x)
			t = t.next;
		if (t == tail) {
			System.out.println("Deletion not possible");
			return -1;
		} else if (t == null) {
			System.out.println("Element not found " + x);
			return -1;
		} else if (t.data == x && t.next.data == tail.data) {
			int k = deleteLast();
			return k;
		} else {
			int k = t.next.data;
			t.next = t.next.next;
			t.next.prev = t;
			return k;
		}
	}

	int deleteBefore(int x) {
		dnode t = head;
		while (t != null && t.data != x)
			t = t.next;
		if (t == head) {
			System.out.println("Deletion not possible ");
			return -1;
		} else if (t == null) {
			System.out.println("Element not found " + x);
			return -1;
		} else {
			int k = t.prev.data;
			t.prev = t.prev.prev;
			t.prev.next = t;
			return k;
		}
	}

	void display() {
		dnode t = head;
		if (head == null)
			System.out.println("List is empty");
		while (t != null) {
			System.out.println(t.data);
			t = t.next;
		}
	}

	void reverse() {
		dnode t = tail;
		if (tail == null)
			System.out.println("List is empty");
		else {
			while (t != null) {
				System.out.println(t.data);
				t = t.prev;
			}
		}
	}

	int size() {
		int count = 0;
		dnode t = head;
		while (t != null) {
			count++;
			t = t.next;
		}
		return count;
	}
}

class DoublyLinkedList {
	public static void main(String args[]) {
		dlist l = new dlist();
		Scanner s = new Scanner(System.in);
		int opt = 0;
		do {
			System.out.println(
					"Enter your choice\n1.InsertFirst\n2.InsertLast\n3.DeleteFirst\n4.DeleteLast\n5.InsertAfter\n6.InsertBefore\n7.DeleteAfter\n8.DeleteBefore\n9.Display\n10.Reverse\n11.Size\n12.Exit");
			opt = s.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter element to InsertFirst");
				int x = s.nextInt();
				l.insertFirst(x);
				break;
			case 2:
				System.out.println("Enter element to InsertLast");
				int y = s.nextInt();
				l.insertLast(y);
				break;
			case 3:
				System.out.println("Deleted First element is " + l.deleteFirst());
				break;
			case 4:
				System.out.println("Deleted Last element is " + l.deleteLast());
				break;
			case 5:
				System.out.println("Enter element value to insert after that element");
				int r = s.nextInt();
				System.out.println("Enter value to insert");
				int t = s.nextInt();
				l.insertAfter(r, t);
				break;
			case 6:
				System.out.println("Enter element value to insert before that element");
				int a = s.nextInt();
				System.out.println("Enter value to insert");
				int b = s.nextInt();
				l.insertBefore(a, b);
				break;
			case 7:
				System.out.println("Enter element value to delete after that element ");
				int c = s.nextInt();
				int u = l.deleteAfter(c);
				System.out.println("Deleted element is " + u);
				break;
			case 8:
				System.out.println("Enter element value to deletebefore that element");
				int d = s.nextInt();
				int v = l.deleteBefore(d);
				System.out.println("Deleted element is " + v);
				break;
			case 9:
				l.display();
				break;
			case 10:
				l.reverse();
				break;
			case 11:
				System.out.println("Size is " + l.size());
				break;
			case 12:
				break;
			}
		} while (opt != 12);
		s.close();
	}
}