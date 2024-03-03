package codingtest.ct.week05;

public class EX0513 {
	public static void main(String[] args) {
		int x[] = { 6, 4, 8, 3, 1, 9, 7 };
		insertSort(x);
	}
	
	static void insertSort(int a[]) {
		for(int i = 1; i < a.length; i++) {
			int j;
			int temp = a[i];
			for(j = i; j > 0 && a[j - 1] > temp; j--) {
				a[j]= a[j - 1];
			}
			a[j] = temp;
			for(int k = 0; k < a.length; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
			
		}
	}
}
