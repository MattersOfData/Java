package java10_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public FileCopy() {
		
	}

	public void start() {
		//c:\\javaFileTest\natural.jpg 읽기
		//c:\\newFolder\natural.jpg로 쓰기
		
	try {
		File source = new File("c://javaFileTest/natural.jpg");
		File target = new File("c://newFolder","natural2.jpg" ); // source.getName()원본 파일 name get 하기
		
		//1. 입력스트링(byte) 만들기
		FileInputStream fs = new FileInputStream(source);
		FileOutputStream fo = new FileOutputStream(target);
		
		/* while(true)	{
			int byteData =	fs.read(); // 읽기 ->
			if(byteData== -1) {break;}
			fo.write(byteData);
		} */
		
		//배열을 이용한 입출력
		//읽기
		byte[] data = new byte[(int)source.length()]; // 파일의 바이트 수만큼 배열 받기-> 단 사이즈가 너무 크면 안됨
		fs.read(data, 0, data.length); // read(배열,시작인덱스, 데이터 길이)
		
		fo.write(data,0,data.length); /// wirte(배열, 시작인덱스, 데이터길이)
		fo.close();
		fo.close();
		
		} catch (Exception e) { // exception으로 하면 모든 예외사항 다 읽음
		e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileCopy().start();

	}

}
