package singleton1;
/* 	 데이터 영역 메모리 	   | heap 메모리 영역
 * 클래스(설계도)static변수 |     일반변수	  */
public class Single {
	private int i;
	
	//디폴트 생성자 자동생성
	 public Single(){}

	private static Single INSTANCE = new Single();
	public static Single getInstance() {
		return INSTANCE;
	}
	
	//Singleton 패턴 형식
//	private static Single INSTANCE;
//	
//	//생성자 함수
//	private Single() {}	//Singleton 패턴
//	
//	public static Single getInstance() {
//		// 객체를 생성 안 했으면, 객체를 생성하고 그 객체를 return
//		// 객체를 생성 했었으면, 그 객체 주소를 return
//		if(INSTANCE == null) {
//			INSTANCE = new Single();
//		}
//		return INSTANCE;
//	}
	
	//메소드
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
