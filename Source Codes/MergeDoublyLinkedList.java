class Node {
	int data;
	Node next, prev;

	Node(Node p, int d, Node n) {
		data = d;
		next = n;
		prev = p;
	}
}

class DLL {
	Node head, tail;

	void insertLast(int x) {
		Node temp = new Node(null, x, null);
		if (head == null)
			head = tail = temp;
		else {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	Node merge(Node headA, Node headB) {
		Node dummyNode = new Node(null, 0, null);
		Node tail = dummyNode;
		while (true) {
			if (headA == null) {
				tail.next = headB;
				break;
			}
			if (headB == null) {
				tail.next = headA;
				break;
			}
			tail.next = headA;
			headA = headA.next;
			tail = tail.next;
			tail.next = headB;
			headB = headB.next;
			tail = tail.next;
		}
		return dummyNode.next;
	}
}

public class MergeDoublyLinkedList {
	public static void main(String args[]) {
		DLL llist1 = new DLL();
		DLL llist2 = new DLL();
		llist1.insertLast(5);
		llist1.insertLast(10);
		llist1.insertLast(15);
		llist2.insertLast(2);
		llist2.insertLast(3);
		llist2.insertLast(20);
		llist1.head = new DLL().merge(llist1.head, llist2.head);
		llist1.printList();
	}
}
