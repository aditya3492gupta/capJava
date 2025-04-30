package java8;

public class StaticRef {
	public static void main(String[] args) {
		Demo add = StaticRef::add;
		add.action(1, 3);

	}

	public static void add(int c, int d) {
		System.out.println(c + d);
	}

}

interface Demo {
	void action(int a, int b);
}
