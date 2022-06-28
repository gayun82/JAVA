package com.yedam.java.ch01_02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");//문자열로 넘겨받은 클래스 정보 
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());;//출력 스트링 
			e.printStackTrace();//예외클래스 printStackTrace호출
			System.out.println("존재하지 않는 클래스 입니다.");//안내
		}

	}

}
