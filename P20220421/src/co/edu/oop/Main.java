package co.edu.oop;

public class Main {

	public static void main(String[] args) {
		//자동차 객체 생성
		Car myCar =new Car(); 
		myCar.company = "기아";
		myCar.model = "k3";
		myCar.color = "white";
		myCar.maxSpeed = 150;
		
		myCar.info();
		System.out.println();
		
		//생성자를 통한 데이터 입력
		Car myCar2 = new Car("sonata", "black");
		
		myCar2.info();
		System.out.println();
		
		Korean k1 = new Korean("박자바", "012345-124578");
		k1.getInfo();
		Korean k2 = new Korean("김자바", "852025-145787");
		k2.getInfo();
		
		Korean k3 = new Korean("미국", "이자바", "741147-8502587");
		k3.getInfo();
		
		Calculator cal = new Calculator();
		
		cal.plus(3, 2);
		cal.minus(10, 2);
		
		int result =cal.plus(3, 2);//3과2가 매개변수
		System.out.println(result);
		
		result =cal.minus(10, 2);
		System.out.println(result);
		
		

}
}