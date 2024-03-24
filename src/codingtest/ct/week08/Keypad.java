package codingtest.ct.week08;

// 프로그래머스
// 키패드 누르기
public class Keypad {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 }; 
		String answer = "";
		String hand = "right";
		
		int left = 10;
		int right = 12;
		
		for(int i = 0; i < numbers.length; i++) {
			int n = numbers[i];
			
			if(n == 1 || n == 4 || n == 7) {
				left = n;
				answer += "L";
			}
			
			if(n == 3 || n == 6 || n == 9) {
				right = n;
				answer += "R";
			}
			
			if(n == 2 || n == 5 || n == 8 || n == 0) {
				
			}
		}
		
		
	}

}
