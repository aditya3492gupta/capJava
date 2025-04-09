package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcepProp {
	public static void main(String[] args) throws Exception {
		m1();
	}

	public static void m1() throws FileNotFoundException {
		m2();
	}

	public static void m2() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("demo.txt");
	}
}
