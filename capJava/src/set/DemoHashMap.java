package set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class DemoHashMap {
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		mp.put(12, "abs");
		mp.put(24, "jnvjf");
		mp.put(1,"dfd");
		mp.put(45, "rohit");
		mp.put(23, "cdef");
		Set<Integer> st = mp.keySet();
		Iterator<Integer> i = st.iterator();
		while(i.hasNext()) {
			Integer temp = i.next();
			System.out.println(temp + " : " + mp.get(temp));
		}
		
		Collection<String>values = mp.values();
		for(String s : values) {
			System.out.println(s);
		}
		
		Set<Map.Entry<Integer, String>> e = mp.entrySet();
		Iterator<Map.Entry<Integer, String>> mpi = e.iterator();
		while(mpi.hasNext()) {
			Map.Entry<Integer, String> temp = mpi.next();
			if(temp.getValue().equals("rohit")) {
				temp.setValue("greif");
			}
		}
		System.out.println(mp);
		
		
		Map<Player, Country> player = new LinkedHashMap<>();
		player.put(new Player("abc",1,20), new Country("India",1));
		player.put(new Player("cvj",3,30), new Country("Australia",2));
		player.put(new Player("qo",2,24), new Country("England",4));
		player.put(new Player("okxs",5,29), new Country("Africa",3));
//		System.out.println(player);
		
		for(Map.Entry<Player, Country> j : player.entrySet()) {
			System.out.println(j);
		}
		System.out.println("-----------");
		player.put(new Player("abc",1,20), new Country("India",2));
		player.replace(new Player("hbh",3,30), new Country("Australia",1));
		for(Map.Entry<Player, Country> j : player.entrySet()) {
			System.out.println(j);
		}	
	}
}

class Player{
	String name;
	int number;
	int age;
	public Player(String name, int number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return age == other.age && Objects.equals(name, other.name) && number == other.number;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", number=" + number + ", age=" + age + "]";
	}
	
	
}

class Country{
	String name;
	int rank;
	public Country(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", rank=" + rank + "]";
	}
	
}
