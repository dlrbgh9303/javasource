package classTest;

public class TvEx3 {
	public static void main(String[] args) {
		// TV3 객체를 3개 생성하고 싶다
		
		
		
		//=>배열
		TV3 tvArr[]=new TV3[3]; // int arr[]=new int[3];
		
		tvArr[0]=new TV3("빨강",true,5);
		tvArr[1]=new TV3("초록",false,6);
		tvArr[2]=new TV3("파랑",true,2);
	
		printArr(tvArr);
	}
	
	static void printArr(TV3 tvArr[]) { // for문 쓰려면 어레이명 가져와야함
		//tvArr에 들어있는 객체의 내용을 출력
		for (int i = 0; i < tvArr.length; i++) {
			System.out.println("TV 색상 "+tvArr[i].getColor());
			System.out.println("TV 채널 "+tvArr[i].getChannel());
			System.out.println();
			
		}
	}
	
	
}
