import java.util.*;
class Queue
{
	int max;
	int q[];
	int f,r;
	Queue(int size)
	{
		max=size;
		q=new int[max];
		f=r=-1;
	}
	public boolean isFull()
	{
		if((r+1)%max==f)
			return true;
		else
			return false;
	}
	public boolean isEmpty()
	{
		if(f==-1)
			return true;
		else
			return false;
	}
	void enqueue(int x)
	{
		if(isFull())
		{
	    System.out.println("Queue overflow ");
		}
		else if(r==-1)
		{
			f++;
			r++;
			q[r]=x;
		}
		else
		{
			r=(r+1)%max;
			q[r]=x;
		}
	}
	int dequeue()
	{
		int temp;
		if(isEmpty())
		{
			System.out.println("Queue is underflow");
			return -1;
		}
		else if(f==r)
		{
			temp=q[f];
			f=r=-1;
			return temp;
		}
		else
		{
			temp=q[f];
			f=(f+1)%max;
			return temp;
		}
	}
	void display()
	{
		for(int i=f;i!=r;i=(i+1)%max)
			System.out.println(q[i]);
			System.out.println(q[r]);
	}
	int size()
	{
	    if(f<=r)
		return r-f+1;
		else
		return r-f+1+max;
	}
	int top()
	{
		if(f==-1)
		return -1;
	else
	return q[f];

	}
}
class CircularQueue
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter queue size");
		int size=s.nextInt();
		Queue qu=new Queue(size);
		int opt=0;
		do
		{
			System.out.println("Enter your choice");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Size");
			System.out.println("4.Top Element");
			System.out.println("5.Display");
			System.out.println("6.Exit");
			opt=s.nextInt();
			switch(opt)
			{
				case 1:System.out.println("Enter value to enqueue");
				int x=s.nextInt();
				qu.enqueue(x);
				break;
				case 2:int p=qu.dequeue();
				System.out.println("Dequeue value is "+p);
				break;
				case 3:System.out.println("Size is "+qu.size());
				break;
				case 4:System.out.println("Top element is "+qu.top());
				break;
				case 5:System.out.println("Elements are ");
				qu.display();
				break;
				case 6:
				break;
				default:
				System.out.println("Enter value again");
				break;
			}
		}while(opt!=6);
	}
}