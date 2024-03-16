package codingtest.ct.week07;

// 프로그래머스
// 신규 아이디 추천
public class Test8 {

	public static void main(String[] args) {
		
		String new_id = "...!@BaT#*..y.abcdefghijklm.";
		System.out.println("입력 > " + new_id);
		
		new_id = new_id.toLowerCase();
		System.out.println("1단계: " + new_id);
		
		new_id = new_id.replaceAll("[^a-z0-9\\.\\-\\_]", "");
		System.out.println("2단계: " + new_id);
		
		new_id = new_id.replaceAll("	", ".");
		System.out.println("3단계: " + new_id);
		
		new_id = new_id.replaceAll("^\\.", "");
		new_id = new_id.replaceAll("\\.$", "");
		System.out.println("4단계: " + new_id);
		
		if(new_id.equals("")) {
			new_id = "a";
		}
		System.out.println("5단계: " + new_id);
		
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			if(new_id.charAt(new_id.length() - 1) == '.') {
				new_id = new_id.substring(0, 14);
			}
		}
		System.out.println("6단계: " + new_id);
		
		if(new_id.length() <= 2) {
			while(new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length() - 1);
			}
		}
		System.out.println("7단계: " + new_id);
		
	}

}
