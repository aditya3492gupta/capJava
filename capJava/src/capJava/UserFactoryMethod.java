package capJava;

public class UserFactoryMethod {
	private String name;
	private int age;
	private UserFactoryMethod(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public static UserFactoryMethod getUserFactoryMethod(String name, int age) {
		return new UserFactoryMethod(name, age);
	}
}
