package dataStructure;

public class QueueArrDriver {
	public static void main(String[] args) {
		QueueArr q = new QueueArr(5);
		q.print();
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.print();
	}
}
