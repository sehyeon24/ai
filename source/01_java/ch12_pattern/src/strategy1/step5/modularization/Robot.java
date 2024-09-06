package strategy1.step5.modularization;

import strategy1.step4.interfaces.FlyImpl;
import strategy1.step4.interfaces.KnifeImpl;
import strategy1.step4.interfaces.Missilelmpl;

public abstract class Robot {
	private FlyImpl 	fly;
	private Missilelmpl missile;
	private KnifeImpl 	knife;
	
	public abstract void shape();	// 아래를 추상메소드로 전환
//	public void shape() {
//		String className = getClass().getName();	// 내 객체의 클래스이름을 가져옴 : "strategy1.step2.SuperRobot"으로 가져와짐
//					  // = new String("strategy1.step2.Robot");
//		int idx = className.lastIndexOf(".");		// 윗줄에서 맨 마지막.의 위치를 찾는 것
//		String name = className.substring(idx+1);	// idx+1번째부터 끝까지 스트링(이름) 추출
//		System.out.println(name + "의 외형은 팔, 다리, 머리, 몸통이 있습니다 = = = ");
//	}
	
	public void actionWalk() {
		System.out.println("걸을 수 있습니다");
	}
	public void actionRun() {
		System.out.println("달릴 수 있습니다");
	}
	
		public void actionFly() {
			fly.fly();
		}
		public void actionMssile() {
			missile.missile();
		}
		public void actionKnife() {
			knife.knife();
		}
		
		//setter
		public void setFly(FlyImpl fly) {
			this.fly = fly;
		}

		public void setMissile(Missilelmpl missile) {
			this.missile = missile;
		}

		public void setKnife(KnifeImpl knife) {
			this.knife = knife;
		}
	
}
	
