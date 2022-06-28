package com.yedam.java.question_01;

public class EmpDept extends Employee{

	public EmpDept(String name, int salary) {
		super(name, salary);
	}
	
	String dep;

	public EmpDept(String name, int salary, String dep) {
		super(name, salary);
		this.dep = dep; //초기화
	}

	public String getDep() {
		return dep;
	}
	@Override
	public void getInformation() {
		System.out.println("이름 : "+ name + "연봉 : " + salary + "부서 : " +dep);
	}
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}
}
