package dataStructure;

import java.util.EmptyStackException;

public class BrowserStack {
	NodeBrowser head;
	int size;

	public void push(String data) {
		NodeBrowser newNode = new NodeBrowser(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public String pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		String x = head.data;
		head = head.next;
		size--;
		return x;
	}
	
	public String peek() {
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	public int getSize() {
		return size;
	}

}

class NodeBrowser {
	String data;
	NodeBrowser next;

	public NodeBrowser(String data) {
		this.data = data;
	}
}