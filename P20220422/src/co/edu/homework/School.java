package co.edu.homework;

public class School {
	//필드
	//학생정보 : 학번,이름, 국어, 수학, 영어
	int studentNo;
	String studentName;
	int kor;
	int eng;
	int math;
	
	//생성자
	public School() {
		
	}
	
	public School(int studentNo, String studentName, int kor, int eng, int math) {
		this.studentNo = studentNo;//클래스x 인스턴스 구분 클래스 존재 1개 클래스 기반 인스턴스(this) 
		this.studentName = studentName;
		this.kor = kor;
		this.eng = eng;
		this.math =math;
	}
	
	//2.값을 넣어주는 역할
	//적합한 값으로 바꿔주는 역할
	//메소드
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getInfo() {
		System.out.println("이름 >" + studentName );
	}
	
		
	}


