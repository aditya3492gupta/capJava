package dataStructure;

public class StackArrDriver {
	public static void main(String[] args) {
		StackArr s = new StackArr(10);
		System.out.println(s.currentSize());
		s.push(5);
		s.push(6);
		s.push(1);
		s.push(2);
		s.push(8);
		s.push(7);
		s.push(10);
		s.printStack();
		s.pop();
		s.printStack();
		System.out.println(s.pop());
		s.printStack();
		System.out.println(s.peek());
		System.out.println(s.currentSize());
	}
}
