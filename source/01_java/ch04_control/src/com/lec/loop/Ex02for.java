package com.lec.loop;
// 1. 1~10까지 누적합 출력 : 55 (1+2+3+...+9+10=55) : 숫자의 합만 더함
// 2. 1+2+3+4+5+6+7+8+9+10 = 55 : 문자도 반복
public class Ex02for {
	public static void main(String[] args) {
		int total = 0;
//		total = total + 1; // 1
//		total = total + 2; // 1+2 (3)
//		total = total + 3; // 1+2+3 (6)
//		total = total + 4;
		for(int i=1 ; i<=10 ; i++) {
			total += i; // total = total + i; 와 같음 		// 1. 
			if(i==10) {
				System.out.print(i + "=");
			}else {
				System.out.print(i + "+"); 					// 2. 
			}
		}			
		System.out.println(total);
	}
}
