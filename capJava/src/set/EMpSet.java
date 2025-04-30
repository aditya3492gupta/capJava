package set;

import java.util.*;

public class EMpSet {
	public static void main(String[] args) {
		Set<Emp> s = new HashSet<Emp>();
		s.add(new Emp("abc", 123, 20000));
		s.add(new Emp("ghi", 25, 27000));
		s.add(new Emp("ghi", 25, 27000));
//		System.out.println(s);
		for(Emp e : s) {
			System.out.println(e.name);
		}
	}
}

class Emp {
	String name;
	int id;
	Double salary;

	public Emp(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
}