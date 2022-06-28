package com.yedam.java.ch09_1;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		A.B tempB = tempA.new B(); //이렇게도 가능
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		
		A.C.field2 = 0;
		
		//로컬 클래스 객쳋 생성
		a.method();
		

	}

}
