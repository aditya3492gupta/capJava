package capJava;

public class PrintChar {

	public static void main(String[] args) {
		
		printC('Y');
		printC('s');
		printC('U');

	}
	public static void printC(char ch) {
		System.out.println(ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : "LowerCase");
	}

}
	