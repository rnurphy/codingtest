package codingtest.ct.week06;

// 프로그래머스
// 소수 만들기
public class Test5 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 7, 6, 4 };
		int answer = 0;
		/* 
		 * 1 2 3
		 * 1 2 4
		 * 1 3 4
		 * 2 3 4
		 * 
		 * 
		 * */
		
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				for(int k = j + 1; k < nums.length; k++) {
					int total = nums[i] + nums[j] + nums[k];
					int count = 0;
					// 1번 방법
//					for(int x = 1; x <= total; x++) {
//						if(total % x == 0) count++;
//					}
					
//					if(count == 2) answer++;
					
					// 2번째방법
					boolean isPrime = true;
					for(int m = 2; m <= Math.sqrt(total); m++) {
						if(total % m == 0) {
							isPrime = false;
							break;
						}
					}
					if(isPrime) answer++;
				}
			}
		}
		System.out.println(answer);
		
	}
}
