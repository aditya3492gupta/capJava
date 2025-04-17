package MPractice;

public interface Hospital extends Animal{
	public void admit(String name);
	public void sleep(String name);
	default void catchBall(String name, int a) {
		this.sleep(name);
		System.out.println(name + " dropped the ball");
	}
}
