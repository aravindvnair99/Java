import java.util.*;
class Stack
{
int max;
int stackarray[];
int top;
public Stack(int size)
{
	max=size;
	stackarray=new int[max];
	top=-1;
}	
public int isFull()
{
	if(top==max-1)
		return 1;
	else 
		return 0;
}
public int isEmpty()
{
	if(top==-1)
		return 1;
	else 
		return 0;
}
public void push(int x)
{
	if(isFull()==1)
		System.out.println("Stack is overflow");
	else
		stackarray[++top]=x;
}
public int pop()
{
	if(isEmpty()==1)
	{
		System.out.println("Stack is underflow");
		return -1;
	}
	else
	{
		int a=stackarray[top];
		top--;
		return a;
	}
}
public int size()
{
	return top+1;
}
public int peek()
{
	if(top==-1)
		return -1;
	else
	return stackarray[top];
}
public void printstack()
{
    if(top==-1)
	System.out.println("Stack is empty");
	else
	{
	for(int i=0;i<=top;i++)
	System.out.println(stackarray[i]);
	}
}
}
class StackMain
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter stack size ");
		int size=in.nextInt();
		Stack s=new Stack(size);
		int opt=0;
		do
		{
			System.out.println("Enter your choice");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Size");
			System.out.println("4.Top Element");
			System.out.println("5.Print Stack");
			System.out.println("6.Exit");
			opt=in.nextInt();
			switch(opt)
			{
				case 1:System.out.println("Enter value to push");
				int data=in.nextInt();
				s.push(data);
				break;
				case 2:int p=s.pop();
				System.out.println("Popped value is "+p);
				break;
				case 3:System.out.println("Size is "+s.size());
				break;
				case 4:System.out.println("Top element is "+s.peek());
				break;
				case 5:System.out.println("Elements are ");
				s.printstack();
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