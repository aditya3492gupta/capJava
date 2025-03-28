package capJava;

public class NonStaticDemo {
	{
//		System.out.println(a);
		System.out.println("no static block 1");
	}
	int a = display();

	NonStaticDemo() {
		System.out.println("Constructor");
	}

	public int display() {
		System.out.println("method");
		return 100;
	}

	{
		System.out.println("no static block 2");
		System.out.println(a);
	}
}
