package classTest;

public class SubscriberInfo {
	//속성 - 이름, 아이디, 패스워드, 전화번호, 주소
		private String name;
		private String id;
		private String pw;
		private String tel;
		private String addr;
		
		
		//생성자 - 이름, 아이디, 패스워드만 초기화를 한 후 객체 생성
		//      - 이름 ,아이디, 패스워드, 전화번호, 주소를 초기화 한 후 객체 생성
		
		public SubscriberInfo(String name, String id, String pw) {
			super();
			this.name = name;
			this.id = id;
			this.pw = pw;
			
		}
		
		

		public SubscriberInfo(String name, String id, String pw, String tel, String addr) {
			super();
			this.name = name;
			this.id = id;
			this.pw = pw;
			this.tel = tel;
			this.addr = addr;
		}



		//기능 - 비번 변경, 전번 변경, 주소변경
		// setter 메소드로 

		public void setPw(String pw) {
			this.pw = pw;
		}


		public void setTel(String tel) {
			this.tel = tel;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		
	
	
	
	
}
