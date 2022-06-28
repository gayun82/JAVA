package co.edu.oper;

public class OperatorExam {
d
	public static void main(String[] args) {
		
		/// -> 몫
		//% -> 몫의 나머지
		// 10000초 - > 10000(60*60) => 시간
		//         - > 10000/60 => 분
		//			- >10000%60 => 초
		int hour = 10000/(60*60);//만초 시간으로 변환
		int min = 10000/60;//만초 분으로 변환
		int sec = 10000%60;//남는 초 계산
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		
		
		int i = 0;
//		
	i = i + 1;
//		//대입 연산자
//		i+= 1;//위의 식을 줄여서 씀
//		//증감 연산자
//		//i = i+1;
		i++;
		++i;
		//i=0;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		
		System.out.println(++i);
		
		System.out.println(i++); //실행문이 다 실행된 다음에 연산
		System.out.println(i);
	}

}
