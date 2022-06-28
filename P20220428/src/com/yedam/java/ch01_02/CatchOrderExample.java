package com.yedam.java.ch01_02;

public class CatchOrderExample {

	public static void main(String[] args) {
		try {
			String data1= args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(value1 + "+" + value2 + "=" +result);
		
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");	
		
		}catch(Exception e) {//Exception항상 마지막 캐치구문에 있어야함
			System.out.println("다시 실행해 주세요.");
		
		}finally {
			System.out.println("항상 실행");
		}


	}

}
