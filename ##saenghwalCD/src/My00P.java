public class My00P {
	public static void main(String[] args) {
		Print p1 = new Print();

		Print.delimiter = "-----";
		p1.A(); // 클래스를 복제한 것들을 인스턴스라함.
		p1.A();
		p1.B();
		p1.B();

		Print p2 = new Print();

		Print.delimiter = "-----";
		p2.A();
		p2.A();
		p2.B();
		p2.B();

		p1.A();
		p2.A();
		p1.B();
		p2.B();

	}
}
