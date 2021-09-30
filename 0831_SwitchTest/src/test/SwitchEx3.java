package test;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
//		String position="과장";
		
		//position 입력 받은 후 금액출력
		
		// position 부장 700만 , 과장 500만원 나머지 300만원
		
		Scanner l = new Scanner(System.in);
		
		System.out.println("직급 : ");
		String x = l.next();
		
		
		switch (x) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");	
			break;
		default:
			System.out.println("300만원");
			break;
		}
		
		
		
	}

}
