package codingtest.ct.week04;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			int cmd = sc.nextInt();
			
//			String str = sc.nextLine();
//			StringTokenizer st = new StringTokenizer(str);
//			String cmd = st.nextToken();
			
			switch(cmd) {
				case 1:
//					int x = Integer.parseInt(st.nextToken());
					int x = sc.nextInt();
					stack.push(x);
					break;
				case 2:
					if(stack.isEmpty()) {
						sb.append(-1).append("\n");
					}else {
						sb.append(stack.pop()).append("\n");
					}
					break;
				case 3:
					sb.append(stack.size()).append("\n");
					break;
				case 4:
					sb.append(stack.isEmpty() ? 1 : 0).append("\n");
					break;
				case 5:
					if(stack.isEmpty()) {
						sb.append(-1).append("\n");
					}else {
						sb.append(stack.peek()).append("\n");
					}
					break;
				default:
					break;
			}
		}
		System.out.println(sb.toString());
	}
}
