package codingtest.ct.week04;

import java.util.Arrays;
import java.util.Stack;

public class Ex0401 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.toString());
		System.out.println(stack.peek());
		stack.push(1);
		System.out.println(stack.toString());
		
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();	// 4가 빠짐
		System.out.println(stack.toString());
		System.out.println(stack.peek());	// 마지막 요소를 보여줌
		System.out.println(stack.isEmpty());
		
		// 없으면 -1, 있으면 그 요소의 순번을 출력
		// 순번은 위에서 아래로 흐름
		System.out.println(stack.search(4));
		System.out.println(stack.search(2));
		
		// true - false
		System.out.println(stack.contains(2));
		System.out.println(stack.containsAll(Arrays.asList(1, 2, 4)));
		
		System.out.println(stack.size());
	}
}
