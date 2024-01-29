package codingtest.ct.week01;

public class Ex0106 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		String[] arrays = {"a", "b", "c", "d", "e"};
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}
		for (String str : arrays) {
			System.out.println(str);
		}
		int[] number = {1, 2, 3, 4, 5};
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		for (int num : number) {
			System.out.println(num);
		}
	}
}
