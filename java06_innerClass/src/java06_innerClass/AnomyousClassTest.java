package java06_innerClass;

public class AnomyousClassTest {

	public AnomyousClassTest() {}
	
	public void start() {
		//익명의 내부 클래스
		new Sample() {
			//Sample 클래스의 sum()메소드를 오버라이딩
			public void sum() {
				int evenSum = 0;
				for (int i = 2; i<=100; i+=2) {
					evenSum += i;
				}System.out.println("evenSum = " + evenSum);
			}
			//Sample 클래스 내에 없는 메소드도  추가 가능
			public void print(){
				System.out.println(num + "----->" + name);
			}
			
		//}.print(); 
		//}.sum();
		};
		s.sum(); // 익명 내부클래스의 오버라이딩 된 메소드가 유지됨
		//s.print();// 익명 내부클래스에서 추가한 메소드는 숨김처리 됨
	}
	public static void main(String[] args) {
		new AnomyousClassTest().start();
	}

}
