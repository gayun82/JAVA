package com.yedam.java.ch15_01;

public class BoxExamaple {

	public static void main(String[] args) {
		/*	Box box = new Box();
			
			box.setObject("홍길동");
			String name = (String)box.getObject();
		
			
			box.setObject(new Apple());
			Apple apple =(Apple) box.getObject();
		*/
		Box<String> stringBox = new Box<String>();//string만 받을 수 있음.
		
		stringBox.set("홍길동");
		String name = stringBox.get();
		
		Box<Apple> appleBox = new Box<Apple>();
		
		stringBox.set(new Apple());
		Apple apple =appleBox.get();
		// 각각 따로 받는게 성능적으로 좋음
	}

}
