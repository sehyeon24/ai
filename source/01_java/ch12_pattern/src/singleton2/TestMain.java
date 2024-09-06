package singleton2;

public class TestMain {
	public static void main(String[] args) {
		FirstClass firstObj = new FirstClass();		// firstObj라는 객체 생성
		SecondClass secondObj = new SecondClass();
		SingletonClass singObj = SingletonClass.getInstance();	// 메소드 호출
		System.out.println("main함수에서 싱글톤 객체 i값은 : " + singObj.getI());
	}
}
