package intro;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Read {
	public static void main(String[] args) throws IOException {
		File f = new File("demo.json");
//		f.createNewFile();
		ObjectMapper mapper = new ObjectMapper();
		Student s1 = mapper.readValue(f,Student.class);
		System.out.println(s1.getAge());
		System.out.println(s1.getAdd().getCity());
		System.out.println(Arrays.toString(s1.getPhoneNumber()));
	}
}

class Student {
	String name;
	int age;
	String email;
	Address add;
	long [] phoneNumber;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public long[] getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
class Address{
	String city;
	String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
