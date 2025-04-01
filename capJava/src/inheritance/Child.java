package inheritance;

public class Child extends Parent {
	static int c = 100;
	int d = 200;
	{
		System.out.println("Child class non static block");
	}
	static {
		System.out.println("Child class static block");
	}

	Child() {
		System.out.println("Child class constructor");
	}

	public static void m2() {
		System.out.println("Child Class static method");
	}

	public void m3() {
		System.out.println("Child Class non-static method");
	}

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		ch.m();
		ch.m1();
		System.out.println(ch.c);
		System.out.println(ch.d);
		m2();
		ch.m3();
	}
}
