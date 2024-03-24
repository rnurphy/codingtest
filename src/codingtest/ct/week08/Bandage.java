package codingtest.ct.week08;

// 프로그래머스 붕대 감기
public class Bandage {
	public static void main(String[] args) {
		int[] bandage = { 1, 1, 1 };
		int health = 5;
		int[][] attacks = { {1, 2}, {3, 2} };
		
        int atkIdx = 0;
		int castingTime = 0;
		int curHp = health;
		
		for(int i = 0; i < attacks[attacks.length - 1][0] + 1; i++) {
			if(i == attacks[atkIdx][0]) {
				curHp -= attacks[atkIdx][1];
                if(curHp <= 0) {
                    System.out.println("-1");
                    break;
                }
				castingTime = 0;
				atkIdx++;
			}else {
				curHp += bandage[1];
				castingTime++;
				
				if(castingTime == bandage[0]) {
					curHp += bandage[2];
					castingTime = 0;
				}
				
                if(curHp > health) {
                	curHp = health;
                	System.out.println(curHp);
                }
                
                
			}
			System.out.println(i + "초" + curHp);
            
		}
		
		System.out.println("최종: " + curHp);
//		return curHp < 0 ? -1 : curHp;
		
	}
}
