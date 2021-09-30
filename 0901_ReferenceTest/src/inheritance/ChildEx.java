package inheritance;

public class ChildEx {

	public static void main(String[] args) {
		//Child 객체 생성 => 2가지
		
		// 객체 생성
		// 1) super();  => Object 생성자 호출
		// 2) this.age = age
		// 3) super(age);  => Parent 생성자 호출
		// 4) Child 객체 생성
		
		Child child = new Child(25);
		System.out.println("child age "+child.getAge());
		child.play();
		child.print();
		
		
		Parent parent = new Child(26);
		System.out.println("child age "+parent.getAge());
		parent.print();
		
	}

}
