package inheritance;

public class Parent {
	static int a = 10;
	int b = 20;
	static {
		System.out.println("Parent class static block");
	}
	
	{
		System.out.println("Parent class non static block");
	}

	public static void m() {
		System.out.println("Parent Class static method");
	}

	public void m1() {
		System.out.println("Parent Class non-static method");
	}

	Parent() {
		System.out.println("Parent class constructor");
	}

}
