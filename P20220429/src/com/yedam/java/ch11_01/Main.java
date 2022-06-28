package com.yedam.java.ch11_01;

public class Main {

	public static void main(String[] args) {
//		String str1 = new String("홍길동");
//		String str2 = new String("홍길동");//무조건 새로운 객체// 해쉬코드가 다름

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				
				//return;
				//break;
				System.exit(0);//숫자는 큰 의미없음
			}
		}
		System.out.println("마무리코드");
	}

}
