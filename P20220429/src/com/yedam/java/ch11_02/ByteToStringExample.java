package com.yedam.java.ch11_02;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);//6인덱스 부터 4개의 문자열
		System.out.println(str2);

	}

}
