package ch03;

public class Ex3_2 {

	public static void main(String[] args) {
		
		// 사과 = 123 
		// 바구니 1개에 10개씩 담을 수 있음 ->  13개 바구니가 필요?!
		// 123 / 10 = 12.3 -> 올림 
		
		int apple = 123; //사과의 개수
		int basket = 0; // 바구니의 개수
		if(apple%10 !=0) {
			basket = (apple/10)+1;
		}
		System.out.println("apple의 개수 =" + apple + ", 필요한 basket의 개수 = " + basket) ;
		
		
		int numOfApple = 123; //사과의 개수
		int sizeOfBucekt = 10; // 바구니의 크기(바구니에 담을 수 있는 사괴의 개수)
		int numOfBucket = numOfApple/sizeOfBucekt + (numOfApple%sizeOfBucekt>0 ? 1: 0);
		
		// 1. int / int = int -> 나머지 버림
		// 2. 나머지가 있는 경우 -> 바구니가 1개 더 필요 -> % 활용하여 나머지 여부 확인 !
	}

}
