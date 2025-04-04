package inheritance;

class Animals {
	public void makeSound() {
		System.out.println("Generic animal sound");
	}
}

class Dogs extends Animals {
//	@Override
	public void makeSound() {
		System.out.println("Woof!");
	}
}

public class Example {

	public static void main(String[] args) {
		Animals animal = new Dogs(); // Upcasting: Dog object assigned to Animal reference
		animal.makeSound(); // Calls the Dog's makeSound() method (overridden method)
	}
}
