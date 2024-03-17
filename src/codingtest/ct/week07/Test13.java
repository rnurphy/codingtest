package codingtest.ct.week07;

// 프로그래머스
// 크기기 작은 부분 문자열

public class Test13 {
	public static void main(String[] args) {
		String t = "500220839878";
		String p = "7";
		
		int result = 0;
		
		for(int i = 0; i < t.length() - p.length() + 1; i++) {
			Long newT = Long.parseLong( t.substring(i, i + p.length()));
			
			if(newT <= Long.parseLong(p)) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
