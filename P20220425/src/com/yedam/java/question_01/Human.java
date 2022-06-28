package com.yedam.java.question_01;

public class Human {
	String name;
	double height;
	double weight;
	
	public Human(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		
		
	}


	
	public void getInformation() {
		System.out.println("이름 : " + name + "키 : " + height + "몸무게 : " + weight);
	}
	
}
