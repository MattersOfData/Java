package test_0916;

public class Ex6_21 {
//Tv 클래스를 주어진 로직대로 완성하시오.
// 완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인하라
	
public static void main(String args[]) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel+ ", VOL:"+ t.volume);
		
		t.ChannelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel+ ", VOL:"+ t.volume);
		
		t.volume = 100;
		t.ChannelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel+ ", VOL:"+ t.volume);
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
	
	void turnOnOff() { //1) isPowerOn의 값이 true면 -> false or false -> true
		if(isPowerOn) 
			 isPowerOn = false; 
		else 
			isPowerOn = true; 
		}
	void volumeUp () {//2) volume의 값이 MAX_VOLUME 보다 작을때만 값을 1 증가
		if(volume<MAX_VOLUME) 
			volume++;
		}
	void volumeDown() { //3) volume의 값이 MIN_VOLUME 보다 클때만 값을 1 감소
		if(volume>MIN_VOLUME) 
			volume--;
		}
	void ChannelUp () {//4) channel의 값이 MAX_CHANNEL 보다 작을때만 값을 1 증가
		if(channel<MAX_CHANNEL) 
			channel++;
		}
	void ChannelDown () {//5) channel의 값이 MIN_CHANNEL 보다 클때만 값을 1 감소
		if(channel>MIN_CHANNEL) 
			channel--;
		}
	}// end of MyTv


	
	

	
		