package codingtest.ct.week01;

public class Ex0103 {
	public static void main(String[] args) {
		int i = 10, j = 20;
		int k = -8;
		
		int a = i + j;
		int b = i - j;
		int c = i * j;
		int d = i / j;
		int e = i % j;
		
//		System.out.println(e);
//		System.out.println(i++);
//		System.out.println(++j);
		
		System.out.println(i | j);	// 비트 연산 둘 중 하나 1 이어야 1
		System.out.println(i & j);	// 비트 연산 둘 다 모두 1 이어야 1
		
		System.out.println(k >> 3);
		System.out.println(k << 3);
		
	}
}
