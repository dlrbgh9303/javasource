//본인이 판단하기에 xx가 필요하다면 그 때 쓰는것

// 변수(Variable) - 데이터를 담는 그릇 
// 프로그램 진행중에 만들어진 데이터를 임시로 저장할 때
// 어디다 저장?? - RAM에 저장 그렇기때문에 임시저장
// 문법 
//    그릇종류       그릇이름
//    어떤데이터저장   그릇이름
//    자료형(data type) 변수멍

// 자료형
//    기본형
//       정수 - byte, short, int(주력), long
//       실수 - float, double(주력)
//       한글자 - char
//       논리 - boolean
// 		 없다 - void
//    참조형
//       여러글자 - string(주력)
//       기타등등...

// 변수형 
//    마음대로
//       숫자로 시작불가 - IT전반적
//       특수문자 불가(_$는 괜찮음)
//       자바문법 불가

//       소문자로 시작
//       영어+숫자 조합으로
//       뜻을 알기 좋게 ->
//            근데 띄어쓰기는 못쓰니
//             korScore : 낙타체
//              kor_score: 뱀체
// = 같다x
// = 오른쪽에 있는거 왼쪽에 넣어라
// 변수 이름 일괄변경 = 변수명 우클릭 - refactor - rename

// 기본자료형
//     아무처리도 안하고 값만 있으면 뭘로 인식

//      static
//      stack - 프로그램 종료시 자동반납 -> 수동 정리가 불가
//      heap - 자동 반납되지 않음 -> 개발자 수동으로 반납처리해야
//           Java에는 GarbageCollection기능이 
//               heap 영역 자동정리 시스템 - 언제?

public class VariableMain {
	public static void main(String[] args) {
		// 국어점수가 80인거를 임시로 저장할 수 있게
		int kyuho_korScore; // 변수 만들기
		kyuho_korScore = 80; // 변수에 값 저장

		System.out.println("kyuho_korScore");
		System.out.println(kyuho_korScore);
		// ----------------------------------
		// # 실습예제
		// 기온이 24.38도인거를 임시로 저장할 수 있게
		// 변수 만들기
		// 변수에 값 저장

		// 그 변수에 들어있는 값 출력

		double temp;
		temp = 24.38;

		System.out.println("temp");
		System.out.println(temp);

		// ㅋ라는 글자를 임시로 저장할 수 있게
		// char에는 따옴표 한개짜리 사용!
		char lol;
		lol = 'ㅋ';
		System.out.println("lol");
		System.out.println(lol);

		// ㅋㅋ라는 글자를 저장할수있게
		String lol2;
		lol2 = "ㅋㅋ";
		System.out.println(lol2);

		// 배고픈가를 임시로 저장할 수 있게
		boolean isHungry;
		isHungry = true;
		System.out.println(isHungry);

		// Java에서 지역변수를 만들고 값을 안넣으면 사용이 불가능
//		int age;
//		System.out.println(age);
		int age;
		age = 29;
		System.out.println(age);

	}

}
