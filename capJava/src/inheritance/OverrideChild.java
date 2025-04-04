package inheritance;

public class OverrideChild extends OverrideParent {
	public void marry() {
		System.out.println("Child");
	}
	public OverrideChild display() {
		System.out.println("non primitive child");
		return null;
	}
	public static void main(String[] args) {
		OverrideParent p = new OverrideChild();
		p.marry();
		OverrideParent ch = p.display();
	}
}
