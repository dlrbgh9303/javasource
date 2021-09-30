package classTest;

//생성자 작성
// [마우스 오른쪽] = [square] - [using field]
// [마우스 오른쪽] = [square] - [super class]

public class Account {
	// 속성 :(122-22-22222),잔액,이름
		String accNum;
		int balance;
		String name;
	
		// 외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업시
		// set~ 으로 메소드를 작성한다.
		
		// 멤버변수 : 계좌번호를 변경하고 싶다면?
		public void setAccNum(String accNum) {
			this.accNum = accNum;
		}
		
		// 이름을 변경하고 싶다면?
		public void setName(String name) {
			this.name = name;
		}
		
		//	멤버 변수의 값을 리턴하고 싶다면?
		// get~~
		public int getBalance() {
			return balance;
		}
		
		
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 기능 : 입금한다.(입력값 : 입금액,반환값 없음) 현재잔액 += 입금액
			 //출금한다. 입력값 출금액 ,반환값 현재잔
		void int deposit(int status) {
			balance+=status;
					
			
		}
		
	// 출금한다.(입력값 : 출금액, 반환값 현재잔액)    현재잔액 -= 출금액
		public Account(String accNum, int balance, String name) {
			super();
			this.accNum = accNum;
			this.balance = balance;
			this.name = name;
		}
		public Account() {
			super();

		}

		public Account(String accNum, String name) {
			super();
			this.accNum = accNum;
			this.name = name;
		}

		int withdraw(int status) {
			if (balance>status) {
				
			}
			balance-=status;
			
			
		}
		return balance;
}
