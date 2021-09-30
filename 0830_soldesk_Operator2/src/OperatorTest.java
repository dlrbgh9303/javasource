import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("비만도 검사===========");

		System.out.print("이름 : ");
		String name = k.next();

		System.out.print("키 : ");
		double height = k.nextDouble();

		System.out.print("몸무게 : ");
		double weight = k.nextDouble();

		System.out.println("-------------");

		System.out.println("표준체중 : ");
		double stdWeight = (height - 100) * 0.9;

		System.out.println("비만도 : ");
		double bimando = (weight / stdWeight) * 100;
		String result = (bimando > 120) ? "비만" : "정상";

	}

}
