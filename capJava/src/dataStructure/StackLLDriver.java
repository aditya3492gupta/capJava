package dataStructure;

public class StackLLDriver {
	public static void main(String[] args) {
		StackLL st = new StackLL();
		st.push(10);
		st.push(20);
		st.push(30);
		st.printList();
		st.pop();
		System.out.println(st.peek());
	}
}
