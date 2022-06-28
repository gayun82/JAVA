package com.yedam.java.question_01;

public class StandardWeightInfo extends Human{

	public StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
		
		
	}
	
	double StandardWeight;
	
	public void getInformation() {
		System.out.println("이름 : " + name + "키 : " + height + "표준체중 : " + StandardWeight());
	}
	public double StandardWeight()  {
		 return StandardWeight = (height - 100) * 0.9;
		
	}
		
	

}
