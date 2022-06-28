package com.yedam.java.ch11_02;

public class StringIndexOfExample {
	
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		//String subject1 = "JAVA PROGAMING";//소문자를 넣었을 때 값이 나오지 않음
		
		int location = subject.indexOf("프로그래밍");//프로그램이 시작되는 위치 인덱스값
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
	}
	

}
