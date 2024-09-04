package com.lec.loop;
// 1~100까지의 숫자 중 3의 배수 합을 출력하기
public class Ex09while {
	public static void main(String[] args) {
		int tot = 0;	// 누적변수
		int i = 1;
		while(i <= 100) {
			if(i%3 == 0) {	// 3의 배수일때만 누적 : i를 3으로 나눈 값이 0일 때
				tot += i;
			}
			
//			if(i%3 != 0) {	// 방법2
//				i++;
//				continue;
//			}
//			tot += i;
//			i++;
			
			i++;
		} // while 끝
		System.out.println("1~100까지 3의 배수의 합은 " + tot);
	}
}
