package co.micol.prj0506.baseball;

import java.util.Random;

public class Baseball {
	//임의의 숫자 1~9까지 3개 생성(중복숫자x)
	//랜덤수와 입력한 숫자 비교
	//몇개의 숫자가 같은지
	//특정 자리에 특정 숫자가 있는지
	//숫자만 같으면 볼
	//자리와 숫자 둘다 같으면 스트라이크
	//같은수가 없는
	
	public int randomNum() {
		Random random = new Random();
			return random.nextInt(9)+1;
	
}
	
}