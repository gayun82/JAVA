package com.yedam.java.question_01;

public abstract class Culture {
	String title;
	int direcNo;
	int actor;
	int audience;
	int totalScore;
	
	public Culture(String title, int direcNo, int actor, int audience, int totalScore) {
		super();
		this.title = title;
		this.direcNo = direcNo;
		this.actor = actor;
		this.audience = audience;
		this.totalScore = totalScore;
		
		public void setTotalScore(int score)
		public String getGrade()
		public abstract void getInformation()
	}
	

}
