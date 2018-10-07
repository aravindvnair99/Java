import java.util.*;
class cnode
{
	int data;
	cnode next;
	cnode(int x)
	{
		data=x;
		next=null;
	}
}
class clist
{
	cnode tail;
	clist()
	{
		tail=null;
	}
	void insertFirst(int x)
	{
		cnode temp=new cnode(x);
		if(tail==null)
		{
			tail=temp;
			tail.next=tail;
		}
		else
		{
			temp.next=tail.next;
			tail.next=temp;
		}
	}
	void insertLast(int x)
	{
		cnode temp=new cnode(x);
		if(tail==null)
		{
			tail=temp;
			tail.next=tail;
		}
		else
		{
			temp.next=tail.next;
			tail.next=temp;
			tail=temp;
		}
		
	}
	int deleteFirst()
	{
		if(tail==null)
		{
			System.out.println("List is empty ");
			return -1;
		}
		else if(tail.next==tail)
		{
			int y=tail.data;
			tail=null;
			return y;
		}
		else
		{
			int y=tail.next.data;
			tail.next=tail.next.next;
			return y;
		}
	}
	int deleteLast()
	{
		if(tail==null)
		{
			System.out.println("List is empty ");
			return -1;
		}
		else if(tail.next==tail)
		{
			int y=tail.data;
			tail=null;
			return y;
		}
		else
		{
			int y=tail.data;
			cnode t=tail.next;
			while(t.next!=tail)
				t=t.next;
			t.next=tail.next;
			tail=t;
			return y;
		}
	}
	void display()
	{
		if(tail==null)
			System.out.println("List is empty ");
		else
		{
			cnode t=tail.next;
			while(t!=tail)
			{
				System.out.println(t.data);
				t=t.next;
			}
			System.out.println(tail.data);
		}
	}
	int size()
	{
		int count=1;
		if(tail==null)
		{
			return 0;
		}
		else
		{
			cnode t=tail.next;
		    while(t!=tail)
		    {
			   count++;
			   t=t.next;
		    }
		return count;
		}
	}
}
class CircularLinkedList
{
	public static void main(String args[])
	{
		clist l=new clist();
		Scanner s=new Scanner(System.in);
		int opt=0;
		do
		{
			System.out.println("Enter your choice\n1.InsertFirst\n2.InsertLast\n3.DeleteFirst\n4.DeleteLast\n5.Display\n6.Size\n7.Exit");
			opt=s.nextInt();
			switch(opt)
			{
				case 1:System.out.println("Enter element to InsertFirst");
				int x=s.nextInt();
				l.insertFirst(x);
				break;
				case 2:System.out.println("Enter element to InsertLast");
				int y=s.nextInt();
				l.insertLast(y);
				break;
				case 3:System.out.println("Deleted First element is "+l.deleteFirst());
				break;
				case 4:System.out.println("Deleted Last element is "+l.deleteLast());
				break;
				case 5:
				l.display();
				break;
				case 6:
				System.out.println("Size is "+l.size());
				break;
				case 7:
				break;
			}
		}while(opt!=7);
			
	}
}