package test_0920;


public class Ex7_10_1 {

	public static void main(String[] args) {
	MyTv t = new MyTv();
	
	t.setChannel(10);
	System.out.println("CH:" + t.getChannel());
	t.setVolume(20);
	System.out.println("VOL:" + t.getVolume());
	}
}	

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int setChannel(int channel) { 
		if(channel >MAX_CHANNEL || MIN_CHANNEL<1) // 매개변수가 있는 경우, 반드시 유효성 검사 진행 !!
			return 0;
		return this.channel = channel; // 메서드 안의 lv channel 은 메서드 종료시, 사라지기 때문에 iv 에 담아서 업데이트 필수 !!
	}
	int setVolume(int volume) {
		if(MAX_VOLUME >100 ||MIN_VOLUME <0) // 매개변수가 있는 경우, 반드시 유효성 검사 진행 !!
			return 0;
		return this.volume = volume; // 메서드 안의 lv volume 은 메서드 종료시, 사라지기 때문에 iv 에 담아서 업데이트 필수 !!
	}
	
	int getChannel() {
		return channel;
	}
	int getVolume() {
		return volume;
	}

}	
		




