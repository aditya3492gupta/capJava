package exception;

public class InvalidAge extends RuntimeException {
//	public class InvalidAge extends Exception/Throwable { for checked exception
	public InvalidAge() {
		super("Invalid age for access");
	}
}
