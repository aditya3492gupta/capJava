package MPractice;

public class Dog extends AnimalClass {
	static int a = 10;
	
	public static void bark(String name) {
		System.out.println(name + " is barking main");
	}

	public static void main(String[] args) {
		int a = 20;
		System.out.println(a);
		AnimalClass dog = new AnimalClass();
		dog.eat("Dog");
		bark("Dog");
		dog.sleep("Dog");
		Animal.bark("Dog");
		System.out.println(Animal.age);
		System.out.println(AnimalClass.age);
		dog.admit("dog");
		dog.sleep(8);
		dog.catchBall("Dog", 10);
	}
}
