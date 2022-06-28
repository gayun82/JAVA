package com.yedam.java.ch03_1;

public class SmartPhone extends Phone {
	
	public SmartPhone(String owner){ 
		super(owner);//부모클래스의 생성자 호출
	}
	 public void internetSearch() {
		 System.out.println("인터넷 검색을 합니다.");
	 }
}
