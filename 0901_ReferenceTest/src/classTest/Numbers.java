package classTest;

import java.util.Iterator;

public class Numbers {
	private int num[];

		// 생성자 - 소스 유징 블라블
	public Numbers(int[] num) {
		super();
		//{5,6,7,8,9};
		this.num = num;
	}
	//합계 => 반환값은 int,입력값은 없음
	//	  => 멤버변수 num 배열에 들어있는 값의 합계 리턴
		int getTotal() {
			int sum=0;
			for (int i = 0; i < num.length; i++) {
				sum+=num[i];
			}
			return sum;
		}
		//평균 => 반환값은 double, 입력값은 없음
		//    => 합계 메소드를 이용해서 평균을 구해
		double getAvg() {
			// 15/5 => 3 => 3.0
			return (double)getTotal()/num.length;
		}

 }

