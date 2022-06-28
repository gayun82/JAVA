package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample {
	
	public static void main(String[] args) {
		//매개변수도 리턴값도 존재하지 않는 람다식
		MyFunctionalInterface1 fi; //메소드 하나
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
	}
}
