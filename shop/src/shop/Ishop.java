package shop;

// 완전추상화 => 상수필드,추상메서드 가짐
// jdk8 => default , static 가질수 있긴 함

public interface Ishop {
	void setTitle(String title); // public abstract 부분이 생략
	void genUser();
	void genProduct();
	void start();
	
}
