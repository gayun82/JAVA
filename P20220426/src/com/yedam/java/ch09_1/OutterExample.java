package com.yedam.java.ch09_1;

import com.yedam.java.ch09_1.Outter.Nested;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested netsted = outter.new Nested();
		
		netsted.print();

	}

}
