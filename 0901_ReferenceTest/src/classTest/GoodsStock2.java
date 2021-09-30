package classTest;

public class GoodsStock2 {
	// 속성 : 상품코드(p12345), 재고수량(100)
	// 기능 : 재고수량 증가(입력값 수량,출력값은 없음)
	// 재고수량 감소(입력값 수량,출력값은 현재 재고수량)
	private String name;
	private int stock;

	// 기본생성자
	GoodsStock2() {
	}

	// 생성자 오버로딩
	GoodsStock2(String name, int stock) {
		this.name = name;
		this.stock = stock;

	}

	void stockUp(int amount) {
		stock += amount;
	}

	int stockDown(int amount) {
		if (stock > amount) {
			stock -= amount;
		}
		return stock;
	}
	
	
	
	//현재 재고수량을 리턴하는 기능
	
	int getstock() {
		return stock;
	}
	
	
	
	
	
	
	
}
