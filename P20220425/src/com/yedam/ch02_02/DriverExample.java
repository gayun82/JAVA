package com.yedam.ch02_02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //bus -> vehicle 자동타입변환
		driver.drive(taxi);//taxi -> vehicle 
		

	}

}
