package capJava;

public class CarE {
	private String brand;
//	private Engine eng = new Engine(4,"4","petrol");

//	{
//		eng = new Engine(4,"4","petrol");
//	}

	private Engine eng;

	CarE(String brand, Engine eng) {
		this.brand = brand;
		this.eng = eng;
	}

	public String getBrand() {
		return brand;
	}

	public CarE(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return eng;
	}

	public void setEngine(Engine eng) {
		this.eng = eng;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

//	lazy instantiation
	Mirror[] mirror;

	void getMirror() {
		mirror = new Mirror[4];
		for (int i = 0; i < 4; i++)
			mirror[i] = new Mirror();

	}

//	early instantiation
	Tyre[] tyre = new Tyre[4];
	{
		for (int i = 0; i < 4; i++)
			tyre[i] = new Tyre();
	}

}
