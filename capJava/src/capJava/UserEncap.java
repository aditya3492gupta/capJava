package capJava;

public class UserEncap {
	private String name;
	private int age;
	private String city;
	
//	public UserEncap(String name, int age, String city) {
//		this.name = name;
//		this.age = age;
//		this.city = city;
//	}
	
	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public int getAge() {
		return this.age;
	}
}
