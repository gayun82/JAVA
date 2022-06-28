package co.micol.prj0509;

import java.util.Scanner;

public class VendingMachin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cash = 0;
		int menu = 0;
	
		while(true) {
			
		System.out.println("===============자판기=================");
		System.out.println(" 1.커피 | 2.사이다 | 3.콜라 | 4.오랜지주스 |");
		System.out.println("5.자몽주스 | 6.환타 | 7.밀크티 | 8.랜덤음료 |");
		System.out.println("====================================");
		System.out.println("===========================9.관리자모드");
		
		System.out.println("음료 선택>");
		menu = Integer.parseInt(sc.nextLine());
		
		System.out.println("돈을 넣어주세요");
		cash = Integer.parseInt(sc.nextLine());
		
		if(menu == 1) {
			
			System.out.println("커피를 선택하셨습니다.");
			System.out.println("투입한 금액"+cash + "원");
			//System.out.println("거스름돈"+ (cash-(음료가격))+"원 입니다.");
			
		}else if(menu == 2) {
			System.out.println("사이다를 선택하셨습니다.");
			
		}else if(menu == 3) {
			System.out.println("콜라를 선택하셨습니다.");
			
		}else if(menu == 4) {
			System.out.println("오랜지주스를 선택하셨습니다.");
			
		}else if(menu == 5) {
			System.out.println("자몽주스를 선택하셨습니다.");
			
		}else if(menu == 6) {
			System.out.println("환타를 선택하셨습니다.");
			
		}else if(menu == 7) {
			System.out.println("밀크티를 선택하셨습니다.");
			
		}else if(menu == 8) {
			System.out.println("랜덤음료를 선택하셨습니다.");
			
		}else if(menu == 9) {
			System.out.println("관리자모드 입니다.");
			Manager();//왜안됨
		}
		}
	}



}
