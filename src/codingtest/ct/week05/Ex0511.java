package codingtest.ct.week05;

public class Ex0511 {
	public static void main(String[] args) {
		int n = 7;
		int x[] = { 1, 3, 9, 4, 7, 8, 6 };
		
		bubbleSort(x);
	}
	
	static void bubbleSort(int a[]) {
		int comp = 0;
		int exchange = 0;
		int cnt = 0;
		
		while(exchange < a.length - 1) {
			int last = a.length - 1;
			System.out.println("패스: " + (++cnt));
			
			for(int i = a.length - 1; i > exchange; i--) {
				if(a[i - 1] > a[i]) {
					swap(a, i - 1, i);
					last = i;
				}
				comp++;
				
				for(int j = 0; j < a.length; j++) {
					System.out.print(a[j] + " ");
				}
				System.out.println();
			}
			exchange = last;
		}
		
		System.out.println("비교횟수: " + comp);
		System.out.println("교환횟수: " + exchange);
	}
	
	static void swap(int a[], int n, int m) {
		int temp = a[n];
		a[n] = a[m];
		a[m] = temp;
	}
}
