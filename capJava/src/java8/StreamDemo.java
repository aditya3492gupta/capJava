package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(30);
		list.add(1041);
		
		list.stream().filter(element -> element % 2 == 0).forEach((element)-> System.out.println(element));
		
		Stream<Integer> s = list.stream().filter((element) -> {
			System.out.println("Filter");
			return element % 2 == 0;
		});
		s.forEach((ele)->System.out.println(ele));
		System.out.println(s);
		
		 list.stream().filter((element) -> {
				System.out.println("Filter");
				return element % 2 == 0;
			}).forEach(e -> System.out.println(e));
		 
		 List<Integer> l = list.stream().filter((element )-> {
			System.out.println(element);
			return element % 2 == 0;
		 }).toList();
		 System.out.println(l.size());

	}
}
