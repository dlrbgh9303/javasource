package test;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {

		// 사용자한테 숫자 2개 입력받기
		Scanner num = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int x = num.nextInt();

		System.out.printf("숫자를 입력하세요 : ");
		int y = num.nextInt();

		// 연산자 입력받기 (+,-,*,/,%)
		System.out.print("연산자를 입력하세요 : ");
		String op = num.next();

		// switch(연산자)

		System.out.println("---------------");

		// 연산 후 계산 결과 출력

		int result = 0;

		switch (op) {
		case "+":
			result = x + y;
//			System.out.printf(x+op+y+"="+(x+y));
			break;
		case "-":
			result = x - y;
//			System.out.printf(x+op+y+"="+(x-y));
			break;
		case "*":
			result = x * y;
//			System.out.printf(x+op+y+"="+(x*y));
			break;
		case "/":
			result = x / y;
//			System.out.printf(x+op+y+"="+(x/y));
			break;
		case "%":
			result = x % y;
//			System.out.printf(x+op+y+"="+(x%y));
			break;

//		default:
//			System.out.println("연산자를 확인해주세요!");
//			break;
		}
		System.out.printf("%d %s %d = %d", x, op, y, result);
//		                  정수 문자 정수
	}

}
