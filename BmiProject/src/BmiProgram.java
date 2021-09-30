import java.util.Scanner;

public class BmiProgram {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = k.next();
		System.out.print("키(m단위) : ");
		double height = k.nextDouble();
		if (height >= 3) {
			height /= 100;
		}
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		double bmi = weight / (height * height);
		String result = "저체중";
		if (bmi >= 35) {
			result = "고도비만";
		} else if (bmi >= 30) {
			result = "중도비만";
		} else if (bmi >= 25) {
			result = "경도비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		}
		System.out.println("------");
		System.out.printf("BMI :  bmi");
		System.out.printf("%s씨는 %s\n", name, result);

	}
}
//		고도 비만 : 35 이상
//		중(重)도 비만 (2단계 비만) : 30 - 34.9
//		경도 비만 (1단계 비만) : 25 - 29.9
//		과체중 : 23 - 24.9
//		정상 : 18.5 - 22.9
//		저체중 : 18.5 미만

//		System.out.print("Bmi점수 : ");
//		double bmiScore = (weight / height);
