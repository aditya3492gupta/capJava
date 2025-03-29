package capJava;

public class DriverSingleton {
	public static void main(String[] args) {
		UserSingleton u = UserSingleton.getUserSingleton("asf", 87);
		System.out.println(u);
		UserSingleton u1 = UserSingleton.getUserSingleton("asjbf", 487);
		System.out.println(u1);
	}
}
