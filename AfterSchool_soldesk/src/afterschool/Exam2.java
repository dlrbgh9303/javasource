package afterschool;

public class Exam2 {

	public static void main(String[] args) {

		
		int i=1;          // 변수를 메인에 선언했기에 아래 모두 해당 변수를 이용가능!!
		if(i<10) {
			System.out.println(i);
			System.out.println("안녕하세요");
			
		}
		for ( i = 0; i < 10; i++) // 변수를 이미 메인에 선언했기에 해당 for문에서 int는 빼야 된다.
		System.out.println(i);	
		
		switch (i) {
		case 1:
			
			break;

		default:
			break;
		}
		
		
	}

}
