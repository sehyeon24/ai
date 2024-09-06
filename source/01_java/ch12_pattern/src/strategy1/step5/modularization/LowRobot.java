package strategy1.step5.modularization;

import strategy1.step4.interfaces.*;

public class LowRobot extends Robot {
	//데이터
	private FlyImpl 	fly;
	private Missilelmpl missile;
	private KnifeImpl 	knife;
	
	//생성자
	public LowRobot() {
		//setI(10); i = 10;
		setFly(new FlyNo()); 			// fly 	= new FlyNo();
		setMissile(new MissileNo());	// missile = new MissileNo();
		setKnife(new KnifeNo());		// knife = new KnifeNo();
	}
	
	//메소드
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

	@Override
	public void shape() {
		System.out.println("= = 로우로봇의 외형은 팔, 다리, 머리 몸통이 있습니다 = =");
	}
	
}
