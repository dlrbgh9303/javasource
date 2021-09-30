package classTest;

public class Card {
	
	// 멤버 변수
	private String kind; // 카드 모양 지정
	private int number; // 카드 숫자 지정
	
//	int width;
//	int height;
	
	// static (정적) : 클래스에 고정된 멤버
	// 			      객체를 생성하지 않고 사용
	// 				  클래스가 메모리에 로드될 때 생성
	
	// 클래스 변수
	static int width = 10;
	static int height = 7;
	
	// 생성자
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}


	public String getKind() {
		return kind;
	}

	public int getNumber() {
		return number;
	}


	// static(정적) 매소드 : 객체를 생성하지 않고 사용 
	// 					  클래스가 메모리에 로드될 떄 생성
	//					  static 메소드 안에서 인스턴스 멤버 사용 불가 (같은 get만 부를수있
	
	public static int getWidth() {
		return width;
	}


	public static int getHeight() {
		return height;
	}


	}
	
	
	

