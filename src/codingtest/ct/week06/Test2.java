package codingtest.ct.week06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 프로그래머스
// 실패율
public class Test2 {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		
		int[] reach = new int[N + 1];
		int[] clear = new int[N + 1];
		
		int[] answer = new int[N];
	
		for(int i = 0; i < stages.length; i++) {
			for(int j = 0; j < stages[i]; j++) {
				clear[j]++;
			}
			reach[stages[i] - 1]++;
			
		}
		
		Map<Integer, Double> map = new HashMap<Integer, Double>();
		
		for(int i = 0; i < N; i++) {
			if(clear[i] == 0 || reach[i] == 0) {
				map.put(i + 1, 0.0);
			}else {
				map.put(i + 1, (double)reach[i] / clear[i]);
			}
			
		}
		
		List<Integer> list = new ArrayList<Integer>(map.keySet());
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return map.get(o2).compareTo(map.get(o1));
			}
			
		});
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		for(int x : answer) {
			System.out.print(x);
		}
	}
}	
