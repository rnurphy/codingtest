package codingtest.ct.week07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// 프로그래머스
// 두 개 뽑아서 더하기
public class Test10 {
	public static void main(String[] args) {
		
		int[] numbers = { 2,1,3,4,1 };
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		Iterator<Integer> it = set.iterator();

		while(it.hasNext()) {
			list.add(it.next());
		}
		
		Collections.sort(list);
		
	

	}
}
