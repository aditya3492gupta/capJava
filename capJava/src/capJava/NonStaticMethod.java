package capJava;

public class NonStaticMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	public void m1() {
		NonStaticMethod d1 = new NonStaticMethod();
		d1.m1();
	}
}
