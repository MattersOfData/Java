package test_0918;
// 컴파일 오류를 해결하기 위한 방법을 설명하시오
class Product{
	int price ; // 제품의 가격
	int bonusPoint; // 제품 구매시 제공하는 보너스 점수
	
	Product(){} 
	Product(int price){
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
}

class Tv1 extends Product{
	//Tv1(){super(); }// 기본생성자 : 컴파일러 자동 추가
	 
	Tv1(){super(100);}// if Tv객체의 멤버변수 초기화하고 싶을 경우, 여기에 price 입력 & 기본 생성자 삭제 !
	
	// Tv(자손)와 Product(부모)가 상속관계에 있을때,
	// Tv 객체 생성시, Tv생성자 호출 & 조상 생성자 super() 호출해서 초기화 진행
	// 클래스에 생성자는 반드시 있어야 하고, 상속관계가 있을 경우, 첫줄에 반드시 생성자 호출해야함
	// 없으면, 컴파일러가 자동으로 기본 생성자 super();삽입함
	// 없어서 컴파일러가 추가하려고 보니까, Product에 매개변수 생성자만 있고, 기본생성자 없음 --> 이미 생성자 1개 있기때문에, 기본생성자 자동추가 x
	// 에러 
	
	public String toString() {
		return "Tv1";
	}
}

public class Ex7_5 {

	public static void main(String[] args) {
		Tv1 t = new Tv1();
		System.out.println(t.price);
		System.out.println(t.bonusPoint);
		System.out.println(t.toString());
	}

}
