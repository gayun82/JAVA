package com.yedam.java.hw;

public class RPGgameExample {

	public static void main(String[] args) {
		
		RPGgame rg = new RPGgame();
		rg.leftUpButton();
		rg.rightUpButton();
		rg.changeMode(0);
		rg.rightUpButton();
		rg.rightDownButton();
		rg.changeMode(1);
		rg.rightDownButton();
		
		System.out.println("=================");
		ArcadeGame ag = new ArcadeGame();
		ag.leftUpButton();
		ag.rightUpButton();
		ag.leftDownButton();
		ag.changeMode(1);
		ag.rightUpButton();
		ag.leftUpButton();
		ag.rightDownButton();

	}

}
