class QueueArray {
	int[] a = new int[5];
	int f,r;
	QueueArray() {
	  f=r=-1;
	}
	void addFirst(int ele){
		if(f==0){
			System.out.println("Overflow");
		}
		else if(f==-1){
			f++;
			r++;
			a[f] = ele;
		}
		else{
			f = f-1;
			a[f] = ele;
		}
	}
	void addLast(int ele) {
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
	int removeFirst() {
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
	int removeLast(){
		int temp;
		if(f==-1||r==-1){
			System.out.println("Underflow");
		}
		else if(f==r){
			temp = a[f];
			f = r = -1;
			return temp;
		}
		else{
			temp = a[f];
			r = r-1;
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

public class DoubleEndedQueue {
	public static void main(String args[]) {
	QueueArray q = new QueueArray();
	q.addFirst(50);
	q.addLast(60);
	q.addFirst(75);
	q.addLast(60);
	q.addLast(90);
	q.addLast(100);
	q.removeFirst();
	q.addFirst(99);
	System.out.println("The elements of the queue are");
	q.display();
	}
}
