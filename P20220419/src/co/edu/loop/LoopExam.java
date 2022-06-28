package co.edu.loop;

public class LoopExam {

	public static void main(String[] args) {
		int sum = 0;

		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;

		System.out.println("1~5의 합 :" + sum);
		// 1~5까지의 합을 만들어보는 프로그램
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
			// 첫번째 sum = 0
			// 1) i=1 0 0=0+1; -> sum = 1;
			// 1) i=2 0 1=0+2; -> sum = 3;
			// 1) i=3 0 3=0+3; -> sum = 6;
			// 1) i=4 0 6=0+4; -> sum = 10;
			// 1) i=5 0 10=0+5; -> 최종적 sum = 15;
			sum += i;

		}
		// 구구단 2단 만들기
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {// 2중 for문
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("2단 :2 * " + i + " = " + (2 * i));
		}
		// 3의 배수
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println("3의배수 : " + i);
			}
			if (i % 2 == 0) {
				System.out.println("2의배수 : " + i);

				// 홀수 짝수
				for (int i1 = 1; i1 <= 100; i1++) {
					if (i1 % 2 == 1) {
						System.out.println("홀수 : " + i1);
					} else if (i1 % 2 == 0) {
						System.out.println("짝수 : " + i1);
						break;
					}
				}
				// *
				// **
				// ***
				// ****
				// *****
				// i<=5
				for (int i1 = 1; i1 < 6; i1++) {
					for (int j = 1; j <= i1; j++) {
						System.out.print("*");// ln 엔터키
					}
					System.out.println();

				}
				for (int i2 = 5; i2 >= 1 && i2 < 6; i2--) {// i=1; i<6; i++
					for (int j = 1; j <= i2; j++) {// j=5 j>=i; J--
						System.out.print("*");

					}
					System.out.println();

				}
				for (int i3 = 0; i3 <=5; i3++) { // i<=5
					for (int j = 5; j >0; j--) // int j=5; j>0; j--
						if (i < j) {
							System.out.print(" ");
						}else {
							System.out.print("*");

							System.out.println();

						}
				}
			} 
		}
	}
}
