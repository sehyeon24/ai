package strategy1.step2;

public class Robot {
	public void shape() {
		String className = getClass().getName();	// 내 객체의 클래스이름을 가져옴 : "strategy1.step2.SuperRobot"으로 가져와짐
					  // = new String("strategy1.step2.Robot");
		int idx = className.lastIndexOf(".");		// 윗줄에서 맨 마지막.의 위치를 찾는 것
		String name = className.substring(idx+1);	// idx+1번째부터 끝까지 스트링(이름) 추출
		System.out.println(name + "의 외형은 팔, 다리, 머리, 몸통이 있습니다 = = = ");
	}
	public void actionWalk() {
		System.out.println("걸을 수 있습니다");
	}
	public void actionRun() {
		System.out.println("달릴 수 있습니다");
	}
}
