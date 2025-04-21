package tree;

public class TreeDriver {
	
	public static void main(String[] args) {
		Tree t = new Tree();
		t.add(10);
		t.add(8);
		t.add(6);
		t.add(12);
		t.add(30);
		t.add(11);
		t.add(5);
		t.add(28);
		t.add(4);
		t.printInorder(t.root);
		t.printPostorder(t.root);
		t.printPreorder(t.root);
	}
}
