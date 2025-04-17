package MPractice;

public interface Animal {
	public abstract void eat(String name);

	public void sleep(String name);

	public static void bark(String name) {
		System.out.println(name + " is barking");
	}
	
	public int age = 30;
	
	default void catchBall(String name) {
		this.eat(name);
		System.out.println(name + " is catching the ball");
	}
}
