package hashmap;

public class HashMapDriver {
	public static void main(String[] args) {
		HashMap mp = new HashMap();
		System.out.println(mp.get(10));
		mp.put(10, "a");
		mp.put(20, "b");
		mp.put(20, "c");
		mp.put(40, "d");
		mp.put(50, "e");
		mp.put(60, "e");
		mp.put(70, "e");
		mp.put(80, "e");
		mp.put(90, "e");
		mp.put(100, "e");
		System.out.println(mp.get(100));
		System.out.println(mp.remove(100));
	}
}
