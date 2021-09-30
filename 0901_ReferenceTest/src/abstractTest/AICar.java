package abstractTest;

public class AICar extends Car {
	
	public AIcar(String color) {
		super(color);
		
		
	}
	
	@Override
	void drive() {
		System.out.println("출발");
	}
	@Override
	void stop() {
		System.out.println("자동으로 멈춤");
	}
}
