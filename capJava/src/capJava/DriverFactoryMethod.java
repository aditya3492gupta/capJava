package capJava;

public class DriverFactoryMethod {
	public static void main(String[] args) {
		UserFactoryMethod u = UserFactoryMethod.getUserFactoryMethod("adf", 6556);
		System.out.println(u.getName());
		System.out.println(u.getAge());
	}
}
