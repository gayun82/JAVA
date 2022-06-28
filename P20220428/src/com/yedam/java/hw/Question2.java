package com.yedam.java.hw;

public class Question2 {

	public static void main(String[] args) {
		method1();
		System.out.println(1);

		System.out.println(2);

		System.out.println(3);

		System.out.println(4);

	}

	public static void method1() {
		throw new NullPointerException();
	}

}
