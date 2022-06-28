package com.yedam.java.ch09_2;

public class Anonymous {
	
	//필드 초기값으로 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};//부모이름 빌려옴 , 중괄호가 붙음 세미콜론 반드시 명령어
	
	//로컬 변수값으로 대입
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
				
			}
			@Override
			public void wake() {
				super.wake();
				walk();
			}
	};
	
	localVar.wake();
	
}
	void method2(Person person) {
		person.wake();
	}
}