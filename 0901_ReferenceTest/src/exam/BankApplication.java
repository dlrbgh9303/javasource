package exam;

import java.util.Scanner;

public class BankApplication {

	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성
	private static void createAccount() {
		//배열이 비어있는지 확인
		
		// 비어있다면 사용자의 입력값을 기반으로 배열에 담기
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		System.out.print("잔액 : ");
		int balance = scanner.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null); {
				accountArray[i] = new Account(ano,owner,balance);
				System.out.println("계좌가 생성되었습니다");
				break;
			}
		}
		
	}

	// 계좌 목록보기
	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]!=null) //for문 쓸대에 널 오류 떴을시 
			System.out.printf("%s\t%s\t%d\n",accountArray[i].getAno(),
					accountArray[i].getOwner(),accountArray[i].getBalance());
			
		}
	}

	// 입금하기
	private static void deposit() {
		//findAccount 호출해서 이용
		
		//입금할 계좌번호 입력받기
		System.out.print("입금계좌 입력 : ");
		String ano = scanner.next();
		
		
		Account account = findAccount(ano);
		
		//입금하기 기능
		if(account!=null) {
			System.out.println("입금액 : ");
			int amount = scanner.nextInt();
			//잔액 = 잔액 + 입금액;
			account.setBalance(account.getBalance()+amount);
		}else {
			System.out.println("입금 계좌룰 확인해 주세요");
		}
		
		
	}

	// 출금하기
	private static void withdraw() { // 실행자 구문
		//출금할 계좌번호 입력받기
				System.out.print("출금계좌 입력 : ");
				String ano = scanner.next();
				
				
				Account account = findAccount(ano);
				
				//출금하기 기능
				if(account!=null) {
					System.out.println("출금액 : ");
					int amount = scanner.nextInt();
					account.setBalance(account.getBalance()-amount);
				}else {
					System.out.println("출금 계좌룰 확인해 주세요");
				}
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) { // 실행자 구문
		
		Account account=null;
		//ano와 동일한 Account 객체 찾기
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray!=null) {
			// 조건 ano와 accountArray 가 가지고 있는 ano가 같다면
				if(ano.equals(accountArray[i].getAno())) { // if 에서? == 대신 이퀄스
					account=accountArray[i];
					break;
				}
				
			}
	  
		}
		
		
		return account;
		
		
	}
}
