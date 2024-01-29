package codingtest.ct.week01;

public class Ex0114 {
	public static void main(String[] args) {
		String str = "Good Morning";
		
		System.out.println("charAt: " + str.charAt(7));
		System.out.println("startsWith: " + str.startsWith("good"));	// 대소문자를 구분
		System.out.println("endsWith: " + str.endsWith("ng"));			// 대소문자를 구분
		System.out.println("equals: " + str.equals("good morning"));	// 대소문자를 구분
		System.out.println("indexOf: " + str.indexOf("Mor"));			// 앞에서부터 찾아서 시작위치의 인덱스 리턴
		System.out.println("lastIndexOf: " + str.lastIndexOf("Mor"));	// 뒤에서부터 찾아서 시작위치의 인덱스 리턴
		System.out.println("length: " + str.length());					// 공백 포함
		
		System.out.println("replace: " + str.replace("Good", "a"));		// 위치 바꾸기
		System.out.println("replace: " + str.replace("o", "a"));		
		
		System.out.println("replaceAll: " + str.replaceAll("Good", "a"));	
		System.out.println("replaceAll: " + str.replaceAll("[Good]", "a"));	// 정규식 패턴
	}
}
