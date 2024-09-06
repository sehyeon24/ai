package strategy1.step4.modularization;

import strategy1.step4.interfaces.*;

//extends로 윗 3줄은 상속(override) 받을 거라서
public class SuperRobot extends Robot {
	private FlyImpl fly;
	private Missilelmpl missile;
	private KnifeImpl knife;
	public SuperRobot() {
		setFly(new FlyYes());
		setMissile(new MissileYes());
		setKnife(new KnifeLazer());
	}
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
