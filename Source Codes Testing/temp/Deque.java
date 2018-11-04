import java.util.*;

class deq {
	int maxsize;
	int q[];
	int f, r;

	public deq(int size) {
		maxsize = size;
		f = r = -1;
		q = new int[maxsize];
	}

	public boolean isFull() {
		if (f == 0)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (f == -1)
			return true;
		else
			return false;
	}

	void addFirst(int x) {
		if (isFull())
			System.out.println("Overflow");
		else if (f == -1) {
			f++;
			r++;
			q[f] = x;
		} else {
			f--;
			q[f] = x;
		}
	}

	void addLast(int x) {
		if (r == maxsize - 1)
			System.out.println("Overflow");
		else if (r == -1) {
			r++;
			f++;
			q[r] = x;
		} else {
			r++;
			q[r] = x;
		}
	}

	int deleteFirst() {
		if (isEmpty()) {
			System.out.println("Underflow");
			return -1;
		} else if (f == r) {
			int x = q[f];
			f = r = -1;
			return x;
		} else {
			int x = q[f];
			f++;
			return x;
		}
	}

	int deleteLast() {
		if (isEmpty()) {
			System.out.println("Underflow");
			return -1;
		} else if (f == r) {
			int x = q[r];
			f = r = -1;
			return x;
		} else {
			int x = q[r];
			r--;
			return x;
		}
	}

	void display() {
		for (int i = f; i <= r; i++) {
			System.out.println(q[i]);
		}
	}

	int size() {
		return r - f + 1;
	}
}

class Deque {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter deque size");
		int size = s.nextInt();
		deq d = new deq(size);
		int opt = 0;
		do {
			System.out.println("1.AddFirst");
			System.out.println("2.AddLast");
			System.out.println("3.DeleteFirst");
			System.out.println("4.DeleteLast");
			System.out.println("5.Display");
			System.out.println("6.Size");
			System.out.println("7.Exit");
			opt = s.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter element to add first");
				int data = s.nextInt();
				d.addFirst(data);
				break;
			case 2:
				System.out.println("Enter element to add last");
				int ele = s.nextInt();
				d.addLast(ele);
				break;
			case 3:
				System.out.println("Deleted first element is " + d.deleteFirst());
				break;
			case 4:
				System.out.println("Deleted lasst element is " + d.deleteLast());
				break;
			case 5:
				System.out.println("Elements are ");
				d.display();
				break;
			case 6:
				System.out.println("Size is " + d.size());
				break;
			case 7:
				break;
			default:
				System.out.println("Enter again");
				break;
			}
		} while (opt != 7);
		s.close();
	}
}