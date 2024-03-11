package codingtest.ct.week06;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex0602 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 5, 7, 9, 6 };
		int[] arr2 = { 5, 2, 8, 3, 6 };
		
		
		// 교집합
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					list.add(arr1[i]);
				}
			}
		}
		
		System.out.println("교집합: " + list);
		
		// 합집합
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int value : arr1) {
			set.add(value);
		}
		
		for(int value : arr2) {
			set.add(value);
		}
		
		System.out.println("합집합: " + set);
		
		// 차집합
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		for(int value : arr1) {
			set2.add(value);
		}
		
		for(int value : arr2) {
			set2.remove(value);
		}
		
		System.out.println("차집합: " + set2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
