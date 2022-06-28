package com.yedam.java.hw;

public class Homework {
	public static void main(String[] args) {
		// 문제1> 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라.
		int i = 37;
		int j = 91;
		System.out.println("변수명1 :" + i);
		System.out.println("변수명2 :" + j);
		System.out.println();

		// 문제2>문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라
		System.out.println(j + i);
		System.out.println(j - i);
		System.out.println(j * i);
		System.out.println(j / i);
		System.out.println();

		// 문제3>각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요
		int var1 = 128;
		String var2 = "B";
		int var3 = 44032;
		long var4 = 100000000000L;
		double var5 = 43.93106;
		double var6 = 301.3;

		System.out.printf("%d,int\n", var1);
		System.out.printf("%s,String\n", var2);
		System.out.printf("%d,int\n", var3);
		System.out.printf("%d,long\n", var4);
		System.out.printf("%8.5f,double\n", var5);
		System.out.printf("%5.1f,double\n", var6);
		System.out.println();

		// 문제4>아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;

		long result1 = a + c + d;
		System.out.println(result1);
		int result2 = a + b + c;
		System.out.println(result2);

		double e = 45.31;
		double result3 = c + d + e;
		System.out.println(result3);
		System.out.println();

		// 문제5>아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";

		String str = String.valueOf(charValue);//스트링으로 변환
		String strResult;

		strResult = str + ((intValue1 * intValue4) + (intValue4 * intValue2) + intValue3) + strValue
				+ ((double) intValue4);
		System.out.println(strResult);
		System.out.println();

		// 문제6> ) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요.
		int value = 485;
		int total = 0;
		while (value > 0) {
			total += value % 10;
			System.out.println(total);
			value /= 10;
			System.out.println(value);
		}

		System.out.println("4+8+5=17으로 결과는 total입니다");
		
		

	}

}
