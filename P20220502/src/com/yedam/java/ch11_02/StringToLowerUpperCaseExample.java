package com.yedam.java.ch11_02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1= "Java Pograming";
		String str2= "JAVA Pograming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));//논리적인 값만 비교

	}

}
