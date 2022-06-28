package co.edu.oop;

public class Student {
	
//	-숙제
//	1명 관리 학생 관리 프로그램
//	학생 정보 : 학번, 이름, 국어, 수학, 영어
//	기본 생성자를 통한 인스턴스를 만들고, 인스턴스에 데이터 입력
//
//	1.학생의 기본 정보 출력(학번, 이름, 국어, 수학 , 영어)
//	2.학생의 점수 평균 출력(국어, 수학, 영어)
	int id;
	String name;
	int korean;
	int math;
	int english;
	
	
	public Student() {
		this.id = 2317748;
		this.name = "김자바";
		this.korean = 80;
		this.math = 90;
		this.english = 50;
		 
	 }
	
	
		
	
	void getInfo() {
		System.out.println("id : "+ id +" name : " + name + " korean: " + korean + " math : " + math + " english : "+ english);
	}
	void getInfo2() {
		System.out.println((korean+math+english)/3);
	}
}
