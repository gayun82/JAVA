package co.deu.Quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
	//가위=1 바위=2 보=3	
	System.out.println("게임 시작");
	Scanner sc = new Scanner(System.in);
	while(true) {
		
		int num = (int)(Math.random() * 3)+1;
		System.out.println("가위바위보 중에 선택");
		int a = sc.nextInt();
		
		System.out.println();
		if(num == 1 && a ==1) {
			System.out.println("컴퓨터 : 가위 ");
			System.out.println("무승부");
			continue;
		}else if(num==1 && a==2) {
			System.out.println("컴퓨터 : 가위 ");
			System.out.println("패배");
			continue;
		}else if(num==1 && a==3) {
			System.out.println("컴퓨터 : 가위 ");
			System.out.println("패배");
			continue;
		}else if(num==2 && a==1) {
			System.out.println("컴퓨터 : 바위 ");
			System.out.println("승리");
			continue;
		}else if(num==2 && a==2) {
			System.out.println("컴퓨터 : 바위 ");
			System.out.println("무승부");
			continue;
		}else if(num==2 && a==3) {
			System.out.println("컴퓨터 : 바위 ");
			System.out.println("무승부");
			continue;
		}else if(num==3 && a==1) {
			System.out.println("컴퓨터 : 보 ");
			System.out.println("승리");
			continue;
		}else if(num==3 && a==2) {
			System.out.println("컴퓨터 : 보 ");
			System.out.println("패배");
			continue;
		}else if(num==3 && a==3) {
			System.out.println("컴퓨터 : 보 ");
			System.out.println("무승부");
			continue;
		}else {
			System.out.println("종료");
			break;
		}
		
	}
	}

}



//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//
//	System.out.println("나: ");
//	String str = sc.nextLine();
//
//	int game = 0;
//	
//	if (str.equals("가위")) {
//		game = 0;
//	} else if (str.equals("바위")) {
//		game = 1;
//	} else if (str.equals("보")) {
//		game = 2;
//	} else {
//		System.out.println("다시입력하세요.");
//	}
//
//	int comGame = (int) (Math.random() * 2);
//	if (comGame == 0) {
//		System.out.println("컴퓨터: 가위.");
//	} else if (comGame == 1) {
//		System.out.println("컴퓨터: 바위.");
//	} else if (comGame == 2) {
//		System.out.println("컴퓨터: 보.");
//	} else {
//		System.out.println("다시.");
//	}
//
//	
//	if (game == comGame) {
//		System.out.println("비겼습니다");
//	} else if (game >= comGame) {
//		System.out.println("이겼습니다");
//	} else {
//		System.out.println("졌습니다.");
//	}
//
//}