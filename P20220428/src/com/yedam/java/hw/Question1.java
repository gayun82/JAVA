package com.yedam.java.hw;

public class Question1 {
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for (int i = 0; i <= 2; i++) {

			try {
				value = Integer.parseInt(strArray[i]);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 변환할 수 없습니다.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("두개의 실행 매개값이 필요합니다.");
			} finally {
				System.out.println(value);
			}
		}
	}
}
