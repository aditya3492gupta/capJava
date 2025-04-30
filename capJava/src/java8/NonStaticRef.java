package java8;

public class NonStaticRef<T> {
	public static void main(String[] args) {
		NonStaticRef<Integer> obj = new NonStaticRef();
		System.out.println(obj.test(20, 10, (a, b) -> a - b));
	}

	public T test(T o1, T o2, Function<T> f) {
		return f.action(o1, o2);
	}
}

interface Function<T> {
	T action(T o1, T o2);
}
