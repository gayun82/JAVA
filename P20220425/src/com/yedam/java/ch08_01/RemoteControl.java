package com.yedam.java.ch08_01;

public interface RemoteControl {
	
	//상수 필드
	public static final int MAX_VOLUME = 10;//상수명은 대문자
	int MIN_VOLUME = 0;//public static final int MIN_VOLUME = 0 와 같음
	
	
	//추상 메서드
	public abstract void turnOn();
	void turnOff();//public abstract void turnOff();
	public void setVolume(int volume);
}
