package com.yedam.java.ch01_02;

public class CatchByExceptionExample {

	public static void main(String[] args) {
		try {
			String data1= args[0];//예외 발생
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(value1 + "+" + value2 + "=" +result);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(NumberFormatException e) {//정보가 없어서 건너뜀
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("항상 실행");
		}

	}

}
//실행 매개값의 수가 부족합니다.
//항상 실행