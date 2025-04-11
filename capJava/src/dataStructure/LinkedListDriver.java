package dataStructure;

public class LinkedListDriver {

	public static void main(String[] args) {
		LinkedList node = new LinkedList();
		System.out.println("is empty " + node.isEmpty());
		node.prepend(0);
		System.out.println("0 add " + node);
		node.append(10);
		node.append(20);
		System.out.println("add 10, 20 at last " + node);
		node.append(30);
		System.out.println("add 30 at last " + node);
		node.prepend(40);
		System.out.println("add 40 at start " + node);
		node.addIndex(2, 5);
		System.out.println("add 5 at index 2 " + node);
		node.addIndex(0, 6);
		System.out.println("add 6 at index 0 " + node);
		node.addIndex(7, 12);
		System.out.println("add 12 at index 7 " + node);
		node.addIndex(1, 55);
		System.out.println("add 55 at index 1 " + node);
//		node.addIndex(10, 4); exception
//		System.out.println("add 4 at index 101 " + node);
//		node.removeStart();
//		System.out.println(node);
//		node.removeLast();
//		System.out.println(node);
//		node.removeIndex(5);
//		System.out.println(node);
		Node newNode = node.getNode(5);
		System.out.println(newNode.data);
		System.out.println(node.containsData(56));
		System.out.println(node.containsData(30));
	}

}
