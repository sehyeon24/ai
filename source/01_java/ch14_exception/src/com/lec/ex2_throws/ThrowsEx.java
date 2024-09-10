package com.lec.ex2_throws;
// Ex를 가지고 TestMain을 실행
public class ThrowsEx {
	public ThrowsEx() throws Exception {		// 디폴트 생성자 함수
			actionB();			// return값 안 받음
	}
	
	//메소드
	private void actionB() throws ArrayIndexOutOfBoundsException {
		System.out.println("actionB 전반부");
		actionA();
		System.out.println("actionB 후반부");
	}
	private void actionA() throws ArrayIndexOutOfBoundsException {
		System.out.println("actionA 전반부");
		int[] arr = {0, 1, 3};
		System.out.println(arr[3]);				// ArrayIndexOutOfBoundsException : 예외 타입
		System.out.println("actionA 후반부");
	}
	
}
