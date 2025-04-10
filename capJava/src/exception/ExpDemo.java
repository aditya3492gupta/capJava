package exception;

public class ExpDemo {
	public static void main(String[] args) {
		Product p = null;
		System.out.println("start");
		try {
			System.out.println(p.price);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		} finally {
			System.out.println("End");
		}
	}
}
