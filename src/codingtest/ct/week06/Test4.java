package codingtest.ct.week06;

// 프로그래머스
// 비밀지도
public class Test4 {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 }; 
		int[] arr2 = { 30, 1, 21, 17, 28 };
		String[] answer = new String[n];
		
		
		for(int i = 0; i < n; i++) {
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
			
			answer[i] = answer[i].replace("1", "#");
			answer[i] = answer[i].replace("0", " ");
		}

		
		for(String str : answer) {
			System.out.println(str);
		}
		
	}
}
