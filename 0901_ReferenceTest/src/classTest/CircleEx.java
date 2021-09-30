package classTest;

public class CircleEx {

	public static void main(String[] args) {
		
		Circle play1 = new Circle();
		play1.radius =10;
		
		System.out.println("원의 면적: "+play1.area());
		
		Circle play2 = new Circle();
		play2.radius =4.5;
		
		System.out.println("원의 면적: "+play2.area());
		
	}

}
