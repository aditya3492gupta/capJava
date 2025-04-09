package exception;

public class DivideZero {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} finally {
			System.out.println("End");
		}
	}
}
