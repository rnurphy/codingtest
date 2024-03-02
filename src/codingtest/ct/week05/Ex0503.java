package codingtest.ct.week05;

import java.util.Map;
import java.util.TreeMap;

public class Ex0503 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87, "홍길동");
		scores.put(98, "이몽룡");
		scores.put(75, "성춘향");
		scores.put(95, "홍길순");
		scores.put(90, "변학도");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.lowerEntry(88);
		System.out.println("88 아래 점수: " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.higherEntry(88);
		System.out.println("88 위 점수: " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.floorEntry(88);
		System.out.println("88 이거나 바로 아래 점수 " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.ceilingEntry(88);
		System.out.println("88 이거나 바로 위 점수 " + entry.getKey() + " - " + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollLastEntry();
			System.out.println(
					entry.getKey() + " - " + entry.getValue()+ "(남은 객체 수: " + scores.size() + ")"
			);
		}
	}
}
