package capJava;

public class StackCall {
	static int num = 0;
	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		System.out.println("main end");
	}
	public static void m1(){
//		System.out.println("m1 start");
		num++;
		m2();
//		System.out.println("m1 end");
	}
	public static void m2(){
//		System.out.println("m2 start");
//		m3();
		System.out.println(num);
		m1();
	}
	
}
