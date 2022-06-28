package co.edu.extend;

public class DmbCellPhone extends CellPhone{
	
	//필드
	public int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel +"Dmd 시작");
		super.powerOn();
	}
	void turnoffDmb() {
		System.out.println("Dmb종료");
	}
	@Override//자바가 알아야할 공지
	void powerOn(){
	System.out.println("자식 클래스에서 전원을 켭니다.");

}
}