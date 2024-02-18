package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex0304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		int m = sc.nextInt();
		int arr[] = new int[m];
		
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		for (int t : arr) {
			int idx = q.indexOf(t);
			int h = q.size();
			if (idx < h) {
				while (t != q.getFirst()) {
					q.addLast(q.removeFirst());
					cnt++;
				} 
			} else {
				while (t != q.getFirst()) {
					q.addFirst(q.removeLast());
					cnt++;
				}
			}
			q.pollFirst();
		}
		System.out.println(cnt);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
