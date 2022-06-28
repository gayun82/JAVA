package com.yedam.java.ch11_02;

public class StringSubstringExample {

	public static void main(String[] args) {
		
		String ssn = "880815-1234256";
		
		String firstNum = ssn.substring(0,6);//0부터 5까지(뒷수는 포함하지 않음)
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);//7~마지막
		System.out.println(secondNum);
	}

}
