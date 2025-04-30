package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(30);

//		List<Integer> newList = list.stream().map((element) -> element * element).toList();
//		System.out.println(newList);

		List<Integer> newList = list.stream().map((element) -> element * element).collect(Collectors.toList());
		System.out.println(newList);
		newList.add(20);
		System.out.println(newList);

		Optional<Integer> sum = list.stream().filter(e -> e % 2 == 0).map((element) -> element * element)
				.reduce((a, b) -> a + b);
		System.out.println(sum.get());
	}
}
