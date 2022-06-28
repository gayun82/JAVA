package com.yedam.java.ch11_02;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	
	

	public static void main(String[] args) { 
		//String 생성자 : byte타입 -> String타입 , 디코딩(사람인식)
		//getBytes메소드 : String타입 -> byte타입 , 인코딩(컴퓨터인식)
		
		String str = "안녕하세요";
		
		byte[] strBytes1 = str.getBytes();
		System.out.println(strBytes1);
		String str1 =new String(strBytes1);
		System.out.println(str1);
		
		try {
		byte[] strBytes2 = str.getBytes("EUC-KR");
		System.out.println("strBytes2의 길이 :" + strBytes2.length);
		String str2 = new String(strBytes2, "EUC-KR");
		System.out.println("strBytes2->String  : " + str2);
		
		
				
	}catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}

}
}