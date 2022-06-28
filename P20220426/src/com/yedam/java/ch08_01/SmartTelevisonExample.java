package com.yedam.java.ch08_01;

public class SmartTelevisonExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}

}
