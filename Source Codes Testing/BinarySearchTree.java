import java.util.*;

class node {
	int data;
	node left;
	node right;

	node(int e) {
		data = e;
		left = null;
		right = null;
	}
}

class BST {
	node root;

	BST() {
		root = null;
	}

	void insert(int x) {
		node pt = null;
		if (root == null)
			root = new node(x);
		else {
			node t = new node(x);
			node temp = root;
			while (temp != null) {
				pt = temp;
				if (t.data > temp.data)
					temp = temp.right;
				else
					temp = temp.left;
			}
			if (t.data > pt.data)
				pt.right = t;
			else
				pt.left = t;
		}
	}

	node RecInsert(node t, int x) {
		if (t == null) {
			t = new node(x);
			return t;
		} else {
			if (x > t.data)
				t.right = RecInsert(t.right, x);
			else
				t.left = RecInsert(t.left, x);
		}
		return t;
	}

	boolean RecSearch(node t, int x) {
		if (t == null)
			return false;
		else {
			if (t.data == x)
				return true;
			else if (x > t.data)
				return RecSearch(t.right, x);
			else
				return RecSearch(t.left, x);
		}
	}

	void inOrder(node t) {
		if (t != null) {
			inOrder(t.left);
			System.out.print(t.data + " -> ");
			inOrder(t.right);
		}
	}

	void postOrder(node t) {
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.data + " -> ");
		}
	}

	void Preorder() {
		preOrder(root);
	}

	void preOrder(node t) {
		if (t != null) {
			System.out.print(t.data + " -> ");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	void deleteNode(int x) {
		node t = root;
		node pt = root;
		if (root.data == x && root.left == null && root.right == null)
			root = null;
		else {
			while ((t != null) && (t.data != x)) {
				if (x > t.data) {
					pt = t;
					t = t.right;
				} else {
					pt = t;
					t = t.left;
				}
			}
			// DONE SEARCHING FOR ELEMENT IN TREE, t is the element and pt is its parent
			if (t == null)
				System.out.println("Element not present in tree");
			else {
				if ((t.left == null) && (t.right == null)) {
					if (pt.left == t)
						pt.left = null;
					else
						pt.right = null;
				} else if ((t.left == null) && (t.right != null)) {
					if (pt.right == t)
						pt.right = t.right;
					else
						pt.left = t.right;
				} else if ((t.left != null) && (t.right == null)) {
					if (pt.right == t)
						pt.right = t.left;
					else
						pt.left = t.left;
				} else if ((t.left != null) && (t.right != null)) {
					// when there are two children to the node to be deleted
					node temp_parent=null;
                    node temp=t.right;
                    while(temp.left!=null){
                        temp_parent=temp;
                        temp=temp.left;
                        }
                    temp_parent.left=null;
                    t.data=temp.data;
				}
			}
		}
	}
}

public class bst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST t = new BST();
		System.out.println("1. Insert node");
		System.out.println("2. Recursively insert node");
		System.out.println("3. Search the tree");
		System.out.println("4. Inorder display");
		System.out.println("5. Preorder display");
		System.out.println("6. Postorder display");
		System.out.println("7. Delete node");
		System.out.println("8. EXIT");
		int ch = 0;
		do {
			System.out.println("Enter choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter number to be inserted: ");
				t.insert(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter element to be inserted: ");
				t.RecInsert(t.root, sc.nextInt());
				break;
			case 3:
				System.out.println("Enter element to be searched for: ");
				if (t.RecSearch(t.root, sc.nextInt()))
					System.out.println("Element is present in tree");
				else
					System.out.println("Element not present in tree");
				break;
			case 4:
				System.out.print("In order tree: ");
				t.inOrder(t.root);
				System.out.println("END");
				break;
			case 5:
				System.out.print("Pre order tree: ");
				t.preOrder(t.root);
				System.out.println("END");
				break;
			case 6:
				System.out.print("Post order tree: ");
				t.postOrder(t.root);
				System.out.println("END");
				break;
			case 7:
				System.out.println("Enter element to be deleted: ");
				t.deleteNode(sc.nextInt());
				break;
			case 8:
				break;
			default:
				System.out.println("Invalid choice entered");
			}
		} while (ch != 8);
		sc.close();
		System.out.println("DONE");
	}
}