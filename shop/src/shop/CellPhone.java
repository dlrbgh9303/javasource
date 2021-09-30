package shop;

public class CellPhone extends Product {
	
	private String carrier; // 통신사 정보

	public CellPhone(String pname, int price,String carrier) {
		super();
		this.carrier=carrier;
	}




	
	
	
	
	@Override
	public void printExtra() {
		System.out.println("통신사정보 : "+carrier);
	}

}
