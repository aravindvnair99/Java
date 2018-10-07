import java.util.*;
class Stack
{
	int max;
	int stackarray[];
	int top;
	public Stack(int x)
	{
		max=x;
		stackarray=new int[x];
		top=-1;
	}
	public boolean isFull()
	{
		if(top==max-1)
			return true;
		else
			return false;
	}
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("Stack is overflow");
		}
		else
		{
			stackarray[++top]=x;
		}
	}
	public int pop()
	{
		if(isEmpty())
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
			System.out.println(stackarray[top]);
		}
	}
}
class PrefixEvaluation
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter prefix expression");
		String str=s.next();
		Stack st=new Stack(str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				System.out.println("Enter the value for "+str.charAt(i));
				int data=s.nextInt();
				st.push(data);
			}
			else
			{
				int res;
				int op1=st.pop();
				int op2=st.pop();
				if(str.charAt(i)=='+')
					res=op1+op2;
				else if(str.charAt(i)=='-')
					res=op1-op2;
				else if(str.charAt(i)=='/')
					res=op1/op2;
				else if(str.charAt(i)=='*')
					res=op1*op2;
				else 
					continue;
				st.push(res);
			}
		}
		System.out.print("Answer is ");
		st.printstack();
	}
}