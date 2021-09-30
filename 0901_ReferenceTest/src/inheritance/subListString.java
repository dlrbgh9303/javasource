package inheritance;

public class subListString extends ListString {
	String name = "이규호";
	
	@Override
	public void list() {
		// TODO Auto-generated method stub
		super.list(); //모데이터 .리스트 호출
		System.out.println(name + "하위 클래스");
		
	}
	
	public void writer( ) {
		//부모가 가지고 있는 이름을 출력
		System.out.println(super.name); // 수퍼를 붙히면 모데이터를 가리킴
		
		super.list();
		
	}
	
	
}
 