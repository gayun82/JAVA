package com.yedam.java.hw;

public class ArcadeGame implements Keypad{
	 int mode = NORMAL_MODE;

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다.");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
		
	}

	@Override
	public void rightUpButton() {
		if(mode == 0) {
			System.out.println("캐릭터가 일반 공격.");
		}else {
			System.out.println("캐릭터가 연속 공격.");
		}
	}

	@Override
	public void rightDownButton() {
		if(mode == 0) {
			System.out.println("캐릭터가 HIT 공격.");
		}else {
			System.out.println("캐릭터가 Double HIT 공격.");
		}
	}

	@Override
	public void changeMode(int mode) {
		if(mode == 1) {
			System.out.println("RMAL_MODE -> HARD_MODE");
		}else {
			System.out.println("HARD_MODE -> NORMAL_MODE");
		
	}

}
}