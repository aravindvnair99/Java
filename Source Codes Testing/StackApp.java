import java.util.*;

class StackX {
	private int maxSize;
	private long[] stackArray;
	private int top;  // points the current top of the stack
	public StackX(int s)
{
maxSize = s;
stackArray = new long[maxSize]; 
top = -1;
}

public void push(long j)

{
if(isFull())
{
  System.out.println("Stack is full");
}
else
stackArray[++top] = j;

}

public long pop()

{
if(isEmpty()){
System.out.println("Stack is Empty"); 
return -99;
}
else
return stackArray[top--]; 
}

public long peek()

{
return stackArray[top];
}

public boolean isEmpty()

{
return (top == -1);
}

public boolean isFull()

{
return (top == maxSize-1);
}

} 

public class StackApp
{
public static void main(String[] args)
{
StackX theStack = new StackX(5); // creating an object of the class StackX

Scanner scan = new Scanner(System.in);

		int opt = 0;
		do {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Size");
			System.out.println("4.Top");
			System.out.println("5.PrintStack");
			System.out.println("6.Exit");
			opt = scan.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter value to push");
				int data = scan.nextInt();
			theStack.push(data);
				break;
			case 2:
                                         long p;
                                         p=theStack.pop();
                                         if(p==-99){}
                                         else				
                                           System.out.println("Popped value is " + p);
				break;
		/*	case 3:
				System.out.println("Size is " + theStack.size());
				break;*/
			case 4:
				System.out.println("Top is " + theStack.peek());
				break;
			/*case 5:
				theStack.printStack();
				break;*/
			case 6:
				break;
			default:
				System.out.println("Enter Again");
				break;
			}
		} while (opt != 6);
} 
}

