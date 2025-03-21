package capJava;

public class ArgCall {

	public static void main(String[] args) {
		add(20,30);
		add(40,50);
		add(89,78);
		add(550,548);
		add(69,96);

	}
	public static void add(int n1, int n2) {
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}
}
