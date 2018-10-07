import java.util.*;
public class Short {
public static void main(String[] args) {
		String exp;
		char opt = 's';
		char ch;
		Scanner as = new Scanner(System.in);
		exp= as.next();
		Stack st = new Stack();
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)=='#')
				st.push(opt);
			else 
				st.push(exp.charAt(i));
		}
		for(int i=st.top;i>=0;i--)
		{
			 ch=st.pop();
			 System.out.print(ch);
		}

	}

}
class Stack
{
	int top=-1;
	char s[];
	int n;
	Stack()
	{
		s= new char[10];
		n=20;
	}
	void push (char e)
	{
		if(top==n-1)
			System.out.println("Stack is full");
			else 
				s[++top]=e;
	}
	char pop()
	{
		if(top!=-1)
			return (s[top--]);
		else 
			return '0';
	}
	
}
