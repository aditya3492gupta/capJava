package dataStructure;

public class CircularSinglyLinkedListDriver {
	public static void main(String[] args) {
		CircularSinglyLinkedList node = new CircularSinglyLinkedList();
		node.append(1);
		System.out.println(node);
		node.append(2);
		node.append(3);
		System.out.println(node);
		node.prepend(4);
		System.out.println(node);
		node.removeFirst();
		System.out.println(node);
		node.removeLast();
		System.out.println(node);
		node.removeLast();
		System.out.println(node);
		node.removeLast();
		System.out.println(node);
	}
}
