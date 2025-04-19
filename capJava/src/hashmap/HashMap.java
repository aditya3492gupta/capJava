package hashmap;

public class HashMap {
	private class Node {
		Integer key;
		String value;
		Node next;

		Node(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	private Node[] buckets;
	private int capacity = 12;
	int size;
	private float loadFactor = 0.75f;

	public HashMap() {
		buckets = new Node[capacity];
		size = 0;
	}

	private int getIndex(Integer key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	public void put(Integer key, String value) {
		int index = getIndex(key);
		Node newNode = new Node(key, value);
		Node head = buckets[index];
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		newNode.next = buckets[index];
		buckets[index] = newNode;
		size++;
		if (size >= loadFactor * capacity)
			reSize();
	}

	public String remove(Integer key) {
		int index = getIndex(key);
		Node head = buckets[index];
		Node prev = null;
		while (head != null) {
			if (head.key.equals(key)) {
				if (prev == null) {
					buckets[index] = head.next;
				} else {
					prev.next = head.next;
				}
				size--;
				return head.value;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}

	public String get(Integer key) {
		int index = getIndex(key);
		Node head = buckets[index];
		while (head != null) {
			if (head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}

	public void reSize() {
		Node[] oldValues = buckets;
		capacity *= 2;
		buckets = new Node[capacity];
		size = 0;
		for (int i = 0; i < oldValues.length; i++) {
			Node head = oldValues[i];
			while (head != null) {
				put(head.key, head.value);
				head = head.next;
			}
		}
		System.out.println("resize done");
	}
}
