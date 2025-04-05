package interfaceP;

public class Diamond2 implements P11, P22 {
	public void m1() {
		P22.super.m1();
	}

	public static void main(String[] args) {
		P22 obj2 = new Diamond2();
		obj2.m1();
	}

}

interface P11 {

	default void m1() {
		System.out.println("hi p1");
	}
}
interface P22 {
	
	default void m1() {
		System.out.println("hi p2");
	}
