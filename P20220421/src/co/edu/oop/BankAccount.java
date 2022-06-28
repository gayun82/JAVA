package co.edu.oop;

public class BankAccount {
	//2.은행계좌 (BankAccount)
	// 계좌번호, 예금주, 잔액
	//매개 변수 3개 (계좌번호, 예금주, 잔액)를 가지는 생성자
	//메소드
//	1.예금을 할수 있는 메소드
//	2.출금을 할 수 있는 메소드
//	3.현재 잔액을 확인 할 수 있는 메소드
//	
//	Main class
//	인스턴스는 1개 인자 3개를 가지도록 생성.
//	Scanner 이용
//	반복문을 이용해서 1.예금 2.출금 3.잔액 확인 4.종료
	
	//필드
	String accountNo;
	String name;
	int balance;
	//생성자
	public BankAccount(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
		//메소드
		//1.예금을 할 수 있는 메소드
		void deposit(int money) {
			this.balance +=money;
			System.out.println("계좌번호>" + this.accountNo);
			System.out.println("예금주>" + this.name);
			System.out.println("출금 후 잔액>" + this.balance);
		}
		//출금을 할 수 있는 메소드
		void withDraw(int money) {
			this.balance -= money;
			System.out.println("계좌번호>" + this.accountNo);
			System.out.println("예금주>" + this.name);
			System.out.println("출금 후 잔액>" + this.balance);
		}
		int nowMoney() {
			return balance;
		}
	}


