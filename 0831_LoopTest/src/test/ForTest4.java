package test;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		// 사용자한테 구구단의 단수를 입력받기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		

		for (int i = 1; i < 10; i++) {
			//System.out.println("2 * " + i + "=" + (2 * i));
			System.out.printf("%d * %d = %d\t" ,num,i, (num*i));
			// 마치 like 엑셀 이뺴로 마냥
		}

	}

}
