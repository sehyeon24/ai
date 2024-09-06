package singleton2;

public class FirstClass {
	//생성자함수 new FistClass 하면 호출되는 것
	public FirstClass() {
		System.out.println("FirstClass 생성자 실행 중 - - - - - - ");
		SingletonClass firstSingtonObj = SingletonClass.getInstance();
		System.out.println("싱글톤 객체의 i값 : " + firstSingtonObj.getI());
		firstSingtonObj.setI(999);
		System.out.println("싱글톤 객체의 수정한 i값 : " + firstSingtonObj.getI());
	}
	
}
