package dataStructure;

public class DoublyCircularLinkedListDriver {
	public static void main(String[] args) {
		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		list.append(5);
		list.append(6);
		System.out.println(list);
		list.prepend(10);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.head.prev.data);
		list.removeFirst();
		System.out.println(list);
	}
}
