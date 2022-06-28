package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		//매개변수가 있고 리천값이 없는 람다식
		MyFunctionalInterface2 fi;
		
		fi =(x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(5);
		
		fi = (x) -> {System.out.println(x*5);};
		fi.method(4);
		
		fi = x -> System.out.println(x*5);
		fi.method(3);

}
}