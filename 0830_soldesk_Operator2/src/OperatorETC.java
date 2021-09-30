import java.util.Scanner;

// << >> <<<(shift 연산)
// 다중선택문제에서 사용 

// 정렬 
//    왼쪽 : 1
//    가운데 : 2
//    오른쪽 : 3
// 정렬 = 1

// 특성
//  	이탤릭 : 1 << 0
// 		굵게  : 1 << 1
//   	밑줄 : 1 << 2


// 대부분 2항연산
// a > 2
// 1 + 2

// 1항(단항)연산
// !d



// 24시간 = 1 << 0 
// 주차 = 2 << 1
// 흡연실 = 3 << 2
// 와이파이 = 4 << 3

public class OperatorETC {
	public static void main(String[] args) {
		int a = 3 << 2;
		System.out.println(a);
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.println("나이 : ");
		int age = k.nextInt();
		
		
		// 이름이 홍길동이면 어? 야!!!, 아니면 어서오세
		// 연산자라는것들은 stack 영역이 댁상
		//String say2 = (name == "홍길동") ? "어? 야!!!" : "어서오세요";
		String say2 = (name.equals("홍길동")) ? "어? 야!!!" : "어서오세요";
		System.out.println(say2);
		// 20살 이상이면 안녕하세요, 아니면 나가
		// 3항연산
		// 		조건식 ? 0때값 : X때값
		String say = (age >= 20) ? "안녕하세요" : "나가";
		System.out.println(say);
		
		// 나이가 짝수면 짝/홀수면 홀
		String oe = (age %2 == 0) ? oe=  "짝" : "홀";
		System.out.println(oe);
		
	}

}
