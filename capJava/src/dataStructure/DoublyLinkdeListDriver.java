package dataStructure;

public class DoublyLinkdeListDriver {
	public static void main(String[] args) {
		DoublyLinkedList doubleNode = new DoublyLinkedList();
		System.out.println(doubleNode.isEmpty());

		doubleNode.addFirst(5);
		System.out.println("add 5 in front " + doubleNode);

//		doubleNode.removeFirst();
//		System.out.println("remove from last " + doubleNode);

		doubleNode.addLast(56);
		System.out.println("add 56 in last " + doubleNode);

		doubleNode.addFirst(6);
		System.out.println("add 6 in front " + doubleNode);

		doubleNode.addIndex(10, 2);
		System.out.println("add 10 at 2 " + doubleNode);

		doubleNode.addIndex(45, 0);
		System.out.println("add 45 at 0 " + doubleNode);

		doubleNode.addIndex(88, doubleNode.size);
		System.out.println("add 88 at doubleNode.size " + doubleNode);

		doubleNode.removeFirst();
		System.out.println("remove from front " + doubleNode);

		doubleNode.removeLast();
		System.out.println("remove from last " + doubleNode);

		doubleNode.removeIndex(2);
		System.out.println("remove element at index 2 " + doubleNode);
	}
}
