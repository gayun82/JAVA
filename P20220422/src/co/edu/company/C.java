package co.edu.company;

import co.edu.ass.A;

public class C extends A{ //상속 자식클래스가 된거임
	public static void main(String[] args) {
		A a =new A();
		int temp;
		//public
		temp =a.b;
		//protected
		C c =new C();
		int d = c.c;
		
	
	}

}
