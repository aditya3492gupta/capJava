package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;


public class TreeSetUser {
	public static void main(String[] args) {
		TreeSet<Integer> i = new TreeSet<>();
		i.add(10);
		i.add(100);
		i.add(3);
		i.add(5);
		i.add(8);
		System.out.println(i);
		System.out.println(i.higher(5));
		System.out.println(i.lower(5));
		System.out.println(i.last());
		System.out.println(i.first());
		
		
		TreeSet<Device> d = new TreeSet<>();
		d.add(new Device("abc", 5000, 2023));
		d.add(new Device("def", 7000, 2019));
		d.add(new Device("gfi", 2000, 2020));
		d.add(new Device("xyz", 56000, 2025));
		d.add(new Device("aag", 78000, 2021));
		System.out.println(d);
	}
}


class DeviceComparator implements Comparator<Device>{

	@Override
	public int compare(Device o1, Device o2) {
		// TODO Auto-generated method stub
		return o1.amount - o2.amount;
	}
	
}

class Device implements Comparable<Device>{
	String name;
	int amount;
	Integer year;
	public Device(String name, int amount, int year) {
		this.name = name;
		this.amount = amount;
		this.year = year;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, name, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		return amount == other.amount && Objects.equals(name, other.name) && year == other.year;
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", amount=" + amount + ", year=" + year + "]";
	}
	@Override
	public int compareTo(Device o) {
		// TODO Auto-generated method stub
		return o.year.compareTo(this.year);
	}
	
}