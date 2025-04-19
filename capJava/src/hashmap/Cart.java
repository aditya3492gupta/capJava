package hashmap;

public class Cart {
	
	CartHash items = new CartHash();

	public void addProduct(Product p, int qty) {
		items.put(p, qty);
	}

	public void remove(Product p) {
		System.out.println((items.remove(p)));
	}

	public double getTotal(Product p) {
		return items.getKey(p);
	}

	public void displayCart(Product p) {
		System.out.println(items.get(p));
	}
}
