package com.yedam.java.question_01;

public class ObesityInfo extends StandardWeightInfo{

	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
		
	}
		public void getInformation() {
			System.out.println("이름 : " + name + "키 : " + height + "비만도 : " +);
		}
		public double getObesity() {
			double BMI = (weight - StandardWeight)/StandardWeight * 100);
			if(BMI <=StandardWeight ) {
				System.out.println("이름 : " + name + "키 : " + height + "몸무게 : " +weight);
			}
			
		}
	}

