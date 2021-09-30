package classTest;

public class GoodsStockPlay2 {

	public static void main(String[] args) {
		
				// 첫번째 상품 재고관리
		GoodsStock2 product1 = new GoodsStock2("p12345",30);
		
			// 클래스 외부에서 속성을 직접 변경하는 것은 안됨
			// private => GoodsStock2.code is not visible
			// 
		
			//product1.name = "p12345";
			//product1.stock= 30;
			
				// 상품판매 => 재고 감소
				// 호출 => 리턴값으 있다면 리턴값을 받기(syso,변수로)
				//System.out.println("현재 재고수량 "+product1.stockDown(15));
			
			// 변수 선언
			int stock = product1.stockDown(15);
			System.out.println("현재 재고수량 "+stock);
			
			//이후로 stock을 계속 사용 가능
			
				// 반품 => 재고 증가
				// 메소드 호출 => 리턴타입이 없으면 호출만 하면 됨
			product1.stockUp(5);
			System.out.println("현재 재고수량 "+product1.getstock());
			
		
		
	}

}
