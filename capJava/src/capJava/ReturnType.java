package capJava;

public class ReturnType {

	public static void main(String[] args) {
		int sum = add(20, 30);
		System.out.println(sum);
		int s = sqr(9);
		System.out.println(s);

	}
	public static int add(int a, int b) {
		return a + b;
	}
	void sqr(int a) {
		System.out.println(a*a);
	}
}
