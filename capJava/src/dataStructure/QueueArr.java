package dataStructure;

public class QueueArr {
	private int[] queue;
	private int front, rear;
	int curSize;

	public QueueArr(int size) {
		queue = new int[size];
		front = 0;
		rear = -1;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear = (rear + 1) % queue.length;
		queue[rear] = data;
		curSize++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MAX_VALUE;
		}
		curSize--;
		int x = queue[front];
		front = (front + 1) % queue.length;
		return x;
	}

	public boolean isFull() {
		return curSize == queue.length;
	}

	public boolean isEmpty() {
		return curSize == 0;
	}

	public void print() {
		System.out.println(curSize);
		if(isEmpty()) {
			System.out.println("||");
			return;
		}
//		System.out.println(front + " " + rear);
		System.out.print("|");
//		if (front < rear) {
//			for (int i = front; i <= rear; i++) {
//				System.out.print(queue[i] + "|");
//			}
//		} else {
//			for (int i = front; i < queue.length; i++) {
//				System.out.print(queue[i] + "|");
//			}
//			for (int i = 0; i <= rear; i++) {
//				System.out.print(queue[i] + "|");
//			}
//		}
		for(int i = 0 ; i < curSize ; i++) {
			System.out.print(queue[((front + i) % queue.length)] + "|");
		}
		System.out.println();
	}

}
