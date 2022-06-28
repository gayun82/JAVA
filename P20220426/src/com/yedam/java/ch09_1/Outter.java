package com.yedam.java.ch09_1;

public class Outter {
	String field = "Outter - field";
	void mehtod() {
		System.out.println("Outter- method");
	}
	class Nested{
		String field = "Nested-field";
		void mehtod( ) {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);//내부에 있는거 먼저 찾음 기본 우선순위
			this.mehtod();
			
			System.out.println(Outter.this.field);// 밖깥클래스의 이름을 가지고 오는것
			Outter.this.mehtod();
		}
	}
}
