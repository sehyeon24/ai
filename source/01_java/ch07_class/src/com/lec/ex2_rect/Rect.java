package com.lec.ex2_rect;
// 클래스 : 속성(인스턴스변수):private ,생성자함수(속성데이터 초기화), 메소드, setter&getter 필요!
// Rect r1 = new Rect() : 매개변수 X / r1.setWidth(2); r1.setHeight(4);
// Rect r1 = new Rect(2, 4) : 매개변수 O
// Rect r1 = new Recr(3);
public class Rect {
	private int width;			// 데이터함수 : 가로
	private int height;			// 데이터함수 : 세로
	
	// ↓ 생성자 함수가 없을 경우, JVM이 디폴트 생성자 자동 생성
	public Rect()	{}	// 디폴트 생성자	=> 이걸 안 적으면 20줄까지 알아서 자동생성
	public Rect(int side)	{
//		width = height = side;	// 우결합성 : 오른쪽부터 왼쪽으로
		width = side;
		height = side;
	}
	public Rect(int width, int height)	{
		this.width = width;
		this.height = height;
	}
	
	public int area()	{		// 메소드 : 넓이
		return width*height;	
	}
	
	// setter & getter 만들기
	public int getWidth() {		// 우클릭+Source+Generate getters and setters
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
//	public void setWidth(int width) {	// setWidth+ctrl+spacebar+Enter
//		this.width = width;
//	}
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	public int getWidth() {
//		return width;
//	}
//	public int getHeight() {
//		return height;
//	}
	
}
