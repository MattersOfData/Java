package java10_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest {

	public DataOutputStreamTest() {
		
	}
	public void start() {
		//DataInputStrea, DataOutputStream: 원 데이터의 크기만큼 바이트를 확보하여 정보 1개를 저장
		
		int intData = 1234;
		double dbData = 235.69;
		char charData = '한';
		boolean booData = true;
		
		try {
			// Data 쓰기
			FileOutputStream fos = new FileOutputStream("c://javaFileTest/data.txt"); // 해당경로에 data.txt 생성
			DataOutputStream dos = new DataOutputStream(fos); // 데이터 쓰기
			
			dos.writeInt(intData); // 4 byte 확보
			dos.writeDouble(dbData); // 8 byte 확보
			dos.writeChar(charData);  // 3byte 확보
			dos.writeBoolean(booData); // 1byte 확보
			
			dos.close();
			fos.close();
			
			// 원래 데이터 타입은 원래 데이터 타입대로 읽어와야 제대로 보임
			// Data 크기만큼 읽어오기
			File file = new File("c://javaFileTest/data.txt"); //파일 객체 만들기
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			
			int inRead  = dis.readInt();
			double dbRead = dis.readDouble();
			char charRead = dis.readChar();
			boolean booRead = dis.readBoolean();
			
			System.out.println("int -> " + inRead);
			System.out.println("double -> " + dbRead );
			System.err.println("char -> "+ charRead);
			System.out.println("boolean -> " + booRead);
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
	public static void main(String[] args) {
		new DataOutputStreamTest().start();

	}

}
