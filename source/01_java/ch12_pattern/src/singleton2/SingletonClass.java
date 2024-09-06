package singleton2;

public class SingletonClass {
	//데이터
	private int i;
	
	//변수
	private static SingletonClass INSTANCE;
	
	//생성자
	private SingletonClass() {
		i = 10;		// i값 초기화(기본값)
	}
	public static SingletonClass getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SingletonClass()	;
		}
		return INSTANCE;
	}
	
	//메소드 getter&setter
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
}
