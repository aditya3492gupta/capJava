package capJava;

public class TypeOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(5, 3));
		System.out.println(add(5.36, 5.2));
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static double add(double a, double b) {
		return a + b;
	}
}
