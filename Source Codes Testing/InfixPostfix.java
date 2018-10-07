import java.util.*;
class Stack
{
	int max;
	char stackarray[];
	int top;
	public Stack(int x)
	{
		max=x;
		stackarray=new char[x];
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
	public void push(char x)
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
	public char pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is underflow");
			return '\0';
		}
		else
		{
			char a=stackarray[top];
			top--;
			return a;
		}
	}
	public int size()
	{
		return top+1;	
	}
	public char top()
	{
		if(top==-1)
			return '\0';
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
class InfixToPostfix
{
	public static int precedence(char c)
	{
		switch(c)
		{
			case '(':
			case ')':return 0;
			case '+':
			case '-':return 1;
			case '*':
			case '/':return 2;
			case '^':return 3;
		}
		return 0;
	}
public static void main(String args[])
{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter infix expression");
		String str=s.next();
		Stack st=new Stack(str.length());
		char out[]=new char[50];
		int p=0,count=0;
		for(int i=0;<str.length();i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i)==')')
				count++;
		}
		for(int i=0;i<str.length();i++)
		{
		  char c=str.charAt(i);
		   if(c=='(')
			st.push(c);
		    else if(c==')')
			{
				while(st.top()!='(')
				{
					System.out.print(st.pop());
				}
				st.pop();
			}
			else if(c<='a' && c<='z' || c>='A' && c<='Z')
				System.out.print(c);
			else if(st.isEmpty() || precedence(c)>precedence(st.top()))
				st.push(c);
			else if(precedence(c) <= precedence(st.top()))
			{
				System.out.print(st.pop());
				st.push(c);
			}
			else
				continue;
		}
		while(!st.isEmpty())
		  out[p++]=st.pop();
		  int j=0;
		for(j=0;j<str.length()-count;j++)
			System.out.print(out[j]);
}
}