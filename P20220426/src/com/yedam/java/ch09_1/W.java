package com.yedam.java.ch09_1;

public class W {
	//필드
	int field1;
	static int field2;
	//메소드
	void method1() {}
	static void method2() {}
	
	
	//인스턴스 멤버 클래스
	class Y{
		void mehtod() {
			field1 = 10;
			field2 = 20;
			
			method1();
			method2();
		}
	}
	//정적 멤버 클래스
	static class Z{
		void method() {
		//field1 = 10;
		field2 = 20;
		
		//method1();
		method2();
	}

}
}