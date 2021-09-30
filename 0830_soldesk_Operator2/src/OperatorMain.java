import java.util.Scanner;

// 정보처리기사 무적권 따라..
// 정보올림피아드 초딩거 해보기(코드 줄이는데에 도움됨)
// 정골.org

//논리연산자
//>      >=     ==      !=      <=      <
//초과    이상    같다     다르다    이하    미만

//논리결헙연산자
//&&       ||          !         ^
//고/and  거나/or     반대/not     xor

// xor(exclusive or) - 배타적 or

public class OperatorMain {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("---편의점 택배---");
		System.out.print("가로 : ");
		int x = k.nextInt();
		System.out.print("세로 : ");
		int y = k.nextInt();
		System.out.print("높이 : ");
		int z = k.nextInt();
		System.out.print("무게 : ");
		int h = k.nextInt();

		System.out.println("--------------");

		double v = x * y * z;
		System.out.printf("부피 : %.1f\n", v);
		System.out.printf("무게 : %.1f\n", h);

		// 부피 : cm
		// 무게 : kg
		
		// # 언어를 잘쓰는 법
		
		// 조건문 - 모두 어려워한다
		// 반복문 - 모두 어려워한다
		// 배열
		
		// 그 언어만의 특징 - 객체, 라이브러리 잘 활

		// 부피가 10이상이고, 무게가 1000이상이면 이용가능
		boolean a = v >= 10 & h >= 1000;
		System.out.println(a);

		// 부피가 10미만이거나, 무게가 1000미만이면
		boolean b = (v < 10) | (h < 1000);
		System.out.println(b);

		// 부피가 10미만이든지, 무게가 1000미만이든지 하나만
		boolean d = (v<10) ^ (v<1000);
		System.out.println(d);
		
		// 2800
		// 
		
		// 무게가 20이상이고, 무게가 30이상이면
		boolean c = (h >= 20) & (h > 30);
		System.out.println(c);

	}

}
