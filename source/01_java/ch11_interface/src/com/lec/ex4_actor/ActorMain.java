package com.lec.ex4_actor;
// 다형성 예제
public class ActorMain {
	public static void main(String[] args) {
		Actor park = new Actor("박보검");
		park.canCatchCriminal();
		park.canSearch();
		park.outFire();
		park.saveMan();
		park.makePizza();
		park.makeSpaghetti();
		IPoliceMan policePark = park;
		policePark.canCatchCriminal();
		policePark.canSearch();
//		policePark.outFire();			// 실행안됨
//		policePark.saveMan();
//		policePark.makePizza();
//		policePark.makeSpaghetti();
		IFireFighter fighterPark = park;
//		fighterPark.canCatchCriminal();
//		fighterPark.canSearch();
		fighterPark.outFire();
		fighterPark.saveMan();
//		fighterPark.makePizza();
//		fighterPark.makeSpaghetti();
		ICheif cheifPark = park;
//		cheifPark.canCatchCriminal();
//		cheifPark.canSearch();
//		cheifPark.outFire();
//		cheifPark.saveMan();
		cheifPark.makePizza();
		cheifPark.makeSpaghetti();
	}
}
