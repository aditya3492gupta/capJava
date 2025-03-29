package capJava;

public class DriverEncap {
	public static void main(String[] args) {
		UserEncap u = new UserEncap();
		u.setName("ads");
		System.out.println(u.getName());
		u.setCity("ajb");
		System.out.println(u.getCity());
		UserEncap u1 = new UserEncap();
		u1.setName("jhi");
		System.out.println(u1.getName());
	}
}
