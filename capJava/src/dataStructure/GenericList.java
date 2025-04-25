package dataStructure;

public class GenericList<T extends Number> {
	LNode<T> head;

	public void append(T data) {
		LNode<T> newNode = new LNode<>(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		LNode<T> current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public void prepend(T data) {
		LNode<T> newNode = new LNode<>(data);
		newNode.next = head;
		head = newNode;
	}

	public void addIndex(int index, T data) {
		if (index == 0) {
			prepend(data);
			return;
		}
		if (isEmpty()) {
			System.out.println("Empty list");
			return;
		}
		int len = findLength();
		if (len == index) {
			append(data);
			return;
		}
		if (len < index || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		int i = 0;
		LNode<T> current = head;
		while (i < index - 1) {
			current = current.next;
			i++;
		}
		LNode<T> newNode = new LNode<>(data);
		newNode.next = current.next;
		current.next = newNode;
	}

	public boolean removeStart() {
		if (isEmpty()) {
			System.out.println("Return false");
			return false;
		}
		head = head.next;
		return true;
	}

	public boolean removeLast() {
		if (isEmpty()) {
			System.out.println("Empty list");
			return false;
		}
		if (head.next == null) {
			head = null;
			return true;
		}
		LNode<T> current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		return true;
	}

	public boolean removeIndex(int index) {
		int len = findLength();
		if (index < 0 || index >= len) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			return removeStart();
		}
		LNode<T> current = head;
		LNode<T> prev = null;
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

	public LNode<T> getNode(int index) {
		if (isEmpty()) {
			System.out.println("Empty list");
			return null;
		}
		int len = findLength();
		if (index >= len || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		LNode<T> current = head;
		int i = 0;
		while (i < index) {
			current = current.next;
			i++;
		}
		return current;
	}

	public boolean containsData(T val) {
		LNode<T> current = head;
		while (current != null) {
			if (current.data.equals(val)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public String toString() {
		if (isEmpty()) {
			return "[ ]";
		}
		LNode<T> current = head;
		StringBuilder list = new StringBuilder("[");
		while (current.next != null) {
			list.append(current.data).append(" -> ");
			current = current.next;
		}
		list.append(current.data).append("]");
		return list.toString();
	}

	public int findLength() {
		int len = 0;
		LNode<T> current = head;
		while (current != null) {
			current = current.next;
			len++;
		}
		return len;
	}
}

class LNode<T extends Number> {
	T data;
	LNode<T> next;

	LNode(T data) {
		this.data = data;
	}

	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}
