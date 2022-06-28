package co.edu.oop;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("990820-4456848", "김자바", "대구 예담",55);
		p1.getInfo();
		
		Person p2 = new Person("123456-1516515", "최자바", "대구 중구",55);
		p2.getInfo();
		
		Person p3 = new Person("990820-4456848", "이자바", "서울 종로",55);
		p3.getInfo();
	}

}
