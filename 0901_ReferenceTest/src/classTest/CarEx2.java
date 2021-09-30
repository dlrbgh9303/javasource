package classTest;

public class CarEx2 {

	public static void main(String[] args) {
		
		//첫번째 차
		//객체 생성시 생성자 자동 호출됨
		Car2 car=new Car2();
		// 기본 속성값은 String=>null,0,false,0.0
		// int=>0
		//boolean=>false, double=>0.0
		
		
		//두번째 차
		Car2 car2=new Car2("kona");
		//세번째 차
		Car2 car3=new Car2("kona","black");
		//세번째 차
		Car2 car4=new Car2("현대","kona","black",250);
		
		
	}

}
