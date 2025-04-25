package collectionArray;

public class Generics {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.data = 20;
		System.out.println(b1.data);
		Box<Double> b2 = new Box<>();
		b2.data = 20.11;
	}
}

class Box<T extends Number> {
	T data;
}

class Square<T extends Number, K extends Print> {
	T data;
}

interface Print {

}

class Laptop implements Comparable<Laptop> {
	int price;

	public Laptop() {
		this.price = price;
	}

	@Override
	public int compareTo(Laptop o) {
		if (this.price > o.price)
			return 1;
		else if (this.price < o.price)
			return -1;
		else
			return 0;
	}

}