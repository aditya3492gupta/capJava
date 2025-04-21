package hashmap;

public interface StudentManager {
	public static ChainMethod getStdentObject(String name, int age) {
		ChainMethod s = new ChainMethod(name, age);
		return s;
	}
}
