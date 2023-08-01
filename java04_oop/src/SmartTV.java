
public class SmartTV extends TV {
	public SmartTV () {
		size = 65;
		//MAX_VOLUMN= 50; final 변수 임으로 값을 변경할수 없다.
		
	}
	public void start() {
		System.out.println("MAX_VOLUMN ->" + MAX_VOLUMN);
		
		volumnDonw();
		
		System.out.println("volumn -> " + volumn);
	}
		// 상위클래스의 final 메소드는 오버라이딩 할 수 없음!
		//public void volumnDonw() {}
		
	public static void main(String args[]) {
		SmartTV sTV = new SmartTV();
		sTV.start();

	}
}	


