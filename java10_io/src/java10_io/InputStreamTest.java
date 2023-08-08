package java10_io;

import java.io.IOException;
import java.io.InputStream;

import javax.swing.text.IconView;

public class InputStreamTest {

	public InputStreamTest() {
		
	}

	public void start() {
		//InputStream: byte단위로 입력받음
		//			 : 추상클래스 임으로, 객체를 생성할 수 없음
		//			 : System클래스 멤버변수 중, in 멤버변수가 InputStream 객체를 가지고 있음
		InputStream is = System.in;
		try {
			
			while(true) { // 1 바이트만 읽어 오기때문에, 전체 읽어오려면 while 문 사용 !
				/*int readData = is.read(); // 데이터 읽다가 데이터가 없을 때 -> -1 return
				if(readData == -1) break;
				System.out.println(readData);
				System.out.println((char)readData);
				*/
			
				/*byte[] data = new byte[5]; // 한번에 읽을때 5바이트씩 읽어와서, data배열에 담고, 입력한 byte수를 리턴
				int cnt = is.read(data);
				System.out.println(new String(data));
				*/
				
				byte[] data = new byte[5];
				int cnt = is.read(data,0,3); //(변수,시작인덱스, 읽어올개수): 배열이니까 인덱스가 있음 -> data의 인덱스 1에서 시작해서, 3개 읽어서 -> cnt 에 담기
				System.out.println(cnt + "-->" + new String(data));
			}
			
				//System.out.println("------------");
			
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		new InputStreamTest().start();

	}

}
