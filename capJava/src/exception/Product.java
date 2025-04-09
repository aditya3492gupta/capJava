package exception;

public class Product {
	String type;
	int price;
	Product(String type, int price) {
		this.price = price;
		this.type = type;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
