package codingtest.ct.week07;

// 프로그래머스
// 로또의 최고 순위와 취저 순위
public class Test11 {
	public static void main(String[] args) {
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };
		
		int[] arr = { 6, 6, 5, 4, 3, 2, 1 };
				
		int matchCount = 0;
		int zeroCount = 0;
		
		for(int i = 0; i < lottos.length; i++) {
			for(int j = 0; j < win_nums.length; j++) {
				if(lottos[i] == 0) {
					zeroCount++;
					break;
				}
				
				if(lottos[i] == win_nums[j]) {
					matchCount++;
					break;
				}
			}
		}
		
		int[] answer = { zeroCount == 6 ? 1 : arr[matchCount] - zeroCount, arr[matchCount] };
		 	
	}
}
