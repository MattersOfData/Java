package java10_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;

public class ObjectOutputStreamTest implements Serializable {

	public ObjectOutputStreamTest() {
	}
	
	public void start() {
		// 객체를 파일로 쓰기 - 반드시 직렬화가 되어야 함.
		// 				 - 인터페이스 Serializeable을 상속받아주면됨 
		
	DataVO vo = new DataVO();
	vo.setNum(7777);
	vo.setName("박태환");
	Calendar d = Calendar.getInstance(); 
	d.set(2024, 5, 19); //2024/6/19
	vo.setDate(d);
	
	try {
		File f = new File("C:\\javaFileTest\\object.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		
		oos.writeObject(vo); // 객체 파일 쓰기
		
		oos.close();
		fos.close();
		
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
		System.out.println("쓰기 완료");
		}

	public static void main(String[] args) {
		new ObjectOutputStreamTest().start();
	}

}
