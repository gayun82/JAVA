package co.yedam.var;

public class Example {

	public static void main(String[] args) {
		//반지름이 5인 원의 면적
		
		double PI = 3.14;
		int radius = 5;
		
		double gongsic = PI * radius *radius;
		
		System.out.println(gongsic);
		
		//밑면 * 높이 / 2 = 삼각형 넓이 답 : 8
		int 밑면 = 4;
		int 높이 = 4;
		
		int 넓이 =밑면 * 높이/2; //double을 쓰면 소수점까지 나옴 26줄
		
		System.out.println(넓이);
		
		int  height = 4;
		int wedth = 4;
		double triangleArea = height * wedth / 2;
		System.out.println(triangleArea);
		
		

	}

}
