package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex0307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			// 문서의 수
			int doc = sc.nextInt();
			
			// 인덱스 번호
			int idx = sc.nextInt();
			
			// 우선순위담기
			LinkedList<int[]> queue = new LinkedList<int[]>();
			for(int j = 0; j < doc; j++) {
				queue.offer(new int[] {j, sc.nextInt()});
			}
			
			// 출력수
			int printCount = 0;
			while (!queue.isEmpty()) {
				// 맨앞 큐 가져오기
				int[] front = queue.poll();
				
				// 가져온 큐는 무조건 최대값
				boolean isMax = true;
				// 가져온 큐보다 큰 값이 있는지 확인(있으면 뒤로 보내기)
				for(int k = 0; k < queue.size(); k++) {
					if(front[i] < queue.get(k)[1]) {
						queue.offer(front);
						isMax = false;
						break;
					}
				}
				// 최대값이 아니면 continue
				if(!isMax) continue;
				
				// 출력수
				printCount++;
				
				// 큐의 배열번호와 인덱스번호가 같으면 break;
				if(idx == front[0]) break;
			}
			// 테스트 케이스별 출력 수 담기
			sb.append(printCount).append("\n");
		}
		// 전체 테스트 케이스별 출력 수 출력
		System.out.println(sb.toString());
		
	}
}
