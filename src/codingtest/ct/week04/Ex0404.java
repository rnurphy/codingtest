package codingtest.ct.week04;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex0404 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			String cmd = st.nextToken();
			
			switch(cmd) {
				case "push":
					int x = Integer.parseInt(st.nextToken());
					stack.push(x);
					break;
				case "pop":
					if(stack.isEmpty()) {
						sb.append(-1).append("\n");
					}else {
						sb.append(stack.pop()).append("\n");
					}
					break;
				case "size":
					sb.append(stack.size()).append("\n");
					break;
				case "empty":
					sb.append(stack.isEmpty() ? 1 : 0).append("\n");
					break;
				case "top":
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
