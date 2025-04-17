package MPractice;

public class Dog {
	public static void main(String[] args) {
		AnimalClass dog = new AnimalClass();
		dog.eat("Dog");
		dog.sleep("Dog");
		Animal.bark("Dog");
		System.out.println(Animal.age);
		System.out.println(AnimalClass.age);
		dog.admit("dog");
		dog.sleep(8); 
		dog.catchBall("Dog", 10);
	}
}
