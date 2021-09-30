package classTest;

public class TvEx {
	public static void main(String[] args) {
		
		// 객체 선언, 생성 
		TV tv = new TV();
		System.out.println(tv);
		
		// 객체 조작
		tv.power = true;
		tv.channel = 2;
		
		tv.channelUp(); // 메소드 호출
		System.out.println("채널상태:"+tv.channel);
		
		
		
	}
	
}
