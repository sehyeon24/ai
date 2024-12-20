package com.lec.ex;
// 형변환 = 묵시적 형변환 + 명시적 형변환 (형 : 정수에서 실수로, 실수에서 정수로 변하는 것)
public class VarEx05 {
	public static void main(String[] args) {
		long l = 2200000000L;
		int i=10;
		double d = i; // 묵시적 형변환 (공간이 큰 변수에 공간이 작은 값을 할당할 경우)
		System.out.println("d="+d);
		i = (int)10.6; // 명시적 형변환 - 데이터 손실이 생길 수 있다. (큰 값을 작은 변수에 넣을 때)
		System.out.println("i="+i);
	}
}
