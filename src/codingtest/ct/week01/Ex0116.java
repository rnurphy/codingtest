package codingtest.ct.week01;

public class Ex0116 {
	public static void main(String[] args) {
		// 1차원 배열 선언
//		byte ~ int = 0, long = 0L
//		float = 0.0F, double = 0.0
//		boolean = false
//		class, object = null
		System.out.println("aad");
		int[] a;
		int b[];
		
//		1차원 배열값 초기화
		char[] c = {'A', 'B', 'C'};
		int d[] = new int[3];		// 모두 0으로 설정
		System.out.println(c[1]);
		d[0] = 1;
		d[1] = 2;
		d[2] = 3;
		System.out.println(d[2]);
		
		float f[] = new float[] {1.2F, 2.3F, 3.4F};
		
		int[] score = new int[10];
		for (int i = 0; i < 10; i++) {
			score[i] = i + 1;
		}
		
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
	}
	
}
