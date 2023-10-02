
package test_1001;

public class Ex9_1 {
		public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2):"+c1.equals(c2));
			}
		}
		class SutdaCard {
		int num;
		boolean isKwang;
		
		SutdaCard() {
		this(1, true);
		}
		
		SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
		}
		
		public boolean equals(Object obj) { // Object 이기때문에, 어떤 타입의 인스턴스도 매개변수로 가능
			if(obj instanceof SutdaCard) { //그래서 반드시 로 확인한 후에 형변환해서 멤버변수 값 비교
				SutdaCard c = (SutdaCard)obj; 
			return num == c.num && isKwang == c.isKwang;// 두 객체 간의 동등성 비교에 사용되며, 이를 통해 두 개의 SutdaCard 객체가 동일한 카드를 나타내는지를 판단
			}return false;
		}
		public String toString() {
		return num + ( isKwang ? "K":"");
		}
	}