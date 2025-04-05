package abstraction;

public class OneDriver {
	public static void main(String[] args) {
		One o = new OneOperations();
		int add = o.add(5, 6);
		System.out.println(add);
	}
}
