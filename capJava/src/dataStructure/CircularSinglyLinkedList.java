package dataStructure;

public class CircularSinglyLinkedList {
	private class CirSingNode {
		int data;
		CirSingNode next;

		CirSingNode(int data) {
			this.data = data;
		}
	}

	CirSingNode head;
	private int size;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void append(int data) {
		CirSingNode newNode = new CirSingNode(data);
		if (isEmpty()) {
			head = newNode;
			head.next = head;
			size++;
			return;
		}
		CirSingNode current = head;
		while (current.next != head) {
			current = current.next;
		}
		current.next = newNode;
		newNode.next = head;
		size++;
	}

	public void prepend(int data) {
		CirSingNode newNode = new CirSingNode(data);
		if (isEmpty()) {
			head = newNode;
			head.next = head;
			size++;
			return;
		}
		CirSingNode current = head;
		while (current.next != head) {
			current = current.next;
		}
		current.next = newNode;
		newNode.next = head;
		head = newNode;
		size++;
	}

	public boolean removeFirst() {
		if (isEmpty()) {
			System.out.println("Empty List");
			return false;
		}
		CirSingNode current = head;
		while (current.next != head) {
			current = current.next;
		}
		head = head.next;
		current.next = head;
		size--;
		return true;
	}
	
	public boolean removeLast() {
		if(isEmpty()) {
			System.out.println("Empty List");
			return false;
		}
		if(size == 1) {
			head = null;
			size--;
			return true;
		}
		CirSingNode current = head;
		while(current.next.next != head) {
			current = current.next;
		}
		current.next = head;
		size--;
		return true;
	}

	public String toString() {
		System.out.println("Size = " + size);
		if (isEmpty())
			return "[]";
		StringBuffer data = new StringBuffer("[");
		CirSingNode temp = head;
		while (temp.next != head) {
			data.append(temp.data + " -> ");
			temp = temp.next;
		}
		data.append(temp.data + "]");
		return data.toString();
	}

}
