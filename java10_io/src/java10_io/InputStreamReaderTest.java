package java10_io;

import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public InputStreamReaderTest() {}
	
	
	//InputStreamReader : 문자 단위로 입력받는 클래스
	//배열의 크기 만큼 문자열 한번에 읽어오기
	public void start() {	
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			/*
			while(true) {
				int code = isr.read();	
				if(code==13) break; // 엔터 13나오면 break 		'한'						"한"
				System.out.println(code + "---->" + (char)code + "," + String.valueOf((char)code)); 
			}*/
			
			/*char [] inData = new char[10]; // 10 글자
			int cnt = isr.read(inData); 
			System.out.println(cnt + "==>" + String.valueOf(inData));
			*/
			
			char[] inData = new char[10];
			int cnt =isr.read(inData, 2 ,4);
			System.out.println(cnt + "--->" + new String(inData));
			
			System.out.println("12345");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new InputStreamReaderTest().start();
	}

}
