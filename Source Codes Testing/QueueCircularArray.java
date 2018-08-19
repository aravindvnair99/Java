import java.util.Scanner;

public class QueueCircularArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter total no of elements to be in the queue: ");
		int maxSize = input.nextInt();
		CircularQueue queue = new CircularQueue(maxSize);
		int select;
		int term = 0;
		while (term == 0) {
			System.out.print(
					"\nOption:\tTo Do:\n1\tTo enqueue element.\n2\tTo dequeue element.\n3\tTo Display the Queue elements.\n4\tTo Exit the Program.\n\nEnter your option:- ");
			select = input.nextInt();
			switch (select) {
			case 1: {
				System.out.print("\nEnter element to insert in the queue: ");
				int ele = input.nextInt();
				queue.enqueue(ele);
				break;
			}
			case 2: {
				queue.dequeue();
				break;
			}
			case 3: {
				queue.display();
				break;
			}
			case 4: {
				term = 1;
				System.out.println("\nSee you next time!");
				input.close();
				break;
			}
			default:
				System.out.println("\nEnter a valid option.");
			}
		}
	}
}

class CircularQueue {
	int maxSize;
	int rear;
	int front;
	int aQueue[];
	{
		rear = -1;
		front = -1;
	}

	CircularQueue(int maxSize) {
		this.maxSize = maxSize;
		this.aQueue = new int[maxSize];
	}

	void enqueue(int item) {
		if (((rear + 1) % maxSize) == front) {
			System.out.println("\nQueue is full");
		} else {
			if (rear == front && front == -1) {
				front += 1;
			}
			rear = (rear + 1) % maxSize;
			aQueue[rear] = item;
		}
	}

	void dequeue() {
		if (rear == front && rear == -1) {
			System.out.println("\nQueue is empty.");
		} else {
			int item = aQueue[front];
			if (rear == front) {
				rear = -1;
				front = -1;
			} else {
				front = (front + 1) % maxSize;
			}
			System.out.println(item + " is deQueued from the Queue");
		}
	}

	void display() {
		int tempfront = front;
		if (rear == front && rear == -1) {
			System.out.println("\nQueue is Empty.");
		} else {
			System.out.println("\nThe contents of the queue are:- ");
			for (int i = 0; i < maxSize; i++) {
				if (tempfront != rear) {
					System.out.println(aQueue[tempfront]);
					tempfront = (tempfront + 1) % maxSize;
				} else {
					System.out.println(aQueue[rear]);
					break;
				}
			}
		}
	}
}