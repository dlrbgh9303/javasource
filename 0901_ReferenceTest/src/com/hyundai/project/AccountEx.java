package com.hyundai.project;

// 같은 패키지가 아닌 클래스를 불러올 때 필요
import com.samsung.project.Account;

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
