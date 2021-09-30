package classTest;

public class MyMathEx {

	public static void main(String[] args) {
		//static 메소드(클래스 메소드) 호출 => 객체 생성 없이
		System.out.println(MyMath.add(200l, 100l));
		System.out.println(MyMath.subtract(200l, 100l));
		System.out.println(MyMath.multiply(200l, 100l));
		System.out.println(MyMath.divide(200l, 100l));
		
		//멤버메소드 호출
		MyMath math = new MyMath();
		
		
	}

}
