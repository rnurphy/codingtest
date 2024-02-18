package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex0306 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			String cmd = st.nextToken();
			
			switch (cmd) {
			case "push":
				queue.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if (queue.isEmpty()) {
					sb.append(-1).append("\n");
//					System.out.println(-1);
				}else {
					sb.append(queue.poll()).append("\n");
//					System.out.println(queue.poll()); 
				}
				break;
			case "size":
//				System.out.println(queue.size());
				sb.append(queue.size()).append("\n");
				break;
			case "empty":
				if (queue.isEmpty()) {
					sb.append(1).append("\n");
//					System.out.println(1);
				}else {
					sb.append(0).append("\n");
//					System.out.println(0);
				}
				break;
			case "front":
				if (queue.isEmpty()) {
					sb.append(-1).append("\n");
//					System.out.println(-1);
				}else {
					sb.append(queue.getFirst()).append("\n");
//					System.out.println(queue.getFirst());
				}
				break;
			case "back":
				if (queue.isEmpty()) {
					sb.append(-1).append("\n");
//					System.out.println(-1);
				}else {
					sb.append(queue.getLast()).append("\n");
//					System.out.println(queue.getLast());
				}
				break;
			default:
				break;
			}
		}
		System.out.println(sb.toString());
	}
}
