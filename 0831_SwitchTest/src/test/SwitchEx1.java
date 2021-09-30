package test;

//* switch(int,double,float,String,enum){
//* case 값1
//*		해야할일 ;
//* 	break;
//* case 값2
//*		해야할일 ;
//* 	break;
//* default
//*		해야할일 ;
//* }
//*
//* if ~ elseif ~ else 	대체해서 사용가
//*
//*/






public class SwitchEx1 {

	public static void main(String[] args) {
		// 주사위

		// 1~6 사이의 수를 자동으로 생성해주는 코드
		// 0.0 <= 어떤값 < 1.0
		int num = (int) (Math.random()*6)+1;
		
//		if (num==1) {
//		}else if (num==2) {
//			System.out.println("1번나옴");
//		}else if (num==3) {
//			System.out.println("2번나옴");
//		}else if (num==4) {
//			System.out.println("3번나옴");
//		}else if (num==5) {
//			System.out.println("4번나옴");
//		}else if (num==6) {
//			System.out.println("5번나옴");
	
		switch (num) {
		case 1: 
			System.out.println("1번나옴");
			break;
		case 2: 
			System.out.println("2번나옴");
			break;
		case 3: 
			System.out.println("3번나옴");
			break;
		case 4: 
			System.out.println("4번나옴");
			break;
		case 5:
			System.out.println("5번나옴");
			break;
		default:
			System.out.println("6번나옴");
		}
		
		
		
		}
		}
	


