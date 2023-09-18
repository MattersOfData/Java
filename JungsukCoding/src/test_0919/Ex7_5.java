package test_0919;

class Product{
	int price ; // 제품의 가격
	int bonusPoint; // 제품 구매시 제공하는 보너스 점수
	
	Product(){} 
	Product(int price){
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(); // 컴파일러 자동 추가
	} 
	// Tv 객체 생성할때, Tv생성자 호출 & 조상 생성자 super() 호출해서 초기화 진행
	// 생성자 첫줄에 반드시 생성자 호출해야 하기때문에
	// 없으면, 컴파일러가 자동으로 super();삽입함
	// 없어서 컴파일러가 추가하려고 보니까, Product에 매개변수 생성자만 있고, 기본생성자 없음 --> 이미 생성자 1개 있기때문에, 기본생성자 자동추가 x
	// 에러 
	
	public String toString() {
		return "Tv";
	}
}

public class Ex7_5 {

	public static void main(String[] args) {
		Tv t = new Tv();
	}

}
