package co.edu.oop;

public class Person {
	//실습예제
	//1.person 클래스 선언
	//1) 필드 1.주민번호 2.이름 3.주소 4.나이
	//2) 생성자
	 //1.기본 생성자(필드 초기화 x)
	 //2.주민번호, 이름, 주소, 나이를 매개변수로 필드 초기화
	//3)메소드 
	 //1. introduce -> "Person[name : John, age  : 20]"
	//Main 클래스
	//-생성자에 데이터를 입력하여 객체 생성
//	임의의 3명에 대한 객체를 만들고 메소드 introduce 호출하여 정보 출력
	
	 String ssn;
	 String name;
	 String addr;
	 int age;
	 
	 public Person() {
		 
	 }
	 
	 public Person(String ssn, String name, String addr, int age) {
	  this.ssn = ssn;
	  this.name = name;
	  this.addr = addr;
	  this.age = age; 
	 }
	  void getInfo() {
		  System.out.println("name : " +name+ "age : " +age);
	
	

}
}