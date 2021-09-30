package afterschool;

public class Exam12 {

	public static void main(String[] args) {
		String arr[]= {"사과","배","수박","참외","딸기","포도","체리"};
		
		for (String str : arr) {
			System.out.print(str+" ");
		}
		System.out.println();
		double arr2[]= {56.3,78,9,453.8,79,65};
		for (double d : arr2) {
			System.out.print(d+" "); // 정수로 넣은 소수도 자동형변환 promotion(프로모션)
		}
	}

}
