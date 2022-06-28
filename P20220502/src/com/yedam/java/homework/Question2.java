package com.yedam.java.homework;

public class Question2 {

	// 메뉴1. 문자하나

	public void setCharData() {
		// 현재까지 입력된 문자들의 목록을 출력
		showCharData();
		if(charData.size()== strAnswer.lenght()) {
			System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
		}
		// 값을 입력받고
		String inputStr = inputData();
		// 정답에 포함된 문자인지 확인
		if(strAnswer.indexOf(inputStr.charAt(0))!= -1) {
			System.out.println("문자열을 구성하는 문자입니다.");
			charData.add(inputStr.charAt(0));
		}else {
			System.out.println("문자열을 구성하는 문자가 아닙니다.");
		}
}
	public void showCharData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for(char data : charData) {
			System.out.println(data +" ");
			
		}
		System.out.println();
	}
	public String inputData() {
		System.out.println("입력 값>>");
		return new Scanner(System.in).next().toLowerCase();
	}
	
	//메뉴 2. 단어
	
	public void setStrData() {
		//현재까지 입력된 문자들의 목록을 출력
		showCharData();
		
	//값을 입력받고
		String inputStr = inputData();
		
		if(strAnswer.equals(inputStr)){//소문자로 바꿔놓았으니까
//정답인지
			System.out.println("정답입니다.");
		}else {
			//정답이 아니라면 문자별로 O,X를 구분
			showStrData(inputStr);
		}
			
	}
	public void showStrData(String inputStr) {
		if(strAnswer.length() == inputStr.length()) {
			for(int i=0; i<strAnswer.len)
		}
	}
}
