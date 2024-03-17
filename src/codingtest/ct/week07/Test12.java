package codingtest.ct.week07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 프로그래머스
// 개인정보 수집 유효기간
public class Test12 {
	 public static void main(String[] args) {
		 String today = "2022.05.19";
		 String[] terms = { "A 6", "B 12", "C 3" };
		 String[] privacies = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };
		 
		 List<Integer> list = new ArrayList<Integer>();
		 
		 Map<String, String> map = new HashMap<String, String>();
		 
		 for(int i = 0; i < terms.length; i++) {
			 String[] tData = terms[i].split(" ");
			 map.put(tData[0], tData[1]);
		 }

		 String[] todayStr = today.split("\\.");
		 
		 int todayValue = Integer.parseInt(calculateY(todayStr[0]))
				 + Integer.parseInt(calculateM(todayStr[1]))
				 + Integer.parseInt(calculateD(todayStr[2]));
		 	
		 for(int i = 0; i < privacies.length; i++) {
			 String[] pData = privacies[i].split(" ");
			 String[] ppData = pData[0].split("\\.");
			 
			 int pppValue = Integer.parseInt(calculateY(ppData[0]))
					 + Integer.parseInt(calculateM(ppData[1]))
					 + Integer.parseInt(calculateD(ppData[2]));
			 
			 int termValue = Integer.parseInt(map.get(pData[1])) * 28;
			 
			 if(todayValue - pppValue >= termValue) {	// 파기
				 list.add(i + 1);
			 }
		 }
		 
		 int[] answer = new int[list.size()];
		 
		 for(int i = 0; i < answer.length; i++) {
			 answer[i] = list.get(i);
		 }
		 
	}
	 
	 
	 public static String calculateY(String str) {
		 return Integer.toString((Integer.parseInt(str) - 2000) * 12 * 28);
	 }
	 
	 public static String calculateM(String str) {
		 return Integer.toString((Integer.parseInt(str) * 28));
	 }
	 
	 public static String calculateD(String str) {
		 return Integer.toString(Integer.parseInt(str));
	 }
}
