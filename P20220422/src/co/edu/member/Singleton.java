package co.edu.member;

public class Singleton {
	
	
	//필드
	private static Singleton singleton = new Singleton();
	//생성자
	private Singleton() {
		
	}
 //정적 메소드
	static Singleton getInstace() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	}