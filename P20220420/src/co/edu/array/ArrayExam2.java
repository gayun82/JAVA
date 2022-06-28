package co.edu.array;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		int[] ary1 = {5,10,4,7,8};
		//최대값 변수
		int max=0;
		//최소값 변수
		int min = ary1[0];
		for(int i=0; i<ary1.length; i++) {
			//최대값구하기
			if(max < ary1[i]) {
				max =ary1[i];
			}
			//최소값 구하기
			if(min > ary1[i]) {
				min = ary1[i];
			}

	}
			System.out.println("최대값" + max);
			System.out.println("최소값" + min);
			
			
			Scanner sc =new Scanner(System.in);
			// 배열은 만들되, 사이즈는 아직 정하지 않겠다.
			int[] ary2 = null;
			System.out.println("배열의 사이즈를 입력하세요.");
			//배열 사이즈 입력.
			int num = sc.nextInt();
			//배열 사이즈 입력한 값으로 배열 크기 설정
			ary2 = new int[num];
			
			for(int i=0; i<ary2.length; i++) {
				//1~배열의 크기만큼 데이터 입력
				ary2[i] = i+1; 
			}
			
			for(int i=0; i<ary2.length; i++) {
				//짝수만 출력
				if(ary2[i] % 2 == 0) {
					System.out.println(ary2[i]);
				}
			}
			for(int i=0; i<ary2.length; i++) {
				//홀수만 출력
				if(ary2[i] % 2 == 1) {
					System.out.println(ary2[i]);
			
}
}
			
			int[] ary3 =new int[num];
			//ary2, ary3 배열을 총 2개 만듬.
			for(int i=0; i<ary3.length; i++) {
				       //i<num
				ary3[i] = i; 
			}
			//중첩 반복문, 조건문을 이용한 데이터 출력.
			for(int i=0; i<ary2.length; i++) {
				for(int j=0; j<ary3.length; j++) {
					//조건
					//ary2의 데이터 + ary3의 데이터 < 10이 나오는 경우 
					if(ary2[i]+ary3[j] == 10) {
						System.out.println("1." + ary2[i] + "2" +ary3[j]);
					}
				}
			}
	}
}