package hashmap;

public class ChainMethod {
	private String name;
	private int age;

	public ChainMethod(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public ChainMethod setName(String name) {
		this.name = name;
		return this;
	}

	public ChainMethod setAge(int age) {
		this.age = age;
		return this;
	}

	public int getAge() {
		return age;
	}
}
