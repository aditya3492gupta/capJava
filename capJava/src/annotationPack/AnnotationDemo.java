package annotationPack;

public class AnnotationDemo {
	public static void main(String[] args) {
		Child c = new Child();
		c.merry();
		@SuppressWarnings("unused")
		int a = 10;
//		System.out.println(a);
	}
}

class Parent{
	public void marry() {
		System.out.println("parent class");
	}
}

class Child extends Parent{
//	@Override
	public void merry() {
		System.out.println("child class");
	}
}
