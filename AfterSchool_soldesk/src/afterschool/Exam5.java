package afterschool;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수를 입력하고 마지막에 0을 입력하세요
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		int sum=0;
		int num; 
		int count=0;
		// 사용자한테 int값을 입력받고, num이라는 변수에 담고,
		// num이 0이 아니어야 한다.
		while ((num=sc.nextInt())!=0) {
			sum+=num; // 사용자가 입력한 값 다 더하기
			count++;
		}
	
		// 10 30 -20 40 0
		// 입력한 수의 개수는 4개이며 평균은 15.0입니다.
		System.out.printf("입력한 수의 개수는 %d개이며 평균은 %.1f입니다.",count,(double)sum/count);
	}

}
