package hashmap;

public class CartHash {
	private class NodeHash {
		Product key;
		int value;
		NodeHash next;

		NodeHash(Product key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	private NodeHash[] buckets;
	private int capacity = 12;
	int size;
	private float loadFactor = 0.75f;

	public CartHash() {
		buckets = new NodeHash[capacity];
		size = 0;
	}

	private int getIndex(Product key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	public void put(Product key, int value) {
		int index = getIndex(key);
		NodeHash newNode = new NodeHash(key, value);
		NodeHash head = buckets[index];
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

	public Product remove(Product key) {
		int index = getIndex(key);
		NodeHash head = buckets[index];
		NodeHash prev = null;
		while (head != null) {
			if (head.key.equals(key)) {
				if (prev == null) {
					buckets[index] = head.next;
				} else {
					prev.next = head.next;
				}
				size--;
				return head.key;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}

	public Product get(Product key) {
		int index = getIndex(key);
		NodeHash head = buckets[index];
		while (head != null) {
			if (head.key.equals(key)) {
				return head.key;
			}
			head = head.next;
		}
		return null;
	}
	public double getKey(Product key) {
		int index = getIndex(key);
		NodeHash head = buckets[index];
		while (head != null) {
			if (head.key.equals(key)) {
				return (head.value * head.key.price);
			}
			head = head.next;
		}
		return 0;
	}

	public void reSize() {
		NodeHash[] oldValues = buckets;
		capacity *= 2;
		buckets = new NodeHash[capacity];
		size = 0;
		for (int i = 0; i < oldValues.length; i++) {
			NodeHash head = oldValues[i];
			while (head != null) {
				put(head.key, head.value);
				head = head.next;
			}
		}
		System.out.println("resize done");
	}
}
