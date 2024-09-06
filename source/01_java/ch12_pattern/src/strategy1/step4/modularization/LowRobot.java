package strategy1.step4.modularization;

import strategy1.step4.interfaces.*;

// extends로 윗 3줄은 상속(override) 받을 거라서
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
	@Override
	public void actionFly() {
		fly.fly();
	}
	@Override
	public void actionMssile() {
		missile.missile();
	}
	@Override
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
