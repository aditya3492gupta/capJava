package dataStructure;

public class QueueLL {
	NodeQ head;
	NodeQ tail;
	int size;

	public void enqueue(int data) {
		NodeQ newNode = new NodeQ(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			size++;
			return;
		}
		tail.next = newNode;
		tail = newNode;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Empty");
			return Integer.MAX_VALUE;
		}
		int data = head.data;
		head = head.next;
		size--;
		return data;
	}

	public void print() {
		System.out.println("Size = " + size);
		if (isEmpty()) {
			System.out.println("||");
			return;
		}
		System.out.print("|");
		NodeQ current = head;
		while (current != null) {
			System.out.print(current.data + "|");
			current = current.next;
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return head == null;
	}
}

class NodeQ {
	int data;
	NodeQ next;

	public NodeQ(int data) {
		this.data = data;
	}
}
