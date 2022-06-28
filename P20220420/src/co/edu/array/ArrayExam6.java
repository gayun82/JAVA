package co.edu.array;

import java.util.Scanner;

public class ArrayExam6 {
	
	public static void main(String[] args) {
		
		
		boolean run = true;
		int studentNum= 0; //배열 크기
		int[] scores = null;// 데이터 담기위해
		Scanner  scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 | 5.종료 ");
			System.out.println("---------------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			 	//문자가 들어오면 숫자로					//라인 엔터키
			//switch
			if(selectNo==1) {
			// 학생수 => 배열 크기 설정
				System.out.println("학생수>");
				studentNum = scanner.nextInt();//엔터키가 남아있는 상황
				scores = new int[studentNum];
				scanner.nextLine();//넥스트인트 쓴 다음 쓴다 엔터키 없애줌(그다음 넥스라인->넥스트인트->넥스트라인)
		
				//점수 입력=> 배열 데이터 입력		
		}else if(selectNo ==2) {
		 
		 for(int i=0; i<scores.length; i++) {
			 System.out.println("scores[" + i +"]>");
			 scores[i] = scanner.nextInt();
			
		 }
		 scanner.nextLine();
		 
		//점수 리스트 => 배열 데이터 출력
		}else if(selectNo ==3) {
			for(int i = 0; i<scores.length; i++) {
				System.out.println("scores["+ i + " ]>" +scores[i]);
				
			}
			
			//분석=>최대값, 평균 구하기
		}else if(selectNo ==4) {
			int sum = 0;
			int max = 0;
			for (int i = 0; i < scores.length; i++) {

				max = max < scores[i] ? scores[i] : max;

				if (max < scores[i]) {
					max = scores[i];
				}
				sum += scores[i];
			}
			System.out.println("최고 점수 : " + max);
			System.out.printf("평균 점수 : %.2f\n", (double) sum / scores.length);
			
			
			//종료 => 반복문 종료
		}else if(selectNo ==5) {
			run = false;
		}
		}
		System.out.println("프로그램 종료");
	}

}
