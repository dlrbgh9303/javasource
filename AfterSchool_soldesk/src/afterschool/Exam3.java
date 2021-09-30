package afterschool;

public class Exam3 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55
		
		// 반복문 => for, while, do~while
		int sum=0;
		for (int i = 1; i < 11; i++) {
			
			sum+=i;  // 열전전체 합계 
			
			System.out.print(i);
			if (i<=9) {
				System.out.print("+");
			} else {
				System.out.print("=");
				System.out.print(sum);
			}
			
		}
				
			}
			
		}
		
		
	

	
