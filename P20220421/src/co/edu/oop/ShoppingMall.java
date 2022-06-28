package co.edu.oop;

public class ShoppingMall {
	//필드
	int num;//주문번호
	String id;//아이디
	String name;//주문자 이름
	int proNo;// 주문번호
	String addr;//배송주소
	
	//생성자
	public ShoppingMall(int num, String id, String name, int protNo, String addr) {
		super();
		this.num = num;
		this.id = id;
		this.name = name;
		this.proNo = protNo;
		this.addr = addr;
	}
	//메소드
	void getInfo() {
		System.out.println("주문번호 :" + num);
		System.out.println("아이디 :" + id);
		System.out.println("이름 :" + name);
		System.out.println("주문상품번호 :" + proNo);
		System.out.println("주소 :" + addr);
	}

}
