package string;

public class SearchMatch {
	public static void main(String[] args) {
		String s = "hi hello world!";
		System.out.println("contains " + s.contains("hell"));
		System.out.println("index of " + s.indexOf("wo"));
		System.out.println("last index " + s.lastIndexOf("h")); 
		System.out.println("start with " + s.startsWith("hi"));
		System.out.println("ends with " + s.endsWith("d!"));
	}
}
