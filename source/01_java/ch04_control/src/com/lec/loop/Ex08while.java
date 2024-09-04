package com.lec.loop;
// 1~10까지의 누적합 출력하기 (while 사용)
public class Ex08while {
	public static void main(String[] args) {
		int i = 1;
		int tot = 0;	// 누적합이므로 0을 설정 : 누접합 변수 (곱하기면 1)
		while (i <= 10) {
			tot += i;	// tot = tot + i;
			System.out.printf("i가 %d일때까지의 누적합은 %d\n", i, tot);
			i++;
			
//			int i = 0;													// 다른 방법
//			int tot = 0;	// 누적합이므로 0을 설정 : 누접합 변수 (곱하기면 1)
//			while (++i <= 10) {
//				tot += i;	// tot = tot + i;
//				System.out.printf("i가 %d일때까지의 누적합은 %d\n", i, tot);
			
		}
	}
}
