package co.micol.prj0509;

import java.util.Scanner;

public class Manager {
	private Drink[] drink = new Drink[7];
	private int price = 0;
	private int stock = 0;
	private int count = 8;//메뉴 갯수
	static int profit = 0;//총 수익
	Scanner sc = new Scanner(System.in);
	
	public void init() {//initialize : 맨 처음 실행되는 내용.
		//배열의 공간 잡아주기
		for(int i = 0; i <drink.length; i++) {
			drink[i] = new Drink();
			
		}//이름과 가격 설정
		
		drink[0].setDrinkName("커피");
		drink[0].setPrice(1000);
		drink[0].setStock(5);
		drink[1].setDrinkName("사이다");
		drink[1].setPrice(1200);
		drink[1].setStock(5);
		drink[2].setDrinkName("콜라");
		drink[2].setPrice(1300);
		drink[2].setStock(5);
		drink[3].setDrinkName("오랜지 주스");
		drink[3].setPrice(1600);
		drink[3].setStock(5);
		drink[4].setDrinkName("자몽 주스");
		drink[4].setPrice(1600);
		drink[4].setStock(5);
		drink[5].setDrinkName("환타");
		drink[5].setPrice(1000);
		drink[5].setStock(5);
		drink[6].setDrinkName("밀크티");
		drink[6].setPrice(1300);
		drink[6].setStock(5);
		drink[7].setDrinkName("랜덤음료");
		drink[7].setPrice(1300);
		//랜덤...
		//열거타입?
		
	}
	public static void admin() {
		
		
		while(true) {
			System.out.println("==========================관리자 페이지========================");
			System.out.println("1.매출 확인 | 2.재고 추가 |3.음료 변경 |4.음료 추가 |5.음료 가격 변경 |6. 종료 ");
			System.out.println("메뉴 선택>");
			int num = sc.nextInt();
			//1.매출확인
			if(num == 1) {
				System.out.println("현재까지의 수익은"+profit+"입니다");
				 for(int i = 0 ; i < stock; i++) {
		                System.out.print((i+1) + ":" + box[i] + "(" + price[i] + "W)-" + stock[i] + "개   ");
		            }
				
			//2.재고 추가
			}else if(num == 2) {
				
				
			//3.음료 변경	
			}else if(num == 3) {
				System.out.println("변경할 메뉴를 입력하세요(1~"+count + "):");
				
				System.out.println("메뉴변경이 완료되었습니다.");
			//4.음료 추가
			}else if(num == 4) {
				
			//5.음료 가격 변경
			}else if(num == 5) {
				
			//6.종료
			}else if(num == 6) {
				VendingMachin();
				return;
				
			}
			
		}
	}
	private static void VendingMachin() {
		
	}

}
