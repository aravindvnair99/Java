ffimport java.util.Scanner;

class StackX{
	private int top;
	private int maxsize;
	long[] StackArray;
	public StackX(int s)
	{
		top=-1;
		maxsize=s;
		StackArray=new long[maxsize];
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public boolean isFull()
	{
		return (top==maxsize-1);
	}
	
	public void push(long a)
	{
		if(isFull())
			System.out.println("Stack is full");
		else
			StackArray[++top]=a;
	}
	
	public long pop()
	{
		if(isEmpty())
			return 100;
		else
			return StackArray[top--];
	}
	
	
	
}

public class StackBasic {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the arrray");
		n=ob.nextInt();
		StackX as = new StackX(n);
		long[] a = new long[n];
		System.out.println("Enter the elements of the Array");
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextLong();
		}
		
		for(int i=0;i<n;i++)
		{
			as.push(a[i]);
		}
		
		System.out.println("Array after reversing");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]=as.pop());
		}
		
		
	}

}
