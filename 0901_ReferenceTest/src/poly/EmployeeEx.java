package poly;

public class EmployeeEx {

	public static void main(String[] args) {
		Worker worker = new Worker();
		
		
		
		Employee e1 = new Employee();
		e1.setName("홍길동");
		e1.setPosition("사원");
		worker.work(e1);
		
		Ceo ceo = new Ceo();
		ceo.setName("박보검");
		ceo.setPosition("사장");
		worker.work(ceo);
		
		Manager manager = new Manager();
		manager.setName("김수정");
		manager.setPosition("관리자");
		worker.work(manager);
		
		Parttime partTime = new Parttime();
		partTime.setName("이지훈");
		partTime.setPosition("알바");
		worker.work(partTime);
		
		
	}

}
