package codingtest.ct.week08;

import java.util.HashMap;
import java.util.Map;

// 프로그래머스 달리기 경주
public class Race {

	public static void main(String[] args) {
		String[] players = { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = { "kai", "kai", "mine", "mine" };
		String[] answer = new String[players.length];
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}
		
		System.out.println(map);
		
		for(int i = 0; i < callings.length; i++) {
			int n = map.get(callings[i]);
			String p = players[n - 1];
			
			players[n - 1] = callings[i];
			players[n] = p;	

			map.put(p, n);
			map.put(callings[i], n - 1);
		}
		
		
		System.out.println(map);
	}

}
