package codingtest.ct.week02;

import java.util.ArrayList;
import java.util.List;

public class Ex0203 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
		list.add("A");
		System.out.println(list.toString() + ", " + list.size());
		list.add("B");
		list.add("D");
		System.out.println(list.toString() + ", " + list.size());
		list.add(2, "C");
		list.add("F");
		System.out.println(list.toString() + ", " + list.size());
		list.set(4, "E");
		System.out.println(list.toString() + ", " + list.size());
		System.out.println(list.get(3));
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d 번째 숫자 : %s\n", i, list.get(i));
		}
		
		list.remove(1);
		list.remove("D");
		
		for (String s : list) {
			System.out.printf("문자 : %s\n", s);
		}
		
	}
}
