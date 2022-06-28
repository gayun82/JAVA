package prj.test2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VendingMachin1 {

	private Scanner sc;
	private Can[] canArr; // 자판기 구성 메뉴판
	private int myMoney;//넣는 돈
	private int sum;//음료값 합계
	private int[] stock;//음료수재고
	private String select;//선택한 음료
	private int randomPrice;//랜덤음료수 값
	private List<Can> cart = new ArrayList<Can>(); // 카트

	public void setCanArr(Can[] canArr) {
		this.canArr = canArr;
	}

	public VendingMachin1() {
		init();
	}

	public void init() {
		sc = new Scanner(System.in);
		String[] nmArr = { "커피", "사이다", "콜라", "포도주스", "자몽주스", "환타", "밀크티", "랜덤음료" };
		int[] priceArr = { 1000, 1200, 1300, 1600, 1600, 1000, 1300, 1300 };
		int[] stockArr = { 3, 5, 4, 2, 2, 4, 5, 5 };
		
		
		canArr = new Can[nmArr.length];
		stock = new int[stockArr.length];

		for (int i = 0; i < nmArr.length; i++) {
			canArr[i] = new Can(nmArr[i], priceArr[i], stockArr[i]);
		}
		for (int i = 0; i < nmArr.length; i++) {
			stock[i] = stockArr[i];
		}
	}

	public boolean inputMoney() {

		boolean flag = true;
		System.out.println("돈을 넣어주세요 : ");
		myMoney = sc.nextInt();

		if (myMoney < canArr[0].getPrice()) {
			System.out.printf("넣은 금액이 최소 가격보다 적습니다. 금액 %d원을 반환합니다.\n", myMoney);
			inputMoney();

		}

		System.out.println();
		return flag;
	}

	public void Menu() {

		System.out.println("===========메뉴==========");
		for (int i = 0; i < canArr.length; i++) {
			System.out.printf("%d.%-9s%9d원\n", i + 1, canArr[i].getNm(), canArr[i].getPrice());
		}

		System.out.println();
	}

	public void purchase() { // 주문
		boolean b = false;
		while (!b) {
			System.out.println("메뉴선택> (영수증 출력:0, 관리자메뉴:9)");
			int selectNum = sc.nextInt();

			switch (selectNum) {
			case 0: // 영수증 출력
				if (cart.isEmpty()) {
					System.out.println("선택한 물건이 없습니다.");
				} else {
					showAcount();
				}
				b = true;
				break;
			case 1:
				cart.add(canArr[0]);
				System.out.println("커피를 선택하셨습니다.");
				sum += 1000;
				break;
			case 2:
				cart.add(canArr[1]);
				System.out.println("사이다를 선택하셨습니다.");
				sum += 1200;
				break;
			case 3:
				cart.add(canArr[2]);
				System.out.println("콜라를 선택하셨습니다.");
				sum += 1300;

				break;
			case 4:
				cart.add(canArr[3]);
				System.out.println("포도주스를 선택하셨습니다.");
				sum += 1600;
				break;
			case 5:
				cart.add(canArr[4]);
				System.out.println("자몽주스를 선택하셨습니다.");
				sum += 1600;
				break;
			case 6:
				cart.add(canArr[5]);
				System.out.println("환타를 선택하셨습니다.");
				sum += 1000;
				break;
			case 7:
				cart.add(canArr[6]);
				System.out.println("밀크티를 선택하셨습니다.");
				sum += 1300;
				break;
			case 8: // 랜덤음료 1~7까지 메뉴중에 랜덤
				int random = (int) (Math.random() * 7) + 1;
				select = canArr[random - 1].getNm();
				cart.add(canArr[7]);
				System.out.printf("%s를 선택하셨습니다.\n", select);
				randomPrice = canArr[random - 1].getPrice();// 랜덤음료수 값
				System.out.println(canArr[random - 1].getPrice());
				sum += (canArr[random - 1].getPrice());
				break;
			case 9: // 관리자
				Manager();
				
				
			}
		}

		if (myMoney < sum) {//
			System.out.println("!!돈이 부족합니다.!!");

			
		}
	}

	public void showAcount() {
		int sum = 0;
		System.out.println("┌────────────────────────────┐");
		System.out.println("│============영수증============│");
		System.out.println("│품명　　　　　　　　　　　　　　　　　금액│");
		System.out.println("│----------------------------│");
		for (Can c : cart) {// 랜덤음료를 선택했을 때 영수증 출력
			if (c.getNm().equals("랜덤음료")) {
				System.out.println("│" + select + " \t\t\t " + randomPrice + "│");
				sum += randomPrice;
			} else {
				System.out.println("│" + c.getNm() + " \t\t\t " + c.getPrice() + "│");
				sum += c.getPrice();
			}

		}
		System.out.println("│----------------------------│");
		System.out.printf("│%-13s%13d│\n"," ·받은금액",myMoney);
		System.out.printf("│%-13s%13d│\n"," ·합계	", sum);
		System.out.printf("│%-13s%13d│\n"," ·거스름돈", (myMoney - sum));
		System.out.println("└────────────────────────────┘");
	}

	public void Manager() {
		while(true) {
			System.out.println("=========관리자 페이지==========");
			System.out.println("1.재고 확인 | 2.재고 추가 | 3.종료");
			System.out.println("메뉴 선택>");
			int num = sc.nextInt();
			if(num==1) {//현재 재고 확인
				for (int i = 0; i < canArr.length; i++) {
					System.out.printf("%s의 남은 재고는 %d개 입니다.\n", canArr[i].getNm(), stock[i]);
					
				}
			}else if(num==2) {//재고 추가
				System.out.println();
				System.out.println("<재고 추가>");
				 System.out.print("재고를 추가하실 메뉴의 번호를 입력하세요(1~7:)");
	                int i = sc.nextInt();//메뉴 선택
	                System.out.print(canArr[i-1].getNm() + "를(을) 몇 개 추가 하시겠습니까? :");
	                int j = sc.nextInt();// 추가할 수량 입력
	                stock[i-1] += j;
	                System.out.println(canArr[i-1].getNm()+"재고 추가가 완료되었습니다!");
			}else if(num==3) {
				System.out.println("<관리자메뉴 종료>");
				break;
			}
	}
}
}

