//클래스명에 final 을 명시하는 경우 -> 햐덩 클래스 자체가 상속이 안됨 -> 클래스 내용 사용 x
//상속가능하게 할 경우 -> final 삭제
//public final class TV {
	public class TV { //초기값
	int size = 42;  // 55 -> 65
	int channel = 11; // 3
	int volumn = 12; // 14
	final int MAX_VOLUMN = 30; //상속됨, 값을 변경할 수 없음-> 대문자 사용
	
	public TV() {
		size = 55;
		channel = 3;
		volumn =15;
	}
	public void volumnUp() {
		volumn++;
			if(volumn>MAX_VOLUMN) {
				volumn = 30;
			}
	}
	
	//final 이라 상속되도, 오버라이딩은 안됨(재정의 불가)
	public final void volumnDonw() {
		volumn --;
		if(volumn<0) {
			volumn = 0;
		}
	}
}
