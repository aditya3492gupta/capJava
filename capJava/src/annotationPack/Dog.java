package annotationPack;

public class Dog {
	@CustomAnno(times = 3)
	public void kato() {
		System.out.println("bite");
	}

	public void bhoko() {
		System.out.println("bark");
	}
}
