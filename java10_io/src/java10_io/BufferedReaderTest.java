package java10_io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public BufferedReaderTest() {
		start();
		
	}
	public void start() {
		//BufferInputStream : 문자를 1byte단위로 입력하여 버퍼에 보관후 읽을 수 있는 클래스
		//BufferReader : char 단위로 입력하여 버퍼에 보관후 1줄씩 읽을 수 있도록 제공하는 클래스
	
	
		try {
			InputStreamReader isr = new InputStreamReader(System.in); //추상클래스여서 바로 객제 생성 x
			BufferedReader br = new BufferedReader(isr);
			
			String txt = br.readLine();
			System.out.println(txt);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		new BufferedReaderTest();
	}

}
