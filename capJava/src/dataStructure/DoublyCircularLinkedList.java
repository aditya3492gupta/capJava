package dataStructure;

public class DoublyCircularLinkedList {
	NodeDC head;
	int size;

	public void append(int data) {
		NodeDC newNode = new NodeDC(data);
		if (isEmpty()) {
			head = newNode;
			head.next = head;
			size++;
			return;
		}
		NodeDC current = head;
		while (current.next != head) {
			current = current.next;
		}
		newNode.prev = current;
		current.next = newNode;
		newNode.next = head;
		head.prev = newNode;
		size++;

	}

	public void prepend(int data) {
		NodeDC newNode = new NodeDC(data);
		if (isEmpty()) {
			head = newNode;
			head.next = head;
			size++;
			return;
		}
		NodeDC current = head;
		while (current.next != head) {
			current = current.next;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		current.next = newNode;
		head.prev = current;
		size++;
	}

	public boolean removeFirst() {
		if (isEmpty()) {
			System.out.println("Empty List");
			return false;
		}
		if (size == 1) {
			size--;
			head = null;
			return true;
		}
		size--;
		NodeDC current = head;
		while (current.next != head) {
			current = current.next;
		}
		head = head.next;
		head.prev = current;
		current.next = head;
		return true;
	}

	public boolean removeLast() {
		if (isEmpty()) {
			System.out.println("Empty List");
			return false;
		}
		if (size == 1) {
			size = 0;
			head = null;
			return true;
		}
		size--;
		NodeDC current = head;
		while (current.next.next != head) {
			current = current.next;
		}
		current.next = head;
		head.prev = current;
		return true;
	}

	public String toString() {
		System.out.println("Size = " + size);
		if (isEmpty()) {
			return "[ ]";
		}
		NodeDC current = head;
		String list = "[";

		while (current.next != head) {
			list += current.data + " -> ";
			current = current.next;
		}

		list += current.data + "]";
		return list;

	}

	public boolean isEmpty() {
		return head == null;
	}
}

class NodeDC {
	int data;
	NodeDC next;
	NodeDC prev;

	public NodeDC(int data) {
		this.data = data;
	}
}
