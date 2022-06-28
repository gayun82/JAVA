package co.edu.exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		//1.화씨를 섭씨로 변환 하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨를 입력하세요");
		int c_temp = sc.nextInt();
		double f_temp = 5/9.0*(c_temp-32); //.0 정수타입으로 계산되기때문에 넣어준다
		f_temp = (c_temp-32)*5/9;
		System.out.printf("%.2f\n", 5/9.0*(c_temp-32));
	
		
		//2.가위 바위 보
		System.out.println("가위(0) 바위(1) 보(2)");
		int user = sc.nextInt();
		int random = (int)(Math.random() * 3);//0,1,2
		
		switch (user){
		case 0:
			//user = 가위(0), 컴퓨터는 
			if(random == 1) {
				System.out.println("졌습니다.");
			}else if (random == 2) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("비겼습니다.");
			}
			break;
		case 1:
		case 2:
			break;
		
		}
		//3.학점관리프로그램
		System.out.println("점수를 입력하세요");
		int point = sc.nextInt();
		
		//100~90, 89~80, 79~70
		switch(point /10) {//100보다 큰 숫자가 들어올때 10으로 처리
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		}

	}

}
