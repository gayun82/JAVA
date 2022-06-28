package co.edu.homework;

import java.util.Scanner;

public class SchoolManagement {

	public static void main(String[] args) {
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		School[] std =null;
		
		SchoolManagement sm = new SchoolManagement();
		
		int studentNo = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("==========================================================");
			System.out.println("1. 학생수  | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
			System.out.println("==========================================================");
			System.out.println("선택>");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				System.out.println("학생수>");
				studentNo = Integer.parseInt(sc.nextLine());
				scores = new int[studentNo];
				
			}else if(menu == 2) {
				System.out.println("학생 정보 입력>");
				
				
			}else if(menu == 3) {
				System.out.println("학생 정보 출력>");
			}else if(menu == 4) {
				System.out.println("순위>");
			}else if(menu == 5) {
				System.out.println("종료>");
				break;
			}
		}
		
		
		

	}

}
