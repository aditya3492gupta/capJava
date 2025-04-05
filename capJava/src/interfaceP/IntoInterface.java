package interfaceP;

public interface IntoInterface {
	int a = 20;
//	int i = 0;
	default void m1() {
		int i =0;
		System.out.println("Default Method");
		System.out.println(i);
		i++;
		System.out.println(i);
	}
	public static void main(String[] args) {
		System.out.println("Interface");
	}
}
