package codingtest.ct.week01;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}