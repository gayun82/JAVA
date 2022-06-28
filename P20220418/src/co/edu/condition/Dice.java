package co.edu.condition;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = (int) (Math.random() * 6) + 1; // 1~6까지의 데이터를 랜덤 추출

			System.out.println("주사위의 수는 :" + num);
			if (num == 1) {
				System.out.println("숫자 1");
			} else if (num == 2) {
				System.out.println("숫자 2");
			} else if (num == 3) {
				System.out.println("숫자 3");
			} else if (num == 4) {
				System.out.println("숫자 4");
			} else if (num == 5) {
				System.out.println("숫자 5");
			} else {
				System.out.println("숫자 6, 탈출");
				break;

			}
		}

		// 학점 측정 프로그램
		int grade;

		System.out.println("성적을 입력하세요.");
			//예시) 문자열 : "85 -> int : 85
		grade = Integer.parseInt(sc.nextLine());
			
		if (grade >= 90) {
			System.out.println("A학점");
		} else if (grade >= 80){
			System.out.println("B학점");
		} else if(grade >= 70){
			System.out.println("C학점");
		} else if(grade >= 60){
			System.out.println("D학점");
		}else {
			System.out.println("F학점, 공부하세요.");
		}
	}
}
