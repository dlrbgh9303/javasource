package classTest;

public class Triangle3 {
	// 길이가 서로 더른 삼각형 5개를 가지고 있다.
	// 넓이 구하기
	private int baseLine;
	private int height;

	Triangle3() {
	}

	

	Triangle3(int baseLine,int height){
	this.baseLine = baseLine;
	this.height = height;
}

//기능 : 밑변*높이 /2 결과 리턴
	int getArea() {
	return baseLine*height /2;
	}
}