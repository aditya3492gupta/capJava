package inheritance;

public class Zoo{
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		Animal a1 = new Cow();
		a1.sound();
		Animal a2 = new Dog();
		a2.sound();
		Animal a3 = new Cat();
		a3.sound();
	}
}
