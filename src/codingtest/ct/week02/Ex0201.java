package codingtest.ct.week02;

import java.util.Scanner;

public class Ex0201 {
	public static void main(String[] args) {
		System.out.println("세 정수의 최대값을 구하세요!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A 값 : ");
		int a = sc.nextInt();
		System.out.print("B 값 : ");
		int b = sc.nextInt();
		System.out.print("C 값 : ");
		int c = sc.nextInt();

		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.printf("최대값 : %d", max);
	}
}
