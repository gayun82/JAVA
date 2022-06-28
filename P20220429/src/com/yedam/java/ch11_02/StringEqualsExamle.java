package com.yedam.java.ch11_02;

public class StringEqualsExamle {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";// 같은 문자열이 있는지 찾아감 (new없을떄)
		String str3 = new String("홍길동");

		if (str1 == str2) {
			System.out.println("str1과 str2는 같은 객체를 참조합니다.");
		} else {
			System.out.println("str1과 str2는 다른 객체를 참조합니다.");
		}
		if (str1 == str3) {
			System.out.println("str1과 str3는 같은 객체를 참조합니다.");
		} else {
			System.out.println("str1과 str3는 다른 객체를 참조합니다.");
		}
		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 객체를 참조합니다.");
		} else {
			System.out.println("str1과 str2는 다른 객체를 참조합니다.");
		}
		if (str1.equals(str3)) {
			System.out.println("str1과 str3는 같은 객체를 참조합니다.");
		} else {
			System.out.println("str1과 str3는 다른 객체를 참조합니다.");
		}
	}
}