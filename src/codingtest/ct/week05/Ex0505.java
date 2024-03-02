package codingtest.ct.week05;

import java.util.Scanner;

public class Ex0505 {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 11, 15, 20, 28, 29, 31, 39, 58, 68, 70, 95 };
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int idx = BinSearch.binSearch(arr, n);
		
		if(idx == -1) {
			System.out.println(String.format("존재하지 않는 %d 수", n));
		}else {
			System.out.println(String.format("%d 수는 arr[%d]에 존재", n, idx));
		}
	}
}

class BinSearch {
	static int binSearch(int[] a, int key) {
		int pl = 0;
		int pr = a.length - 1;
		
		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key) return pc;
			else if(a[pc] < key) {
				pl = pc + 1;
			}else {
				pr = pc - 1;
			}
			
		} while (pl <= pr);
		
		return -1;
	}
}