package interfaceTest;

public interface PlayingCard {
	int SPADE =4; // 상수니깐 public static final 생략 가능
	final int DIAMOND =3;
	static int HEART =2;
	
	
	public abstract String getCardNumber();
	String getCardKind();
	
}
