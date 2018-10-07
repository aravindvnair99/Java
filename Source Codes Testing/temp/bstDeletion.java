 import java.util.*;
class node{
    int data;
    node right,left;
    node(int x){
        data=x;
        right=left=null;
    }
}
class BS{
    node root;
    
    void addNode(int el){
        node temp=root;
      while(true){          
        if(root==null){
            root=new node(el);
            temp=root;
            return;
        }
        else if(temp.data<el){
            if(temp.right==null){
             temp.right=new node(el);
             return;
            } 
            else {
                temp=temp.right;
            }
        }
        else if(temp.data>el){
            if(temp.left==null){
                 temp.left=new node(el);
                 return;
                } 
                else {
                    temp=temp.left;
                }
        }
      }
    }
    void deletetree(int x)
    {int k,l;
    	int el=x;
    	node temp=root,pt=root;
    	 
    	
    	while(temp.data!=el)  
    { 
     if(temp.data>el){
    		 pt=temp;
    		 temp=temp.left;
    	 }if(temp.data<el){
    		 pt=temp;
    		 temp=temp.right;
    	 }
    }  
    	if(temp.data==el&& temp==root){
    		if(temp==root&&root.right==null&&root.left==null){
    	   		 root=null;
    	   		
    	   	 }else if(temp==root&&root.right!=null&&root.left==null){
    	    		temp=root.right;
    	    		root.right=null;
    	    	root=temp;
    	    		
    	    	}	else if( temp==root&&root.right==null&&root.left!=null){
    	    		temp=root.left;
    	    		root.left=null;
    	    	root=temp;
    	    		
    	    	}
    	    	else if(temp==root&&root.left!=null&&root.right!=null){
    	    		temp=root.left;
    	    		while(temp.right!=null){
    	    			pt=temp;
    	    			temp=temp.right;
    	    		}
    	    		k=temp.data;
    	    		if(temp.left!=null){
    	    			pt.right=temp.left;
    	    			}
    	    		else{
    	    			pt.right=null;
    	    		}
    	    		root.data=k;
    	    		
    	    		
    	    	}
 
    		
    	} 
    	else if(temp.data==el&&temp!=root)
    	{
    		
    		if(temp.data==el&&temp.right==null&&temp.left==null){
    	   		if(pt.data>temp.data){
    	   			pt.left=null;
    	   		}
    	   		else{
    	   			pt.right=null;
    	   		}
    			
    	   	 }
    	    	else if(temp.data==el&&temp.right!=null&&temp.left==null){
    	    		if(pt.data>temp.data){
    	    			pt.left=temp.right;
    	    		}
    	    		else{
    	    			pt.right=temp.right;
    	    		}
    	    	 
    	    		
    	    	}	else if(temp.data==el&&temp.right==null&&temp.left!=null){
    	    		if(pt.data>temp.data){
    	    			pt.left=temp.left;
    	    		}
    	    		else{
    	    			pt.right=temp.left;
    	    		}
    	    	 
    	    	}
    	    	else if(temp.data==el&&temp.left!=null&&temp.right!=null){
    	    		node temppo;
    	    		temppo=temp;
    	    		temp=temp.left;
    	    		while(temp.right!=null){
    	    			pt=temp;
    	    			temp=temp.right;
    	    		}
    	    		k=temp.data;
    	    		if(temp.left!=null){
    	    			pt.right=temp.left;
    	    			}
    	    		else{
    	    			pt.right=null;
    	    		}
    	    		temppo.data=k;
    	    		
    	    		
    	    	}
 
    	}
    	
    	
    	
    	
    }
    public void inOrderTraverseTree(node focusNode) {
        if (focusNode != null) {
            // Traverse the left node
            inOrderTraverseTree(focusNode.left);
            // Visit the currently focused on node
            System.out.println(focusNode.data);
            // Traverse the right node
            inOrderTraverseTree(focusNode.right);
        }
    }
    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
     System.out.println("......................................................");
        while(isRowEmpty==false) {
          Stack localStack = new Stack();
          isRowEmpty = true;
          for(int j=0; j<nBlanks; j++)
              System.out.print(' ');
          while(globalStack.isEmpty()==false) {
           node temp = (node)globalStack.pop();
           if(temp != null) {
             System.out.print(temp.data);
             localStack.push(temp.left);
             localStack.push(temp.right);
             if(temp.left != null || temp.right != null)
                 isRowEmpty = false;
           }
           else {
             System.out.print("--");
             localStack.push(null);
             localStack.push(null);
           }
           for(int j=0; j<nBlanks*2-2; j++)
              System.out.print(' ');
        }  // end while globalStack not empty
        System.out.println();
        nBlanks /= 2;
        while(localStack.isEmpty()==false)
           globalStack.push( localStack.pop() );
       }  // end while isRowEmpty is false
        System.out.println("......................................................");
     } 
    void search(int x){
    	int el=x;
    	node temp=root;
    	while(true){
    	if(temp.data==el){
    		System.out.println("element is  found");
    		return;
    	}
    	else{
	if(temp.data>el){
    			temp=temp.left;  
    			if(temp==null){
    				System.out.println("element is not found");
    	    		return;
    			}
    			}else if(temp.data<el)
    			{temp=temp.right;
    			if(temp==null){
    				System.out.println("element is not found");
    	    		return;
    			}}
    			
    	
    }}}    
    
   /* void deletion (int x){
    	int el=x;
    	node temp;
    	temp=root;
    	
    	while(true){
if(temp.data==el&&temp.right==null&&temp.left==null){
	
}
    	}
    }*/
    
    
    
}
public class Bst {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BS theTree = new BS();
        
        theTree.addNode(5);
        theTree.addNode(6);
        theTree.addNode(3);
        theTree.addNode(2);
theTree.addNode(4);
theTree.addNode(54);
theTree.addNode(12);
theTree.addNode(32);
theTree.addNode(100);
 
        
        theTree.displayTree();
       theTree.search(3);
       theTree.search(34);
       theTree.deletetree(6);
       
       theTree.displayTree();
    }
 
}