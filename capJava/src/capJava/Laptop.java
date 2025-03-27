package capJava;

public class Laptop {
	String brand;
	String processor;
	double screenSize;
	int ramSize;
	Laptop(String brand, String processor, double screenSize, int ramSize){
		this.brand = brand;
		this.screenSize =screenSize;
		this.processor = processor;
		this.ramSize = ramSize;
	}
	Laptop(String brand, int ramSize, double screenSize){
		this.brand = brand;
		this.screenSize =screenSize;
		this.ramSize = ramSize;
	}
	Laptop(String brand, int ramSize){
		this.brand = brand;
		this.screenSize = screenSize;
	}
	void printData() {
		if(this.brand != null)
			System.out.println(this.brand);
		if(this.processor != null)
			System.out.println(this.processor);
		if(this.ramSize != 0)
			System.out.println(this.ramSize);
		if(this.screenSize != 0)
			System.out.println(this.screenSize);
		System.out.println("================");
	}
}
