package com.yedam.java.question_01;

public class Employee {
	String name;
	int salary;
	
	
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void getInformation() {
		System.out.println("이름 : "+ name +"연봉 : "+ salary);
		}
	public void print() {
		System.out.println("수퍼클래스");
	}
}
