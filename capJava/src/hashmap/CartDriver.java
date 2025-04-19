package hashmap;

public class CartDriver {
	public static void main(String[] args) {
		Product p1 = new Product(1,"abes",2.0);
		Product p2 = new Product(2, "rpm", 100);
		
		
		
		Cart c1 = new Cart();
		c1.addProduct(p1, 10);
		System.out.println(c1.getTotal(p1));
		c1.displayCart(p1);
		c1.addProduct(p1, 20);
		c1.displayCart(p1);
		
		c1.addProduct(p2, 10);
		System.out.println(c1.getTotal(p2));
		
	}
}
