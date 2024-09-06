package strategy1.step2;
// extends로 윗 줄은 상속 받을 거라서
public class LowRobot extends Robot {
	//메소드
	public void actionFly() {
		System.out.println("날 수 없습니다");
	}
	public void actionMssile() {
		System.out.println("미사일을 쏠 수 없습니다");
	}
	public void actionKnife() {
		System.out.println("검이 없습니다");
	}
	
}
