package com.lec.loop;
// break
// continue
public class Ex05_breakContinue {
	public static void main(String[] args) {
		for(int i=1 ; i<=10 ; i++) {
			if(i==3) {
				//break; // 반복문 for 블럭을 빠져 나감
				continue; // 증감식으로 올라감 : 3일 땐 다시 for로 돌아가서 출력이 안됨
			}
			System.out.print(i+ "\t");
			
		}
	}
}
