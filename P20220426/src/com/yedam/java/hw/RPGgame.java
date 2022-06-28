package com.yedam.java.hw;

public class RPGgame implements Keypad{
	private int currentMode;
	//private int mode = NORMAL_MODE;
	
	public RPGgame() {
		this.currentMode= Keypad.NORMAL_MODE;
		System.out.println("RPGgame 실행");
		//mode = NORMAL_MODE;
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
		
	}

	@Override
	public void rightUpButton() {
		if(this.currentMode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}else if(this.currentMode == Keypad.HARD_MODE){
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
		
		
	}

	@Override
	public void rightDownButton() {
		if(this.currentMode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격.");
		}else if(this.currentMode == Keypad.HARD_MODE){
			System.out.println("캐릭터가 HIT공격.");
		}
		
	}

	@Override
	public void changeMode(int mode) {
		if(this.currentMode == Keypad.NORMAL_MODE) {
			this.currentMode = Keypad.HARD_MODE;
			System.out.println("현재 모드 :HARD_MODE");
		}else if(this.currentMode == Keypad.HARD_MODE) {
			this.currentMode = Keypad.NORMAL_MODE;
			System.out.println("현재 모드 : NORMAL_MODE");
		}
		
	}

}
