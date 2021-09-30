package inheritance;

public class BonusPointAccount extends Account2{
private int bonusPoint;

// 계좌번호 , 계좌주, 잔액, 보너스포인트 / 입금하다 출금하다 보너스 포인트 추가
	public BonusPointAccount(String accountNo,int balance,String name,int bonusPoint) {
		super(accountNo, balance, name);
		this.bonusPoint=bonusPoint;
		
	
	}
	
	@Override
		void deposit(int amount) {
			// 예금하다 + 예금액의 0.1% 보너스 포인트
			super.deposit(amount);
			
		}
	
}
