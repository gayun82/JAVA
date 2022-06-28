package co.deu.Quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨 온도를 입력하세요");
		
		double F = Integer.parseInt(sc.nextLine());
		double c = (F-32)*5/9;
		System.out.println(c);
		
		
				
	
	}
}

