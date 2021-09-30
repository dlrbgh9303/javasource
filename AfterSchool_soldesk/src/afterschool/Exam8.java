package afterschool;

public class Exam8 {

	public static void main(String[] args) {
		// 배열은 메모리를 효율적으로 쓰기위해 같은타입 저장할때
		
		// 배열 => 힙(new)
		
		// 배열 선언
		 int arr [];
		// 생성
		 arr = new int[10];
		 
		
		// 초기화 1~10까지 값을 대입
//		int arr2[]={1,2,3,4,5,6,7,8,9,10};
		 for (int i = 0; i < arr.length; i++) {
			//System.out.print([i]+" ");
			 arr[i]=i+1;
		}
		
		 
		// 사용
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+" ");
		 }
		
		
		
		
		
	}

}
