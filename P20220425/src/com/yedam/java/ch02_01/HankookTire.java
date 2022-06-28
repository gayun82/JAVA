package com.yedam.java.ch02_01;

public class HankookTire extends Tire{
								//부모
	public HankookTire(String location, int maxRocation) {
		super(location, maxRocation);//생성자 불러옴
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTires 수명 : " 
		+ (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}
}
}