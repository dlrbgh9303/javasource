package classTest;

public class AccountEx2 {

	public static void main(String[] args) {
		
		Account account1 = new Account();
//		account1.accNum="122-01-232322";
//		account1.balance=10000;
//		account1.name="홍길동";
		
		account1.setBalance(40000);
//		계좌번호
		account1.setAccNum("122-01-213232");
//		이름
		account1.setName("홍길동");
		
		
		account1.deposit(50000);
		System.out.println("입금 후 잔액 :"+account1.getBalance());
		account1.withdraw(30000);
		
		
		
	}

}
