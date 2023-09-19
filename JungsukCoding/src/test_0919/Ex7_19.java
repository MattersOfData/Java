package test_0919;

public class Ex7_19 {
	// 다음 3개의 메서드를 완성하시오
	// 1. 메서드명 : buy
	// 기능  : 지정된 물건을 구입한다
	// 			가진돈(money)에서 물건의 가격을 뺴고, 카드(cart)에 담는다
	//			만일, 가진 돈이 물건의 가격보다 적다면 바로 종료한다
	// 반환타입 : 없음
	// 매개변수 : Product p - 구입할 물건
	
	// 2. 메서드명 : add
	// 기능 : 지정된 물건을 장바구니에 담는다
	//		만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린 다음 담는다
	// 반환타입 : 없음
	// 매개변수 : Product p - 구입할 물건
	// 3. 메서드명 : summary
	// 기능 : 구입한 물건의 목록과 , 사용금액, 남은 금액을 출력한다
	// 반환타입 : 없음
	// 매개변수 : 없음
	
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	
	}
	}

class Buyer{
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열 --> 각기 다른 객체를 하나의 배열로 저장
									// Product배열 cart에 사용될 index
	int i = 0; // 구입한 제품의 수 
	
	void buy(Product p) {
		if(money < p.price){// 가진돈과 비교 --> 돈이 적으면 메서드 종료
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
			return ;
		}else { // 가진돈이 충분하면 --> 가진돈 - 제품가격
			money = money - p.price;
				add(p); // 장바구니에 구입할 물건 담는다(add 메서드 호출)
		}
	}
	
	void add(Product p) {
	if( i>=cart.length) { //i의 값이 장바구니 크기보다 같거나 크면
		Product[] cart1 = new Product[cart.length*2];
		for(int i = 0; i< cart.length;i++) { //기존 장바구니 크기보다 2배 큰 새로운 배열을 생성
			cart1[i] = cart[i];  //기존 장바구니 내용을 새로운 배열에 복사
				}				// System.arraycopy(cart,0,cart1,0,cart.length);
		cart = cart1; //새로운 장바구니와 기존 장바구니 바꿈
			}
		cart[i++] = p;//물건을 장바구니(cart)에 저장 & i의 값을 1만큼 증가
		}
	
	void summary() { //매개변수 없게 진행해야 함 --> 위에서 b.summary()로 호출했기때문에
		int sum = 0;
		String itemList= "";
		for(int i = 0; i< cart.length; i++){
			if(cart[i] == null) break;  // 장바구니에 담긴 물건이 없을때 break; 
			sum = sum + cart[i].price; // 장바구니에 담긴 물건들의 가격을 모두 더해서 출력
			itemList = itemList + cart[i].toString()+ ","; // 장바구니에 담긴 물건들의 목록을 만들어 출력
			//itemList += cart[i] + ",";
		}
		// 물건을 사고 나믄 금액을 출력
		System.out.println("사용한 금액: " + sum);
		System.out.println("남은 금액:" +money);
		System.out.println("구입한 물건: " + itemList);
		}

	}

class Product{
	int price ;
	
	Product(int price){
		this.price = price;
	}

}

class Tv extends Product{
	Tv() { super(100); }
	public String toString() {return "Tv";}
}	

class Computer extends Product{
	Computer() { super(200);}
	public String toString() {return "Computer";}
	
}

class Audio extends Product{
	Audio() { super(50);}
	public String toString() {return "Audio";}
	
}