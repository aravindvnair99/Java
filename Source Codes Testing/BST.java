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
	int count = 0;
	int count1 = 0;

	BST() {
		root = null;
	}

	void RecInsert(int x) {
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

	void inOrder(node t) {
		if (t != null) {
			inOrder(t.left);
			count++;
			inOrder(t.right);
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
					node temp_parent = null;
					node temp = t.right;
					while (temp.left != null) {
						temp_parent = temp;
						temp = temp.left;
					}
					if (t.right.left == null && t.right.right == null) {
						t.right = null;
					}
					if (temp_parent != null) {
						temp_parent.left = null;
					}
					if (temp.right != null) {
						temp_parent.left = temp.right;
					}
					t.data = temp.data;
				}
			}
		}
	}

	void preOrder(node t) {
		if (t != null) {
			System.out.print(t.data + " -> ");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	void postOrder(node t) {
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			count1++;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		BST t = new BST();
		t.RecInsert(50);
		t.RecInsert(40);
		t.RecInsert(60);
		t.RecInsert(30);
		t.RecInsert(80);
		t.RecInsert(45);
		t.RecInsert(43);
		t.RecInsert(44);
		t.preOrder(t.root);
		System.out.println();
		t.deleteNode(40);
		t.preOrder(t.root);
	}
}