package interfaceP;																																																														

public class InterfaceImpl implements IntoInterface {
	public static void main(String[] args) {
		IntoInterface i = new InterfaceImpl();
		i.m1();
		IntoInterface i1 = new InterfaceImpl();
		i.m1();
	}
}
