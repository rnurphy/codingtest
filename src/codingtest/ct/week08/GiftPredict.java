package codingtest.ct.week08;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 프로그래머스 가장 많이 받은 선물
public class GiftPredict {

	public static void main(String[] args) {
		String[] friends = { "muzi", "ryan", "frodo", "neo" };
		String[] gifts = {  "muzi frodo",
							"muzi frodo",
							"ryan muzi",
							"ryan muzi",
							"ryan muzi",
							"frodo muzi",
							"frodo ryan",
							"neo muzi"    };
										
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < friends.length; i++) {
			map.put(friends[i], i);
		}
		
		int[] index = new int[friends.length];
		int[][] exchange = new int[friends.length][friends.length];
		
		for(int i = 0; i < gifts.length; i++) {
			String[] duo = gifts[i].split(" ");
			String sender = duo[0];
			String receiver = duo[1];
			
			exchange[map.get(sender)][map.get(receiver)] += 1;
			index[map.get(sender)] += 1;
			index[map.get(receiver)] -= 1;
		}
		
		int answer = 0;
		
		for(int i = 0; i < friends.length; i++) {
			int cnt = 0;
			for(int j = 0; j < friends.length; j++) {
				if(i == j) continue;
				if(exchange[i][j] > exchange[j][i]) {
					cnt++;
				}else if((exchange[i][j] == exchange[j][i]) && index[i] > index[j]) {
					cnt++;
				}
			}
			if(cnt > answer) {
				answer = cnt;
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
