import java.util.*;
class stack
{
	int top = -1;
	char s[];
	int n;
	stack()
	{
		s = new char[10];
		n=20;
	}
	void push(char e)
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
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stack as = new stack();
		String s;
		s = sc.next();
		int a=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='a')
			{
				a++;
				as.push(s.charAt(i));
			}
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(as.pop());
		}
		

	}

}
