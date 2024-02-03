package codingtest.ct.week02;

import java.util.Arrays;
import java.util.List;

public class Ex0204 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
		
		list1.toArray();
		System.out.println(list1);
	}
}
