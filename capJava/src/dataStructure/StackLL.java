package dataStructure;

import java.util.EmptyStackException;

public class StackLL {
	NodeLL head;
	int size;

	public void push(int data) {
		NodeLL newNode = new NodeLL(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		int x = head.data;
		head = head.next;
		size--;
		return x;
	}
	
	public int peek() {
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void printList() {
		NodeLL temp = head;
		while (temp != null) {
			System.out.println("| " + temp.data + " |");
			temp = temp.next;
		}
		System.out.println("------------");
	}

}

class NodeLL {
	int data;
	NodeLL next;

	public NodeLL(int data) {
		this.data = data;
	}
}
