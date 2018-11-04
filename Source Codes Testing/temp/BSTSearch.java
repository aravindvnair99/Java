import java.util.Scanner;
import java.util.Stack;

class BST {
	public Node root;

	public void addNode(int key) {
		// Create a new Node and initialize it
		Node newNode = new Node(key);
		// If there is no root this becomes root
		if (root == null) {
			root = newNode;
		} else {
			// Set root as the Node we will start
			// with as we traverse the tree
			Node focusNode = root;
			// Future parent for our new Node
			Node parent;
			while (true) {
				// root is the top parent so we start
				// there
				parent = focusNode;
				// Check if the new node should go on
				// the left side of the parent node
				if (key < focusNode.key) {
					// Switch focus to the left child
					focusNode = focusNode.leftChild;
					// If the left child has no children
					if (focusNode == null) {
						// then place the new node on the left of it
						parent.leftChild = newNode;
						return; // All Done
					}
				} else { // If we get here put the node on the right
					focusNode = focusNode.rightChild;
					// If the right child has no children
					if (focusNode == null) {
						// then place the new node on the right of it
						parent.rightChild = newNode;
						return; // All Done
					}
				}
			}
		}
	}

	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth
	public void inOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			// Traverse the left node
			inOrderTraverseTree(focusNode.leftChild);
			// Visit the currently focused on node
			System.out.println(focusNode.key);
			// Traverse the right node
			inOrderTraverseTree(focusNode.rightChild);
		}
	}

	public Node findNode(int key) {
		// Start at the top of the tree
		Node focusNode = root;
		// While we haven't found the Node
		// keep looking
		while (focusNode.key != key) {
			// If we should search to the left
			if (key < focusNode.key) {
				// Shift the focus Node to the left child
				focusNode = focusNode.leftChild;
			} else {
				// Shift the focus Node to the right child
				focusNode = focusNode.rightChild;
			}
			// The node wasn't found
			if (focusNode == null)
				return null;
		}
		return focusNode;
	}

	public void displayTree() {
		Stack<Node> globalStack = new Stack<Node>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");
		while (isRowEmpty == false) {
			Stack<Node> localStack = new Stack<Node>();
			isRowEmpty = true;
			for (int j = 0; j < nBlanks; j++)
				System.out.print(' ');
			while (globalStack.isEmpty() == false) {
				Node temp = (Node) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.key);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if (temp.leftChild != null || temp.rightChild != null)
						isRowEmpty = false;
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j = 0; j < nBlanks * 2 - 2; j++)
					System.out.print(' ');
			} // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		} // end while isRowEmpty is false
		System.out.println("......................................................");
	}
}

public class Main {
	public static void main(String[] args) {
		BST theTree = new BST();
		Scanner sc = new Scanner(System.in);
		int n;
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
		// Inorder tree traversal
		theTree.inOrderTraverseTree(theTree.root);
		System.out.println("Enter the key which you need to search");
		n = sc.nextInt();
		Node dummy = theTree.findNode(n);
		if (dummy == null)
			System.out.println("NOT FOUND");
		else
			System.out.println("Found");
		sc.close();
	}
}

class Node {
	int key;
	Node leftChild;
	Node rightChild;

	Node(int key1) {
		key = key1;
	}
}