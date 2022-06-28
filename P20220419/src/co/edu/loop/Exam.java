package co.edu.loop;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run =true;
		int balance = 0; //계좌
		int menu = 0;//switch, if
		int withDraw = 0;//출금
		int deposit =0; //예금
		
		while(run) {//false -> 조건만족 -> while 종료
			System.out.println("--------------------------");
			System.out.println("1.예금 |2. 출금 |3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.println("선택>");
			menu = sc.nextInt(); //4가지 중에 하나 선택
			
			switch (menu) {
			case 1:
				System.out.println("예금액>");
				deposit = sc.nextInt();
				balance += deposit;
				break;
			case 2:
				System.out.println("출금액>");
				withDraw = sc.nextInt();
				//출금액이 계좌에 있는 돈 보다 많을 때
				if(balance  < withDraw) {
					System.out.println("잔고 부족");
				}else {
					balance -= withDraw;
				}
				break;
			case 3: 
				System.out.println("잔고>"  + balance);
				break;
			case 4:
				System.out.println("종료");
				run = false;
				break;
				}
			}
				System.out.println("프로그램종료");
		}
		

	}
