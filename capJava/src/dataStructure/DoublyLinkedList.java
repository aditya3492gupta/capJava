package dataStructure;

public class DoublyLinkedList {
	DoublyNode head;
	int size;

	public void addFirst(int data) {
		DoublyNode newNode = new DoublyNode(data);

		if (isEmpty()) {
			head = newNode;
			size++;
			return;
		}
		size++;
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	public void addLast(int data) {
		if (isEmpty()) {
			addFirst(data);
			return;
		}
		size++;
		DoublyNode newNode = new DoublyNode(data);
		DoublyNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		newNode.prev = current;
	}

	public void addIndex(int data, int index) {
		if (index == 0) {
			addFirst(data);
			return;
		}
		if (isEmpty()) {
			System.out.println("Empty List");
			return;
		}
		if (index > size || index < 0) {
			throw new ListIndexOutOfBoundsException();
		}
		if (index == size) {
			addLast(data);
			return;
		}
		int i = 0;
		DoublyNode current = head;
		DoublyNode newNode = new DoublyNode(data);
		while (i < index - 1) {
			current = current.next;
			i++;
		}
		newNode.next = current.next;
		newNode.prev = current;
		current.next = newNode;
		size++;
	}

	public boolean removeFirst() {
		if (isEmpty()) {
			System.out.println("Empty List");
			return false;
		}
//		head.next.prev = null;
		head = head.next;
		if (head != null)
			head.prev = null;
		size--;
		return true;
	}

	public boolean removeLast() {
		if (isEmpty()) {
			System.out.println("Empty List");
			return false;
		}
		if (head.next == null) {
			head = null;
			size--;
			return true;
		}
		DoublyNode current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next.prev = null;
		current.next = null;
		size--;
		return true;
	}

	public boolean removeIndex(int index) {
		if (isEmpty()) {
			System.out.println("Empty List");
			return false;
		}
		if (index == 0) {
			removeFirst();
			return true;
		}
		if (index == size - 1) {
			removeLast();
			return true;
		}
		if (index > size || index < 0) {
			throw new ListIndexOutOfBoundsException();
		}
		int i = 0;
		DoublyNode current = head;
		while (i < index) {
			current = current.next;
			i++;
		}
		current.prev.next = current.next;
		if (current.next != null) {
			current.next.prev = current.prev;
		}
		current.next = null;
		size--;
		return true;
	}

	public String toString() {
		System.out.println("Size = " + size);
		if (isEmpty()) {
			return "[ ]";
		}
		DoublyNode current = head;
		String list = "[";
//		takes element till second last
		while (current.next != null) {
			list += current.data + " -> ";
			current = current.next;
		}
//		adding last element
		list += current.data + "]";

		return list;
	}

	public boolean isEmpty() {
		return head == null;
	}

}

class DoublyNode {
	int data;
	DoublyNode prev;
	DoublyNode next;

	public DoublyNode(int data) {
		super();
		this.data = data;
	}
}
