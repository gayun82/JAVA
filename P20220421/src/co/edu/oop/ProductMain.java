package co.edu.oop;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문 번호 입력>");
		int num =Integer.parseInt(sc.nextLine());
		System.out.println("주문자 아이디 입력>");
		String id = sc.nextLine();
		System.out.println("주문자 이름 입력>");
		String name =sc.nextLine();
		System.out.println("상품 번호 입력>");
		int proNo = Integer.parseInt(sc.nextLine());
		System.out.println("주소 입력>");
		String addr =sc.nextLine();
				
		ShoppingMall spm = new ShoppingMall(num, id, name, proNo, addr);
		spm.getInfo();
	}
	}

