import java.util.*;

class LNode {
	public int info; // Stores the data
	public LNode next; // Link pointer to the next node in the list

	public LNode(int item) {
		info = item;
		next = null;
	}

	public LNode(int item, LNode n) {
		info = item;
		next = n;
	}
}

class SList {
	public LNode head, tail; // pointer to head and tail nodes

	public SList() {
		head = tail = null; // empty list has null values for head and tail
	}

	public boolean isEmpty() { // returns true if list is empty{
		return (head == null); // head is null in an empty list
	}

	public void insertFront(int el) {
		head = new LNode(el, head); // Create a new element which points to
		// current head of list
		if (tail == null) // if list was empty tail before the operation.
			tail = head;
	}

	public void insertLast(int el) {
		if (!isEmpty()) {
			tail.next = new LNode(el);
			tail = tail.next;
		} else // when list is empty and you are calling insertLast method
			head = tail = new LNode(el);
	}

	public int deleteFront() {
		int el = head.info;
		if (head == tail) // if only one element was there
			head = tail = null;
		else
			head = head.next;
		return el;
	}

	public int deleteLast() {
		int el = tail.info;
		if (head == tail)
			head = tail = null; // if only one element was there
		else {
			LNode temp;
			for (temp = head; temp.next != tail; temp = temp.next)
				; // find "last but one" node
			tail = temp;
			tail.next = null;
		}
		return el;
	}

	public void deleteAt(int pos) {
		if (isEmpty())
			return;
		LNode temp = head;
		// If head needs to be removed
		if (pos == 0) {
			head = temp.next; // Change head
			return;
		}

		// Find previous node of the node to be deleted
		for (int i = 0; temp != null && i < pos - 1; i++)
			temp = temp.next;

		// If position is more than number of nodes
		if (temp == null || temp.next == null)
			return;

		// Node temp->next is the node to be deleted
		// Store pointer to the next of node to be deleted
		LNode next = temp.next.next;
		temp.next = next; // Unlink the deleted node from list
		System.out.println("Removed element " + temp.info + " from position " + pos);
	}

	public void displayAllAndSum() {
		LNode temp;
		int sum = 0;
		if (isEmpty())
			System.out.println("List is empty");
		else {
			for (temp = head; temp != null; temp = temp.next) {
				sum = sum + temp.info;
				System.out.print(temp.info + " ");
			}
			System.out.println("\n" + "Sum=" + sum);
		}
	}

	public void displayAlternate() {
		LNode temp;
		if (isEmpty())
			System.out.println("List is empty");
		else {
			for (temp = head; temp != null; temp = temp.next.next) {
				System.out.print(temp.info + " ");
				if (temp == tail)
					break;
			}
		}
	}

	public void delete(int el) { // delete the node with an element el
		if (!isEmpty()) {
			if (head == tail && el == head.info) // if only one node on the
				// list
				head = tail = null;
			else if (el == head.info) // if more than one node on the list and
				// el is in the head node
				head = head.next;

			else {
				// if more than one node in the list
				LNode pred, temp; // and el is in a non-head node
				pred = head;
				for (temp = head.next; temp != null && temp.info != el; pred = pred.next, temp = temp.next)
					;
				if (temp != null) {
					// if el was found;
					pred.next = temp.next;
					if (temp == tail) // if el is in the last node
						tail = pred;
				}
			}
		}
	}

	public void insertAfter(int el, int newel) {
		if (!isEmpty()) {
			LNode temp; // and el is in a non-head node
			temp = head;
			for (temp = head; temp != null && temp.info != el; temp = temp.next)
				;
			if (temp == null)
				System.out.println("Element " + el + " not in list");
			else {
				// if el was found
				temp.next = new LNode(newel, temp.next);
				if (tail == temp)
					tail = temp.next;
			}
		}
	}
}

public class LinkedList {
	public static void main(String[] args) {
		SList ll = new SList();
		int option;
		int elem;
		Scanner kbd = new Scanner(System.in);
		do {
			System.out.println("Enter option:" + "\n\n1 Insert front\t2 Insert last\t3 Insert After"
					+ "\n\n4 Delete front\t5 Delete last\t6 Delete element\t9 Delete At"
					+ "\n\n7 Display all and sum\t8 Display alternate" + "\n\n0 Exit");
			option = kbd.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter element:");
				elem = kbd.nextInt();
				ll.insertFront(elem);
				break;
			case 2:
				System.out.println("Enter element:");
				elem = kbd.nextInt();
				ll.insertLast(elem);
				break;
			case 3:
				System.out.println("Enter an element after which to be inserted:");
				int a = kbd.nextInt();
				System.out.println("Enter the element to be inserted");
				int b = kbd.nextInt();
				ll.insertAfter(a, b);
				break;
			case 4:
				if (ll.isEmpty())
					System.out.println("Error: Empty List");
				else {
					elem = ll.deleteFront();
					System.out.println("Removed element " + elem + " from front");
				}
				break;
			case 5:
				if (ll.isEmpty())
					System.out.println("Error: Empty List");
				else {
					elem = ll.deleteLast();
					System.out.println("Removed element " + elem + " from rear");
				}
				break;
			case 6:
				System.out.println("Enter the element to be deleted");
				ll.delete(kbd.nextInt());
				break;
			case 7:
				ll.displayAllAndSum();
				break;
			case 8:
				ll.displayAlternate();
				break;
			case 9:
				if (ll.isEmpty())
					System.out.println("Error: Empty List");
				else {
					ll.deleteAt(kbd.nextInt());
				}
				break;
			case 0:
				kbd.close();
				break;
			default:
				System.out.println("Error: Invalid entry.");
			}
		} while (option != 0);
	}
}