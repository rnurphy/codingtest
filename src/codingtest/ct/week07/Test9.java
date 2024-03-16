package codingtest.ct.week07;

// 프로그래머스
// 음양 더하기
public class Test9 {

	public static void main(String[] args) {
		int[] absolutes = { 4, 7, 12 };
		boolean[] signs = { true, false, true };
		int answer = 0;
		for(int i = 0; i < signs.length; i++) {
			answer += signs[i] ? absolutes[i] : -absolutes[i];
		}
		System.out.println(answer);
	}

}
