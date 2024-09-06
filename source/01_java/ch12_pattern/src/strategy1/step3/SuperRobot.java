package strategy1.step3;
//extends로 윗 3줄은 상속(override) 받을 거라서
public class SuperRobot extends Robot {
	//메소드
	@Override
	public void actionFly() {
		System.out.println("날 수 있습니다");
	}
	@Override
	public void actionMssile() {
		System.out.println("미사일을 쏠 수 있습니다");
	}
	@Override
	public void actionKnife() {
		System.out.println("레이저 검이 있습니다");
	}
	
}
