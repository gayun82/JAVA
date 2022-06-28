package co.edu.extend;

public class Main {

	public static void main(String[] args) {
		
			DmbCellPhone dmbCellPhone = new DmbCellPhone("고아라폰", "white", 100);
		//부모클래스 메소드
			dmbCellPhone.powerOn();
			dmbCellPhone.bell();
			dmbCellPhone.hangup();
			
			//자식 클래스 메소드			
			dmbCellPhone.turnOnDmb();
			dmbCellPhone.turnoffDmb();
			
			//부모클래스 메소드
			dmbCellPhone.powerOff();
			//부모클래스 출력
			System.out.println(dmbCellPhone.color);
			System.out.println(dmbCellPhone.model);
			
			//부모클래스
			Calculator cal = new Calculator();
			cal.areaCircle(50);
			
			//자식클래스
			Computer com = new 
		}

	}


