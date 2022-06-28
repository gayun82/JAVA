package com.yedam.java.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringGame {
	static String word;

	public static void main(String[] args) {
		// 문자를 이용한 스무고개 구현
		List<String> list = new ArrayList<String>();
		// private String[] strData = { , , , , }

		String str1 = "Orange";
		String str2 = "Game";
		String str3 = "Phone";
		String str4 = "Smart";

		int rd = (int) (Math.random() * 4);//+1안함 0부터 시작
		System.out.println(rd);
		if (rd == 1) {
			word = str1;
		} else if (rd == 2) {
			word = str2;
		} else if (rd == 3) {
			word = str3;
		} else if (rd == 4) {
			word = str4;
		}
		Scanner sc = new Scanner(System.in);

		String str;
		while (true) {
			System.out.println("---------------------------------------------");
			System.out.println(" 1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
			System.out.println("---------------------------------------------");
			System.out.println("선택>");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
				System.out.println("입력값>>");
				str = sc.nextLine();
				if (word.indexOf(str) != -1) {
					System.out.println("문자열을 구성하는 문자입니다.");
					list.add(str);
					System.out.println(list);
				} else {
					System.out.println("문자열을 구성하는 문자가 아닙니다.");
				}

				System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
				System.out.println(str);
			}
//			}else if(menu == 2) {
//				
//			}else if(menu == 3) {
//				
//			}else if(menu == 4) {
//				
//			}else if(menu == 5) {
//				
//			}
		}

	}
}
