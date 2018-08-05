class Queue {
	int[] a = new int[5];
	int f,r;
	Queue() {
	  f=r=-1;
	}
	void enqueue(int ele) {
	  	if(r==-1) {
		 	r=r+1;
			f=f+1;
		 	a[r]=ele;
	  	}
	  	else if(r==4) {
		  	System.out.println("Queue Overflow");
		  	System.exit(0);
	  	}
	  	else {
		  	r=r+1;
		  	a[r]=ele;
	  	}
	}
	int dequeue() {
	  	int temp;
	  	if(f==-1) {
			System.out.println("Queue Underflow");
			System.exit(0);       
	  	}
	  	else if(f==r) {
		  	temp = a[f];
		  	f=-1;
		  	r=-1;
		  	return temp;
	  	}
	  	else {
		  	temp = a[f];
		  	f = f+1;
		  	return temp;
		}
		return 0;   
	}
	int size() {
	   return (r-f+1);
	}
	int first() {
	   return a[f];
	}
	void display() {
		for(int i=f;i<=r;i++)
			System.out.println("a[" + i + "]=" + a[i]);
	}
}

public class QueueArray {
	public static void main(String args[]) {
	Queue q = new Queue();
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.enqueue(40);
	q.enqueue(50);
	//q.enqueue(100);
	System.out.println("The elements of the queue are");
	q.display();
	System.out.println("The dequeued element is "+q.dequeue());
	System.out.println("The elements of the queue are");
	q.display();
	q.enqueue(60); 
	}
}