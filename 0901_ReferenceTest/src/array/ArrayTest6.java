package array;

public class ArrayTest6 {

	public static void main(String[] args) {
		// 이차원배열
		int scores[][]=new int[2][3];
		
		
		//초기화
		scores[0][0]=15;
		scores[0][1]=25;
		scores[0][2]=35;
		
		scores[1][0]=45;
		scores[1][1]=55;
		scores[1][2]=65;
		//확인
		System.out.println("배열길이(행):"+scores.length);
		System.out.println("배열길이(열):"+scores[0].length);
		
		
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		
		int arr[][]= {
				{15,25},
				{65,85,95}
		
		};
		
	}

}
