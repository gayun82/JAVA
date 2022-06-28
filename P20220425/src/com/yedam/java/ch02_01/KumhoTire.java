package com.yedam.java.ch02_01;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRocation) {
		super(location, maxRocation);
	}
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTires 수명 : " 
		+ (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
}
}