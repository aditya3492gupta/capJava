package polymorphism;

public class CityDriver {
	public static void main(String[] args) {
		City c = new City("abc", 2000, 032, "xyz");
		City c1 = new City("abc", 2000, 032, "xyz");
		System.out.println(c);
		System.out.println(c.equals(c1));
	}

}
