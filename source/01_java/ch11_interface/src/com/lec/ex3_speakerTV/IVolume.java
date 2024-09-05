package com.lec.ex3_speakerTV;
// 인터페이스 : (1) 작업명세서 역할(v) (2) 다형성 구현 (3) 기능을 부품화
// 작업명세서 역할 예제
// 인터페이스에는 static final 변수(상수)와 추상메소드만 가능 (예외 : default메소드, static메소드)
public interface IVolume {
	//override 해야 할 메소드 4개
	public void volumeUp();			// 볼륨이 1씩 증가 (매개변수 X)
	public void volumeUp(int i);	// 볼륨이 i씩 증가 (매개변수 O)
	public void volumeDown();		// 볼륨이 1씩 감소
	public void volumeDown(int i);	// 볼륨이 i씩 감소
	
	public default void setMute(boolean mute) {		// default메소드
		if(mute) {
			System.out.println("무음");
		}else {
			System.out.println("무음해제");
		}
	}
	
	public static void changeBattery() {			// static메소드
		System.out.println("건전지를 교환합니다");
	}
	
}
