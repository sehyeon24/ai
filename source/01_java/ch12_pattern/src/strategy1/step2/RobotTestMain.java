package strategy1.step2;

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
		//	robot.actionFly();	//안됨 : Robot클래스 안에는 없는 거라서
		//	((SuperRobot)robot).actionFly();	//이렇게 하면 안됨
		//	형변환필요 (actionFly, actionMssile, actionKnife)
			if(robot instanceof SuperRobot) {	// instanceof : 앞에 있는 변수가 뒤에 있는 객체 타입인지
				SuperRobot tempRobot = (SuperRobot)robot;	// tempRobot : SuperRobot으로 형변환한 Robot의 객체 이름
				tempRobot.actionFly();
				tempRobot.actionMssile();
				tempRobot.actionKnife();
			}else if(robot instanceof StandardRobot) {
				StandardRobot tempRobot = (StandardRobot)robot;
				tempRobot.actionFly();
				tempRobot.actionMssile();
				tempRobot.actionKnife();
			}else if(robot instanceof LowRobot) {
				LowRobot tempRobot = (LowRobot)robot;
				tempRobot.actionFly();
				tempRobot.actionMssile();
				tempRobot.actionKnife();
			} // if
			
		}	 // for
		
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
