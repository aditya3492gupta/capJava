package capJava;

public class UserSingleton {
	private static UserSingleton userConnection;
	
	private String name;
	private int age;

	private UserSingleton(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}

	public static UserSingleton getUserSingleton(String name, int age) {
		if(userConnection == null) {
			userConnection = new UserSingleton(name, age);
		}
		return userConnection;
	}
}
