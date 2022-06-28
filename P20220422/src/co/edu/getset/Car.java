package co.edu.getset;

public class Car {
	//필드
	private String company;
	private String model;
	private String color;
	private int speed;//필드보호
	
	//생성자
	
	
	//메소드

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {//단위변환
		//속도 mile(미국단위) -> km
		return speed*2; //임의설정
		//return speed;
	}

	public void setSpeed(int speed) {
		if(speed <0) {//속도가 음수일때 0으로 처리
			speed = 0;
		}
		this.speed = speed;
	}

}
