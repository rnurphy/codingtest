package codingtest.ct.week06;

import java.util.Stack;


public class Test {
	public static void main(String[] args) {
		int[][] board = { {0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1} };
		int[] moves = { 1,5,3,5,1,2,1,4 };
		int removeCount = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		
		for(int i = 0; i < moves.length; i++) {	// 라인 찾기
			int lineNum = moves[i];
			System.out.println(lineNum + " 라인");
			for(int j = 0; j < board.length; j++) {	// 목표 찾기
				if(board[j][lineNum - 1] != 0) {
					int target = board[j][lineNum - 1];
					board[j][lineNum - 1] = 0;
					System.out.println("타겟: " + target);
					if(stack.isEmpty()) {
						stack.push(target);
					}else {
						if(stack.peek() == target) {
							stack.pop();
							removeCount += 2;	// 횟수가 아니라 개수가 중요
						}else {
							stack.push(target);
						}
					}
	
					break;
				}
				
				
			}
			
		}
		
		System.out.println("\n정답: " + removeCount);
	}
}
