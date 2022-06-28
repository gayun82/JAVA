package com.yedam.java.hw;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() * 100) + 1;

		// 사용자입력을 저장할 공간
		int input = 0;

		// 시도횟수를 세기 위한 변수
		int count = 0;

		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			try {
				input = Integer.parseInt(sc.nextLine());
				if (input == answer) {
					System.out.println("맞췄습니다.");
					System.out.printf("시도횟수는 %d번 입니다.\n ", count);
					break;
				} else if (input > answer) {
					System.out.println("더 작은 수를 입력하세요");
					
				} else if (input < answer) {
					System.out.println("더 큰수를 입력하세요.");
				}

			} catch (NumberFormatException e) {
				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요");
				
			}

		} while (true);
	}
}