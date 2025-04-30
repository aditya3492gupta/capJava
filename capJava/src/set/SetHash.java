package set;

import java.util.HashSet;
import java.util.Set;

public class SetHash {
	public static void main(String[] args) {
		Set<Integer> st = new HashSet<Integer>();
		st.add(1);
		st.add(8);
		st.add(9);
		st.add(5);
		st.add(100);
		st.add(6);
		st.add(7);
		System.out.println(st);
	}
}
