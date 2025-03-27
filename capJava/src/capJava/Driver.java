package capJava;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Car 1");
		Car c1 = new Car();
		c1.brandName = sc.nextLine();
		c1.price = sc.nextInt();
		c1.seatSize = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Car 2");
		Car c2 = new Car();
		c2.brandName = sc.nextLine();
		c2.price = sc.nextInt();
		c2.seatSize = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Car 3");
		Car c3 = new Car();
		c3.brandName = sc.nextLine();
		c3.price = sc.nextInt();
		c3.seatSize = sc.nextInt();
		
		System.out.println("Car 1");
		System.out.println(c1.brandName);
		System.out.println(c1.price);
		System.out.println(c1.seatSize);
		
		System.out.println("Car 2");
		System.out.println(c2.brandName);
		System.out.println(c2.price);
		System.out.println(c2.seatSize);
		
		System.out.println("Car 3");
		System.out.println(c3.brandName);
		System.out.println(c3.price);
		System.out.println(c3.seatSize);
	}
}
