package codingtest.ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class Ex0403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		int top = 0;
		
		while(n > 0) {
			int m = sc.nextInt();
			
			if(m > top) {
				for(int i = top + 1; i <= m; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				top = m;
			}else if(stack.peek() != m) {
//				sb.append("NO").append("\n");
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
			
			n--;
		}
		
		System.out.println(sb.toString());
	}
}
