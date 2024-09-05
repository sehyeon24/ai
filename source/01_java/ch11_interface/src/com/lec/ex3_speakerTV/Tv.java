package com.lec.ex3_speakerTV;

public class Tv implements IVolume {
	
	private int volumeLevel;
	private final int MAX_VOLUME = 100;
	private final int MIN_VOLUME = 0;
	
	public Tv() {
		volumeLevel = 10;		// main에서 new TV(); 초기값
	}
	
	//일반메소드
	@Override
	public void volumeUp() {		// 매개변수 없는 : 볼륨을 1씩 증가
		if(volumeLevel < MAX_VOLUME) {
			volumeLevel++;
			System.out.println("TV 볼륨을 1올려 현재 볼륨은 " + volumeLevel);
		}else {
			System.out.println("TV 볼륨이 최대치(" + MAX_VOLUME + ")여서 올리지 못했습니다");
		}
	}
	@Override
	public void volumeUp(int i) {	// 매개변수 있는 : 볼륨을 i씩 up
		if(volumeLevel == MAX_VOLUME) {
			System.out.println("TV 볼륨이 최대치(" + MAX_VOLUME + ")이어서 못 올려요");			// 경우의 수 1 : 증가 못하는 경우
		}else if( (volumeLevel+i) <= MAX_VOLUME) {
			volumeLevel += i;
			System.out.println("TV 볼륨을 " + i + "만큼 올려 현재 볼륨은 " + volumeLevel);		// 경우의 수 2 : i만큼 증가 가능한 경우
		}else {
			int temp = MAX_VOLUME - volumeLevel;	// temp : 볼륨을 내가 얼만큼 올렸는지(현재 증가 가능한 정도)
			volumeLevel = MAX_VOLUME;				//	한 번에 씩 못 올리면 다 MAX_VOLUME
			System.out.println("TV 볼륨이 " + temp + "만큼 올려 최대치입니다");					// 경우의 수 3 : i만큼 증가 못하는 경우 
		}	// if
	}	// volumeUp

	@Override
	public void volumeDown() {
		if(volumeLevel > MIN_VOLUME) {
			volumeLevel--;
			System.out.println("TV 볼륨을 1내려 현재 볼륨은 " + volumeLevel);
		}else {
			System.out.println("TV 볼륨이 최소치(" + MIN_VOLUME + ")여서 내리지 못했습니다");
		}	
	}	
	@Override
	public void volumeDown(int i) {	// 볼륨을 i씩 down
		if(volumeLevel == MIN_VOLUME) {
			System.out.println("TV 볼륨이 최소치(" + MIN_VOLUME + ")이어서 못 내려요");
		}else if( (volumeLevel-i) >= MIN_VOLUME) {
			volumeLevel -= i;
			System.out.println("TV 볼륨을 " + i + "만큼 내려 현재 볼륨은 " + volumeLevel);
		}else {						// 현재 볼륨=3, i=5 : 5만큼 못내림
			int temp = volumeLevel - MIN_VOLUME;
			volumeLevel = MIN_VOLUME;
			System.out.println("TV 볼륨이 " + temp + "만큼 내려 최소치입니다");
		}	// if
	}	// volumeDown
	
}	// class
