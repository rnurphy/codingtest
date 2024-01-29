package codingtest.ct.week01;

public class Ex0111 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d | " , i, j, i * j);
//				System.out.printf("%d * %d = %-2d | " , i, j, i * j);	// 왼쪽으로 자리 맞춤
			}
			System.out.println();
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %2d | " , j, i, j * i);
			}
			System.out.println();
		}
		
		
		
	}
}	
