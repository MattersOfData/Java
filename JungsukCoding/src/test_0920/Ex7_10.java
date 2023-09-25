package test_0920;


// 7-10 
// MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고
// 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter & setter 메서드를 추가하라

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int channel) { // 멤버변수의 값을 어디서나 읽고& 변경 가능 하게 하기 위해서 'public' 사용
		if(channel >MAX_CHANNEL || MIN_CHANNEL<1) // 매개변수가 있는 경우, 반드시 유효성 검사 진행 !!
			return;
		this.channel = channel; // 메서드 안의 lv channel 은 메서드 종료시, 사라지기 때문에 iv 에 담아서 업데이트 필수 !!
		}
	
	public void setVolume(int volume) { // 멤버변수의 값을 어디서나 읽고& 변경 가능 하게 하기 위해서 'public' 사용
		if(MAX_VOLUME >100 ||MIN_VOLUME <0) // 매개변수가 있는 경우, 반드시 유효성 검사 진행 !!
			return;
		this.volume = volume; // 메서드 안의 lv volume 은 메서드 종료시, 사라지기 때문에 iv 에 담아서 업데이트 필수 !!
		}
	
	public int getChannel() {
		return channel;
		}
	public int getVolume() {
		return volume;
		}

	}		
class Ex7_10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
		}
	}	


