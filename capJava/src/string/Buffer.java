package string;

public class Buffer {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("njdnfjd");
		StringBuffer s2 = new StringBuffer("njdnfjd");
		String str = s1 + "";
		System.out.println(str);
		
		System.out.println(s1.toString().equals(s2.toString()));
	}
}
