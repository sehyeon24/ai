package com.lec.ex4_actor;
// main >> new Actor("박보검")
public class Actor implements IPoliceMan, IFireFighter, ICheif	{
	private String name;			// 데이터

	public Actor(String name) {		// 생성자
		this.name = name;
	}
	
	//추상메소드
	@Override	//	요리사
	public void makePizza() {
		System.out.println(name + "은 요리사입니다. 피자를 굽습니다");
	}
	@Override
	public void makeSpaghetti() {
		System.out.println(name + "은 요리사입니다. 스파게티를 만듭니다");
	}

	@Override	//	소방관
	public void outFire() {
		System.out.println(name + "은 소방관입니다. 불을 끕니다");
	}
	@Override
	public void saveMan() {
		System.out.println(name + "은 소방관입니다. 사람을 구합니다");
	}

	@Override	//	경찰관
	public void canCatchCriminal() {
		System.out.println(name + "은 경찰관입니다. 범인을 잡습니다");
	}
	@Override
	public void canSearch() {
		System.out.println(name + "은 경찰관입니다. 물건을 찾습니다");
	}
	
	
	
	
}
