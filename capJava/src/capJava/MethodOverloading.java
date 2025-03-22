package capJava;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(5,3));
		System.out.println(add(5,3,6));
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
}
