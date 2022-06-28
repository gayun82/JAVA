package co.edu.oop;

import java.security.PublicKey;

public class Car {
	
	//필드
	
	String color;
	String model;
	int tire;
	int price;
	
	//생성자
	public Car() {
	}
	public Car(String a, String b, int c) {
		color = a;
		model = b;
		price =c;
	}
	//메소드(기능)
	void info() {
		System.out.println("model =" + model);
		System.out.println("color =" + color);
		System.out.println("price = " + price);
	}
	}
	

