package co.edu.casting;

public class Main {
	//D->B->A
	//E->C->A
	public static void main(String[] args) {
//		B b =new B();
//		B c =new C();
//		B d =new D();
//		B e =new E();
//	
//		A a1 = b;
//		A a2 = c;
//		A a3 = d;
//		A a4 = e;
//		
//		B b1= d;
//		C c1 = e;
		
//		B b3= e; //연결안됨
//		C c2 =d;
		
		
		Parent p1 = new Child();
		
		p1.method1();
		p1.method2();
		p1.method3();
		//p1.method4();
		
		//클래스 타입 배열
		Parent p2 = new Parent();
		Parent p3 = new Parent();
		Parent p4 = new Parent();
		
		Parent[] parent = {p2, p3,p4};
		
		Parent[] parent = {
				new Parent(),
				new Parent(),
				new Parent()
		};
	}

}
