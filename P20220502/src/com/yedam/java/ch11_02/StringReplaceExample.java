package com.yedam.java.ch11_02;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA"); //기존 앞에 바꾸고자 하는 문자열은 뒤에
		
		System.out.println(newStr);
		System.out.println(oldStr);

	}

}
