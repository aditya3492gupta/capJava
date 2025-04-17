package dataStructure;

public class QueueLLDriver {
	public static void main(String[] args) {
		QueueLL q = new QueueLL();
		q.print();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.print();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.print();
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.print();
	}
}
