package strategy1.step5.modularization;

import strategy1.step4.interfaces.*;

public class RobotTestMain {
	public static void main(String[] args) {
		SuperRobot 		superRobot 		= new SuperRobot();
		StandardRobot 	standardRobot 	= new StandardRobot();
		LowRobot 		lowRobot 		= new LowRobot();
		
		Robot[] robots = {superRobot, standardRobot, lowRobot};		//배열
		for(Robot robot : robots) {		//확장for문
			robot.shape();
			robot.actionWalk();
			robot.actionRun();
			robot.actionFly();
			robot.actionMssile();
			robot.actionKnife();
		}	 // for
		System.out.println("SuperRobot의 나는 부품을 높이 나는 기능으로 업그레이드");
		superRobot.setFly(new FlyHigh());
		superRobot.shape();
		superRobot.actionFly();
   // = robots[0].actionFly();
		System.out.println("LowRobot의 knife부품을 장난감 검이 있습니다 기능으로 업그레이드");
		lowRobot.setKnife(new KnifeToy());
		lowRobot.shape();
		lowRobot.actionKnife();
		
// 2번	//	robot.actionFly();	//안됨 : Robot클래스 안에는 없는 거라서
//		//	((SuperRobot)robot).actionFly();	//이렇게 하면 안됨
//		//	형변환필요 (actionFly, actionMssile, actionKnife)
//			if(robot instanceof SuperRobot) {	// instanceof : 앞에 있는 변수가 뒤에 있는 객체 타입인지
//				SuperRobot tempRobot = (SuperRobot)robot;	// tempRobot : SuperRobot으로 형변환한 Robot의 객체 이름
//				tempRobot.actionFly();
//				tempRobot.actionMssile();
//				tempRobot.actionKnife();
//			}else if(robot instanceof StandardRobot) {
//				StandardRobot tempRobot = (StandardRobot)robot;
//				tempRobot.actionFly();
//				tempRobot.actionMssile();
//				tempRobot.actionKnife();
//			}else if(robot instanceof LowRobot) {
//				LowRobot tempRobot = (LowRobot)robot;
//				tempRobot.actionFly();
//				tempRobot.actionMssile();
//				tempRobot.actionKnife();
//			} // if
			
// 1번	superRobot.shape();
//		superRobot.actionWalk();
//		superRobot.actionRun();
//		superRobot.actionFly();
//		superRobot.actionMssile();
//		superRobot.actionKnife();
//		// ----------------------------
//		standardRobot.shape();
//		standardRobot.actionWalk();
//		standardRobot.actionRun();
//		standardRobot.actionFly();
//		standardRobot.actionMssile();
//		standardRobot.actionKnife();
//		// ----------------------------
//		lowRobot.shape();
//		lowRobot.actionWalk();
//		lowRobot.actionRun();
//		lowRobot.actionFly();
//		lowRobot.actionMssile();
//		lowRobot.actionKnife();
		
	}		// main
			
}			// class
