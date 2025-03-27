package capJava;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l = new Laptop("Dell", "i3",15.7, 8);
		l.printData();
//		System.out.println(l.brand);
//		System.out.println(l.processor);
//		System.out.println(l.ramSize);
//		System.out.println(l.screenSize);
		Laptop l1 = new Laptop("Hp", 8, 14);
		l1.printData();
//		System.out.println(l1.brand);
//		System.out.println(l1.ramSize);
//		System.out.println(l1.screenSize);
	}
}
