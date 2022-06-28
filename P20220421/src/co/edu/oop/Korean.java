package co.edu.oop;

public class Korean {
	
	//필드
	String nation ="대한민국";
			String name;
			String ssn;
	
	//생성자
			// 생성자의 오버로딩
			public Korean(String n, String s) {
				//this 클래스 내에 선언된 필드를 콕 찝어서 사용하겠다.
				this.name = n;
				this.ssn = s;
			}
			public Korean(String n, String s, String p){
				this.nation = n;
				this.name = s;
				this.ssn = p;
			}
	//메소드의 오버로딩
			void getInfo() {//getInfo 메소드이름 
				//return이 필요없는 것 void
				System.out.println("국적 : "+ nation);//this.nation 써도됨
				System.out.println("이름 : "+ name);
				System.out.println("주민번호 : "+ ssn);
				return; //void일때 return을 하면 강제종료 
			}
	

}
