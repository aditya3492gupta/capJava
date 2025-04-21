package tree;

public class Tree {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	Node root;

	public void add(int data) {
		root = addNode(root, data);
	}

	private Node addNode(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data) {
			root.left = addNode(root.left, data);
		} else if (data > root.data) {
			root.right = addNode(root.right, data);
		}
		return root;
	}

	public void printInorder(Node root) {
		inorderTraversal(root);
		System.out.println();
	}

	private void inorderTraversal(Node root) {
		if (root == null)
			return;
		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}

	public void printPreorder(Node root) {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		inorderTraversal(root.left);
		inorderTraversal(root.right);
	}

	public void printPostorder(Node root) {
		postorderTraversal(root);
		System.out.println();
	}

	private void postorderTraversal(Node root) {
		if (root == null)
			return;
		inorderTraversal(root.left);
		inorderTraversal(root.right);
		System.out.print(root.data + " ");
	}
}
