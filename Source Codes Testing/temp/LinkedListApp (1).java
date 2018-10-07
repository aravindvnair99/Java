import java.util.*;
// demonstrates LinkedList
////////////////////////////////////////////////////////////////

// Class definition for a node in the linked list
class LNode
{
	public int info;   // Stores the data
	public LNode next; // Link pointer to the next node in the list
	//--------------------------------------------------------------
	public LNode(int item)
	// constructor
	{
		info=item;
		next=null;
	}
	public LNode(int item, LNode n)
	{
		info=item;
		next=n;
	}
}
// Class definition for linked list
class SList 
{
	public LNode head,tail;   // pointer to head and tail nodes 
	
	public SList() {
		head=tail=null;   // empty list has null values for head and tail
	}

	public boolean isEmpty() { // returns true if list is empty{
		return head==null;  // head is null in an empty list
	}

	public void insertFront(int el) // insert a new node at the beginning of list
	{
		head = new LNode(el, head);   // Create a new element which points to current head of list
		if (tail==null)		// if list was empty tail before the operation.
			tail=head;
	}

	public void insertLast(int el) // insert a new node at the rear of list
	{
		if (!isEmpty())
		{
			tail.next = new LNode(el);
			tail = tail.next;
		}
		else                             // when list is empty and you are calling insertLast method
			head=tail=new LNode(el);
	}

	public int deleteFront()  // delete the node at the beginning of list
	{
		int el = head.info;
		if (head==tail)         // if only one element was there
			head=tail=null;
		else
			head = head.next;
		return el;
	}

	public int deleteLast() // delete the node at the rear of list
	{
		int el = tail.info;
		if (head==tail)
			head=tail=null; // if only one element was there
		else
		{
			LNode temp;
			for (temp=head; temp.next !=tail; temp=temp.next); // find "last but one" node
			tail=temp;
			tail.next = null;
		}
		return el;
	}

	public void displayAllAndSum()  // Display the conntents of nodes in the list
	{
		LNode temp;
                    int sum=0;
		if (isEmpty()) System.out.println("List is empty");
		else
		{ 
			for (temp=head; temp !=null; temp=temp.next) {
				sum=sum+temp.info;
                                        System.out.print(temp.info + " ");}
			System.out.println("\n"+"sum="+sum);
		}
	}
          public void displayAlternate()  // Display the conntents of nodes in the list
	{
		LNode temp;
                    int sum=0;
		if (isEmpty()) System.out.println("List is empty");
		else
		{ 
			for (temp=head; temp !=null; temp=temp.next.next) {
                                        System.out.print(temp.info + " ");
                                        if(temp==tail)
                                          break;
                             }
			
		}
	}

	public void delete(int el)  { // delete the node with an element el;
		if (!isEmpty()) {
	              if (head == tail && el == head.info) // if only one node on the list;
				head = tail = null;	
		    else if (el == head.info) // if more than one node on the list; and el is in the head node;
				head = head.next;

			else  {
				// if more than one node in the list
				LNode pred, temp;   // and el is in a non-head node;
				pred = head;
for (temp = head.next; temp != null && temp.info != el; pred = pred.next, temp = temp.next);
				if (temp != null) {
					// if el was found;
					pred.next = temp.next;
					if (temp == tail) // if el is in the last node;
					   tail = pred;
				}
			}
		}
	}

	public void insertAft(int el, int newel)  // insert newel after el
	{
		if (!isEmpty())
		{
			LNode temp;   // and el is in a non-head node;
			temp = head;
			for (temp = head; temp != null && temp.info != el; temp = temp.next);
			if (temp == null)
				System.out.println("Element " + el + " not in list");
			else
			{
				// if el was found;
				temp.next = new LNode(newel, temp.next);
				if (tail==temp)  
					tail=temp.next;
			}
		}
	}



public void insertAt(int x, int pos) {
		if (isEmpty()) {
			LNode p = new LNode(x);
			head = p;
		} else {
			int i = 1;
			LNode current = head;
                              
			if (pos > 0) {
                                        if(pos == 1) {
                                                       LNode p = new LNode(x);
                                                       p.next = head;
                                                       head = p;
                                                       return;
                                        }
                                                       
                                        
				while (current != null) {
					if (i == pos - 1) {
						LNode p = new LNode(x);
						p.next = current.next;
						current.next = p;
						return;
					} else {
						current = current.next;
						i++;
					}
				}
			} else
				System.out.println("Wrong position!");
		}
	}  


public void insertBefore(int x, int pos) {
	if (isEmpty()) {
		LNode p = new LNode(x);
		head = p;
	} else {
		int i = 1;
		LNode current = head;
                          
		if (pos > 0) {
                                    if(pos == 1) {
                                                   LNode p = new LNode(x);
                                                   p.next = head;
                                                   head = p;
                                                   return;
                                    }
                                                   
                                    
			while (current != null) {
				if (i == pos - 2) {
					LNode p = new LNode(x);
					p.next = current.next;
					current.next = p;
					return;
				} else {
					current = current.next;
					i++;
				}
			}
		} else
			System.out.println("Wrong position!");
	}
}  
public void insertAfter(int x, int pos) {
	if (isEmpty()) {
		LNode p = new LNode(x);
		head = p;
	} else {
		int i = 1;
		LNode current = head;
                          
		if (pos > 0) {
                                    if(pos == 1) {
                                                   LNode p = new LNode(x);
                                                   p.next = head;
                                                   head = p;
                                                   return;
                                    }
                                                   
                                    
			while (current != null) {
				if (i == pos) {
					LNode p = new LNode(x);
					p.next = current.next;
					current.next = p;
					return;
				} else {
					current = current.next;
					i++;
				}
			}
		} else
			System.out.println("Wrong position!");
	}
}  

public void deleteele(int el)  { // delete the node with an element el;
	if (!isEmpty()) {
              if (head == tail && el == head.info) // if only one node on the list;
			head = tail = null;	
	    else if (el == head.info) // if more than one node on the list; and el is in the head node;
			head = head.next;

		else  {
			// if more than one node in the list
			LNode pred, temp;   // and el is in a non-head node;
			pred = head;
for (temp = head.next; temp != null && temp.info != el; pred = pred.next, temp = temp.next);
			if (temp != null) {
				// if el was found;
				pred.next = temp.next;
				if (temp == tail) // if el is in the last node;
				   tail = pred;
			}
		}
	}
}

public void deleteAt(int pos) {
	if (isEmpty()) {
		System.out.println("list is empty");
	} else {
		int i = 1;
		LNode current = head;
                          
		if (pos > 0) {
                                    if(pos == 1) {
                                               LNode temp;
                                               temp= head;
                                               head= head.next;
                                               temp.next=null;
                                               
                                    }
                                                   
                                    
			while (current != null) {
				if (i == pos) {
					LNode p= new LNode(pos);
					p.next= current.next;
					current.next = null;
					return;
				} else {
					current = current.next;
					i++;
				}
			}
		} else
			System.out.println("Wrong position!");
	}
}  


// Class for main program
public  class LinkedListApp
{
	public static void main(String[] args)
	{
		SList ll = new SList(); // create a new linked list
		int option;
		int elem;
		Scanner kbd = new Scanner(System.in);
		do
		{
			System.out.println("Enter option: 1 insert front, 2 insert last");
			System.out.println("              3 delete front, 4 delete last");
			System.out.println("              5 displayAllAndSum, 6 InsertAfter");
            System.out.println("              7 delete_element, 8 displayAlternate 11. insert at ");
            System.out.println("              9. insert before a given position 10.insert after a given position"  +  " 0 exit");
			option=kbd.nextInt(); 

			switch (option) {
				case 1: System.out.println("Enter element:");
					elem = kbd.nextInt();
					ll.insertFront(elem);
					break;
				case 2: System.out.println("Enter element:");
					elem = kbd.nextInt();
					ll.insertLast(elem);
					break;
				case 3: if (ll.isEmpty()) System.out.println("Error: Empty List");
					else
					{
					elem = ll.deleteFront();
					System.out.println("Removed elemen " + elem + " from front");
					}
					break;
				case 4: if (ll.isEmpty()) System.out.println("Error: Empty List");
					else
					{
					elem = ll.deleteLast();
					System.out.println("Removed elemen " + elem + " from rear");
					}
					break;
				case 5: ll.displayAllAndSum();
					break;
                case 6:System.out.println("Enter an element after which to be inserted");
                    System.out.println("Enter the element to be inserted");    
                    ll.insertAfter(kbd.nextInt(),kbd.nextInt());
                    break;
                case 8: ll.displayAlternate();
                    break;
                case 7: System.out.println("Enter the element to be deleted");
                    ll.delete(kbd.nextInt());
                    break;
                case 9: System.out.println("enter the position before which element has to be added");
                    int a= kbd.nextInt();
                    int b= kbd.nextInt();
                    ll.insertBefore(a,b);
                    break;
                case 10:
                    	System.out.println("enter the position after which element has to be added");
                    	int c= kbd.nextInt();
                    	int d= kbd.nextInt();
                    	ll.insertAfter(c,d);
                    	break;
                case 11:
                    	System.out.println("enter the position at which element has to be added");
                    	int m= kbd.nextInt();
                    	int n= kbd.nextInt();
                    	ll.insertAt(m,n);
                case 12:
                	  System.out.println("enter the element to be deleted");
                	  int j= kbd.nextInt();
                	  ll.deleteele(j);
                case 13:
                	System.out.println("enter the position to be deleted");
              	  int k= kbd.nextInt();
              	  ll.deleteAt(k);
                	break;
                	  
				case 0: break;
				default: System.out.println("Invalid Entry ");
			}
		} while (option !=0);
              
	} 
}
}
