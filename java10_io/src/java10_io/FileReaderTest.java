package java10_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public FileReaderTest() {
		
	}
	// 파일에서 데이터 읽어오기
	public void start() {
		
		// 한번에 한글자씩 읽어오기
		try {
		File f = new File("C://javaFileTest", "sql04_.dml.sql");// 경로, 파일명
		FileReader fr = new FileReader(f);
		
		// 한번에 한줄씩 읽어오기
		BufferedReader br = new BufferedReader(fr);
		
		while(true) { // EndOfFile 일때, 반환값은 null
			String inData = br.readLine();
			if(inData == null) break;
			System.out.println(inData);
		}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ep) {
			ep.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new FileReaderTest().start();
		
	}

}
