package codingtest.ct.week06;

import java.util.Stack;

/* 
 * 랜덤 숫자 만들기
 * 중복 숫자 허용(단, 연속은 안됨)
 * 
 * 
 * */
public class Ex0601 {
	public static void main(String[] args) {
		int n = 10;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(stack.size() < n) {
			int m = (int)(Math.random() * 10);
			
			if(stack.isEmpty()) {
				stack.push(m);
			}else {
				if(stack.peek() != m) {
					stack.push(m);
				}
				
 			}
			
			
		}
		System.out.println(stack);
		
		
	}
}
