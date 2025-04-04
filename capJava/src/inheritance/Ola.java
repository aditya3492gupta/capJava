package inheritance;

import java.util.*;

public class Ola {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Auto");
		System.out.println("2. Bike");
		System.out.println("3. Sedan");
		int type = sc.nextInt();
		Cab cab = null;
		switch (type) {
		case 1:
			cab = new Auto("Auto");
			break;
		case 2:
			cab = new Bike("Bike");
			break;
		case 3:
			cab = new Sedan("Sedan");
			break;
		default:
			System.out.println("Invalid Input");
		}
		System.out.println((cab instanceof Object));
		if (cab instanceof Auto) {
//			System.out.println(cab.price); cannot use this because child class is upcasted and to access the methods and members of child class it needs to be downcasted
			Auto auto = (Auto) cab;
			System.out.println(auto.type);
			System.out.println(auto.price);
		} else if (cab instanceof Sedan) {
			Sedan sedan = (Sedan) cab;
			System.out.println(sedan.type);
			System.out.println(sedan.price);
		}
		if (cab instanceof Bike) {
			Bike bike = (Bike) cab;
			System.out.println(bike.type);
			System.out.println(bike.price);
		}
	}
}
