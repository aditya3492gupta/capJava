package dataStructure;

public class LinkedList {
	Node head;

//	add element at last
	public void append(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

//	adding data in the start of the list
	public void prepend(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

//	adding newNode at a particular index
	public void addIndex(int index, int data) {
//		if asked to add at the position of head
		if (index == 0) {
			prepend(data);
			return;
		}

		if (isEmpty()) {
			System.out.println("Empty list");
			return;
		}
		int len = findLength();
//		if asked to add at the last
		if (len == index) {
			append(data);
			return;
		}
//		if length of the current is less than the index asked to add the newNode
		if (len < index || index < 0) {
			throw new ListIndexOutOfBoundsException();
		}
		int i = 0;
		Node current = head;
		while (i < index - 1) {
			current = current.next;
			i++;
		}
		Node newNode = new Node(data);
		newNode.next = current.next;
		current.next = newNode;
	}

//	remove from start
	public boolean removeStart() {
		if (isEmpty()) {
			System.out.println("Return false");
			return false;
		}
		head = head.next;
		return true;
	}

//	remove node from last
	public boolean removeLast() {
		if (isEmpty()) {
			System.out.println("Empty list");
			return false;
		}
		if (head.next == null)
			head = null;
		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		return true;
	}

//	remove element using the index
	public boolean removeIndex(int index) {
		int len = findLength();
		if (index < 0 || index > len) {
			throw new ListIndexOutOfBoundsException();
		}
		if (index == 0) {
			removeStart();
			return true;
		}
		if (index == len) {
			removeLast();
			return true;
		}
		Node current = head;
		Node prev = null;
		int i = 0;
		while (i < index) {
			prev = current;
			current = current.next;
			i++;
		}
		prev.next = current.next;
		current.next = null;
		return true;
	}

//	return the address of the node using the index
	public Node getNode(int index) {
		if (isEmpty()) {
			System.out.println("EMpty list");
			return null;
		}
		int len = findLength();
		if (index > len || index < 0) {
			throw new ListIndexOutOfBoundsException();
		}
		int i = 0;
		Node current = head;
		Node prev = null;
		while (i != index) {
			prev = current;
			current = current.next;
			i++;
		}
		return prev.next;
	}

//	checks if the list contains a particular data or not
	public boolean containsData(int val) {
		Node current = head;
		while (current != null) {
			if (current.data == val) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

//	checks if the linked list is empty or not
	public boolean isEmpty() {
		return head == null;
	}

//	Overridden toString method
	public String toString() {
		if (isEmpty()) {
			return "[ ]";
		}
		Node current = head;
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

//  finds the length of the list
	public int findLength() {
		int len = 0;
		Node current = head;
		while (current != null) {
			current = current.next;
			len++;
		}
		return len;
	}
}

// structure of the node of the linked list
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}