package hashmap;

public class ChainMethodDriver {
	public static void main(String[] args) {
		ChainMethod s1 = new ChainMethod("ABC", 10);
		System.out.println(s1.setName("DEF").getName());
	}
}
