package poly;

public class Parttime extends Employee {
	@Override
	public void work() {
		System.out.println(super.getPosition()+" 으로 "+super.getName()+" 씨가 일을 합니다.");
		
		
	}
}
