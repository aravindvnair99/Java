import java.util.*;

public class Main {
	public static void main(String[] args) {
		List as = new List();
		int opt = 0;
		Scanner aw = new Scanner(System.in);
		do {
			System.out.println("1-addfirst,2-addlast,3-removefirst,4-removelast,5-display,");
			System.out.println("6-ins_aft_ele,7-ele_to_del,8-ins_aft_pos");
			System.out.println("9-ins_bfr_ele,10-del_at_pos,11-ins_aft_pos,12-exit");
			opt = aw.nextInt();
			switch (opt) {
			case 1:
				System.out.println("enter the element to insert at first other than 0");
				int data = aw.nextInt();
				as.insertFirst(data);
				break;
			case 2:
				System.out.println("enter the element to insert at last other than 0");
				int data1 = aw.nextInt();
				as.insertLast(data1);
				break;
			case 3:
				int temp;
				temp = as.removeFirst();
				if (temp != 0)
					System.out.println("the element removed from first is" + temp);
				break;
			case 4:
				int temp1;
				temp1 = as.removeLast();
				if (temp1 != 0)
					System.out.println("the element removed from last is " + temp1);
				break;
			case 5:
				as.display();
				break;
			case 6:
				System.out.println("Enter an element after which to be inserted");
				System.out.println("Enter the element to be inserted");
				as.insertAfter(aw.nextInt(), aw.nextInt());
				break;
			case 7:
				System.out.println("Enter the element to be deleted");
				as.delete(aw.nextInt());
				break;
			case 8:
				System.out.println("Enter an element to be inserted");
				System.out.println("Enter the position(only positive) after which to be inserted ");
				as.insAft(aw.nextInt(), aw.nextInt());
				break;
			case 9:
				System.out.println("Enter an element to be inserted");
				System.out.println("Enter an element before which to be inserted");
				as.insertBefore(aw.nextInt(), aw.nextInt());
				break;
			case 10:
				System.out.println("Enter the pos at which element should delete");
				int x = as.delpos(aw.nextInt());
				if (x != 0)
					System.out.println("element deleted is :" + x);
				break;
			case 11:
				break;
			case 12:
				break;
			default:
				System.out.println("Invalid Entry ");
			}
		} while (opt != 12);
		aw.close();
	}
}

class Node {
	int info;
	Node next;
	Node prev;

	Node(Node s, int item, Node n) {
		prev = s;
		info = item;
		next = n;
	}

	Node() {
	}
}

class List {
	Node head, tail;

	List() {
		head = tail = null;
	}

	void insertFirst(int x) {
		if (head == null)
			head = tail = new Node(null, x, null);
		else
			head = new Node(null, x, head);
	}

	void insertLast(int x) {
		if (head == null)
			head = tail = new Node(null, x, null);
		else {
			Node p = new Node(tail, x, null);
			tail.next = p;
			;
			tail = p;
		}
	}

	int removeFirst() {
		if (head == null) {
			System.out.println("empty");
			return 0;
		} else if (head == tail) {
			int x = head.info;
			head = tail = null;
			return x;
		} else {
			int x = head.info;
			head = head.next;
			head.prev = null;
			return x;
		}
	}

	int removeLast() {
		if (head == null) {
			System.out.println("empty");
			return 0;
		} else if (head == tail) {
			int x = head.info;
			head = tail = null;
			return x;
		} else {
			int x = tail.info;
			Node p = tail.prev;
			tail.prev = null;
			tail = p;
			tail.next = null;
			return x;
		}
	}

	void display() {
		for (Node temp = head; temp != null; temp = temp.next)
			System.out.println(temp.info);
	}

	void insertAfter(int x, int a) {
		Node temp;
		if (head == null)
			System.out.println("list is empty");
		else {
			for (temp = head; temp.info != x; temp = temp.next)
				;
			if (temp == tail) {
				Node p = new Node(tail, a, null);
				tail.next = p;
				tail = p;
			} else {
				Node p = new Node(temp, a, temp.next);
				temp.next = p;
				temp.next.prev = p;
			}
		}
	}

	void insAft(int x, int pos) {
		int i = 2;
		Node temp = head.next;
		if (pos == 1) {
			Node p = new Node(head, x, head.next);
			head.next = p;
		} else {
			while (temp != null) {
				if (i == pos) {
					Node p = new Node(temp, x, temp.next);
					temp.next = p;
					return;
				} else {
					temp = temp.next;
					i++;
				}
			}
		}
	}

	void insBfr(int x, int pos) {
		int i = 2;
		Node temp = head.next;
		if (pos == 1) {
			Node p = new Node(null, x, head);
			head.prev = p;
			head = p;
		} else {
			while (temp != null) {
				if (i == pos) {
					Node p = new Node(temp.prev, x, temp);
					temp.prev = p;
					return;
				} else {
					temp = temp.next;
					i++;
				}
			}
		}
	}

	void insertBefore(int x, int a) {
		Node temp;
		if (head == null)
			System.out.println("empty");
		else {
			for (temp = head; temp.info != x; temp = temp.next)
				;
			if (temp == head) {
				Node p = new Node(null, a, head);
				head.prev = p;
				head = p;
			} else {
				Node p = new Node(temp.prev, a, temp);
				temp.prev.next = p;
				temp.prev = p;
			}
		}
	}

	void delete(int x) {
		Node temp;
		if (head == null)
			System.out.println("empty");
		else if (head.info == x) {
			head.next.prev = null;
			head = head.next;
		} else if (tail.info == x) {
			tail.prev.next = null;
			tail = tail.prev;
		} else {
			for (temp = head.next; temp != null && temp.info != x; temp = temp.next)
				;
			if (temp == null)
				System.out.println("element not found");
			else {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
			}
		}
	}

	int delpos(int pos) {
		if (head == null) {
			System.out.println("empty");
			return 0;
		} else if (pos == 1) {
			int x = head.info;
			head = head.next;
			head.prev = null;
			return x;
		} else {
			Node temp = head.next;
			int i = 2;
			while (temp.next != null) {
				if (i == pos) {
					int x = temp.info;
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
					return x;
				} else {
					temp = temp.next;
					i++;
				}
			}
			if (temp == tail && i == pos) {
				int x = tail.info;
				tail.prev.next = null;
				tail = temp;
				return x;
			}
		}
		return 0;
	}
}