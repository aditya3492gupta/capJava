package capJava;

public class CustructorChaining {
	String uId;
	int password;
	String bio;

	CustructorChaining(String uId, int password) {
		this.uId = uId;
		this.password = password;
	}

	CustructorChaining(String uId, int password, String bio) {
		this(uId, password);
		this.bio = bio;
	}

	void data() {
		System.out.println(this.uId);
		System.out.println(this.bio);
		System.out.println(this.password);
		System.out.println("=================");
	}
}
