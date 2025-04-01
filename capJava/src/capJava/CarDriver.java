package capJava;

public class CarDriver {
	public static void main(String[] args) {
		Engine eng = new Engine(4,"4","petrol");
		CarE c = new CarE("Maruti", eng);
		System.out.println(c.getBrand());
		System.out.println(c.getEngine().getType());
		c.getMirror();
		System.out.println(c.mirror[0].brand);
		
	}
}
