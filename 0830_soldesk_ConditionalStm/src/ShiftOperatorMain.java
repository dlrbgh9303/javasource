
public class ShiftOperatorMain {

	// 배열, 컬렉
	// 점찍고, 디버그
	
	public static void main(String[] args) {
		int value = 21;
		
		if (value >= 16) {
			System.out.println("배달");
			value -= 16;
		}
		System.out.println(value);
		
		if (value >= 8) {
			System.out.println("와이파이");
			value -= 8;
			
		}
		System.out.println(value);
		
		if (value >= 4) {
			System.out.println("흡연실");
			value -= 4;
		}
		System.out.println(value);
	}
		
		
}
