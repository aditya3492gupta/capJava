package capJava;

public class Engine {
	private int noOfPosition;
	private String power;
	private String type;

	public int getNoOfPosition() {
		return noOfPosition;
	}

	public void setNoOfPosition(int noOfPosition) {
		this.noOfPosition = noOfPosition;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public Engine(int noOfPosition, String power, String type) {
		this.noOfPosition = noOfPosition;
		this.power = power;
		this.type = type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
