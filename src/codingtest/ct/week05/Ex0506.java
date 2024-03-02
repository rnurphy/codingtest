package codingtest.ct.week05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0506 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 11, 15, 20, 28, 29, 31, 39, 58, 68, 70, 95 };
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int idx = Arrays.binarySearch(arr, n);
		
		// idx는 존재하지 않는 요소에 대해 -1만을 반환하는 것이 아니다.
		if(idx < 0) {
			System.out.println(String.format("존재하지 않는 %d 수 (%d)", n, idx));
		}else {
			System.out.println(String.format("%d 수는 arr[%d]에 존재", n, idx));
		}
		
		
	}
}
