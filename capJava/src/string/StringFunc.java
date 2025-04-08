package string;

public class StringFunc {
	public static void main(String[] args) {
		String s = "hi hello world!";
		System.out.println("length " + s.length());
		System.out.println("char at 5 " + s.charAt(5));
		System.out.println("substring s at  "+s.substring(4));
		System.out.println("substring s at 4 ,8 "+s.substring(4, 9));
		String s2 = "hi Hello world!";
		System.out.println("equals " + s.equals(s2));
		System.out.println("equal ignore case " + s.equalsIgnoreCase(s2));
		System.out.println("compare " + s.compareTo(s2));
		
		String s1 = null;
		String str = "     ";
		System.out.println("is empty " + str.isEmpty());
		System.out.println("is blank " + str.isBlank());
		System.out.println("is empty " + s1.isEmpty());
		
	}
}
