package exam;

public class NumMultiple {

	public static void main(String[] args) {
		 // 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num
		//의 값을 뺸 나머지를 구하시오
		// ex) num 이 24라면 크면서도 가장 가까운 10의 배수는 30임
		
		int num=24;
		
//		int a = num+9;
//		System.out.println(a-num);
//		System.out.println((10-(num%10))*10);
		System.out.println((num/10+1)*10);
	}

}