package codingtest.ct.week06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test3 {
	public static void main(String[] args) {
		String dartResult = "1D2S3T*";
		int[] eachScore = new int[3];
		
		String strNum = "";
		int n = 0;
		int idx = 0;
		
		for(int i = 0; i < dartResult.length(); i++) {
			char ch = dartResult.charAt(i);
			
			if(ch >= '0' && ch <= '9') {
				strNum += String.valueOf(ch);
			}else if(ch == 'S' || ch == 'D' || ch == 'T') {
				n = Integer.parseInt(strNum);
				
				switch(ch) {
					case 'S':
						eachScore[idx++] = (int) Math.pow(n, 1);
						break;
					case 'D':
						eachScore[idx++] = (int) Math.pow(n, 2);
						break;
					case 'T':
						eachScore[idx++] = (int) Math.pow(n, 3);
						break;
				}
				
				strNum = "";
			}else {
				switch(ch) {
					case '*': 
						eachScore[idx - 1] *= 2;
						if(idx - 2 >= 0) eachScore[idx - 2] *= 2;
						break;
					case '#':
						eachScore[idx - 1] *= -1;
						break;
					
				}
			}
		
		
		}
		System.out.println(eachScore[0] + eachScore[1] + eachScore[2]);
	}
}	
