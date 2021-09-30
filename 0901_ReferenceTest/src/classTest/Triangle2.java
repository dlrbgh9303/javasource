package classTest;

public class Triangle2 {
	// 삼각형 너비 구하기
	// 밑변*높이 /2
	
	//속성 : 밑변 , 높이
	private int baseLine;
	private int height;
	
	//생성자는 기본 생성자 
	//Triangle2(){}
		
	Triangle2(int baseLine,int height){
		this.baseLine = baseLine;
		this.height = height;
	}
	//기능 : 밑변*높이 /2 결과 리턴
	int getArea() {
		return baseLine*height /2;
	}
	
	
		
			
			
			
		}
		
	
	

