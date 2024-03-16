package codingtest.ct.week07;

// 프로그래머스
// 3진법 뒤집기
public class Test6 {
	public static void main(String[] args) {
		int answer = 0;
		int n = 45;
		String a = Integer.toString(n, 3);
		String b = "";
		System.out.println(a);
		
		for(int i = a.length() - 1; i > -1; i--) {
			b += String.valueOf(a.charAt(i));
		}
		
		System.out.println(b);
		
		
		System.out.println(Integer.parseInt(b, 3));
//		System.out.println(answer);
	}
}
