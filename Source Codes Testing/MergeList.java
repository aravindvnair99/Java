class Node {
	int data;
	Node next, prev;

	Node(Node p,int d, Node n) {
		data = d;
		next = n;
		prev = p; 
	}
}

public class Main {
	Node head,tail;

	public void insertFront(int el){
		if (head == null) {
			head = tail = new Node(null,el,null);
		} else {
			head = new Node(null, el, head);
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

	public static void main(String args[]) {
		Main llist1 = new Main();
		Main llist2 = new Main();
		llist1.insertFront(5);
		llist1.insertFront(10);
		llist1.insertFront(15);
		llist2.insertFront(2);
		llist2.insertFront(3);
		llist2.insertFront(20);
		llist1.head = new Gfg().sortedMerge(llist1.head, llist2.head);
		llist1.printList();
	}
}

class Gfg {
	Node sortedMerge(Node headA, Node headB) {
		Node dummyNode = new Node(null,0,null);
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
