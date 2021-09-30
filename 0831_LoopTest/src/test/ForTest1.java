package test;

import java.util.Iterator;

public class ForTest1 {

	public static void main(String[] args) {
		// ;
		
		// for 실행순서
		// 1. int i =0;
		// 2. i < 10; 
		// 3. 반복해야할 작업 실행 => System.out.println("안녕하세요");
		// 4. i++ (i= i+1) => i=1
		// 5. i < 10; 
		// 6. 반복해야할 작업 실행 => System.out.println("안녕하세요");
		// 7. i++ (i= i+1) => i=2
		// 8. i < 10;
		// 9. 반복해야할 작업 실행 => System.out.println("안녕하세요");
		// 반복....
		// i = 9 
		// i < 10;
		// 반복해야할 작업 실행 => System.out.println("안녕하세요");
		// i = 10
		// i < 10
		// i < 10; 조건 불만족 => for 루프를 빠져나감 => for 종료.
		
		
	   for (int i = 0; i < 10; i++) {
		    // 반복해야할 작업
		   System.out.println("안녕하세요");
	}
	   
	  System.out.println();
	  
	  
	  // 1~10까지 출력
	  // 1. int i=1;
	  // 2. i < 10;
	  // 3. System.out.println(i);
	  // 4. i++
	  // 반복... 
	   for (int i = 1; i < 11; i++) {
		System.out.println(i);
	}
	   
	  System.out.println();
	  // 0~10까지 짝수만 출력
	  for (int i = 0; i < 11; i+=2) {
		System.out.print(i+"\t"); // "\t" = 옆으로 나열 print로 출력
		
	  // 3의 배수만 출력
		System.out.println();
		for (int j = 3; j < 100; j+=3) {
			System.out.print(j+"\t");
			
			
		}
		
	}
	  
	   
	   
	   
	}

}
