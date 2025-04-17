package MPractice;

public class AnimalClass implements Hospital,Animal	 {
	public void sleep(String name) {
		System.out.println(name + " is sleeping");
	}

	public void eat(String name) {
		System.out.println(name + " is eating");
	}

	public void admit(String name) {
		System.out.println(name + " is in ot");
	}

	public void sleep(int name) {
		System.out.println("Take 8 hour sleep");
	}
}
