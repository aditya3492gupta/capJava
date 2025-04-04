package polymorphism;

public class City {
	String name;
	int eyear;
	int population;
	String mayor;

	public City(String name, int eyear, int population, String mayor) {
		super();
		this.name = name;
		this.eyear = eyear;
		this.population = population;
		this.mayor = mayor;
	}

//	@Override
	public String toString() {
		return "City [name=" + name + ", eyear=" + eyear + ", population=" + population + ", mayor=" + mayor + "]";
	}

	

//	public String toString() {
//		return "[name = " + this.name + ", Est Year = " + this.eyear + ", Pop = " + this.population + ", Mayor = "
//				+ this.mayor + "]";
//	}
	public boolean equals(Object obj) {
		if (obj instanceof City) {
			City ob = (City) obj;
			if (this.name.equals(ob.name) && this.eyear == ob.eyear)
				return true;
		}
		return false;
	}

}
