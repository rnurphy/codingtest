package codingtest.ct.week02;

public class Ex0202 {
	public static void main(String[] args) {
		System.out.println(MaxMin.max(1, 2, 3));
		System.out.println(MaxMin.max(10, 2, 3));
		System.out.println(MaxMin.max(1, 20, 3));
		
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(MaxMin.max(a));
		
		System.out.println(MaxMin.maxmin(a)[0]); // 최대값
	}
}

class MaxMin {
	static int max(int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}
	
	static int max(int[] arr) {
		if (arr.length <= 0) return -1;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		}
		
		return max;
	}
	
	static int min(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
	}
	
	static int[] maxmin(int[] arr) {
		int mm[] = new int[2];
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		mm[0] = max;
		mm[1] = min;
		
		return mm;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
