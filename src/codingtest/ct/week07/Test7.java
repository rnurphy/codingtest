package codingtest.ct.week07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 프로그래머스
// 성격 유형 검사하기
public class Test7 {
	public static void main(String[] args) {
		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
		int[] choices = { 5, 3, 2, 7, 5 };
		
		Map<Integer, Integer> scores = new HashMap<Integer, Integer>();
		scores.put(1, 3);
		scores.put(2, 2);
		scores.put(3, 1);
		scores.put(4, 0);
		scores.put(5, 1);
		scores.put(6, 2);
		scores.put(7, 3);
		
		Map<Character, Integer> values = new HashMap<Character, Integer>();
		values.put('R', 0);
		values.put('T', 0);
		values.put('C', 0);
		values.put('F', 0);
		values.put('J', 0);
		values.put('M', 0);
		values.put('A', 0);
		values.put('N', 0);
		
		for(int i = 0; i < survey.length; i++) {
			String surveyValue = "";
			
			if(survey[i].equals("RT") || survey[i].equals("TR")) {
				surveyValue = survey[i];
				char left = surveyValue.charAt(0);
				char right = surveyValue.charAt(1);

				if(choices[i] == 4) continue;
				else if(choices[i] < 4) {
					values.put(left,  values.get(left) + scores.get(choices[i]));
				}else {
					values.put(right, values.get(right) + scores.get(choices[i]));				
				}
			}else if(survey[i].equals("CF") || survey[i].equals("FC")) {
				surveyValue = survey[i];
				char left = surveyValue.charAt(0);
				char right = surveyValue.charAt(1);

				if(choices[i] == 4) continue;
				else if(choices[i] < 4) {
					values.put(left,  values.get(left) + scores.get(choices[i]));
				}else {
					values.put(right, values.get(right) + scores.get(choices[i]));				
				}
			}else if(survey[i].equals("JM") || survey[i].equals("MJ")) {
				surveyValue = survey[i];
				char left = surveyValue.charAt(0);
				char right = surveyValue.charAt(1);

				if(choices[i] == 4) continue;
				else if(choices[i] < 4) {
					values.put(left,  values.get(left) + scores.get(choices[i]));
				}else {
					values.put(right, values.get(right) + scores.get(choices[i]));				
				}
			}else if(survey[i].equals("AN") || survey[i].equals("NA")) {
				surveyValue = survey[i];
				char left = surveyValue.charAt(0);
				char right = surveyValue.charAt(1);

				if(choices[i] == 4) continue;
				else if(choices[i] < 4) {
					values.put(left,  values.get(left) + scores.get(choices[i]));
				}else {
					values.put(right, values.get(right) + scores.get(choices[i]));				
				}
			}
		}
		
		String result = "";
		
		Set<Map.Entry<Character, Integer>> r = values.entrySet();
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character,Integer>>();
		
		for(Map.Entry<Character, Integer> data : r) {
			System.out.println(data);
			list.add(data);
		}
		
		System.out.println(list);
		
		for(int i = 1; i < list.size() + 1; i += 2) {
			if(list.get(i).getValue() == list.get(i - 1).getValue()) {
				result += list.get(i).getKey();
			}else if(list.get(i).getValue() > list.get(i - 1).getValue()) {
				result += list.get(i).getKey();
			}else if(list.get(i).getValue() < list.get(i - 1).getValue()) {
				result += list.get(i - 1).getKey();
			}
		}
		
		System.out.println(result);
		
		char[] kakao = { 'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N' };
		int[] score = { 0, 3, 2, 1, 0, 1, 2, 3 };
		String answer = "";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : kakao) {
			map.put(ch, 0);
		}
		
		for(int i = 0; i < survey.length; i++) {
			char[] ch = survey[i].toCharArray();
			
			if(choices[i] < 4) {
				map.put(ch[0], map.get(ch[0]) + score[choices[i]]);
			}else if(choices[i] > 4) {
				map.put(ch[1], map.get(ch[1]) + score[choices[i]]);
			}
		}
		
		for(int i = 0; i < kakao.length; i += 2) {
			if(map.get(kakao[i]) < map.get(kakao[i + 1])) {
				answer += kakao[i + 1];
			}else {
				answer += kakao[i];
			}
		}
		
		System.out.println(answer);
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
