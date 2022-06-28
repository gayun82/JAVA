package com.yedam.java.question_01;

public class Movie extends Culture{
	public Movie(String title, int direcNo, int actor, int audience, int totalScore) {
		super(title, direcNo, actor, audience, totalScore);
	}

	String genre;
	
	public abstract void getInformation() {
		System.out.println(title, direcNo, actor, audience, totalScore);
	}

}
