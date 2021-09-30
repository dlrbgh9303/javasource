import java.util.Scanner;

// 중간고사 : 
// 기말고사 : 
// ------
// 평균 :

// 평균은 소수점 한자리만
public class CSMain2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("중간고사 : ");
		int mid = k.nextInt();

		System.out.print("기말고사 : ");
		int _final = k.nextInt();

		System.out.println("----------");

		double avg = (mid + _final) / 2.0;
		System.out.printf("평균 : %.1f\n", avg);

		System.out.println("야!");	
		if (avg>=80) {
			System.out.println("다음에는 잘해라");
		}
		
		// 평균 90이상이면 "수" 출력, 아니면 야! 공부좀해! 라고 출력
        // 야!는 했지만, 80점 이상이면 다음에는 잘해라
		//System.out.println(avg >= 90 ? "수":"야!");
		
		
		// 점수 >= 90 : 수
		// 80 <= 점수 < 90 : 우
		// ...
		
		if (avg>=90) {
			System.out.println("수");
		}else if (avg>=80) {
			System.out.println("우");
		}else if (avg>=70) {
			System.out.println("미");
		}else if (avg>=60) {
			System.out.println("양");
		}else {// 마지막은 else 만 써서 마무으리!!
			System.out.println("가");
			
		}
		
		
		
		
		
					}
				
				 
}
				
			
	


