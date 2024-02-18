package codingtest.ct.week02;

import java.util.HashSet;
import java.util.Set;

public class Ex0208 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		System.out.println(set.size());
		
		Member member1 = new Member("가나다", 30); 
		Member member2 = new Member("가나다", 30); 
		Member member3 = member2;
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
	}
}

class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { 
			Member member = (Member) obj;
			return member.name.equals(name) && member.age == age;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}