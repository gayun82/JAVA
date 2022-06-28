package com.yedam.java.ch09_1;

import java.lang.reflect.Field;

public class A { //바깥 클래스
	A(){System.out.println("A 인스턴스가 생성됨.");}
	
	//인스턴스 멤버 클래스
	class B{
		B(){System.out.println("B인스천스가 생성됨.");}
			
		//필드
		int field1;
		static int field2;//접근불가
		
		//메소드
		void method1() {}
		static void method2() {}
	}
	//정적 멤버 클래스
	static class C{
		C () {System.out.println("C인스턴스가 생성됨");}//
		
		//필드
		int field1;
		static int field2;
		
		//메소드
		void method1() {}
		static void method2() {}
			
	}
	
	void method() {
		//로컬 클래스
		class D {
			D() {System.out.println("인스턴스가 생성됨.");}
			
			//필드
			int field1;
			//static int field2;
			
			//메소드
			void method1() {}
			//static void method2() {}
	}
		D d =new D();
}
}