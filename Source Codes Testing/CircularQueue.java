class Queue
{
	int[] a = new int[20];
	int f,r,count,si;
	Queue(int size)
	{
		f=r=-1;
		count=0;
		si = size;
	}
	void enqueue(int ele)
	{
		if(r==-1)
		{
			r=r+1;
			f=f+1;
			a[r]=ele;
			count++;
		}
		else if(count==si)
		{
			System.out.println("Queue Overflow");
			System.exit(0);
		}
		else
		{
			r=(r+1)%si;
			a[r]=ele;
			count++;
		}
	}
	int dequeue()
	{
		int temp;
		if(f==-1)
		{
			System.out.println("Queue Underflow");
			System.exit(0);       
		}
		else if(f==r)
		{
			temp = a[f];
			f=-1;
			r=-1;
			count--;
			return temp;
		}
		else
		{
			temp = a[f];
			count--;
			f = (f+1)%si;
			return temp;
		}
		return 0;   
	}
	int size()
	{
		return count;
	}
	int first()
	{
		return a[f];
	}
	void display()
	{
		int c= 0;
			for(int i=f;c<count;i=(i+1)%si){
				c++;
				System.out.println("a[" + i + "]=" + a[i]);
			
		}
	}

}

public class QueueCircularArray 
{
	public static void main(String args[])
	{
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println("The elements of the queue are");
		q.display();
		System.out.println("The dequeued element is "+q.dequeue());
		q.enqueue(999);
		System.out.println("The elements of the queue are");
		q.display();
		q.enqueue(60); 

	}
}
