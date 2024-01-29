package codingtest.ct.week01;

public class Ex0105 {
	public static void main(String[] args) {
		int i = 3;
		/*
		 * switch (i) { case 1: System.out.println("1분기"); break; case 2:
		 * System.out.println("2분기"); break; case 3: System.out.println("3분기"); break;
		 * case 4: System.out.println("4분기"); break; default:
		 * System.out.println("알 수 없음"); }
		 */
		
		char c = 'b';
		/*
		 * switch (c) { case 'a': System.out.println("A"); break; case 'b':
		 * System.out.println("B"); break; case 'c': System.out.println("C"); break; }
		 */
		
		String s = "A";
		switch (s) {
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
			break;
		case "C":
			System.out.println("C");
			break;
		default:
			break;
		}
	}
}
