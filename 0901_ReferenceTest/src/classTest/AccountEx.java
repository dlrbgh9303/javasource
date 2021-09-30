package classTest;

public class AccountEx {

	public static void main(String[] args) {
		
		Account account1 = new Account();
		account1.accNum="122-01-232322";
		account1.balance=10000;
		account1.name="홍길동";
		
		account1.deposit(50000);
		
		account1.withdraw(30000);
		
		
		
	}

}
