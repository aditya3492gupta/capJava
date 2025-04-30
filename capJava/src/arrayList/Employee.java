package arrayList;

//import java.util.Iterator;
//import java.util.Objects;
import java.util.*;



public class Employee {
	public static void main(String[] args) {
		Vector<Detail> emp = new Vector<>();
		emp.add(new Detail("sed",3,"Male"));
		emp.add(new Detail("abc",1,"Male"));
		emp.add(new Detail("vds",4,"Female"));
		emp.add(new Detail("ghi",2,"Female"));
		
		
		System.out.println(emp);
		
		
//		Iterator<Detail> i = emp.iterator();
//		while(i.hasNext()) {
//			Detail d = i.next();
//			if(d.name.equals("abc")) {
//				i.remove();
//			}
//		}
//		System.out.println(emp);
		
		emp.sort(new MarkComparator());
		
//		Collections.sort(emp, (o1, o2) -> o1.gender.compareTo(o2.gender));
		System.out.println(emp);
		
	}
}

class MarkComparator implements Comparator<Detail>{

	@Override
	public int compare(Detail o1, Detail o2) {
		// TODO Auto-generated method stub
		return o2.id - o1.id;
	}

	
	
}

class Detail{
	String name;
	int id;
	String gender;
	public Detail(String name, int id, String gender) {
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		return Objects.hash(gender, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Detail other = (Detail) obj;
		return Objects.equals(gender, other.gender) && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Detail [name=" + name + ", id=" + id + ", gender=" + gender + "]";
	}
	
	public int compare(Detail o1, Detail o2) {
        return Integer.compare(o1.id, o2.id);
    }
	
}
