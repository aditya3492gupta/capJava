package interfaceP;

public class PrivateNonStatic implements P10 {
	public static void main(String[] args) {
		PrivateNonStatic a = new PrivateNonStatic();
		a.m1();
	}
}
interface P10 {
	
	default void m1() {
		System.out.println("P1 Method");
		privateMethod();
	}
	private void privateMethod() {
		System.out.println("Private non static method");
	}
}
