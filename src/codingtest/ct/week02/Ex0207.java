package codingtest.ct.week02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex0207 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		set.add("A");
		
		for(String str : set) {
			System.out.println(str);
		}
		
		
	}
}
